package com.cloudkey.upload.collector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.commons.RoomRate;
import com.cloudkey.commons.RoomType;
import com.cloudkey.dao.DataBaseHandler;
import com.cloudkey.upload.client.UploadServiceClient;
import com.cloudkey.upload.constant.IUploadConstants;
import com.cloudkey.upload.logger.UploadServiceLogger;
import com.cloudkey.upload.remove.UploadQueueDataRemover;
import com.cloudkey.upload.utility.UploadConfigurationReader;


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

	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	int period = Integer.parseInt( UploadConfigurationReader.getProperty(IUploadConstants. RESERVATION_THREAD_INTERVAL)) ;

	String webResult = null;
	// create reference variable to store the database connection object. 
	private static Connection connection = null;

	
	/**
	 * This method is used to listen the upload queue as scheduler after every fixed time period and fetch the reservation data from upload queue.
	 */
	public void fetchReservationDetails() {

		UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " enter method fetchReservationDetails " );

		final Runnable schedulerTask = new Runnable() {

			List<RoomRate> roomRateList = null;
			List<ReservationRoomAllocation> roomAllocationList = null;

			Reservation reservation = null;
			ReservationRoomAllocation reservationRoomAllocation = null;
			RoomRate roomRate = null;
			RoomType roomType = null;
			
            String status = IUploadConstants.RESERVATON_STATUS_COMPL;
            boolean isRecordFound = false;
			PreparedStatement stmtOnStartUp = null;
			String webResult= null;
			String sqlQuery = null;

			public void run() { 

				try {

					sqlQuery = "SELECT reservation.* FROM keypr_bridge_db.reservation_upload  AS reservation WHERE reservation.status = '"+status+"' ";
					UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Query to fetch reservation_upload table data " + sqlQuery );
					
					if ( connection == null ) {

						connection = DataBaseHandler.getConnection();
						stmtOnStartUp = connection.prepareStatement( sqlQuery , Statement.RETURN_GENERATED_KEYS);
					}
					else {
						
						stmtOnStartUp = connection.prepareStatement( sqlQuery , Statement.RETURN_GENERATED_KEYS);
					}

					List<Reservation> reservationList = new ArrayList<Reservation>();
					roomAllocationList = new ArrayList<ReservationRoomAllocation>();
					roomRateList = new ArrayList<RoomRate>();

					ResultSet reservationSet = stmtOnStartUp.executeQuery();
					if( reservationSet!=null ) { 

						while( reservationSet.next() ) {

							isRecordFound = true;
							reservation = new Reservation();
							//To add id .
							int id = reservationSet.getInt( "reservation.id" ) ;	
                            int pmsId = reservationSet.getInt( "reservation.pms_id" ); 
							// To set the reservation data.
							reservation.setId( id ) ;
							reservation.setPmsId( String.valueOf(pmsId)) ;
							reservation.setStayLength(reservationSet.getInt( "reservation.stay_length" )) ;
							reservation.setNumberOfGuests(reservationSet.getInt( "reservation.number_of_guest" ));
							reservation.setFirstName(reservationSet.getString( "reservation.first_name" ));
							reservation.setLastName(reservationSet.getString( "reservation.last_name" ));
							reservation.setCompany(reservationSet.getString( "reservation.company_name" ));
							reservation.setAddress(reservationSet.getString( "reservation.address" ));
							reservation.setLoyaltyNumber(reservationSet.getString( "reservation.loyalty_number" ));
							reservation.setPhoneNumber(reservationSet.getString( "reservation.phone" ));
							reservation.setConfirmationNumber(reservationSet.getString( "reservation.confirmation_number" ));
							reservation.setCheckinDate(reservationSet.getString( "reservation.check_in_date" ));
							reservation.setCheckoutDate(reservationSet.getString( "reservation.check_out_date" ));
							reservation.setNotes(reservationSet.getString( "reservation.notes" ));
							reservation.setLoyaltyNumber(reservationSet.getString( "reservation.loyalty_program" ));
							reservation.setPropertyId(reservationSet.getString( "reservation.property_id" ));
							reservation.setCreditCardNumber(reservationSet.getString( "reservation.credit_card_no" ));
							reservation.setReservationSource(reservationSet.getString( "reservation.reservation_source" ));
							reservation.setAffilateId(reservationSet.getString( "reservation.affiliate_id" ));
							reservation.setMessage(reservationSet.getString( "reservation.messages" ));
							reservation.setEmail(reservationSet.getString( "reservation.email_id" ));
							reservation.setReservationAction("reservation.reservation_action");
							//reservationSet.getString( "status" );
							//			    reservation.setPropertyImage(reservationSet.getBlob( "property_image" ));

							UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Data fetched from reservation_upload table with id " + id +" , PMS ID " + pmsId);
							// To select data from reservation room allocation table.
							
							sqlQuery = " SELECT resvalloc.* FROM keypr_bridge_db.reservation_room_allocation_upload AS resvalloc WHERE resvalloc.reservation_upload_id = ? ";
							UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Query to fetch reservation_room_allocation_upload data " + sqlQuery );
							
							stmtOnStartUp = connection.prepareStatement( sqlQuery  , Statement.RETURN_GENERATED_KEYS);
							stmtOnStartUp.setInt(1, id);

							ResultSet resvRoomAllocationSet = stmtOnStartUp.executeQuery();

							if(resvRoomAllocationSet != null){

								while( resvRoomAllocationSet.next() ) {

									reservationRoomAllocation = new ReservationRoomAllocation();
									roomType = new RoomType();

									int resvUploadId = resvRoomAllocationSet.getInt("resvalloc.reservation_upload_id");
									reservationRoomAllocation.setRoomNo(Integer.parseInt(resvRoomAllocationSet.getString("resvalloc.room_number")));
									reservationRoomAllocation.setReservationStatusType("resvalloc.reservation_status_type");
									roomType.setCode(resvRoomAllocationSet.getString("resvalloc.room_type_code"));
									reservationRoomAllocation.setRoomType(roomType);
									
									UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Data fetched from reservation_room_allocation_upload table with upload id " + resvUploadId );
									
									sqlQuery = " SELECT resvrate.* FROM keypr_bridge_db.reservation_room_rates_upload AS resvrate WHERE resvrate.room_allocation_id = ? ";
									UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Query to fetch reservation_room_rates_upload data " + sqlQuery );
									
									stmtOnStartUp = connection.prepareStatement( sqlQuery  , Statement.RETURN_GENERATED_KEYS);
									stmtOnStartUp.setInt(1, resvUploadId);

									ResultSet resvRoomRateSet = stmtOnStartUp.executeQuery();

									if(resvRoomRateSet != null){

										while(resvRoomRateSet.next()){

											roomRate = new RoomRate();
											roomRate.setBaseAmount(resvRoomRateSet.getDouble("resvrate.base_rate"));
											roomRate.setEffectiveDate(resvRoomRateSet.getString("resvrate.effective_date"));
											roomRate.setExpirationDate(resvRoomRateSet.getString("resvrate.expiration_date"));
											roomRate.setPlanCode(resvRoomRateSet.getString("resvrate.rate_plan_code"));

											// To add room rate into list.
											roomRateList.add(roomRate);
										}
									}
									else{
		
										UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " ResultSet for Room Rate is null ");
									}
									
									UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Data fetched from reservation_room_rates_upload table ");
									
									reservationRoomAllocation.setRoomRateList( roomRateList );
									UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Room Rate List is added on resv room allocation ");	
									
									roomAllocationList.add( reservationRoomAllocation );
									UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Resv Room Alloocation is added on room allocation list ");	

								}
							}
							else{
							
								UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " ResultSet for Room Alloocation is null");
							}
							reservation.setReservationRoomAllocationList( roomAllocationList );
							UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Room Allocation List is added in to  reservation ");
							
							reservationList.add( reservation );
							
							UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Reservation is added in to  reservation list ");	

						}

						int reservationListSize = reservationList.size();
						
						UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " size of reservation list " + reservationListSize );

						if( isRecordFound ) {

							UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " ResultSet Contain Data " );
						}
						else {

							UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " ResultSet is empty " );
						}
							
						if(reservationListSize > 0){
							
						UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Make call to invoke keypr web service " );	
							
						//invoke the web service client for call the web service 
						webResult = UploadServiceClient.invokeReservation( reservationList, reservationListSize);
						//on the basis of getting the response from the client web service call the method to delete the data from upload queue
						if( webResult.equalsIgnoreCase("success") ) {

							UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Web service result is success " );
							UploadQueueDataRemover.removeReservationData( reservationList );
						}
						else {
							
							UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Web service result is failure " );
							boolean isSuccess = false;

							for( int attempt = 0 ; attempt < 3 ; attempt++ )
							{
								UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Attemp for web service request " + attempt );
								webResult = UploadServiceClient.invokeReservation(reservationList, reservationListSize);

								if( webResult.equalsIgnoreCase("success") ) {
									
									UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Web service result is suceess on  " + attempt +" attempt" );
									UploadQueueDataRemover.removeReservationData( reservationList );
									isSuccess = true;
									break;
								}
							}
							if(!isSuccess) {
								
								UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Recall for fetchRservation Details ");
								// to fetch the reservation details , and process again .
								fetchReservationDetails();
							}
						}
					}
					else{
						
						UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Nothing to push since Room Detail List is Empty" );
						
					}
					}
					else{
						
						UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " reservationSet is null" );	
					}
					
				} catch (SQLException exc ) {

					UploadServiceLogger.logError( UploadReservationDataRetriever.class, "fetchReservationDetails", exc );
				}

				UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " exit fetchReservationDetails method " );
			}

		};	


		//scheduler method to listen the upload queue at every given time period 
		@SuppressWarnings("unused")
		final ScheduledFuture<?> schedulerHandle = scheduler.scheduleAtFixedRate(schedulerTask, 10, period, TimeUnit.SECONDS);

		UploadServiceLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " exit method fetchReservationDetails " );
	}

}
