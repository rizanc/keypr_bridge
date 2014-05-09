package com.cloudkey.upload.remove;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomTypeInventory;
import com.cloudkey.dao.DataBaseHandler;
import com.cloudkey.upload.logger.UploadServiceLogger;


/**
 * this class acts as a DataRemover from UploadQueue database on the basis of Id as unique identifier for RoomDetails and RoomInventory
 * @author ektas 
 */
public class UploadQueueDataRemover {

	private static Connection connection = null;
	private static RoomDetails roomDetails;
	private static RoomTypeInventory  roominventoryDetails;

	/**
	 * method to delete the updated RoomDetails data from UploadQueue, after getting success response from the Keypr web service.
	 * 
	 * @param roomdetailsList
	 */
	public static void removeUploadedRoomDetailsData( List <RoomDetails> roomdetailsList ) {

		UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " enter removeUploadedRoomDetailsData method " );

		UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " room detail list passed  " + roomdetailsList.size() );

		try {

			connection = DataBaseHandler.getConnection();
			Statement removeStmt = connection.createStatement();
			String sqlQuery = null;
			Iterator<RoomDetails> roomdetailsItr = roomdetailsList.iterator();

			while(roomdetailsItr.hasNext()){

				roomDetails = roomdetailsItr.next();
				sqlQuery = "DELETE FROM keypr_bridge_db.room_details_upload where id= " + roomDetails.getId();
				
				UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " Query to delete room_details_upload data " + sqlQuery );
				int rowsDeleted = removeStmt.executeUpdate( sqlQuery );

				if( rowsDeleted !=0 ) {

					UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " room detail record deleted with id  " + roomDetails.getId() );
				}
				
				
			}

		} catch( Exception exc ) {

			UploadServiceLogger.logError(UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", exc );	 
		}

		UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " exit removeUploadedRoomDetailsData method " );
	}

	/**
	 * method to delete the updated RoomInventory data  from UploadQueue, after getting success response from the Keypr web service.
	 * 
	 * @param roominventorydetailsList
	 */

	public static void removeUploadedRoomInventoryDetailsData( List <RoomTypeInventory> roominventorydetailsList ) {

		UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " enter removeUploadedRoomInventoryDetailsData method " );

		UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " room roominventorydetails list passed  " + roominventorydetailsList.size() );
		String sqlQuery = null;

		try {

			connection = DataBaseHandler.getConnection();
			Statement removeStmt = connection.createStatement();

			Iterator<RoomTypeInventory> roominventorydetailsItr = roominventorydetailsList.iterator();

			while( roominventorydetailsItr.hasNext() ) {

				roominventoryDetails = roominventorydetailsItr.next();
				sqlQuery = "DELETE FROM keypr_bridge_db.room_inventory_upload where id= "+ roominventoryDetails.getId()+"";
				int rowsDeleted = removeStmt.executeUpdate( sqlQuery );

				if( rowsDeleted !=0 ) {

					UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " room inventory record deleted with id  " + roominventoryDetails.getId() );
				}
				
				UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " Query to delete room_inventory_upload data " + sqlQuery );
				
			}
		} catch( Exception exc ) {

			UploadServiceLogger.logError(UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", exc);
		}

		UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " exit removeUploadedRoomInventoryDetailsData method " );
	}


	/**
	 * method to delete the data from upload table after getting success 
	 * response from the client service
	 * 
	 * @param reservationList
	 */

	public static void removeReservationData( List <Reservation> reservationList ) {

		UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeReservationData ", " enter removeReservationData method " );
		UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeReservationData ", " reservation list passed  " + reservationList.size() );

		Reservation reservation = null;
		String sqlQuery = null;
		try {

			connection = DataBaseHandler.getConnection();
			Statement removeStmt = connection.createStatement();

			Iterator<Reservation> reservationItr = reservationList.iterator();

			while(reservationItr.hasNext()){

				reservation = reservationItr.next();
				
				sqlQuery = "DELETE  FROM keypr_bridge_db.reservation_upload  WHERE id = "+ reservation.getId() +"";
				int rowsDeleted = removeStmt.executeUpdate( sqlQuery);

				if( rowsDeleted !=0 ) {

					UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeReservationData ", " reservation data deleted with id  " + reservation.getId() );
				}
				
				UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeReservationData ", " Query to delete reservation_upload data " + sqlQuery );
			
			}

		}catch(Exception exc){

			UploadServiceLogger.logError(UploadQueueDataRemover.class, " removeReservationData ", exc);
		}

		UploadServiceLogger.logInfo( UploadQueueDataRemover.class, " removeReservationData ", " exit removeReservationData method " );
	}
}
