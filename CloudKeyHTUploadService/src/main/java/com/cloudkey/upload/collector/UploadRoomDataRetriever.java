package com.cloudkey.upload.collector;

import com.cloudkey.commons.RoomDetails;
import com.cloudkey.upload.client.UploadServiceClient;
import com.cloudkey.upload.constant.IUploadConstants;
import com.cloudkey.upload.remove.UploadQueueDataRemover;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * This class is acts as listener , to fetch the updated data of RoomDetails from upload queue .
 * It sent data to keypr and if gets success from keypr service, 
 * delete the data within fixed period of time from upload queue and for failure 
 * three more times scheduler invoke,even then if we get failure,startup method invoke
 * to fetch all the old updated data of upload queue.
 * 
 *  @author ektas 
 *
 */
public class UploadRoomDataRetriever {

	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Inject
	@Named("keypr.bridge.upload.roomstatus.timer.interval")
	int period;

	@Inject
	@Named("keypr.bridge.upload.roomstatus.timer.delay")
	int delayTime;

	@Inject
	protected DataSource dataSource;

	@Inject
	protected UploadQueueDataRemover uploadQueueDataRemover;

	@Inject
	protected UploadServiceClient uploadServiceClient;

	//create reference variable to store the Statement object.
	Statement roomDetailStmt = null;
	String webResponse = null;

