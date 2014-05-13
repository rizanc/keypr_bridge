package com.micros.harvester.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomRate;
import com.cloudkey.commons.RoomType;
import com.cloudkey.dao.DataBaseHandler;
import com.micros.adv.reservation.ResvAdvancedServiceStub.FetchRoomStatusResponse;
import com.micros.availability.AvailabilityServiceStub.Calendar;
import com.micros.availability.AvailabilityServiceStub.CalendarDailyDetail;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarResponse;
import com.micros.availability.AvailabilityServiceStub.RoomTypeInventory;
import com.micros.availability.AvailabilityServiceStub.RoomTypeInventoryList;
import com.micros.harvester.constant.IMicrosHarvester;
import com.micros.harvester.logger.DataHarvesterLogger;

/**
 * This class handles the database related operations for the data harvester service.
 * It connects with the database and stores data collected from the property management
 * system to the database.
 * 
 * @author vinayk2
 *
 */
public class MicrosDAOImpl implements IMicrosDAO {

	/**
	 * This method reads the database configurations from properties file.
	 * It connects with database and returns connection .
	 * 
	 * @return  connection
	 */
	public static Connection getConnection() {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " getConnection ", " Enter getConnection method " );

		/* Reference variables to store connection related operation data. */
		Connection conn = null;

