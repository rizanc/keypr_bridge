package com.cloudkey.upload.collector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.cloudkey.commons.RoomType;
import com.cloudkey.commons.RoomTypeInventory;
import com.cloudkey.dao.DataBaseHandler;
import com.cloudkey.logger.MessageLogger;
import com.cloudkey.upload.client.UploadServiceClient;
import com.cloudkey.upload.constant.IUploadConstants;
import com.cloudkey.upload.remove.UploadQueueDataRemover;
import com.cloudkey.upload.utility.UploadConfigurationReader;

/** This class acts as a listener  to fetch the updated data of RoomInventory from upload queue .
 *  On startup of the service , fetch all the RoomInventory updated data from upload queue and pos
 *  to keypr  web service,if gets success from keypr service,delete the data within that fixed period
 *  of time from upload queue,if gets failure,then three more times scheduler invoke,even then if we get
 *  failure,startup method invoke to fetch all the old updated data of upload queue.
 *
 * @author ektas
 */
public class UploadInventoryDataRetriver {

	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	int period = Integer.parseInt(UploadConfigurationReader.getProperty(IUploadConstants.ROOM_INVENTORY_THREAD_INTERVAL)) ;

	// create reference variable to store the Statement object.
	Statement inventoryStmt = null;
	String webResult = null;
	// create reference variable to store the database connection object. 
	private static Connection connection = null;

	//method to listen the upload queue as scheduler after every fixed time period and fetch the updated RoomInventory data from upload queue.
	public void fetchRoomInventoryDetails() {

		MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " enter method fetchRoomInventoryDetails " );

		final Runnable schedulerTask = new Runnable() {

			ResultSet roominventorySet = null;
			RoomTypeInventory roominventoryDetails = null;

			public void run() { 

				Date date = new Date();

				//start time for scheduler
				Timestamp startTime = new Timestamp(date.getTime() - ( period*1000 ));  

				// end time for scheduler
				Timestamp endTime =  new Timestamp(date.getTime());  
				try {

					List<RoomTypeInventory> roominventorydetailsList = new ArrayList<RoomTypeInventory>();

					connection = DataBaseHandler.getConnection();
					inventoryStmt = connection.createStatement();

					String inventoryQuery = "SELECT rinventory. * FROM keypr_bridge_db.room_inventory_upload  as  rinventory "+ 
							" WHERE (DATE_FORMAT(rinventory.date_modified,'%Y-%m-%d %H:%i:%s') BETWEEN DATE_FORMAT('"+startTime+"','%Y-%m-%d %H:%i:%s') AND" +
							" DATE_FORMAT('" + endTime + "','%Y-%m-%d %H:%i:%s')) OR  (DATE_FORMAT(rinventory.date_created,'%Y-%m-%d %H:%i:%s') " +
							"BETWEEN DATE_FORMAT('"+startTime+"','%Y-%m-%d %H:%i:%s') AND DATE_FORMAT('" + endTime + "','%Y-%m-%d %H:%i:%s'))"; 

					MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Query to fetch room_inventory_upload data " + inventoryQuery );
					
					roominventorySet = inventoryStmt.executeQuery( inventoryQuery );

					//set the data in to RoomInventory object from result set 
					if( roominventorySet != null ) {

						while( roominventorySet.next() ) {

							roominventoryDetails = new RoomTypeInventory ();

							RoomType objRoomType = new RoomType();
							objRoomType.setCode(roominventorySet.getString("rinventory.room_type"));

							roominventoryDetails.setRoomType(objRoomType);
							roominventoryDetails.setTotalRooms(roominventorySet.getInt("rinventory.total_rooms"));
							roominventoryDetails.setRoomsAvailable(roominventorySet.getInt("rinventory.total_rooms_available"));
							//roominventoryDetails.setDateCreated(roominventorySet.getTimestamp("rinventory.date_created"));
							//roominventoryDetails.setDateModified(roominventorySet.getTimestamp("rinventory.date_modified"));

							roominventorydetailsList.add(roominventoryDetails);
						}
					}

					MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Size of RoomInventory List " + roominventorydetailsList.size() );

					//invoke the web service client for call the webservice 
					webResult = UploadServiceClient.invokeRoomInventory(roominventorydetailsList, roominventorydetailsList.size());
					MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Response of keypr web service " + webResult );

					//on the basis of getting the response from the client webservice call the method to delete the data from upload queue
					if (webResult.equalsIgnoreCase("success") ) {

						UploadQueueDataRemover .removeUploadedRoomInventoryDetailsData(roominventorydetailsList);
					}

					//on failure  response from the web service to delete the data,resends request three times to client web service

					else {

						int recall = 0;

						for( int chance = 0; chance < 3; chance++ ) {

							webResult = UploadServiceClient.invokeRoomInventory( roominventorydetailsList, roominventorydetailsList.size() );

							if( webResult.equalsIgnoreCase("success") ) {

								UploadQueueDataRemover .removeUploadedRoomInventoryDetailsData(roominventorydetailsList);
								recall++;
								break;
							}
						}
						if( recall == 0) {

							fetchRoomInventoryDetailsOnStartup();
							fetchRoomInventoryDetails();
						}
					}
				}
				catch ( Exception exc ) {

					MessageLogger.logError( UploadInventoryDataRetriver.class, "UploadQueueRoomInventoryDataRetriver", exc );

				}
			}
		};	


