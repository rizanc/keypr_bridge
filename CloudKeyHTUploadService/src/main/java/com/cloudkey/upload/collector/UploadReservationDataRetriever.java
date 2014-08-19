package com.cloudkey.upload.collector;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.commons.RoomRate;
import com.cloudkey.commons.RoomType;
import com.cloudkey.pms.common.contact.StreetAddress;
import com.cloudkey.upload.client.UploadServiceClient;
import com.cloudkey.upload.constant.IUploadConstants;
import com.cloudkey.upload.remove.UploadQueueDataRemover;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;


/**
 * This class is used to collect reservation data from database(keupr_bridge_db), calls the keypr web service and
 * delete the data from the reservation , room rate and room allocation upload tables in keypr_bridge_db database on SUCCESS.
 * If the keypr response contains failure then try to fetch data 3 times for the old selected data otherwise fetch the 
 * data from database again.
 * 
 * @author niveditat
 *
 */
public class UploadReservationDataRetriever {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	@Inject
	@Named("keypr.bridge.upload.reservation.timer.interval")
	int period;

	@Inject
	@Named("keypr.bridge.upload.reservation.timer.delay")
	int delayTime;

	@Inject
	protected DataSource dataSource;

	@Inject
	protected UploadQueueDataRemover uploadQueueDataRemover;

	@Inject
	protected UploadServiceClient uploadServiceClient;

