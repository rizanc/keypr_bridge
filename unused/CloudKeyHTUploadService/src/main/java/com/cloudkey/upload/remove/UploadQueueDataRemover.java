package com.cloudkey.upload.remove;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomTypeInventory;
import com.cloudkey.upload.constant.IUploadConstants;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Inject
	protected DataSource dataSource;

	/**
	 * method to delete the updated RoomDetails data from UploadQueue, after getting success response from the Keypr web service.
	 *
	 * @param roomdetailsList
	 */
	public void removeUploadedRoomDetailsData(List<RoomDetails> roomdetailsList) {

		log.debug("removeUploadedRoomDetailsData: enter removeUploadedRoomDetailsData method ");
		log.debug("removeUploadedRoomDetailsData: room detail list passed: {}", roomdetailsList.size());

		try {
			Connection connection = dataSource.getConnection();
			Statement removeStmt = connection.createStatement();

			for (RoomDetails roomDetails : roomdetailsList) {

				String sqlQuery = IUploadConstants.QUERY_ROOM_DETAILS_UPLOAD_DELETE_BY_ID + roomDetails.getId();

				log.debug("removeUploadedRoomDetailsData: Query to delete room_details_upload data: {}", sqlQuery);

				int rowsDeleted = removeStmt.executeUpdate(sqlQuery);

				if (rowsDeleted != 0) {

					log.debug("removeUploadedRoomDetailsData: room detail record deleted with id: {}", roomDetails.getId());
				}

			}

		} catch (Exception exc) {

			log.error(" removeUploadedRoomDetailsData ", exc);
		}

		log.debug("removeUploadedRoomDetailsData: exit removeUploadedRoomDetailsData method ");
	}

	/**
	 * method to delete the updated RoomInventory data  from UploadQueue, after getting success response from the Keypr web service.
	 *
	 * @param roominventorydetailsList
	 */

	public void removeUploadedRoomInventoryDetailsData(List<RoomTypeInventory> roominventorydetailsList) {

		log.debug("removeUploadedRoomInventoryDetailsData: enter removeUploadedRoomInventoryDetailsData method ");
		log.debug("removeUploadedRoomInventoryDetailsData: room roominventorydetails list passed: {}", roominventorydetailsList.size());

		try {
			Connection connection = dataSource.getConnection();
			Statement removeStmt = connection.createStatement();

			for (RoomTypeInventory roominventoryDetails : roominventorydetailsList) {

				String sqlQuery = IUploadConstants.QUERY_ROOM_INVENTORY_UPLOAD_DELETE_BY_ID + roominventoryDetails.getId() + "";

				int rowsDeleted = removeStmt.executeUpdate(sqlQuery);

				if (rowsDeleted != 0) {

					log.debug("removeUploadedRoomInventoryDetailsData: room inventory record deleted with id: {}", roominventoryDetails.getId());
				}

				log.debug("removeUploadedRoomInventoryDetailsData: Query to delete room_inventory_upload data: {}", sqlQuery);

			}
		} catch (Exception exc) {

			log.error(" removeUploadedRoomInventoryDetailsData ", exc);
		}

		log.debug("removeUploadedRoomInventoryDetailsData: exit removeUploadedRoomInventoryDetailsData method ");
	}

	/**
	 * method to delete the data from upload table after getting success
	 * response from the client service
	 *
	 * @param reservationList
	 */

	public void removeReservationData(List<Reservation> reservationList) {

		log.debug("removeReservationData: enter removeReservationData method ");
		log.debug("removeReservationData: reservation list passed: {}", reservationList.size());

		try {
			Connection connection = dataSource.getConnection();
			Statement removeStmt = connection.createStatement();

			for (Reservation aReservationList : reservationList) {
				String sqlQuery = IUploadConstants.QUERY_RESERVATION_UPLOAD_DELETE_BY_ID + aReservationList.getId();
				int rowsDeleted = removeStmt.executeUpdate(sqlQuery);

				if (rowsDeleted != 0) {
					log.debug("removeReservationData: reservation data deleted with id: {}", aReservationList.getId());
				}
				log.debug("removeReservationData: Query to delete reservation_upload data: {}", sqlQuery);

			}

		} catch (Exception exc) {

			log.error(" removeReservationData ", exc);
		}

		log.debug("removeReservationData: exit removeReservationData method ");
	}
}
