package com.cloudkey.upload.remove;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomTypeInventory;
import com.cloudkey.dao.DataBaseHandler;
import com.cloudkey.logger.MessageLogger;

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

		MessageLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " enter removeUploadedRoomDetailsData method " );

		MessageLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " room detail list passed  " + roomdetailsList.size() );

		try {

			connection = DataBaseHandler.getConnection();
			Statement removeStmt = connection.createStatement();
			Iterator<RoomDetails> roomdetailsItr = roomdetailsList.iterator();

			while(roomdetailsItr.hasNext()){

				roomDetails = roomdetailsItr.next();
				int rowsDeleted = removeStmt.executeUpdate( "DELETE FROM keypr_bridge_db.room_details_upload where id= " + roomDetails.getId() );

				if( rowsDeleted !=0 ) {

					MessageLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " room detail record deleted with id  " + roomDetails.getId() );
				}
			}

		} catch( Exception exc ) {

			MessageLogger.logError(UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", exc );	 
		}

		MessageLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " exit removeUploadedRoomDetailsData method " );
	}

	/**
	 * method to delete the updated RoomInventory data  from UploadQueue, after getting success response from the Keypr web service.
	 * 
	 * @param roominventorydetailsList
	 */

	public static void removeUploadedRoomInventoryDetailsData( List <RoomTypeInventory> roominventorydetailsList ) {

		MessageLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " enter removeUploadedRoomInventoryDetailsData method " );

		int rowsDeleted = 0;

		try {

			connection = DataBaseHandler.getConnection();
			Statement removeStmt = connection.createStatement();

			Iterator<RoomTypeInventory> roominventorydetailsItr = roominventorydetailsList.iterator();

			while( roominventorydetailsItr.hasNext() ) {

				roominventoryDetails = roominventorydetailsItr.next();

				rowsDeleted = removeStmt.executeUpdate("DELETE FROM keypr_bridge_db.room_inventory_upload where id= "+roominventoryDetails.getId()+"");

				MessageLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " number of rows deleted " + rowsDeleted );	
			}
		} catch( Exception exc ) {

			MessageLogger.logError(UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", exc);
		}

		MessageLogger.logInfo( UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " exit removeUploadedRoomInventoryDetailsData method " );
	}


	/**
	 * method to delete the data from upload table after getting success 
	 * response from the client service
	 * 
	 * @param reservationList
	 */

	public static void removeReservationData( List <Reservation> reservationList ) {

		MessageLogger.logInfo( UploadQueueDataRemover.class, " removeReservationData ", " enter removeReservationData method " );
		Reservation reservation = null;

		try {

			connection = DataBaseHandler.getConnection();
			Statement removeStmt = connection.createStatement();

			Iterator<Reservation> reservationItr = reservationList.iterator();

			while(reservationItr.hasNext()){

				reservation = reservationItr.next();
				removeStmt.executeUpdate("DELETE FROM keypr_bridge_db.reservation_upload WHERE id = "+reservation.getId()+"");
			}

		}catch(Exception exc){
			
			MessageLogger.logError(UploadQueueDataRemover.class, " removeReservationData ", exc);
		}

		MessageLogger.logInfo( UploadQueueDataRemover.class, " removeReservationData ", " exit removeReservationData method " );
	}
}