		//scheduler method to listen the upload queue at every given time period 
		@SuppressWarnings("unused")
		final ScheduledFuture<?> schedulerHandle = scheduler.scheduleAtFixedRate(schedulerTask, 10, period, TimeUnit.SECONDS);

		MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " exit method fetchRoomInventoryDetails " );
	}
	/**
 method to invoke on the startup of the upload service to fetch all the updated data of room details from upload queue database 
 considering Id as unique identifier
	 *
	 */
	public boolean  fetchRoomInventoryDetailsOnStartup() {

		MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " enter fetchRoomInventoryDetailsOnStartup method " );

		boolean isRecordFound = false;
		boolean isCallFetchRoomInventory = false ;
		
		RoomTypeInventory roominventoryDetails= null;
		String sqlQuery = null;
		Statement stmtOnStartUp = null;
		String webResult= null;

		try {

			if ( connection == null ) {

				connection = DataBaseHandler.getConnection();
				stmtOnStartUp = connection.createStatement();
			}
			else {
				stmtOnStartUp = connection.createStatement();
			}

			List<RoomTypeInventory> roominventorydetailsList = new ArrayList<RoomTypeInventory>();

			sqlQuery = "select * from keypr_bridge_db.room_inventory_upload ";
			ResultSet roominventorySet = stmtOnStartUp.executeQuery( sqlQuery );

			MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Query to fetch room_inventory_upload data " + sqlQuery);
						
			if( roominventorySet!=null ) { 

				while( roominventorySet.next() ) {

					isRecordFound = true;
					roominventoryDetails= new RoomTypeInventory();
					//To add id .
					roominventoryDetails.setId(Integer.parseInt(roominventorySet.getString("id")));
					RoomType objRoomType = new RoomType();
					objRoomType.setCode(roominventorySet.getString("type_code"));
					roominventoryDetails.setRoomType(objRoomType);

					roominventoryDetails.setTotalRooms(roominventorySet.getInt("total_rooms"));
					roominventoryDetails.setRoomsAvailable(roominventorySet.getInt("total_rooms_available"));
					/*roominventoryDetails.setDateCreated(roominventorySet.getTimestamp("rinventory.date_created"));
					roominventoryDetails.setDateModified(roominventorySet.getTimestamp("rinventory.date_modified"));*/

					roominventorydetailsList.add(roominventoryDetails);
				}

				MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " size of room inventory list " + roominventorydetailsList.size() );

				if( isRecordFound ) {

					MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " ResultSet Contain Data " );
				}
				else {

					MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " ResultSet is empty " );
				}

				//invoke the webservice client for call the webservice 
				webResult = UploadServiceClient.invokeRoomInventory(roominventorydetailsList, roominventorydetailsList.size());
				//on the basis of getting the response from the client webservice call the method to deltsetlete the data from upload queue
				if( webResult.equalsIgnoreCase("success") ) {

					UploadQueueDataRemover.removeUploadedRoomInventoryDetailsData(roominventorydetailsList);
					isCallFetchRoomInventory = true;
				}
				else {
					
					boolean isSuccess = false;

					for( int attempt = 0 ; attempt < 3 ; attempt++ )
					{
						webResult=UploadServiceClient.invokeRoomInventory(roominventorydetailsList, roominventorydetailsList.size());

						if( webResult.equalsIgnoreCase("success") ) {

							UploadQueueDataRemover .removeUploadedRoomInventoryDetailsData(roominventorydetailsList);
							isCallFetchRoomInventory = true;
							isSuccess = true;
							break;
						}
					}
					if( !isSuccess ) {
						
						MessageLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomInventoryDetailsOnStartup ", " Call fetchRoomInventoryDetailsOnStartup Again" );
						fetchRoomInventoryDetailsOnStartup();
					}
				}
			}
		} catch (SQLException exc ) {

			MessageLogger.logError( UploadInventoryDataRetriver.class, "UploadQueueRoomInventoryDataRetriver", exc );
		}

		MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " exit fetchRoomInventoryDetailsOnStartup method " );
		return isCallFetchRoomInventory;
	}




		}