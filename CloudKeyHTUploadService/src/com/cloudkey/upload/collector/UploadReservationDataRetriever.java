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
import com.cloudkey.logger.MessageLogger;
import com.cloudkey.upload.client.UploadServiceClient;
import com.cloudkey.upload.constant.IUploadConstants;
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

		MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " enter method fetchReservationDetails " );

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
					MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Query to fetch reservation_upload table data " + sqlQuery );
					
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
							int id = reservationSet.getInt( "id" ) ;	
                            int pmsId = reservationSet.getInt( "pms_id" ); 
							// To set the reservation data.
							reservation.setId( id ) ;
							reservation.setPmsId( String.valueOf(pmsId)) ;
							reservation.setStayLength(reservationSet.getInt( "stay_length" )) ;
							reservation.setNumberOfGuests(reservationSet.getInt( "number_of_guest" ));
							reservation.setFirstName(reservationSet.getString( "first_name" ));
							reservation.setLastName(reservationSet.getString( "last_name" ));
							reservation.setCompany(reservationSet.getString( "company_name" ));
							reservation.setAddress(reservationSet.getString( "address" ));
							reservation.setLoyaltyNumber(reservationSet.getString( "loyalty_number" ));
							reservation.setPhoneNumber(reservationSet.getString( "phone" ));
							reservation.setConfirmationNumber(reservationSet.getString( "confirmation_number" ));
							reservation.setCheckinDate(reservationSet.getString( "check_in_date" ));
							reservation.setCheckoutDate(reservationSet.getString( "check_out_date" ));
							reservation.setNotes(reservationSet.getString( "notes" ));
							reservation.setLoyaltyNumber(reservationSet.getString( "loyalty_program" ));
							reservation.setPropertyId(reservationSet.getString( "property_id" ));
							reservation.setCreditCardNumber(reservationSet.getString( "credit_card_no" ));
							reservation.setReservationSource(reservationSet.getString( "reservation_source" ));
							reservation.setAffilateId(reservationSet.getString( "affiliate_id" ));
							reservation.setMessage(reservationSet.getString( "messages" ));
							reservation.setEmail(reservationSet.getString( "email_id" ));
							//reservationSet.getString( "status" );
							//			    reservation.setPropertyImage(reservationSet.getBlob( "property_image" ));

							MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Data fetched from reservation_upload table with id " + id +" , PMS ID " + pmsId);
							// To select data from reservation room allocation table.
							
							sqlQuery = " SELECT resvalloc.* FROM keypr_bridge_db.reservation_room_allocation_upload AS resvalloc WHERE resvalloc.reservation_upload_id = ? ";
							MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Query to fetch reservation_room_allocation_upload data " + sqlQuery );
							
							stmtOnStartUp = connection.prepareStatement( sqlQuery  , Statement.RETURN_GENERATED_KEYS);
							stmtOnStartUp.setInt(1, id);

							ResultSet resvRoomAllocationSet = stmtOnStartUp.executeQuery();

							if(resvRoomAllocationSet != null){

								while( resvRoomAllocationSet.next() ) {

									reservationRoomAllocation = new ReservationRoomAllocation();
									roomType = new RoomType();

									int resvUploadId = resvRoomAllocationSet.getInt("reservation_upload_id");
									reservationRoomAllocation.setRoomNo(Integer.parseInt(resvRoomAllocationSet.getString("room_number")));
									roomType.setCode(resvRoomAllocationSet.getString("room_type_code"));
									reservationRoomAllocation.setRoomType(roomType);
									
									MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Data fetched from reservation_room_allocation_upload table with upload id " + resvUploadId );
									
									sqlQuery = " SELECT resvrate.* FROM keypr_bridge_db.reservation_room_rates_upload AS resvrate WHERE resvrate.room_allocation_id = ? ";
									MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Query to fetch reservation_room_rates_upload data " + sqlQuery );
									
									stmtOnStartUp = connection.prepareStatement( sqlQuery  , Statement.RETURN_GENERATED_KEYS);
									stmtOnStartUp.setInt(1, resvUploadId);

									ResultSet resvRoomRateSet = stmtOnStartUp.executeQuery();

									if(resvRoomRateSet != null){

										while(resvRoomRateSet.next()){

											roomRate = new RoomRate();
											roomRate.setBaseAmount(resvRoomRateSet.getDouble("base_rate"));
											roomRate.setEffectiveDate(resvRoomRateSet.getString("effective_date"));
											roomRate.setExpirationDate(resvRoomRateSet.getString("expiration_date"));
											roomRate.setPlanCode(resvRoomRateSet.getString("rate_plan_code"));

											// To add room rate into list.
											roomRateList.add(roomRate);
										}
									}
									else{
		
										MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " ResultSet for Room Rate is null ");
									}
									
									MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Data fetched from reservation_room_rates_upload table ");
									
									reservationRoomAllocation.setRoomRateList( roomRateList );
									MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Room Rate List is added on resv room allocation ");	
									
									roomAllocationList.add( reservationRoomAllocation );
									MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Resv Room Alloocation is added on room allocation list ");	

								}
							}
							else{
							
								MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " ResultSet for Room Alloocation is null");
							}
							reservation.setReservationRoomAllocationList( roomAllocationList );
							MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Room Allocation List is added in to  reservation ");
							
							reservationList.add( reservation );
							
							MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Reservation is added in to  reservation list ");	

						}

						int reservationListSize = reservationList.size();
						
						MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " size of reservation list " + reservationListSize );

						if( isRecordFound ) {

							MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " ResultSet Contain Data " );
						}
						else {

							MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " ResultSet is empty " );
						}
							
						if(reservationListSize > 0){
							
						MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Make call to invoke keypr web service " );	
							
						//invoke the web service client for call the web service 
						webResult = UploadServiceClient.invokeReservation( reservationList, reservationListSize);
						//on the basis of getting the response from the client web service call the method to delete the data from upload queue
						if( webResult.equalsIgnoreCase("success") ) {

							MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Web service result is success " );
							UploadQueueDataRemover.removeReservationData( reservationList );
						}
						else {
							
							MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Web service result is failure " );
							boolean isSuccess = false;

							for( int attempt = 0 ; attempt < 3 ; attempt++ )
							{
								MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Attemp for web service request " + attempt );
								webResult = UploadServiceClient.invokeReservation(reservationList, reservationListSize);

								if( webResult.equalsIgnoreCase("success") ) {
									
									MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Web service result is suceess on  " + attempt +" attempt" );
									UploadQueueDataRemover.removeReservationData( reservationList );
									isSuccess = true;
									break;
								}
							}
							if(!isSuccess) {
								
								MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Recall for fetchRservation Details ");
								// to fetch the reservation details , and process again .
								fetchReservationDetails();
							}
						}
					}
					else{
						
						MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " Nothing to push since Room Detail List is Empty" );
						
					}
					}
					else{
						
						MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " reservationSet is null" );	
					}
					
				} catch (SQLException exc ) {

					MessageLogger.logError( UploadReservationDataRetriever.class, "fetchReservationDetails", exc );
				}

				MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " exit fetchReservationDetails method " );
			}

		};	


		//scheduler method to listen the upload queue at every given time period 
		@SuppressWarnings("unused")
		final ScheduledFuture<?> schedulerHandle = scheduler.scheduleAtFixedRate(schedulerTask, 10, period, TimeUnit.SECONDS);

		MessageLogger.logInfo( UploadReservationDataRetriever.class, " fetchReservationDetails ", " exit method fetchReservationDetails " );
	}

}
