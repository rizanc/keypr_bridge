package com.cloudkey.upload.collector;

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

import com.cloudkey.commons.RoomDetails;
import com.cloudkey.dao.DataBaseHandler;
import com.cloudkey.logger.MessageLogger;
import com.cloudkey.upload.client.UploadServiceClient;
import com.cloudkey.upload.constant.IUploadConstants;
import com.cloudkey.upload.remove.UploadQueueDataRemover;
import com.cloudkey.upload.utility.UploadConfigurationReader;

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
	int period = Integer.parseInt(UploadConfigurationReader.getProperty(IUploadConstants.ROOM_STATUS_THREAD_INTERVAL)) ;

	//create reference variable to store the database connection object. 
	private static Connection connection = null;
	//create reference variable to store the Statement object.
	Statement roomDetailStmt = null;
	String webResponse = null;

	/*
	  method to listen the upload queue as scheduler after every fixed time period and 
	  fetch the updated room details data from upload queue.
	 */
	public void fetchRoomDetails() {

		MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " enter method fetchRoomDetails " );

		period = Integer.parseInt(UploadConfigurationReader.getProperty(IUploadConstants.ROOM_STATUS_THREAD_INTERVAL)) ;

		final Runnable schedulerTask = new Runnable() {

			public void run() { 

				Date date = new Date();
				//start time for scheduler
				Timestamp startTime = new Timestamp(date.getTime() - (period*1000));  

				//end time for scheduler
				Timestamp endTime =  new Timestamp(date.getTime());  
				try {
					// creating a list of RoomDetails
					List<RoomDetails> roomdetailsList = new ArrayList<RoomDetails>();

					//Reference Variable to store the object of RoomDetails
					RoomDetails roomDetails= null;

					connection = DataBaseHandler.getConnection();
					roomDetailStmt=connection.createStatement();

					//reference variable to store the object of ResultSet.
					ResultSet roomdetailsSet = null;

					String roomDetailQuery =  "SELECT rdetails.* FROM keypr_bridge_db.room_details_upload as  rdetails"+ 
							" WHERE (DATE_FORMAT(rdetails.date_modified,'%Y-%m-%d %H:%i:%s') BETWEEN DATE_FORMAT('"+startTime+"','%Y-%m-%d %H:%i:%s') AND" +
							" DATE_FORMAT('" + endTime + "','%Y-%m-%d %H:%i:%s')) OR  (DATE_FORMAT(rdetails.date_created,'%Y-%m-%d %H:%i:%s') " +
							"BETWEEN DATE_FORMAT('"+startTime+"','%Y-%m-%d %H:%i:%s') AND DATE_FORMAT('" + endTime + "','%Y-%m-%d %H:%i:%s'))"; 

					MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " Query to fetch room_details data " + roomDetailQuery );

					roomdetailsSet = roomDetailStmt.executeQuery( roomDetailQuery );

					if( roomdetailsSet != null ) {

						while( roomdetailsSet.next() ) {

							roomDetails = new RoomDetails();

							int id = roomdetailsSet.getInt("rdetails.id");
							roomDetails.setId( id );
							roomDetails.setRoomNumber( roomdetailsSet.getInt("rdetails.room_number") );
							roomDetails.setFrontOfficeStatus( roomdetailsSet.getString("rdetails.front_office_status") );

							roomDetails.setRoomStatus( roomdetailsSet.getString("rdetails.room_status") );
							roomDetails.setHouseKeeepingStatus( roomdetailsSet.getString("rdetails.house_keeping_status") );

							MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " Data fetched from  table room Details with id " + id);
							roomdetailsList.add(roomDetails);
						}
						
						int roomListSize = roomdetailsList.size();
						MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " Size of room detail list is " + roomListSize  );

					
						if( roomListSize > 0) {

							MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " Make call to invoke keypr web service " );
							// invoke the client of Keypr Web service to post the updated data of RoomDetails as a batch including its size , after being fetched from UploadQueue database 
							webResponse = UploadServiceClient.invokeRoomdetails(roomdetailsList , roomListSize);
							MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " Response from keypr web service  " + webResponse );

							/*check the response from Keypr Web service, if success,invoke the method to delete the data of RoomDetails id as unique identifier*/
							if( webResponse.equalsIgnoreCase("success") ) {

								MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " Web service result is success " );
								UploadQueueDataRemover.removeUploadedRoomDetailsData( roomdetailsList );
							}

							// on getting failure response from Keypr web service, send the request at most three times to invoke the keypr web service for posting the data of RoomDetails
							else {

								//variable to check the response from the KeyprWebservice
								int recall = 0;
								MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " Web service result is failure " );		
								for( int chance = 0; chance < 3; chance++ ) {

									MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " Attemp for web service request " + chance );
									webResponse = UploadServiceClient.invokeRoomdetails( roomdetailsList , roomListSize );

									if( webResponse.equalsIgnoreCase("success") ) {

										MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " Web service result is suceess on  " + chance +" attempt" );
										UploadQueueDataRemover.removeUploadedRoomDetailsData(roomdetailsList);
										recall++;
										break;
									}
								}
								if( recall == 0 ) {

									MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " ReCall fetchRoomDetailsOnStartup , fetchRoomDetails " );			
									fetchRoomDetailsOnStartup();
									fetchRoomDetails();
								}
							}
						}
					
					else{

						MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " Nothing to push since Room Detail List is Empty " );

					}
				}
					else{
						
						MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " roomdetailsSet is null " );
					}
				}
				catch (Exception exc ) {

					MessageLogger.logError( UploadRoomDataRetriever.class, " fetchRoomDetails ", exc );
				}
			}

		};	

		//scheduler method to listen the upload queue at every given time period 
		@SuppressWarnings("unused")
		final ScheduledFuture<?> schedulerHandle = scheduler.scheduleAtFixedRate( schedulerTask, 10, period, TimeUnit.SECONDS );

		MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetails ", " exit  method fetchRoomDetails " );
	}


	/** method to invoke on the startup of the upload Service to fetch all the updated data of room details from upload queue database 
	 * considering Id as unique identifier */

	public boolean fetchRoomDetailsOnStartup() {

		MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " enter method fetchRoomDetailsOnStartup " );

		boolean isCallFetchRoomStatus = false;

		ResultSet roomDetailSet = null; 
		String sqlQuery = null;
		Statement stmtOnStartUp = null;	
		try {

			if(connection == null) {

				connection = DataBaseHandler.getConnection();
				stmtOnStartUp = connection.createStatement();	
			} 
			else{

				stmtOnStartUp = connection.createStatement();
			}

			sqlQuery = "select rdetails.* from  keypr_bridge_db.room_details_upload rdetails";

			MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " Query to fetch room_details_upload data " + sqlQuery );	
			roomDetailSet= stmtOnStartUp.executeQuery( sqlQuery );

			List<RoomDetails> roomdetailsList = new ArrayList<RoomDetails>();
			RoomDetails roomDetails= null;

			// check the null value of ResultSet Object
			if( roomDetailSet != null ) {

				while( roomDetailSet.next()) {

					roomDetails= new RoomDetails();

					int id = roomDetailSet.getInt("rdetails.id") ;
					roomDetails.setId( id );
					roomDetails.setRoomNumber( roomDetailSet.getInt("rdetails.room_number") );

					roomDetails.setFrontOfficeStatus( roomDetailSet.getString("rdetails.front_office_status") );
					roomDetails.setRoomStatus( roomDetailSet.getString("rdetails.room_status") );
					roomDetails.setHouseKeeepingStatus( roomDetailSet.getString("rdetails.house_keeping_status") );

					MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " Data fetched from  table room_details_upload with id " + id);
					roomdetailsList.add(roomDetails);

				}

				int roomListSize = roomdetailsList.size();
				MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " Size of RoomDetail List  " + roomListSize );

				if(roomListSize > 0){
					
				MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " Make call to invoke keypr web service " );			
				//invoke the client of Keypr Web Service to post the updated data of RoomDetails as a batch including its size after being fetched from UploadQueue database .
				webResponse = UploadServiceClient.invokeRoomdetails( roomdetailsList, roomListSize );
				MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " Response from keypr web service " + webResponse );

				try {

					//check the response from Keypr Web Service, if success, invoke the method to delete the data of RoomDetails id as unique identifier
					if( webResponse.equalsIgnoreCase( "success" ) ) {

						MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " Web service result is success " );
						UploadQueueDataRemover.removeUploadedRoomDetailsData(roomdetailsList);
						isCallFetchRoomStatus = true;
					}

					else {

						MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " Response from keypr web service failure " );
						boolean isSuccess = false;

						for( int attempt = 0 ; attempt < 3 ; attempt++ ) {

							MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " Attemp for web service request " + attempt );
							webResponse = UploadServiceClient.invokeRoomdetails( roomdetailsList , roomListSize );

							if( webResponse.equalsIgnoreCase( "success" ) ) {

								MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " Web service result is suceess on  " + attempt +" attempt" );
								UploadQueueDataRemover.removeUploadedRoomDetailsData(roomdetailsList);
								isSuccess = true;
								isCallFetchRoomStatus = true;
								break;
							}
						}
						if( !isSuccess) {

							MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " ReCall fetchRoomDetailsOnStartup " );
							fetchRoomDetailsOnStartup();

						}
					}


				}
				catch( Exception exc ) {

					MessageLogger.logError(UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup" , exc);
				}
			}	
			else{
				
				MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " Nothing to push since Room Detail List is Empty on Start Up " );
				fetchRoomDetailsOnStartup();
			} // end check for list size.
			}
			
			else{
			
				MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " roomDetailSet is null " );
			}
		} catch ( Exception exc ) {

			MessageLogger.logError(UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup" , exc);
		}

		MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomDetailsOnStartup ", " exit method fetchRoomDetailsOnStartup " );

		return isCallFetchRoomStatus;

	}

}