	/*
	  method to listen the upload queue as scheduler after every fixed time period and 
	  fetch the updated room details data from upload queue.
	 */
	public void fetchRoomDetails() {

		log.debug("fetchRoomDetails: enter method fetchRoomDetails ");

		//period = Integer.parseInt(UploadConfigurationReader.getProperty(IUploadConstants.ROOM_STATUS_THREAD_INTERVAL)) ;

		final Runnable schedulerTask = new Runnable() {

			public void run() { 

				Date date = new Date();

				//start time for scheduler
				Timestamp startTime = new Timestamp( date.getTime() - ( period * 1000) );

				//end time for scheduler
				Timestamp endTime =  new Timestamp( date.getTime() );  

				try {
					// creating a list of RoomDetails
					List<RoomDetails> roomdetailsList = new ArrayList<>();

					//Reference Variable to store the object of RoomDetails
					RoomDetails roomDetails;

					Connection connection = dataSource.getConnection();
					roomDetailStmt = connection.createStatement();

					//reference variable to store the object of ResultSet.
					ResultSet roomdetailsSet;

					boolean isResultSetEmpty = true;

					String roomDetailQuery =  "SELECT rdetails.* FROM keypr_bridge_db.room_details_upload as  rdetails"+ 
							" WHERE (DATE_FORMAT(rdetails.date_modified,'%Y-%m-%d %H:%i:%s') BETWEEN DATE_FORMAT('"+startTime+"','%Y-%m-%d %H:%i:%s') AND" +
							" DATE_FORMAT('" + endTime + "','%Y-%m-%d %H:%i:%s')) OR  (DATE_FORMAT(rdetails.date_created,'%Y-%m-%d %H:%i:%s') " +
							"BETWEEN DATE_FORMAT('"+startTime+"','%Y-%m-%d %H:%i:%s') AND DATE_FORMAT('" + endTime + "','%Y-%m-%d %H:%i:%s'))"; 

					log.debug("fetchRoomDetails: Query to fetch room_details data: {}", roomDetailQuery);

					roomdetailsSet = roomDetailStmt.executeQuery( roomDetailQuery );

					if( roomdetailsSet != null ) {

						while( roomdetailsSet.next() ) {

							isResultSetEmpty = false;

							roomDetails = new RoomDetails();

							int id = roomdetailsSet.getInt( IUploadConstants.ROOM_DETAILS_ID );

							roomDetails.setId( id );
							roomDetails.setRoomNumber( roomdetailsSet.getString( IUploadConstants.ROOM_DETAILS_ROOM_NUMBER ) );
							roomDetails.setFrontOfficeStatus( roomdetailsSet.getString( IUploadConstants.ROOM_DETAILS_FRONT_OFFICE_STATUS ) );

							roomDetails.setRoomStatus( roomdetailsSet.getString( IUploadConstants.ROOM_DETAILS_ROOM_STATUS ) );
							roomDetails.setHouseKeeepingStatus( roomdetailsSet.getString( IUploadConstants.ROOM_DETAILS_HOUSE_KEEPING_STATUS ) );

							log.debug("fetchRoomDetails: Data fetched from  table room Details with id: {}", id);

							roomdetailsList.add( roomDetails );
						}

						// If result set is empty.
						if( isResultSetEmpty ) {

							log.debug("fetchRoomDetails: No room details record exist in database.");
							log.debug("fetchRoomDetails: Nothing to push since Room Detail List is Empty ");

						}
						else {

							int roomListSize = roomdetailsList.size();

							log.debug("fetchRoomDetails: Size of room detail list is: {}", roomListSize);
							log.debug("fetchRoomDetails: Make call to invoke keypr web service ");

							// invoke the client of Keypr Web service to post the updated data of RoomDetails as a batch including its size , after being fetched from UploadQueue database 
							webResponse = uploadServiceClient.invokeRoomdetails( roomdetailsList , roomListSize );

							log.debug("fetchRoomDetails: Response from keypr web service: {}", webResponse);

							/*check the response from Keypr Web service, if success,invoke the method to delete the data of RoomDetails id as unique identifier*/
							if( webResponse.equalsIgnoreCase( IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS ) ) {

								log.debug("fetchRoomDetails: Web service result is success ");

								uploadQueueDataRemover.removeUploadedRoomDetailsData( roomdetailsList );

							}

							// on getting failure response from Keypr web service, send the request at most three times to invoke the keypr web service for posting the data of RoomDetails
							else {

								//variable to check the response from the KeyprWebservice
								boolean isSuccess = false;

								log.debug("fetchRoomDetails: Web service result is failure ");

								for( int attempt = 0; attempt < 3; attempt++ ) {

									log.debug("fetchRoomDetails: Attemp for web service request: {}", attempt);

									webResponse = uploadServiceClient.invokeRoomdetails( roomdetailsList , roomListSize );

									if( webResponse.equalsIgnoreCase( IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS ) ) {

										log.debug("fetchRoomDetails: Web service result is suceess on: {} attempt", attempt);

										uploadQueueDataRemover.removeUploadedRoomDetailsData( roomdetailsList );
										isSuccess = true;

										break;
									}
								}

								// if web service response is failure after 3 web service request attempts.
								if( !isSuccess ) {

									log.debug("fetchRoomDetails: ReCall fetchRoomDetailsOnStartup , fetchRoomDetails ");

									fetchRoomDetailsOnStartup();
									fetchRoomDetails();
								}
							}

						}
					}
					else {

						log.debug("fetchRoomDetails: roomdetailsSet is null ");
					}
				}
				catch ( Exception exc ) {

					log.error(" fetchRoomDetails ", exc);
				}
			}

		};	

		//scheduler method to listen the upload queue at every given time period 
		@SuppressWarnings("unused")
		final ScheduledFuture<?> schedulerHandle = scheduler.scheduleAtFixedRate( schedulerTask, delayTime, period, TimeUnit.SECONDS );

		log.debug("fetchRoomDetails: exit  method fetchRoomDetails ");
	}

	/** method to invoke on the startup of the upload Service to fetch all the updated data of room details from upload queue database 
	 * considering Id as unique identifier */

