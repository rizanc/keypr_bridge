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
import com.cloudkey.upload.client.UploadServiceClient;
import com.cloudkey.upload.constant.IUploadConstants;
import com.cloudkey.upload.logger.UploadServiceLogger;
import com.cloudkey.upload.remove.UploadQueueDataRemover;
import com.cloudkey.upload.utility.UploadConfigurationReader;

/** 
 * This class acts as a listener  to fetch the updated data of RoomInventory from upload queue .
 *  On startup of the service , fetch all the RoomInventory updated data from upload queue and pos
 *  to keypr  web service,if gets success from keypr service,delete the data within that fixed period
 *  of time from upload queue,if gets failure,then three more times scheduler invoke,even then if we get
 *  failure,startup method invoke to fetch all the old updated data of upload queue.
 *
 * @author ektas
 */
public class UploadInventoryDataRetriver {

	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool( IUploadConstants.COUNT_ONE ) ;

	int period = Integer.parseInt( UploadConfigurationReader.getProperty( IUploadConstants.ROOM_INVENTORY_THREAD_INTERVAL ) ) ;
	int delayTime = Integer.parseInt( UploadConfigurationReader.getProperty( IUploadConstants.ROOM_INVENTORY_THREAD_DELAY ) ) ;

	// create reference variable to store the Statement object.
	Statement inventoryStmt = null ;
	String webResult = null ;

	// create reference variable to store the database connection object. 
	private static Connection connection = null ;

	//method to listen the upload queue as scheduler after every fixed time period and fetch the updated RoomInventory data from upload queue.
	public void fetchRoomInventoryDetails() {

		UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " enter method fetchRoomInventoryDetails " ) ;