	protected ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * This method is used to listen the upload queue as scheduler after every fixed time period and fetch the reservation data from upload queue.
	 */
	public void fetchReservationDetails() {

		log.debug("fetchReservationDetails: enter method fetchReservationDetails ");

		final Runnable schedulerTask = new Runnable() {

			List<RoomRate> roomRateList = null;
			List<ReservationRoomAllocation> roomAllocationList = null;

			Reservation reservation = null;
			ReservationRoomAllocation reservationRoomAllocation = null;

			RoomRate roomRate = null;
			RoomType roomType = null;

			boolean isRecordFound = false;

			//String status = IUploadConstants.RESERVATON_STATUS_COMPL;
			String webResult = null;

			public void run() { 

				try {
					Connection connection = dataSource.getConnection();

					String sqlQuery = IUploadConstants.QUERY_RESERVATION_UPLOAD_SELECT_BY_RESERVATION_STATUS;
					PreparedStatement stmtOnStartUp = connection.prepareStatement( sqlQuery , Statement.RETURN_GENERATED_KEYS );

					log.debug("fetchReservationDetails: Query to fetch reservation_upload table data: {}", sqlQuery);

					List<Reservation> reservationList = new ArrayList<Reservation>();

					roomAllocationList = new ArrayList<ReservationRoomAllocation>();
					roomRateList = new ArrayList<RoomRate>();

					ResultSet reservationSet = stmtOnStartUp.executeQuery();

					if( reservationSet != null ) { 

						while( reservationSet.next() ) {

							isRecordFound = true;
							reservation = new Reservation();

							//To add id .
							int id = reservationSet.getInt( "reservation.id" ) ;	
							int pmsId = reservationSet.getInt( "reservation.pms_id" ); 

							// To set the reservation data.
							reservation.setId( id ) ;
							reservation.setPmsReservationId(String.valueOf(pmsId)) ;

							reservation.setStayLength( reservationSet.getInt( "reservation.stay_length" )  ) ;
							reservation.setNumberOfGuests( reservationSet.getInt( "reservation.number_of_guest" ) );
							reservation.setFirstName( reservationSet.getString( "reservation.first_name" ) );
							reservation.setLastName( reservationSet.getString( "reservation.last_name" ) );
							reservation.setCompany( reservationSet.getString( "reservation.company_name" ) );

							reservation.setAddress( objectMapper.readValue(reservationSet.getString( "reservation.address" ), StreetAddress.class));
							reservation.setLoyaltyNumber( reservationSet.getString( "reservation.loyalty_number" ) );
							reservation.setPhoneNumber( reservationSet.getString( "reservation.phone" ) );
							reservation.setConfirmationNumber( reservationSet.getString( "reservation.confirmation_number" ) );
							reservation.setCheckinDate( reservationSet.getString( "reservation.check_in_date" ) );

							reservation.setCheckoutDate( reservationSet.getString( "reservation.check_out_date" ) );
							reservation.setNotes( reservationSet.getString( "reservation.notes" ) );
							reservation.setLoyaltyNumber( reservationSet.getString( "reservation.loyalty_program" ) );
							reservation.setPropertyId( reservationSet.getString( "reservation.property_id" ) );
							reservation.setCreditCardNumber( reservationSet.getString( "reservation.credit_card_no" ) );

							reservation.setReservationSource( reservationSet.getString( "reservation.reservation_source" ) );
							reservation.setAffilateId( reservationSet.getString( "reservation.affiliate_id" ) );
							reservation.setMessage( reservationSet.getString( "reservation.messages" ) );
							reservation.setEmail( reservationSet.getString( "reservation.email_id" ) ) ;

							//reservationSet.getString( "status" );
							// reservation.setPropertyImage(reservationSet.getBlob( "property_image" ));

							log.debug("fetchReservationDetails: Data fetched from reservation_upload table with id: {}, PMS ID: {}", id, pmsId);

							// To select data from reservation room allocation table.

							sqlQuery = IUploadConstants.QUERY_RESERVATION_ROOM_ALLOCATION_UPLOAD_BY_RESERVATION_UPLOAD_ID;

							log.debug("fetchReservationDetails: Query to fetch reservation_room_allocation_upload data: {}", sqlQuery);

							stmtOnStartUp = connection.prepareStatement( sqlQuery  , Statement.RETURN_GENERATED_KEYS );
							stmtOnStartUp.setInt(1, id );

							ResultSet resvRoomAllocationSet = stmtOnStartUp.executeQuery();

							if( resvRoomAllocationSet != null ) {

								while( resvRoomAllocationSet.next() ) {

									reservationRoomAllocation = new ReservationRoomAllocation();
									roomType = new RoomType();

									int resvUploadId = resvRoomAllocationSet.getInt( "resvalloc.reservation_upload_id" );

									reservationRoomAllocation.setRoomNo(resvRoomAllocationSet.getString( "resvalloc.room_number" ) );
									reservationRoomAllocation.setReservationStatusType( "resvalloc.reservation_status_type" );
									reservationRoomAllocation.setRoomType( roomType );

									roomType.setCode(resvRoomAllocationSet.getString( "resvalloc.room_type_code" ) );

									log.debug("fetchReservationDetails: Data fetched from reservation_room_allocation_upload table with upload id: {}", resvUploadId);

									sqlQuery = IUploadConstants.QUERY_RESERVATION_ROOM_RATES_UPLOAD_BY_RESERVATION_ROOM_ALLOCATION_ID;

									log.debug("fetchReservationDetails: Query to fetch reservation_room_rates_upload data: {}", sqlQuery);

									stmtOnStartUp = connection.prepareStatement( sqlQuery  , Statement.RETURN_GENERATED_KEYS );
									stmtOnStartUp.setInt(1, resvUploadId );

									ResultSet resvRoomRateSet = stmtOnStartUp.executeQuery();

									if( resvRoomRateSet != null ) {

										while( resvRoomRateSet.next() ) {

											roomRate = new RoomRate();

											roomRate.setBaseAmount(resvRoomRateSet.getDouble( "resvrate.base_rate" ) );
											roomRate.setEffectiveDate(resvRoomRateSet.getString( "resvrate.effective_date" ) );
											roomRate.setExpirationDate(resvRoomRateSet.getString( "resvrate.expiration_date" ) );
											roomRate.setPlanCode(resvRoomRateSet.getString( "resvrate.rate_plan_code" ) );

											// To add room rate into list.
											roomRateList.add( roomRate );
										}
									}
									else {

										log.debug("fetchReservationDetails: ResultSet for Room Rate is null ");
									}

									log.debug("fetchReservationDetails: Data fetched from reservation_room_rates_upload table ");

									reservationRoomAllocation.setRoomRateList( roomRateList );

									log.debug("fetchReservationDetails: Room Rate List is added on resv room allocation ");

									roomAllocationList.add( reservationRoomAllocation );

									log.debug("fetchReservationDetails: Resv Room Alloocation is added on room allocation list ");

								}
							}
							else {

								log.debug("fetchReservationDetails: ResultSet for Room Alloocation is null");
							}
							reservation.setReservationRoomAllocationList( roomAllocationList );

							log.debug("fetchReservationDetails: Room Allocation List is added in to  reservation ");

							reservationList.add( reservation );

							log.debug("fetchReservationDetails: Reservation is added in to  reservation list ");

						}

						int reservationListSize = reservationList.size();

						log.debug("fetchReservationDetails: size of reservation list: {}", reservationListSize);

						if( isRecordFound ) {

							log.debug("fetchReservationDetails: ResultSet Contain Data ");
						}
						else {

							log.debug("fetchReservationDetails: ResultSet is empty ");
						}

						if( reservationListSize > 0) {

							log.debug("fetchReservationDetails: Make call to invoke keypr web service ");

							//invoke the web service client for call the web service 
							webResult = uploadServiceClient.invokeReservation( reservationList, reservationListSize );

							//on the basis of getting the response from the client web service call the method to delete the data from upload queue
							if( webResult.equalsIgnoreCase( IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS ) ) {

								log.debug("fetchReservationDetails: Web service result is success ");

								uploadQueueDataRemover.removeReservationData( reservationList );
							}
							else {

								log.debug("fetchReservationDetails: Web service result is failure ");

								boolean isSuccess = false;

								for( int attempt = 0; attempt < 3; attempt++ )
								{
									log.debug("fetchReservationDetails: Attempt for web service request: {}", attempt);

									webResult = uploadServiceClient.invokeReservation(reservationList, reservationListSize);

									if( webResult.equalsIgnoreCase(IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS) ) {

										log.debug("fetchReservationDetails: Web service result is success on: {}", attempt + " attempt");

										uploadQueueDataRemover.removeReservationData( reservationList );
										isSuccess = true;

										break;
									}
								}
								if( !isSuccess ) {

									log.debug("fetchReservationDetails: Recall for fetchRservation Details ");

									// to fetch the reservation details , and process again .
									fetchReservationDetails();
								}
							}
						} else {
							log.debug("fetchReservationDetails: Nothing to push since Room Detail List is Empty");
						}
					} else {
						log.debug("fetchReservationDetails: reservationSet is null");
					}
				} catch (SQLException | JsonMappingException | JsonParseException e) {
					log.error("fetchReservationDetails", e);
				} catch (IOException e) {
					log.error("fetchReservationDetails", e);
				}

				log.debug("fetchReservationDetails: exit fetchReservationDetails method ");
			}

		};	

		//scheduler method to listen the upload queue at every given time period 
		@SuppressWarnings("unused")
		final ScheduledFuture<?> schedulerHandle = scheduler.scheduleAtFixedRate( schedulerTask, delayTime, period, TimeUnit.SECONDS );

		log.debug("fetchReservationDetails: exit method fetchReservationDetails ");
	}

}