	public boolean fetchRoomDetailsOnStartup() {

		log.debug("fetchRoomDetailsOnStartup: enter method fetchRoomDetailsOnStartup ");

		boolean isCallFetchRoomStatus = false;

		ResultSet roomDetailSet;

		String sqlQuery;

		try {
			Connection connection = dataSource.getConnection();
			Statement stmtOnStartUp = connection.createStatement();

			sqlQuery = IUploadConstants.QUERY_ROOM_DETAILS_UPLOAD ;

			log.debug("fetchRoomDetailsOnStartup: Query to fetch room_details_upload data: {}", sqlQuery);

			roomDetailSet = stmtOnStartUp.executeQuery( sqlQuery );

			List<RoomDetails> roomdetailsList = new ArrayList<>();
			RoomDetails roomDetails;

			boolean isResultSetEmpty = true;

			// check the null value of ResultSet Object
			if( roomDetailSet != null ) {

				while( roomDetailSet.next()) {

					isResultSetEmpty = false;

					roomDetails = new RoomDetails();

					int id = roomDetailSet.getInt( IUploadConstants.ROOM_DETAILS_ID) ;

					roomDetails.setId( id );
					roomDetails.setRoomNumber( roomDetailSet.getString( IUploadConstants.ROOM_DETAILS_ROOM_NUMBER ) );

					roomDetails.setFrontOfficeStatus( roomDetailSet.getString( IUploadConstants.ROOM_DETAILS_FRONT_OFFICE_STATUS ) );
					roomDetails.setRoomStatus( roomDetailSet.getString( IUploadConstants.ROOM_DETAILS_ROOM_STATUS ) );
					roomDetails.setHouseKeeepingStatus( roomDetailSet.getString( IUploadConstants.ROOM_DETAILS_HOUSE_KEEPING_STATUS ) );

					log.debug("fetchRoomDetailsOnStartup: Data fetched from  table room_details_upload with id: {}", id);

					roomdetailsList.add( roomDetails );

				}

				// If result set is empty.
				if( isResultSetEmpty ) {

					log.debug("fetchRoomDetailsOnStartup: No room details record exist in database.");
					log.debug("fetchRoomDetailsOnStartup: Nothing to push since Room Detail List is Empty on Start Up ");

					fetchRoomDetails();
				}
				else {

					int roomListSize = roomdetailsList.size();

					log.debug("fetchRoomDetailsOnStartup: Size of RoomDetail List: {}", roomListSize);
					log.debug("fetchRoomDetailsOnStartup: Make call to invoke keypr web service ");

					//invoke the client of Keypr Web Service to post the updated data of RoomDetails as a batch including its size after being fetched from UploadQueue database .
					webResponse = uploadServiceClient.invokeRoomdetails( roomdetailsList, roomListSize );

					log.debug("fetchRoomDetailsOnStartup: Response from keypr web service: {}", webResponse);

					try {

						//check the response from Keypr Web Service, if success, invoke the method to delete the data of RoomDetails id as unique identifier
						if( webResponse.equalsIgnoreCase( IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS ) ) {

							log.debug("fetchRoomDetailsOnStartup: Web service result is success ");

							uploadQueueDataRemover.removeUploadedRoomDetailsData( roomdetailsList );
							isCallFetchRoomStatus = true;
						}

						else {

							log.debug("fetchRoomDetailsOnStartup: Response from keypr web service failure ");

							boolean isSuccess = false;

							for( int attempt = 0; attempt < 3; attempt++ ) {

								log.debug("fetchRoomDetailsOnStartup: Attemp for web service request: {}", attempt);
								webResponse = uploadServiceClient.invokeRoomdetails( roomdetailsList , roomListSize );

								if( webResponse.equalsIgnoreCase( IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS ) ) {

									log.debug("fetchRoomDetailsOnStartup: Web service result is suceess on: {}", attempt + " attempt");

									uploadQueueDataRemover.removeUploadedRoomDetailsData( roomdetailsList );
									isSuccess = true;
									isCallFetchRoomStatus = true;

									break;
								}
							}

							// if web service response is failure after 3 web service request attempts.
							if( !isSuccess ) {

								log.debug("fetchRoomDetailsOnStartup: ReCall fetchRoomDetailsOnStartup ");

								fetchRoomDetailsOnStartup();

							}
						}

					}
					catch( Exception exc ) {

						log.error(" fetchRoomDetailsOnStartup", exc);
					}

				}

			}
			else {

				log.debug("fetchRoomDetailsOnStartup: roomDetailSet is null ");
			}
		} catch ( Exception exc ) {

			log.error(" fetchRoomDetailsOnStartup", exc);
		}

		log.debug("fetchRoomDetailsOnStartup: exit method fetchRoomDetailsOnStartup ");

		return isCallFetchRoomStatus;

	}

}