		try {

			conn = DataBaseHandler.getConnection();
			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " getConnection", " DataBase connection created " );

		}
		catch( Exception exc ) {

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " getConnection ", exc);
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " getConnection ", " Exit  getConnection method " );

		return  conn;

	}

	@Override
	public boolean persistRoomStatusDataInBridgeDB( FetchRoomStatusResponse objFetchRoomStatusResponse ) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Enter persistRoomStatusDataInBridgeDB method " );

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = "";
		
		String houseKeepingStatus = "";
		String frontOfficeStatus = "";
		String roomType = "";
		int roomNumber;

		boolean isInserted = false;
		
		/*ResultStatus objRStatus = objFetchRoomStatusResponse.getResult();
		ResultStatusFlag objReFlag  = objRStatus.getResultStatusFlag();
		String status = objReFlag.getValue();
		*/
		com.micros.adv.reservation.ResvAdvancedServiceStub.RoomStatus[] objRoomStatusArray = objFetchRoomStatusResponse.getRoomStatus();
		
		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Number of RoomStatus is " + objRoomStatusArray.length);


		try {

			objConnection = MicrosDAOImpl.getConnection();

			boolean isFound = false;
			boolean isUploaded = false;

		       for(int len = 0 ; len< objRoomStatusArray.length; len++ ) {

				frontOfficeStatus = objRoomStatusArray[len].getFrontOfficeStatus();
				houseKeepingStatus = objRoomStatusArray[len].getHouseKeepingStatus();
				roomType = objRoomStatusArray[len].getRoomType();
				roomNumber = Integer.parseInt( objRoomStatusArray[len].getRoomNumber());
                
				RoomDetails objRoomDetails = new RoomDetails();
				objRoomDetails.setFrontOfficeStatus( frontOfficeStatus );
				objRoomDetails.setHouseKeeepingStatus( houseKeepingStatus );
				objRoomDetails.setRoomNumber(roomNumber);

				RoomType objRoomType = new RoomType();
				objRoomType.setCode( roomType );

				objRoomDetails.setRoomType(objRoomType);

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Room Detail object passed to checkExistence " );

				isFound = checkExistence( objRoomDetails);

				if( isFound ) { // Fetched record already exists in the room_details , compare the contents and then proceed.

					boolean isContainsChanges = compareRecord ( objRoomDetails); // checks whether fetched record is new or updated or same as existing record.

					if( isContainsChanges) { // Fetched record contains new field value , push the data to upload and update existing record.

						isUploaded = pushDataToUpload( objRoomDetails );

						if(isUploaded) {

							DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Record uploaded in the room_details_upload queue " );

							sqlQuery = "update keypr_bridge_db.room_details set room_type = ? , front_office_status = ? , house_keeping_status = ?"
									+ " where room_number = ? ";
							
							DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Update Query " + sqlQuery );
							
							pStatement = objConnection.prepareStatement( sqlQuery );

							pStatement.setString( 1, objRoomDetails.getRoomType().getCode());
							pStatement.setString( 2, objRoomDetails.getFrontOfficeStatus());
							pStatement.setString( 3, objRoomDetails.getHouseKeeepingStatus());
							pStatement.setInt( 4, objRoomDetails.getRoomNumber());

							int rowsUpdated = pStatement.executeUpdate();

							if(rowsUpdated != 0 ) {

								DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Record updated in the room_details " );
							}
							else {

								DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Record not updated in the room_details " );
							}

						}
						else {

							DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Record not uploaded in the room_details_upload queue " );
						}

					}
					else { //nothing new in fetched record

						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Nothing to be uploaded on upload room status db " );
					}

				}
				else { // fetched record is new

					DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Record does not exist in room_details room number " + roomNumber );

					isUploaded = pushDataToUpload( objRoomDetails );

					if( isUploaded ) {

						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Record uploaded in the room_details_upload queue " );
						isInserted = persistRecordInBridgeRoomStatus( objRoomDetails);
					}
					else {

						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Record not uploaded in the room_details_upload queue " );
					}

					if ( isInserted ){

						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Record stored in room_details " );

					}
					else {

						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Record Cannot be stored in room_details " );
					}

				}
			}
		}
		catch ( Exception exc ) {

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", exc ) ;
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomStatusDataInBridgeDB ", " Exit persistRoomStatusDataInBridgeDB method " );

		return isInserted;
	}

	/**
	 * This method will compare the contents of record received from the property management system as room status
	 * response with the content existing record of the room_details table of keypr_upload_db database.
	 * 
	 * @param objRoomDetails
	 * @return
	 */
	private boolean compareRecord( RoomDetails objRoomDetails ) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareRecord ", " Enter compareRecord method " );

		boolean isNewFiedlValue = false;

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;
		ResultSet rSet = null;

		try {

			objConnection = MicrosDAOImpl.getConnection();

			sqlQuery = "select room_type, front_office_status ,house_keeping_status "
					+ " from keypr_bridge_db.room_details where room_number = ? ";
			
			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareRecord ", " Select Query " + sqlQuery );
			
			pStatement = objConnection.prepareStatement(sqlQuery);
			pStatement.setInt(1, objRoomDetails.getRoomNumber());
			rSet = pStatement.executeQuery();

			if( rSet != null) {

				while( rSet.next()) {

					RoomDetails persistObject = new RoomDetails();
					persistObject.setFrontOfficeStatus( rSet.getString("front_office_status"));
					persistObject.setHouseKeeepingStatus(rSet.getString("house_keeping_status"));

					RoomType objRoomType = new RoomType();
					objRoomType.setCode( rSet.getString("room_type"));

					objRoomDetails.setRoomType(objRoomType);

					persistObject.setRoomType( objRoomType );

					if( persistObject.equals(objRoomDetails)){

						isNewFiedlValue = false;
						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareRecord ", " Duplicate Record Received " );
					}
					else {

						isNewFiedlValue = true;
						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareRecord ", " Unique Record Received " );
					}
				}

			}
			else {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareRecord ", " No Record fetched from room_details " );
			}

		}
		catch ( Exception exc ) {

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " compareRecord ", exc) ;
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareRecord ", " Enter compareRecord method " );

		return isNewFiedlValue;
	}

	public boolean persistRecordInBridgeRoomStatus(RoomDetails objRoomDetails) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInBridgeRoomStatus ", " Enter persistRecordInBridgeRoomStatus method " );

		boolean isPersisted = false;
		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;

		sqlQuery = " insert into keypr_bridge_db.room_details ( room_number, room_type, front_office_status, "
				+ " house_keeping_status, date_created ) values ( ?, ?, ?, ?, now() )";

		try {

			objConnection = MicrosDAOImpl.getConnection();
			
			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInBridgeRoomStatus ", " Insert Query " + sqlQuery );
			pStatement = objConnection.prepareStatement( sqlQuery );

			pStatement.setInt( 1, (objRoomDetails.getRoomNumber()));
			pStatement.setString( 2, objRoomDetails.getRoomType().getCode() );
			pStatement.setString ( 3, objRoomDetails.getFrontOfficeStatus() );
			pStatement.setString( 4,  objRoomDetails.getHouseKeeepingStatus() );

			int rowInserted = pStatement.executeUpdate();

			if ( rowInserted != 0 ) {

				isPersisted = true;

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInBridgeRoomStatus ", " Row inserted in Room_Details " );
			}
			else {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInBridgeRoomStatus ", " Row cannot be inserted in Room_Details " );
			}
		}
		catch (Exception exc ){

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " persistRecordInBridgeRoomStatus ", exc) ;
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInBridgeRoomStatus ", " Exit persistRecordInBridgeRoomStatus method " );

		return isPersisted;
	}

	/**
	 * This method will store the room status record received from the property management system
	 * in the room_details_upload table of keypr_upload_db database.
	 * 
	 * @param objRoomDetails
	 * @return
	 */
	private boolean pushDataToUpload(RoomDetails objRoomDetails) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " pushDataToUpload ", " Enter  pushDataToUpload method " );
		boolean isPushed = false;

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;

		sqlQuery = " insert into keypr_bridge_db.room_details_upload ( room_number, room_type, front_office_status, "
				+ " house_keeping_status, date_created ) values ( ?, ?, ?, ?, now() )";

		try {

			objConnection = MicrosDAOImpl.getConnection();
			
			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " pushDataToUpload ", " Insert Query " + sqlQuery );
			pStatement = objConnection.prepareStatement( sqlQuery );

			pStatement.setInt( 1, (objRoomDetails.getRoomNumber()));
			pStatement.setString( 2, objRoomDetails.getRoomType().getCode() );
			pStatement.setString ( 3, objRoomDetails.getFrontOfficeStatus() );
			pStatement.setString( 4,  objRoomDetails.getHouseKeeepingStatus() );

			int rowInserted = pStatement.executeUpdate();

			if ( rowInserted != 0 ) {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " pushDataToUpload ", " Row inserted in Room_Details_upload " );
				isPushed = true;
			}
			else {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " pushDataToUpload ", " Row cannot be inserted in Room_Details_upload " );
			}
		}
		catch (Exception exc ){

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " pushDataToUpload ", exc) ;
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " pushDataToUpload ", " Exit pushDataToUpload method " );

		return isPushed;
	}

	/**
	 * This method compare the content of record received from property management system with
	 * the records existing in the room_details table of keypr_upload_db. If record exists then
	 * it returns true otherwise it will return false.
	 * 
	 * @param objRoomDetail
	 * @return
	 */
	boolean checkExistence( RoomDetails objRoomDetail) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistence ", " Enter checkExistence method " );

		boolean isFound = false;

		ResultSet rSet = null;
		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;

		try {

			objConnection = MicrosDAOImpl.getConnection();

			sqlQuery = " select count(*) as cont from keypr_bridge_db.room_details where room_number = ? ";
			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistence ", " Select Query " + sqlQuery );
			
			pStatement = objConnection.prepareStatement(sqlQuery);
			pStatement.setInt( 1, objRoomDetail.getRoomNumber() );

			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistence ", " Room Number is " + objRoomDetail.getRoomNumber());

			rSet = pStatement.executeQuery();

			while ( rSet.next()) {

				int num = Integer.parseInt( rSet.getString( "cont" ) );

				if(num != 0) {

					isFound = true;

				}
			}

			if(isFound) {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistence ", " Record already exist in room_details of keypr_bride_db " );
			}
			else {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistence ", " New Record for room_details the keypr_bride_db " );

			}
		}
		catch ( Exception exc ) {

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " checkExistence ", exc) ;
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistence ", " checkExistence method record exists " + isFound );
		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistence ", " Exit checkExistence method " );

		return isFound;
	}

	public void persistRoomInventoryData( FetchCalendarResponse objFetchCalendarResponse) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Enter persistRoomInventoryData method " );

		boolean isExists = false;
		boolean isDuplicated = true;

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;

		Calendar objCalendar = objFetchCalendarResponse.getCalendar();
		CalendarDailyDetail objCalendarDailyDetailArry[] = objCalendar.getCalendarDay();
		int calendarArrayLength = objCalendarDailyDetailArry.length;

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Inventory has Detail for Calendar days " + calendarArrayLength );

		for ( int len = 0; len < calendarArrayLength; len++ ) {

			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Details for Calendar day " + ( len + 1 ) );

			CalendarDailyDetail objCalendarDailyDetail = objCalendarDailyDetailArry[len];
			Date currentCalendarDay = objCalendarDailyDetail.getDate();

			RoomTypeInventoryList objRoomInventoryList = objCalendarDailyDetail.getOccupancy();
			RoomTypeInventory objRoomTypeInventoryArray[] = objRoomInventoryList.getRoomTypeInventory();

			int lengthRoomInventory = objRoomTypeInventoryArray.length;

			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Number of room inventory present " + lengthRoomInventory + " for calendar day " +( len + 1 ) );

			for (int k = 0; k < lengthRoomInventory ; k++) {

				com.cloudkey.commons.RoomTypeInventory objRInventory = getRoomTypeInventoryInstance( objRoomTypeInventoryArray[k],currentCalendarDay);

				isExists = checkExistenceInRoomInventory( objRInventory );

				if ( isExists ) { // fetched record with given room type code does exist in the room inventory table.

					DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Record Already present in room inventory " );
					isDuplicated = compareInventoryRecord (objRInventory);

					if ( isDuplicated ) { 

						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Duplicate Record for in room inventory " );

					}
					else {

						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Updated  Record for in room inventory " );

						boolean isPersited = persistDataInRoomInventoryUpload( objRInventory );

						if( isPersited ) {

							DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Record inserted in room_inventory_upload " );

							try {

								objConnection = MicrosDAOImpl.getConnection();
								sqlQuery = " update keypr_bridge_db.room_inventory set total_rooms = ? , total_rooms_available = ? where type_code = ?";
								DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Update Query " + sqlQuery );
								
								pStatement = objConnection.prepareStatement(sqlQuery);

								pStatement.setInt(1, objRInventory.getTotalRooms());
								pStatement.setInt(2, objRInventory.getRoomsAvailable());
								pStatement.setString(3, objRInventory.getRoomType().getCode());

								int rowsUpdated = pStatement.executeUpdate();

								if (rowsUpdated != 0 ) {

									DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Record updated in room_inventory " );
								}
								else {

									DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Record Cannot be updated in room_inventory " );

								}
							}
							catch ( Exception exc ) {

							}
						}
						else {

							DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Record not inserted in room_inventory_upload " );
						}
					}
				}
				else { // fetched record with given room type code does not exist in the room inventory table.

					DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Fresh Record for in room inventory " );
					try {

						objConnection = MicrosDAOImpl.getConnection();

						sqlQuery = " insert into keypr_bridge_db.room_inventory ( type_code, total_rooms, total_rooms_available, date_created ) values ( ?, ?, ?, now() )";
						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Insert Query " + sqlQuery );
						
						pStatement = objConnection.prepareStatement(sqlQuery);
						pStatement.setString(1, objRInventory.getRoomType().getCode());
						pStatement.setInt(2, objRInventory.getTotalRooms() );
						pStatement.setInt(3, objRInventory.getRoomsAvailable());

						int rowUpdated = pStatement.executeUpdate();

						if( rowUpdated != 0 ) {

							DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Record Inserted in room_inventory with type code  " + objRInventory.getRoomType().getCode());

							boolean isPersited = persistDataInRoomInventoryUpload(objRInventory);

							if( isPersited ) {

								DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Record inserted in room_inventory_upload " );
							}
							else {

								DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Record not inserted in room_inventory_upload " );
							}
						}
						else {

							DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Record not inserted in room_inventory " );
						}

					}
					catch (Exception exc) {

						DataHarvesterLogger.logError( MicrosDAOImpl.class, " persistRoomInventoryData ", exc );
					}
				}
			}

		}


		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRoomInventoryData ", " Exit persistRoomInventoryData method " );
	}

	/**
	 * This method compares the content of room inventory record with the room inventory record of same type
	 * present in the room upload table. If new data is present in the recent fetched record then it sent
	 * true otherwise it returns false;
	 * 
	 * @return
	 */
	private boolean compareInventoryRecord( com.cloudkey.commons.RoomTypeInventory objRInventory ) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareInventoryRecord ", " Enter compareInventoryRecord method " );

		boolean isDuplicateRow = false;
		boolean isRecordFound = false;
		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;
		String roomTypeCode = null;

		ResultSet rSet = null;

		try {

			objConnection = MicrosDAOImpl.getConnection();
			roomTypeCode = objRInventory.getRoomType().getCode();

			sqlQuery = " select total_rooms, total_rooms_available from keypr_bridge_db.room_inventory where type_code = ? ";
			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareInventoryRecord ", " Select Query " + sqlQuery);
			
			pStatement = objConnection.prepareStatement(sqlQuery);

			pStatement.setString(1, roomTypeCode);

			rSet = pStatement.executeQuery();

			if( rSet != null) {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareInventoryRecord ", " Record fetched from room_inventory with type code  " + roomTypeCode);

				while( rSet.next()) {

					isRecordFound = true;
					com.cloudkey.commons.RoomTypeInventory objRInventoryData = new com.cloudkey.commons.RoomTypeInventory();

					objRInventoryData.setRoomsAvailable(rSet.getInt("total_rooms_available"));
					objRInventoryData.setTotalRooms( rSet.getInt("total_rooms"));

					if( objRInventory.equals(objRInventoryData)) {

						isDuplicateRow = true;
						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareInventoryRecord ", " Both Records are same " );
					}
					else {

						isDuplicateRow = false;
						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareInventoryRecord ", " Both Records are unique " );
					}
				}
				if (isRecordFound ){
					DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareInventoryRecord ", " Result set has row " );
				}
				else {
					DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareInventoryRecord ", " Result set is empty " );		
				}
			}
			else {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareInventoryRecord ", " No Record fetched from room_inventory " );
			}

		}
		catch (Exception exc) {

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " compareInventoryRecord ", exc );
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareInventoryRecord ", " Returning from compareInventoryRecord method " + isDuplicateRow );
		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " compareInventoryRecord ", " Exit compareInventoryRecord method " );

		return isDuplicateRow;
	}

	/**
	 * This method will persist the room inventory information in the room inventory upload table of
	 * keypr bride database.
	 * 
	 * @param objRoomInventory
	 * @return
	 */
	private boolean persistDataInRoomInventoryUpload ( com.cloudkey.commons.RoomTypeInventory objRoomInventory ) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistDataInRoomInventoryUpload ", " Enter persistDataInRoomInventoryUpload method " );

		boolean isInserted = false;
		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;

		try {

			objConnection = MicrosDAOImpl.getConnection();

			sqlQuery = " insert into keypr_bridge_db.room_inventory_upload ( type_code, total_rooms, total_rooms_available, date_created ) values ( ?, ?, ?, now() )";
			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistDataInRoomInventoryUpload ", " Insert Query " + sqlQuery);
			
			pStatement = objConnection.prepareStatement(sqlQuery);

			pStatement.setString(1, objRoomInventory.getRoomType().getCode());
			pStatement.setInt(2, objRoomInventory.getTotalRooms() );
			pStatement.setInt(3, objRoomInventory.getRoomsAvailable());

			int rowUpdated = pStatement.executeUpdate();

			if( rowUpdated != 0 ) {

				isInserted = true;
				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistDataInRoomInventoryUpload ", " Record Inserted in room_inventory_upload with type code  " + objRoomInventory.getRoomType().getCode());
			}
			else {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistDataInRoomInventoryUpload ", " Record not inserted in room_inventory_upload " );
			}

		}
		catch (Exception exc) {

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " persistDataInRoomInventoryUpload ", exc );
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistDataInRoomInventoryUpload ", " Exit persistDataInRoomInventoryUpload method " );

		return isInserted;
	}

	/**
	 * This method check for the existence of incoming inventory record from property management system with
	 * the records present in the room upload table of keypr database. Existence is checked on the basis
	 * of room type code. 
	 * 
	 * @param objRoomInventory
	 * @return
	 */
	private boolean checkExistenceInRoomInventory ( com.cloudkey.commons.RoomTypeInventory objRoomInventory  ) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistenceInRoomInventory ", " Enter checkExistenceInRoomInventory method " );

		boolean isFound = false;

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;
		ResultSet rSet = null;

		try {

			objConnection = MicrosDAOImpl.getConnection();

			sqlQuery = " select count(*) as cont from keypr_bridge_db.room_inventory where type_code = ? ";
			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistenceInRoomInventory ", " Select Query " + sqlQuery );
			
			pStatement = objConnection.prepareStatement(sqlQuery);
			pStatement.setString( 1, objRoomInventory.getRoomType().getCode() );

			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistenceInRoomInventory ", " Room Type is " + objRoomInventory.getRoomType().getCode() );

			rSet = pStatement.executeQuery();

			while ( rSet.next()) {

				int num = Integer.parseInt(rSet.getString( "cont" ));
				if(num != 0) {

					isFound = true;

				}
			}

			if(isFound) {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistenceInRoomInventory ", " Record with Code same keypr_bride_db " );
			}
			else {

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistenceInRoomInventory ", " New Record for room_inventory the keypr_bride_db " );

			}
		}
		catch ( Exception exc ) {

			DataHarvesterLogger.logError( MicrosDAOImpl.class, " checkExistenceInRoomInventory ", exc );

		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " checkExistenceInRoomInventory ", " Exit checkExistenceInRoomInventory method " );

		return isFound;

	}

	/**
	 * This method accepts room inventory detail information , fetched from room type inventory list.
	 * Pull the data from fetched instance and set the retrieved data in an instance of RoomTypeInventory Class.
	 * 
	 * @param objRoomTypeInventory
	 * @return
	 */
	private com.cloudkey.commons.RoomTypeInventory getRoomTypeInventoryInstance( RoomTypeInventory objRoomTypInventory, Date currentCalendarDay ) {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " getRoomTypeInventoryInstance ", " Enter getRoomTypeInventoryInstance method " );

		// Store the retrieved inventory information in RoomTypeInventory Instance.
		com.cloudkey.commons.RoomTypeInventory objRInventory = new com.cloudkey.commons.RoomTypeInventory();

		RoomType objRoomType = new RoomType();
		objRoomType.setCode( objRoomTypInventory.getRoomTypeCode());
		objRInventory.setRoomType(objRoomType);

		objRInventory.setRoomsAvailable(objRoomTypInventory.getTotalAvailableRooms().intValue());
		objRInventory.setTotalRooms( objRoomTypInventory.getTotalRooms().intValue());

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " getRoomTypeInventoryInstance ", " Exit getRoomTypeInventoryInstance method " );

		return objRInventory;
	}

	@Override
	public boolean persistReservationData( Reservation objReservation) throws SQLException {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistReservationData ", " Enter persistReservationData method " );

		boolean isStored = false;
		
		Connection objConn = null;
		String sqlQuery = null;
		
		int rowUpdated = 0;
		int lastInsetedId = 0;
		int roomAllocationListSize = 0;

		PreparedStatement objPreparedStatement = null;
		
		String pmsId = objReservation.getPmsId();
		int stayLength = objReservation.getStayLength();
		String fullName = objReservation.getFullName();
		String firstName = objReservation.getFirstName();
		String lastName = objReservation.getLastName();
		
		String companyName = objReservation.getCompany();
		String address = objReservation.getAddress();
		String phoneNumber = objReservation.getPhoneNumber();
		String emailAddr = objReservation.getEmail();
		String loyaltyNumber = objReservation.getLoyaltyNumber();
		
		int numberOfGuest = objReservation.getNumberOfGuests();
        //List<RoomDetails> listRoomDetails = objReservation.getRoomDetailList();
		List<ReservationRoomAllocation> roomAllocList = objReservation.getReservationRoomAllocationList();
		String confirmationNumber = objReservation.getConfirmationNumber();
		String checkInDate = objReservation.getCheckinDate();
		
		String checkOutDate = objReservation.getCheckoutDate();
		String notes = objReservation.getNotes();
		String loyaltyProgram = objReservation.getLoyaltyProgram();
		String propertyId = objReservation.getPropertyId();
		String creditCardNumber = objReservation.getCreditCardNumber();
		
		String reservationSource = objReservation.getReservationSource();
		byte[] propertyImage = objReservation.getPropertyImage();
		String affiliateId = objReservation.getAffilateId();
		String message = objReservation.getMessage();

		String reservationAction = objReservation.getReservationAction(); 
		
		try {
			objConn = MicrosDAOImpl.getConnection();
			objConn.setAutoCommit(false);//////////
			
			sqlQuery = "insert into keypr_bridge_db.reservation_upload ( pms_id, stay_length, first_name, last_name, company_name, address, loyalty_number, "
					+ "phone, number_of_guest, confirmation_number, check_in_date, check_out_date, notes, loyalty_program, property_id, credit_card_no, "
					+ "reservation_source, affiliate_id, date_created, messages, email_id, status , reservation_action ) values "
					+ "( ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,now(),?, ?,?,?) ";
			
			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistReservationData ", " Insert Query " + sqlQuery );
			
			objPreparedStatement = objConn.prepareStatement(sqlQuery , Statement.RETURN_GENERATED_KEYS);

			objPreparedStatement.setString( 1, pmsId );
			objPreparedStatement.setInt( 2, stayLength );
			objPreparedStatement.setString( 3, firstName );
			objPreparedStatement.setString( 4, lastName );
			objPreparedStatement.setString( 5, companyName );

			objPreparedStatement.setString( 6, address );
			objPreparedStatement.setString( 7, loyaltyNumber );
			objPreparedStatement.setString( 8,phoneNumber );
			objPreparedStatement.setInt( 9,numberOfGuest );
			objPreparedStatement.setString( 10, confirmationNumber );

			objPreparedStatement.setString( 11, checkInDate );
			objPreparedStatement.setString( 12, checkOutDate );
			objPreparedStatement.setString( 13,notes );
			objPreparedStatement.setString( 14,loyaltyProgram );
			objPreparedStatement.setString( 15, propertyId );

			objPreparedStatement.setString( 16, creditCardNumber );
			objPreparedStatement.setString( 17, reservationSource );
			// objPreparedStatement.setBlob(18, propertyImage );
			objPreparedStatement.setString( 18, affiliateId );
			//date_created is added by function now()

			//date_modified columns has to be alter , now uses now()
			objPreparedStatement.setString( 19, message);
			objPreparedStatement.setString( 20, "email" );
			objPreparedStatement.setString( 21, IMicrosHarvester.RESERVATION_STATUS );
			objPreparedStatement.setString( 22, reservationAction );
			
			rowUpdated = objPreparedStatement.executeUpdate();

			if( rowUpdated !=0 ) {
				
				ResultSet keys = objPreparedStatement.getGeneratedKeys(); 

				keys.next();  
				lastInsetedId = keys.getInt(1);

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistReservationData ", " Reservation record saved in database " );
				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistReservationData ", " Record Id is " + lastInsetedId );

				roomAllocationListSize = roomAllocList.size();
				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistReservationData ", " RoomAllocationSize list size " + roomAllocationListSize );

				for( int len = 0; len < roomAllocationListSize ; len++ ) {

					int currentId = persistRecordInReservationRoomAllocation( lastInsetedId, roomAllocList.get(len), objConn );
					DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistReservationData ", " Reservation Room Allocation id " + currentId);

					List<RoomRate> roomRateList = roomAllocList.get(len).getRoomRateList();
					boolean isRecordSaved = persistRecordInReservationRoomRates( currentId, roomRateList ,objConn );

					if( isRecordSaved ) {

						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistReservationData ", " Roomrate records saved in the database");
						
						isStored = true;
					}
					else {
						
                        objConn.rollback();
						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistReservationData ", " Sorry Roomrate records not saved " );
					}

				}
				
				objConn.commit();
			}
			else {
				
				objConn.rollback();
				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistReservationData ", " Sorry, Reservation record cannot be inserted " );
			}

		}
		catch( Exception exc ){

			objConn.rollback();
			DataHarvesterLogger.logError(MicrosDAOImpl.class, " persistReservationData ", exc );
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistReservationData ", " Exit persistReservationData method " );

		return isStored;
	}
	/**
	 * This method will store reservation room allocation data in the database. It accept reservation identifier
	 * of the reservation record recently added to the reservation upload table.
	 * 
	 * @param reservationId
	 * @return
	 * @throws SQLException 
	 */
	private int persistRecordInReservationRoomAllocation( int reservationId , ReservationRoomAllocation objRoomAllocation ,Connection objConn) throws SQLException {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomAllocation ", " Enter persistRecordInReservationRoomAllocation method " );

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomAllocation ", " Reservation Id received :: " + reservationId );

		int recordId = 0;
		int rowUpdated = 0;

		Connection conn = null;
		PreparedStatement objPreparedStatement = null;
		String sqlQuery = null;

		try {

			conn = objConn;
			sqlQuery = " insert into keypr_bridge_db.reservation_room_allocation_upload ( reservation_upload_id, room_number, room_type_code,  reservation_status_type ,date_created) values"
					+ "( ?, ?, ?, ? ,now())";

			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomAllocation ", " Insert Query " + sqlQuery );
			
			objPreparedStatement = conn.prepareStatement( sqlQuery, Statement.RETURN_GENERATED_KEYS );

			String roomNum = String.valueOf(objRoomAllocation.getRoomNo());
			String roomCode = objRoomAllocation.getRoomType().getCode();
            String reservationStatusType  = objRoomAllocation.getReservationStatusType();
			
			objPreparedStatement.setInt( 1, reservationId );
			objPreparedStatement.setString( 2, roomNum);
			objPreparedStatement.setString( 3, roomCode);
			objPreparedStatement.setString( 4, reservationStatusType);

			rowUpdated = objPreparedStatement.executeUpdate();

			if( rowUpdated !=0 ) {
				ResultSet keys = objPreparedStatement.getGeneratedKeys(); 

				keys.next();  
				recordId = keys.getInt(1);

				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomAllocation ", " ReservationRoomAllocatin record saved in datbase " );
				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomAllocation ", " Inserted record Id is " + recordId );

			}
			else {
				conn.rollback();
				DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomAllocation ", " Sorry, Record cannot be inserted " );
			}

		}
		catch( Exception exc ) {

			conn.rollback();
			DataHarvesterLogger.logError( MicrosDAOImpl.class, " persistRecordInReservationRoomAllocation ", exc);
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomAllocation ", " Exit persistRecordInReservationRoomAllocation method " );

		return recordId;

	}
	
/**
 * This method stores the details of room rates associated with the given reservation room allocation to the database.
 * 
 * @param roomAllocationId
 * @param roomRateList
 * @return
 * @throws SQLException 
 */
	private boolean persistRecordInReservationRoomRates( int roomAllocationId, List<RoomRate> roomRateList, Connection objConn ) throws SQLException {

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " Enter persistRecordInReservationRoomRates method " );

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " RoomAllocation Record Id " + roomAllocationId );

		boolean isPersisted = false;
		int roomRateListSize = 0;
		Connection conn = null;
		String sqlQuery = null;
		PreparedStatement objPreparedStatement = null;

		roomRateListSize = roomRateList.size();
		if(roomRateListSize !=0 ) {

			conn= objConn;

			try {

				for( int len = 0 ; len < roomRateListSize ; len++ ) {
					
					sqlQuery = "insert into keypr_bridge_db.reservation_room_rates_upload (room_allocation_id, base_rate, rate_plan_code,"
							+ "effective_date, expiration_date,date_created ) values ( ?,?,?,?,?,now())";
					
					DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " Insert Query " + sqlQuery );
					
					objPreparedStatement = conn.prepareStatement(sqlQuery);
					RoomRate objRoomRate = roomRateList.get(len);

					objPreparedStatement.setInt( 1, roomAllocationId);
					objPreparedStatement.setDouble( 2, objRoomRate.getBaseAmount());
					objPreparedStatement.setString( 3, objRoomRate.getPlanCode());
					objPreparedStatement.setString( 4, objRoomRate.getEffectiveDate());
					objPreparedStatement.setString(5, objRoomRate.getExpirationDate());

					int rowInserted = objPreparedStatement.executeUpdate();

					if( rowInserted != 0 ){
						
						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " RoomRate saved" );
						isPersisted = true;
						
						sqlQuery = "SELECT alloc_upload.reservation_upload_id  FROM keypr_bridge_db.reservation_room_allocation_upload alloc_upload WHERE id = ?";
						
						objPreparedStatement = conn.prepareStatement(sqlQuery);
						objPreparedStatement.setInt(1, roomAllocationId);
						
						ResultSet retrievedRows = objPreparedStatement.executeQuery();
						
						if( retrievedRows != null ) {
							
							retrievedRows.next();
							 
							int id = retrievedRows.getInt(1);
							
							sqlQuery = "update keypr_bridge_db.reservation_upload set status = ? where id = ?";
							
							DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " Update Query " + sqlQuery );
							
							objPreparedStatement = conn.prepareStatement(sqlQuery);
							objPreparedStatement.setString(1, IMicrosHarvester.RESERVATON_STATUS_COMPL );
							objPreparedStatement.setInt(2, id);
							
							int numRows = objPreparedStatement.executeUpdate();
							
							if(numRows !=0 ){
								
								DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " Status updated in Reservation Upload " );
							}
							else {
								
								conn.rollback();
								DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " Sorry Status cannot be updated." );
							}
							
						}
						else {
							
							conn.rollback();
							DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " Reservation Id not Collected " );
						}
						
					}
					else {
						
						DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " RoomRate not saved " );
						
						conn.rollback();
						isPersisted = false;
					}

				}

			}
			catch( Exception exc ) {

				conn.rollback();
				DataHarvesterLogger.logError( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", exc );
			}

		}
		else {
			
			DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " RoomRateList is Empty " );
		}

		DataHarvesterLogger.logInfo( MicrosDAOImpl.class, " persistRecordInReservationRoomRates ", " Exit persistRecordInReservationRoomRates method " );
		
		return isPersisted;

	}
}