		final Runnable schedulerTask = new Runnable() {

			ResultSet roominventorySet = null ;
			RoomTypeInventory roominventoryDetails = null ;

			boolean isResultSetEmpty = true ;

			public void run() { 

				Date date = new Date() ;

				//start time for scheduler
				Timestamp startTime = new Timestamp( date.getTime() - ( period * IUploadConstants.COUNT_THOUSAND ) ) ;  

				// end time for scheduler
				Timestamp endTime =  new Timestamp( date.getTime() ) ;  

				try  {

					List<RoomTypeInventory> roominventorydetailsList = new ArrayList<RoomTypeInventory>() ;

					connection = DataBaseHandler.getConnection() ;
					inventoryStmt = connection.createStatement() ;

					String inventoryQuery = "SELECT rinventory. * FROM keypr_bridge_db.room_inventory_upload  as  rinventory "+ 
							" WHERE (DATE_FORMAT(rinventory.date_modified,'%Y-%m-%d %H:%i:%s') BETWEEN DATE_FORMAT('"+startTime+"','%Y-%m-%d %H:%i:%s') AND" +
							" DATE_FORMAT('" + endTime + "','%Y-%m-%d %H:%i:%s')) OR  (DATE_FORMAT(rinventory.date_created,'%Y-%m-%d %H:%i:%s') " +
							"BETWEEN DATE_FORMAT('"+startTime+"','%Y-%m-%d %H:%i:%s') AND DATE_FORMAT('" + endTime + "','%Y-%m-%d %H:%i:%s'))"; 

					UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Query to fetch room_inventory_upload data " + inventoryQuery );

					roominventorySet = inventoryStmt.executeQuery( inventoryQuery );

					//set the data in to RoomInventory object from result set 
					if( roominventorySet != null ) {

						while( roominventorySet.next() ) {

							isResultSetEmpty = false ;
							roominventoryDetails = new RoomTypeInventory() ;

							RoomType objRoomType = new RoomType() ;
							objRoomType.setCode( roominventorySet.getString( IUploadConstants.ROOM_INVENTORY_ROOM_TYPE ) );

							roominventoryDetails.setRoomType( objRoomType );
							roominventoryDetails.setTotalRoomsAvailable( roominventorySet.getInt( IUploadConstants.ROOM_INVENTORY_TOTAL_ROOMS_AVAILABLE ) );
							roominventoryDetails.setTotalRooms( roominventorySet.getInt( IUploadConstants.ROOM_INVENTORY_TOTAL_ROOMS ) );

							//roominventoryDetails.setRoomsAvailable(roominventorySet.getInt("rinventory.total_rooms_available"));
							//roominventoryDetails.setDateCreated(roominventorySet.getTimestamp("rinventory.date_created"));
							//roominventoryDetails.setDateModified(roominventorySet.getTimestamp("rinventory.date_modified"));

							roominventorydetailsList.add( roominventoryDetails );
						}

						// If result set is empty.
						if( isResultSetEmpty ) {

							UploadServiceLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomInventoryDetails ", " No room inventory details record exist in database." );
							UploadServiceLogger.logInfo( UploadRoomDataRetriever.class, " fetchRoomInventoryDetails ", " Nothing to push since Room Inventory Detail List is Empty " );

						}
						else {

							int roomInventorySize = roominventorydetailsList.size();

							UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Size of RoomInventory List " + roomInventorySize );
							UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Make call to invoke keypr web service " );

							//invoke the web service client for call the webservice 
							webResult = UploadServiceClient.invokeRoomInventory( roominventorydetailsList, roomInventorySize );

							UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Response of keypr web service " + webResult );

							//on the basis of getting the response from the client webservice call the method to delete the data from upload queue
							if ( webResult.equalsIgnoreCase(IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS ) ) {

								UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Web service result is success " );
								UploadQueueDataRemover.removeUploadedRoomInventoryDetailsData( roominventorydetailsList );
							}

							//on failure  response from the web service to delete the data,resends request three times to client web service

							else {

								boolean isSuccess = false;

								UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Web service result is failure " );

								for( int attempt = IUploadConstants.COUNT_ZERO; attempt < IUploadConstants.COUNT_THREE; attempt++ ) {

									UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Attemp for web service request " + attempt );

									webResult = UploadServiceClient.invokeRoomInventory( roominventorydetailsList, roomInventorySize );

									if( webResult.equalsIgnoreCase(IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS) ) {

										UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Web service result is suceess on  " + attempt + " attempt" );

										UploadQueueDataRemover.removeUploadedRoomInventoryDetailsData( roominventorydetailsList );
										isSuccess = true;

										break;
									}
								}

								// if web service response is failure after 3 web service request attempts.
								if( !isSuccess ) {

									UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " Recall for fetchRoomInventoryDetailsOnStartup , fetchRoomInventoryDetails ");

									fetchRoomInventoryDetailsOnStartup();
									fetchRoomInventoryDetails();
								}
							}

						}
					}
					else {

						UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " roominventorySet is null " );
					}
				}
				catch ( Exception exc ) {

					UploadServiceLogger.logError( UploadInventoryDataRetriver.class, "UploadQueueRoomInventoryDataRetriver", exc );

				}
			}
		};	

		//scheduler method to listen the upload queue at every given time period 
		@SuppressWarnings("unused")
		final ScheduledFuture<?> schedulerHandle = scheduler.scheduleAtFixedRate( schedulerTask, delayTime, period, TimeUnit.SECONDS );

		UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetails ", " exit method fetchRoomInventoryDetails " );
	}
	/**
	 *  method to invoke on the startup of the upload service to fetch all the updated data of room details from upload queue database 
	 *  considering Id as unique identifier
	 */
	public boolean  fetchRoomInventoryDetailsOnStartup() {

		UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " enter fetchRoomInventoryDetailsOnStartup method " );

		boolean isResultSetEmpty = true;
		boolean isCallFetchRoomInventory = false ;

		RoomTypeInventory roominventoryDetails = null;
		Statement stmtOnStartUp = null;

		String sqlQuery = null;
		String webResult = null;

		try {

			if ( connection == null ) {

				connection = DataBaseHandler.getConnection();
				stmtOnStartUp = connection.createStatement();
			}
			else {
				stmtOnStartUp = connection.createStatement();
			}

			List<RoomTypeInventory> roominventorydetailsList = new ArrayList<RoomTypeInventory>();

			sqlQuery = IUploadConstants.QUERY_ROOM_INVENTORY_UPLOAD_SELECT ;
			ResultSet roominventorySet = stmtOnStartUp.executeQuery( sqlQuery );

			UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Query to fetch room_inventory_upload data " + sqlQuery );

			if( roominventorySet != null ) { 

				while( roominventorySet.next() ) {

					isResultSetEmpty = false;
					roominventoryDetails = new RoomTypeInventory();

					//To add id .
					String id = roominventorySet.getString( IUploadConstants.ROOM_INVENTORY_ID );
					roominventoryDetails.setId( Integer.parseInt( id ));

					RoomType objRoomType = new RoomType();
					objRoomType.setCode( roominventorySet.getString( IUploadConstants.ROOM_INVENTORY_TYPE_CODE ) );
					roominventoryDetails.setRoomType(objRoomType);

					roominventoryDetails.setTotalRooms( roominventorySet.getInt( IUploadConstants.ROOM_INVENTORY_TOTAL_ROOMS ) );
					roominventoryDetails.setTotalRoomsAvailable( roominventorySet.getInt( IUploadConstants.ROOM_INVENTORY_TOTAL_ROOMS_AVAILABLE ) );

					/*roominventoryDetails.setDateCreated(roominventorySet.getTimestamp("rinventory.date_created"));
					roominventoryDetails.setDateModified(roominventorySet.getTimestamp("rinventory.date_modified"));*/

					UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Data fetched from  table room_inventory_upload with id " + id );

					roominventorydetailsList.add( roominventoryDetails );
				}

				UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " size of room inventory list " + roominventorydetailsList.size() );

				// If result set is empty.
				if( isResultSetEmpty ) {

					UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", "  No room inventory details record exist in database. " );
					UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Nothing to push since Room Inventory Detail List is Empty on Start Up " );

					fetchRoomInventoryDetails();
				}
				else {

					int roomInventorySize = roominventorydetailsList.size();

					UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Size of RoomInventoryDetail List  " + roomInventorySize );
					UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Make call to invoke keypr web service " );	

					//invoke the webservice client for call the webservice 
					webResult = UploadServiceClient.invokeRoomInventory( roominventorydetailsList, roomInventorySize );

					//on the basis of getting the response from the client webservice call the method to deltsetlete the data from upload queue
					if( webResult.equalsIgnoreCase( IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS ) ) {

						UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Web service result is success " );

						UploadQueueDataRemover.removeUploadedRoomInventoryDetailsData( roominventorydetailsList );
						isCallFetchRoomInventory = true;
					}
					else {

						UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Web service result is failure " );	

						boolean isSuccess = false;

						for( int attempt = IUploadConstants.COUNT_ZERO ; attempt < IUploadConstants.COUNT_THREE ; attempt++ )
						{
							UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Attemp for web service request " + attempt );

							webResult = UploadServiceClient.invokeRoomInventory(roominventorydetailsList, roomInventorySize );

							if( webResult.equalsIgnoreCase( IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS ) ) {

								UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Web service result is suceess on  " + attempt + " attempt" );

								UploadQueueDataRemover.removeUploadedRoomInventoryDetailsData( roominventorydetailsList );
								isCallFetchRoomInventory = true;
								isSuccess = true;

								break;
							}
						}

						// if web service response is failure after 3 web service request attempts.
						if( !isSuccess ) {

							UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " Recall for fetchRoomInventoryDetailsOnStartup Details ");

							fetchRoomInventoryDetailsOnStartup();
						}
					}
				}
			}
			else {

				UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " roominventorySet is null " );
			}
		} catch ( SQLException exc ) {

			UploadServiceLogger.logError( UploadInventoryDataRetriver.class, "UploadQueueRoomInventoryDataRetriver", exc );
		}

		UploadServiceLogger.logInfo( UploadInventoryDataRetriver.class, " fetchRoomInventoryDetailsOnStartup ", " exit fetchRoomInventoryDetailsOnStartup method " );

		return isCallFetchRoomInventory;
	}


}