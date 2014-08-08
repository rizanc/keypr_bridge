package com.cloudkey.upload.remove;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomTypeInventory;
import com.cloudkey.upload.constant.IUploadConstants;
import com.cloudkey.upload.logger.UploadServiceLogger;
import com.google.inject.Inject;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;


/**
 * this class acts as a DataRemover from UploadQueue database on the basis of Id as unique identifier for RoomDetails and RoomInventory
 *
 * @author ektas
 */
public class UploadQueueDataRemover {

	@Inject
	protected DataSource dataSource;

	/**
	 * method to delete the updated RoomDetails data from UploadQueue, after getting success response from the Keypr web service.
	 *
	 * @param roomdetailsList
	 */
	public void removeUploadedRoomDetailsData(List<RoomDetails> roomdetailsList) {

		UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " enter removeUploadedRoomDetailsData method ");
		UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " room detail list passed  " + roomdetailsList.size());

		try {
			Connection connection = dataSource.getConnection();
			Statement removeStmt = connection.createStatement();

			for (RoomDetails roomDetails : roomdetailsList) {

				String sqlQuery = IUploadConstants.QUERY_ROOM_DETAILS_UPLOAD_DELETE_BY_ID + roomDetails.getId();

				UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " Query to delete room_details_upload data " + sqlQuery);

				int rowsDeleted = removeStmt.executeUpdate(sqlQuery);

				if (rowsDeleted != 0) {

					UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " room detail record deleted with id  " + roomDetails.getId());
				}

			}

		} catch (Exception exc) {

			UploadServiceLogger.logError(UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", exc);
		}

		UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeUploadedRoomDetailsData ", " exit removeUploadedRoomDetailsData method ");
	}

	/**
	 * method to delete the updated RoomInventory data  from UploadQueue, after getting success response from the Keypr web service.
	 *
	 * @param roominventorydetailsList
	 */

	public void removeUploadedRoomInventoryDetailsData(List<RoomTypeInventory> roominventorydetailsList) {

		UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " enter removeUploadedRoomInventoryDetailsData method ");
		UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " room roominventorydetails list passed  " + roominventorydetailsList.size());

		try {
			Connection connection = dataSource.getConnection();
			Statement removeStmt = connection.createStatement();

			for (RoomTypeInventory roominventoryDetails : roominventorydetailsList) {

				String sqlQuery = IUploadConstants.QUERY_ROOM_INVENTORY_UPLOAD_DELETE_BY_ID + roominventoryDetails.getId() + "";

				int rowsDeleted = removeStmt.executeUpdate(sqlQuery);

				if (rowsDeleted != 0) {

					UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " room inventory record deleted with id  " + roominventoryDetails.getId());
				}

				UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " Query to delete room_inventory_upload data " + sqlQuery);

			}
		} catch (Exception exc) {

			UploadServiceLogger.logError(UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", exc);
		}

		UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeUploadedRoomInventoryDetailsData ", " exit removeUploadedRoomInventoryDetailsData method ");
	}

	/**
	 * method to delete the data from upload table after getting success
	 * response from the client service
	 *
	 * @param reservationList
	 */

	public void removeReservationData(List<Reservation> reservationList) {

		UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeReservationData ", " enter removeReservationData method ");
		UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeReservationData ", " reservation list passed  " + reservationList.size());

		try {
			Connection connection = dataSource.getConnection();
			Statement removeStmt = connection.createStatement();

			for (Reservation aReservationList : reservationList) {
				String sqlQuery = IUploadConstants.QUERY_RESERVATION_UPLOAD_DELETE_BY_ID + aReservationList.getId();
				int rowsDeleted = removeStmt.executeUpdate(sqlQuery);

				if (rowsDeleted != 0) {
					UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeReservationData ", " reservation data deleted with id  " + aReservationList.getId());
				}
				UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeReservationData ", " Query to delete reservation_upload data " + sqlQuery);

			}

		} catch (Exception exc) {

			UploadServiceLogger.logError(UploadQueueDataRemover.class, " removeReservationData ", exc);
		}

		UploadServiceLogger.logInfo(UploadQueueDataRemover.class, " removeReservationData ", " exit removeReservationData method ");
	}
}
