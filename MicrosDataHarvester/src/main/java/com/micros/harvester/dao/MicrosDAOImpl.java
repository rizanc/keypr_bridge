package com.micros.harvester.dao;

import com.cloudkey.commons.*;
import com.cloudkey.pms.micros.og.availability.CalendarDailyDetail;
import com.cloudkey.pms.micros.og.hotelcommon.RoomTypeInventory;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse;
import com.google.inject.Inject;
import com.micros.harvester.constant.IMicrosHarvester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Date;
import java.util.List;

/**
 * This class handles the database related operations for the data harvester service.
 * It connects with the database and stores data collected from the property management
 * system to the database.
 *
 * @author vinayk2
 */
public class MicrosDAOImpl implements IMicrosDAO {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Inject
	protected DataSource dataSource;

/*
	@Override
	public boolean persistRoomStatusDataInBridgeDB( FetchRoomStatusResponse objFetchRoomStatusResponse ) {

		log.debug("persistRoomStatusDataInBridgeDB: Enter persistRoomStatusDataInBridgeDB method " );

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = "";

		String houseKeepingStatus = "";
		String frontOfficeStatus = "";
		String roomType = "";
		int roomNumber;

		boolean isInserted = false;

		*/
/*ResultStatus objRStatus = objFetchRoomStatusResponse.getResult();
		ResultStatusFlag objReFlag  = objRStatus.getResultStatusFlag();
		String status = objReFlag.getValue();
		 *//*

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.RoomStatus[] objRoomStatusArray = objFetchRoomStatusResponse.getRoomStatus();

		log.debug("persistRoomStatusDataInBridgeDB: Number of RoomStatus is: {}", objRoomStatusArray.length);

		try {

			objConnection = MicrosDAOImpl.getConnection();

			boolean isFound = false;
			boolean isUploaded = false;

			for( int len = 0 ; len< objRoomStatusArray.length; len++ ) {

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

				log.debug("persistRoomStatusDataInBridgeDB: Room Detail object passed to checkExistence " );

				isFound = checkExistence( objRoomDetails);

				if( isFound ) { // Fetched record already exists in the room_details , compare the contents and then proceed.

					boolean isContainsChanges = compareRecord ( objRoomDetails); // checks whether fetched record is new or updated or same as existing record.

					if( isContainsChanges) { // Fetched record contains new field value , push the data to upload and update existing record.

						isUploaded = pushDataToUpload( objRoomDetails );

						if( isUploaded ) {

							log.debug("persistRoomStatusDataInBridgeDB: Record uploaded in the room_details_upload queue " );

							sqlQuery = IMicrosHarvester.QUERY_ROOM_DETAILS_UPDATE_BY_ROOM_NUMBER;

							log.debug("persistRoomStatusDataInBridgeDB: Update Query: {}", sqlQuery );

							pStatement = objConnection.prepareStatement( sqlQuery );

							pStatement.setString( 1, objRoomDetails.getRoomType().getCode() );
							pStatement.setString( 2, objRoomDetails.getFrontOfficeStatus() );
							pStatement.setString( 3, objRoomDetails.getHouseKeeepingStatus() );
							pStatement.setInt( 4, objRoomDetails.getRoomNumber() );

							int rowsUpdated = pStatement.executeUpdate();

							if( rowsUpdated != IMicrosHarvester.ROWS_UPDATED ) {

								log.debug("persistRoomStatusDataInBridgeDB: Record updated in the room_details " );
							}
							else {

								log.debug("persistRoomStatusDataInBridgeDB: Record not updated in the room_details " );
							}

						}
						else {

							log.debug("persistRoomStatusDataInBridgeDB: Record not uploaded in the room_details_upload queue " );
						}

					}
					else { //nothing new in fetched record

						log.debug("persistRoomStatusDataInBridgeDB: Nothing to be uploaded on upload room status db " );
					}

				}
				else { // fetched record is new

					log.debug("persistRoomStatusDataInBridgeDB: Record does not exist in room_details room number: {}", roomNumber );

					isUploaded = pushDataToUpload( objRoomDetails );

					if( isUploaded ) {

						log.debug("persistRoomStatusDataInBridgeDB: Record uploaded in the room_details_upload queue " );
						isInserted = persistRecordInBridgeRoomStatus( objRoomDetails);
					}
					else {

						log.debug("persistRoomStatusDataInBridgeDB: Record not uploaded in the room_details_upload queue " );
					}

					if ( isInserted ) {

						log.debug("persistRoomStatusDataInBridgeDB: Record stored in room_details " );

					}
					else {

						log.debug("persistRoomStatusDataInBridgeDB: Record Cannot be stored in room_details " );
					}

				}
			}
		}
		catch ( Exception exc ) {

			log.error(" persistRoomStatusDataInBridgeDB ", exc ) ;
		}

		finally {

			if( objConnection != null ) {

				try {

					objConnection.close();
				}
				catch(SQLException sqe) {

					log.error(" StatusDataInBridgeDB Connection cannot be closed ", sqe );
				}
			}
		}

		log.debug("persistRoomStatusDataInBridgeDB: Exit persistRoomStatusDataInBridgeDB method " );

		return isInserted;
	}
*/

	/**
	 * This method will compare the contents of record received from the property management system as room status
	 * response with the content existing record of the room_details table of keypr_upload_db database.
	 *
	 * @param objRoomDetails
	 * @return
	 */
	private boolean compareRecord( RoomDetails objRoomDetails ) {

		log.debug("compareRecord: Enter compareRecord method ");

		boolean isNewFiedlValue = false;

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;
		ResultSet rSet = null;

		try {

			objConnection = dataSource.getConnection();

			sqlQuery = IMicrosHarvester.QUERY_ROOM_DETAILS_SELECT_BY_ROOM_NUMBER ;

			log.debug("compareRecord: Select Query: {}", sqlQuery);

			pStatement = objConnection.prepareStatement( sqlQuery );

			pStatement.setString(1, objRoomDetails.getRoomNumber());
			rSet = pStatement.executeQuery();

			if( rSet != null ) {

				while( rSet.next() ) {

					RoomDetails persistObject = new RoomDetails();
					persistObject.setFrontOfficeStatus( rSet.getString( IMicrosHarvester.ROOM_DETAILS_FRONT_OFFICE_STATUS) );
					persistObject.setHouseKeeepingStatus( rSet.getString( IMicrosHarvester.ROOM_DETAILS_HOUSE_KEEPING_STATUS) );

					RoomType objRoomType = new RoomType();
					objRoomType.setCode( rSet.getString( IMicrosHarvester.ROOM_DETAILS_ROOM_TYPE) );

					objRoomDetails.setRoomType( objRoomType );

					persistObject.setRoomType( objRoomType );

					if( persistObject.equals( objRoomDetails ) ) {

						isNewFiedlValue = false;
						log.debug("compareRecord: Duplicate Record Received ");
					}
					else {

						isNewFiedlValue = true;
						log.debug("compareRecord: Unique Record Received ");
					}
				}

			}
			else {

				log.debug("compareRecord: No Record fetched from room_details ");
			}

		}
		catch ( Exception exc ) {

			log.error(" compareRecord ", exc ) ;
		}
		finally {

			if( objConnection != null ) {

				try {

					objConnection.close();
				}
				catch(SQLException sqe) {

					log.error(" compareRecord Connection cannot be closed ", sqe );
				}
			}

		}

		log.debug("compareRecord: Exit compareRecord method ");

		return isNewFiedlValue;
	}

	public boolean persistRecordInBridgeRoomStatus( RoomDetails objRoomDetails ) {

		log.debug("persistRecordInBridgeRoomStatus: Enter persistRecordInBridgeRoomStatus method ");

		boolean isPersisted = false;

		Connection objConnection = null;
		PreparedStatement pStatement = null;

		String sqlQuery = null;

		sqlQuery = IMicrosHarvester.QUERY_ROOM_DETAILS_INSERT ;

		try {

			objConnection = dataSource.getConnection();

			log.debug("persistRecordInBridgeRoomStatus: Insert Query: {}", sqlQuery);
			pStatement = objConnection.prepareStatement( sqlQuery );

			pStatement.setString(1, objRoomDetails.getRoomNumber());
			pStatement.setString(2, objRoomDetails.getRoomType().getCode() );
			pStatement.setString (3, objRoomDetails.getFrontOfficeStatus() );
			pStatement.setString(4,  objRoomDetails.getHouseKeeepingStatus() );

			int rowInserted = pStatement.executeUpdate();

			if ( rowInserted != IMicrosHarvester.ROWS_UPDATED ) {

				isPersisted = true;

				log.debug("persistRecordInBridgeRoomStatus: Row inserted in Room_Details ");
			}
			else {

				log.debug("persistRecordInBridgeRoomStatus: Row cannot be inserted in Room_Details ");
			}
		}
		catch ( Exception exc ) {

			log.error(" persistRecordInBridgeRoomStatus ", exc) ;
		}
		finally {

			if( objConnection != null ) {

				try {

					objConnection.close();
				}
				catch(SQLException sqe) {

					log.error(" persistRecordInBridgeRoomStatus Connection cannot be closed ", sqe );
				}
			}
		}

		log.debug("persistRecordInBridgeRoomStatus: Exit persistRecordInBridgeRoomStatus method ");

		return isPersisted;
	}

	/**
	 * This method will store the room status record received from the property management system
	 * in the room_details_upload table of keypr_upload_db database.
	 *
	 * @param objRoomDetails
	 * @return
	 */
	private boolean pushDataToUpload( RoomDetails objRoomDetails ) {

		log.debug("pushDataToUpload: Enter  pushDataToUpload method ");

		boolean isPushed = false;

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		String sqlQuery = null;

		sqlQuery = IMicrosHarvester.QUERY_ROOM_DETAILS_UPLOAD_INSERT;

		try {

			objConnection = dataSource.getConnection();

			log.debug("pushDataToUpload: Insert Query: {}", sqlQuery);
			pStatement = objConnection.prepareStatement( sqlQuery );

			pStatement.setString(1, objRoomDetails.getRoomNumber());
			pStatement.setString(2, objRoomDetails.getRoomType().getCode() );

			pStatement.setString(3, objRoomDetails.getFrontOfficeStatus() );
			pStatement.setString(4,  objRoomDetails.getHouseKeeepingStatus() );

			int rowInserted = pStatement.executeUpdate();

			if ( rowInserted != IMicrosHarvester.ROWS_UPDATED ) {

				log.debug("pushDataToUpload: Row inserted in Room_Details_upload ");
				isPushed = true;
			}
			else {

				log.debug("pushDataToUpload: Row cannot be inserted in Room_Details_upload ");
			}
		}
		catch ( Exception exc ) {

			log.error(" pushDataToUpload ", exc) ;
		}
		finally {

			if( objConnection != null ) {

				try {

					objConnection.close();
				}
				catch(SQLException sqe) {

					log.error(" pushDataToUpload Connection cannot be closed ", sqe );
				}
			}
		}
		log.debug("pushDataToUpload: Exit pushDataToUpload method ");

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

		log.debug("checkExistence: Enter checkExistence method ");

		boolean isFound = false;

		ResultSet rSet = null;
		Connection objConnection = null;
		PreparedStatement pStatement = null;

		String sqlQuery = null;

		try {

			objConnection = dataSource.getConnection();

			sqlQuery = IMicrosHarvester.QUERY_ROOM_DETAILS_COUNT_RECORD_BY_ROOM_NUMBER;

			log.debug("checkExistence: Select Query: {}", sqlQuery);

			pStatement = objConnection.prepareStatement( sqlQuery );
			pStatement.setString(1, objRoomDetail.getRoomNumber());

			log.debug("checkExistence: Room Number is: {}", objRoomDetail.getRoomNumber());

			rSet = pStatement.executeQuery();

			while ( rSet.next() ) {

				int num = Integer.parseInt( rSet.getString( IMicrosHarvester.STRING_COUNT ) );

				if( num != 0) {

					isFound = true;

				}
			}

			if( isFound ) {

				log.debug("checkExistence: Record already exist in room_details of keypr_bride_db ");
			}
			else {

				log.debug("checkExistence: New Record for room_details the keypr_bride_db ");

			}
		}
		catch ( Exception exc ) {

			log.error(" checkExistence ", exc) ;
		}
		finally {

			if( objConnection != null ) {

				try {

					objConnection.close();
				}
				catch(SQLException sqe) {

					log.error(" checkExistence Connection cannot be closed ", sqe );
				}
			}
		}
		log.debug("checkExistence: checkExistence method record exists: {}", isFound);
		log.debug("checkExistence: Exit checkExistence method ");

		return isFound;
	}

	public void persistRoomInventoryData( FetchCalendarResponse objFetchCalendarResponse) {

		log.debug("persistRoomInventoryData: Enter persistRoomInventoryData method ");

		boolean isExists = false;
		boolean isDuplicated = true;

		Connection objConnection = null;
		PreparedStatement pStatement = null;

		String sqlQuery = null;

		log.debug("persistRoomInventoryData: Inventory has Detail for Calendar days: {}", objFetchCalendarResponse.getCalendar().size());
		for (CalendarDailyDetail objCalendarDailyDetail : objFetchCalendarResponse.getCalendar()) {
			log.debug("persistRoomInventoryData: Details for Calendar day: {}", objCalendarDailyDetail.getDate());

			log.debug("persistRoomInventoryData: Number of room inventory present: {} for calendar day {}", objCalendarDailyDetail.getOccupancy().size(), objCalendarDailyDetail.getDate());
			for (RoomTypeInventory roomTypeInventory : objCalendarDailyDetail.getOccupancy()) {
				com.cloudkey.commons.RoomTypeInventory objRInventory = getRoomTypeInventoryInstance( roomTypeInventory, objCalendarDailyDetail.getDate());

				isExists = checkExistenceInRoomInventory( objRInventory );

				if ( isExists ) { // fetched record with given room type code does exist in the room inventory table.

					log.debug("persistRoomInventoryData: Record Already present in room inventory ");
					isDuplicated = compareInventoryRecord (objRInventory);

					if ( isDuplicated ) {

						log.debug("persistRoomInventoryData: Duplicate Record for in room inventory ");

					}
					else {

						log.debug("persistRoomInventoryData: Updated  Record for in room inventory ");

						boolean isPersited = persistDataInRoomInventoryUpload( objRInventory );

						if( isPersited ) {

							log.debug("persistRoomInventoryData: Record inserted in room_inventory_upload ");

							try {

								objConnection = dataSource.getConnection();

								sqlQuery = IMicrosHarvester.QUERY_ROOM_INVENTORY_UPDATE_BY_TYPE_CODE;

								log.debug("persistRoomInventoryData: Update Query: {}", sqlQuery);

								pStatement = objConnection.prepareStatement(sqlQuery);

								pStatement.setInt(1, objRInventory.getTotalRooms());
								//pStatement.setInt(2, objRInventory.getRoomsAvailable());
								pStatement.setInt(2, objRInventory.getTotalRoomsAvailable());
								pStatement.setString(3, objRInventory.getRoomType().getCode());

								int rowsUpdated = pStatement.executeUpdate();

								if ( rowsUpdated != IMicrosHarvester.ROWS_UPDATED ) {

									log.debug("persistRoomInventoryData: Record updated in room_inventory ");
								}
								else {

									log.debug("persistRoomInventoryData: Record Cannot be updated in room_inventory ");

								}
							}
							catch ( Exception exc ) {

							}
						}
						else {

							log.debug("persistRoomInventoryData: Record not inserted in room_inventory_upload ");
						}
					}
				}
				else { // fetched record with given room type code does not exist in the room inventory table.

					log.debug("persistRoomInventoryData: Fresh Record for in room inventory ");
					try {

						objConnection = dataSource.getConnection();

						sqlQuery = IMicrosHarvester.QUERY_ROOM_INVENTORY_INSERT;

						log.debug("persistRoomInventoryData: Insert Query: {}", sqlQuery);

						pStatement = objConnection.prepareStatement( sqlQuery );
						pStatement.setString(1, objRInventory.getRoomType().getCode() );
						pStatement.setInt(2, objRInventory.getTotalRooms() );
						pStatement.setInt(3, objRInventory.getTotalRoomsAvailable() );

						int rowUpdated = pStatement.executeUpdate();

						if( rowUpdated != IMicrosHarvester.ROWS_UPDATED ) {

							log.debug("persistRoomInventoryData: Record Inserted in room_inventory with type code: {}", objRInventory.getRoomType().getCode());

							boolean isPersited = persistDataInRoomInventoryUpload(objRInventory);

							if( isPersited ) {

								log.debug("persistRoomInventoryData: Record inserted in room_inventory_upload ");
							}
							else {

								log.debug("persistRoomInventoryData: Record not inserted in room_inventory_upload ");
							}
						}
						else {

							log.debug("persistRoomInventoryData: Record not inserted in room_inventory ");
						}

					}
					catch (Exception exc) {

						log.error(" persistRoomInventoryData ", exc );
					}
					finally {

						if( objConnection != null ) {

							try {

								objConnection.close();
							}
							catch(SQLException sqe) {

								log.error(" persistRoomInventoryData Connection cannot be closed ", sqe );
							}
						}
					}
				}
			}

		}

		log.debug("persistRoomInventoryData: Exit persistRoomInventoryData method ");
	}

	/**
	 * This method compares the content of room inventory record with the room inventory record of same type
	 * present in the room upload table. If new data is present in the recent fetched record then it sent
	 * true otherwise it returns false;
	 *
	 * @return
	 */
	private boolean compareInventoryRecord( com.cloudkey.commons.RoomTypeInventory objRInventory ) {

		log.debug("compareInventoryRecord: Enter compareInventoryRecord method ");

		boolean isDuplicateRow = false;
		boolean isRecordFound = false;

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		ResultSet rSet = null;

		String sqlQuery = null;
		String roomTypeCode = null;

		try {

			objConnection = dataSource.getConnection();
			roomTypeCode = objRInventory.getRoomType().getCode();

			sqlQuery = IMicrosHarvester.QUERY_ROOM_INVENTORY_SELECT_BY_TYPE_CODE;

			log.debug("compareInventoryRecord: Select Query: {}", sqlQuery);

			pStatement = objConnection.prepareStatement( sqlQuery );

			pStatement.setString(1, roomTypeCode );

			rSet = pStatement.executeQuery();

			if( rSet != null) {

				log.debug("compareInventoryRecord: Record fetched from room_inventory with type code: {}", roomTypeCode);

				while( rSet.next()) {

					isRecordFound = true;
					com.cloudkey.commons.RoomTypeInventory objRInventoryData = new com.cloudkey.commons.RoomTypeInventory();

					//objRInventoryData.setRoomsAvailable(rSet.getInt("total_rooms_available"));
					objRInventoryData.setTotalRoomsAvailable(rSet.getInt( IMicrosHarvester.ROOM_INVENTORY_TOTAL_ROOMS_AVAILABLE) );
					objRInventoryData.setTotalRooms( rSet.getInt( IMicrosHarvester.ROOM_INVENTORY_TOTAL_ROOMS));

					if( objRInventory.equals(objRInventoryData) ) {

						isDuplicateRow = true;
						log.debug("compareInventoryRecord: Both Records are same ");
					}
					else {

						isDuplicateRow = false;
						log.debug("compareInventoryRecord: Both Records are unique ");
					}
				}
				if ( isRecordFound ) {
					log.debug("compareInventoryRecord: Result set has row ");
				}
				else {
					log.debug("compareInventoryRecord: Result set is empty ");
				}
			}
			else {

				log.debug("compareInventoryRecord: No Record fetched from room_inventory ");
			}

		}
		catch (Exception exc) {

			log.error(" compareInventoryRecord ", exc );
		}
		finally {

			if( objConnection != null ) {

				try {

					objConnection.close();
				}
				catch(SQLException sqe) {

					log.error(" compareInventoryRecord Connection cannot be closed ", sqe );
				}
			}
		}
		log.debug("compareInventoryRecord: Returning from compareInventoryRecord method: {}", isDuplicateRow);
		log.debug("compareInventoryRecord: Exit compareInventoryRecord method ");

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

		log.debug("persistDataInRoomInventoryUpload: Enter persistDataInRoomInventoryUpload method ");

		boolean isInserted = false;

		Connection objConnection = null;
		PreparedStatement pStatement = null;

		String sqlQuery = null;

		try {

			objConnection = dataSource.getConnection();

			sqlQuery = IMicrosHarvester.QUERY_ROOM_INVENTORY_UPLOAD_INSERT;

			log.debug("persistDataInRoomInventoryUpload: Insert Query: {}", sqlQuery);

			pStatement = objConnection.prepareStatement(sqlQuery);

			pStatement.setString(1, objRoomInventory.getRoomType().getCode() );
			pStatement.setInt(2, objRoomInventory.getTotalRooms() );
			pStatement.setInt(3, objRoomInventory.getTotalRoomsAvailable() );

			int rowUpdated = pStatement.executeUpdate();

			if( rowUpdated != IMicrosHarvester.ROWS_UPDATED ) {

				isInserted = true;
				log.debug("persistDataInRoomInventoryUpload: Record Inserted in room_inventory_upload with type code: {}", objRoomInventory.getRoomType().getCode());
			}
			else {

				log.debug("persistDataInRoomInventoryUpload: Record not inserted in room_inventory_upload ");
			}

		}
		catch ( Exception exc ) {

			log.error(" persistDataInRoomInventoryUpload ", exc );
		}
		finally {

			if( objConnection != null ) {

				try {

					objConnection.close();
				}
				catch(SQLException sqe) {

					log.error(" persistDataInRoomInventoryUpload Connection cannot be closed ", sqe );
				}
			}
		}

		log.debug("persistDataInRoomInventoryUpload: Exit persistDataInRoomInventoryUpload method ");

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

		log.debug("checkExistenceInRoomInventory: Enter checkExistenceInRoomInventory method ");

		boolean isFound = false;

		Connection objConnection = null;
		PreparedStatement pStatement = null;
		ResultSet rSet = null;

		String sqlQuery = null;

		try {

			objConnection = dataSource.getConnection();

			sqlQuery = IMicrosHarvester.QUERY_ROOM_INVENTORY_COUNT_RECORD_BY_TYPE_CODE;

			log.debug("checkExistenceInRoomInventory: Select Query: {}", sqlQuery);

			pStatement = objConnection.prepareStatement( sqlQuery );
			pStatement.setString(1, objRoomInventory.getRoomType().getCode() );

			log.debug("checkExistenceInRoomInventory: Room Type is: {}", objRoomInventory.getRoomType().getCode());

			rSet = pStatement.executeQuery();

			while ( rSet.next() ) {

				int num = Integer.parseInt(rSet.getString( IMicrosHarvester.STRING_COUNT ));

				if(num != IMicrosHarvester.ROWS_UPDATED) {

					isFound = true;

				}
			}

			if( isFound ) {

				log.debug("checkExistenceInRoomInventory: Record with Code same keypr_bride_db ");
			}
			else {

				log.debug("checkExistenceInRoomInventory: New Record for room_inventory the keypr_bride_db ");

			}
		}
		catch ( Exception exc ) {

			log.error(" checkExistenceInRoomInventory ", exc );

		}
		finally {

			if( objConnection != null ) {

				try {

					objConnection.close();
				}
				catch(SQLException sqe) {

					log.error(" checkExistenceInRoomInventory Connection cannot be closed ", sqe );
				}
			}
		}

		log.debug("checkExistenceInRoomInventory: Exit checkExistenceInRoomInventory method ");

		return isFound;

	}

	/**
	 * This method accepts room inventory detail information , fetched from room type inventory list.
	 * Pull the data from fetched instance and set the retrieved data in an instance of RoomTypeInventory Class.
	 *
	 * @param objRoomTypInventory
	 * @param currentCalendarDay
	 * @return
	 */
	private com.cloudkey.commons.RoomTypeInventory getRoomTypeInventoryInstance( RoomTypeInventory objRoomTypInventory, Date currentCalendarDay ) {

		log.debug("getRoomTypeInventoryInstance: Enter getRoomTypeInventoryInstance method ");

		// Store the retrieved inventory information in RoomTypeInventory Instance.
		com.cloudkey.commons.RoomTypeInventory objRInventory = new com.cloudkey.commons.RoomTypeInventory();

		RoomType objRoomType = new RoomType();
		objRoomType.setCode( objRoomTypInventory.getRoomTypeCode() );
		objRInventory.setRoomType( objRoomType );

		objRInventory.setTotalRoomsAvailable( objRoomTypInventory.getTotalAvailableRooms().intValue() );
		objRInventory.setTotalRooms( objRoomTypInventory.getTotalRooms().intValue() );

		log.debug("getRoomTypeInventoryInstance: Exit getRoomTypeInventoryInstance method ");

		return objRInventory;
	}

	@Override
	public boolean persistReservationData( Reservation objReservation ) throws SQLException {

		log.debug("persistReservationData: Enter persistReservationData method ");

		boolean isStored = false;

		Connection objConn = null;
		String sqlQuery = null;

		int rowUpdated = 0;
		int lastInsetedId = 0;
		int roomAllocationListSize = 0;

		PreparedStatement objPreparedStatement = null;

		String pmsId = objReservation.getPmsId();
		int stayLength = objReservation.getStayLength();
		//String fullName = objReservation.getFullName();
		String firstName = objReservation.getFirstName();
		String lastName = objReservation.getLastName();

		String companyName = objReservation.getCompany();
		String address = objReservation.getAddress();
		String phoneNumber = objReservation.getPhoneNumber();
		//String emailAddr = objReservation.getEmail();
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
		//byte[] propertyImage = objReservation.getPropertyImage();
		String affiliateId = objReservation.getAffilateId();
		String message = objReservation.getMessage();

		String reservationAction = objReservation.getReservationAction();

		try {
			objConn = dataSource.getConnection();
			objConn.setAutoCommit(false);

			sqlQuery = IMicrosHarvester.QUERY_RESERVATION_UPLOAD_INSERT;

			log.debug("persistReservationData: Insert Query: {}", sqlQuery);

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

			if( rowUpdated != IMicrosHarvester.ROWS_UPDATED ) {

				ResultSet keys = objPreparedStatement.getGeneratedKeys();

				keys.next();
				lastInsetedId = keys.getInt(1);

				log.debug("persistReservationData: Reservation record saved in database ");
				log.debug("persistReservationData: Record Id is: {}", lastInsetedId);

				roomAllocationListSize = roomAllocList.size();

				log.debug("persistReservationData: RoomAllocationSize list size: {}", roomAllocationListSize);

				for( int len = 0; len < roomAllocationListSize ; len++ ) {

					int currentId = persistRecordInReservationRoomAllocation( lastInsetedId, roomAllocList.get(len), objConn );

					log.debug("persistReservationData: Reservation Room Allocation id: {}", currentId);

					List<RoomRate> roomRateList = roomAllocList.get(len).getRoomRateList();
					boolean isRecordSaved = persistRecordInReservationRoomRates( currentId, roomRateList ,objConn );

					if( isRecordSaved ) {

						log.debug("persistReservationData: Roomrate records saved in the database");

						isStored = true;
					}
					else {

						objConn.rollback();
						log.debug("persistReservationData: Sorry Roomrate records not saved ");
					}

				}

				objConn.commit();
			}
			else {

				objConn.rollback();
				log.debug("persistReservationData: Sorry, Reservation record cannot be inserted ");
			}

		}
		catch( Exception exc ){

			objConn.rollback();
			log.error(" persistReservationData ", exc);
		}

		log.debug("persistReservationData: Exit persistReservationData method ");

		return isStored;
	}

	@Override
	public boolean persistRtavData( Rtav objRtav ) throws SQLException {

		log.debug("persistRtavData: Enter persistRtavData method ");

		boolean isStored = false;

		Connection objConn = null;
		String sqlQuery = null;

		int rowUpdated = 0;
		int lastInsetedId = 0;

		try {

			/* Todo TBD: Persist Rtav data. */
			isStored = true ;

		}
		catch( Exception exc ){

			objConn.rollback();
			log.error(" persistRtavData ", exc);
		}

		log.debug("persistRtavData: Exit persistRtavData method ");

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

		log.debug("persistRecordInReservationRoomAllocation: Enter persistRecordInReservationRoomAllocation method ");

		log.debug("persistRecordInReservationRoomAllocation: Reservation Id received ::: {}", reservationId);

		int recordId = 0;
		int rowUpdated = 0;

		Connection conn = null;
		PreparedStatement objPreparedStatement = null;
		String sqlQuery = null;

		try {

			conn = objConn;

			sqlQuery = IMicrosHarvester.QUERY_RESERVATION_ROOM_ALLOCATION_UPLOAD_INSERT;

			log.debug("persistRecordInReservationRoomAllocation: Insert Query: {}", sqlQuery);

			objPreparedStatement = conn.prepareStatement( sqlQuery, Statement.RETURN_GENERATED_KEYS );

			String roomNum = String.valueOf(objRoomAllocation.getRoomNo());
			String roomCode = objRoomAllocation.getRoomType().getCode();
			String reservationStatusType  = objRoomAllocation.getReservationStatusType();

			objPreparedStatement.setInt(1, reservationId );
			objPreparedStatement.setString(2, roomNum );
			objPreparedStatement.setString(3, roomCode );
			objPreparedStatement.setString(4, reservationStatusType );

			rowUpdated = objPreparedStatement.executeUpdate();

			if( rowUpdated != IMicrosHarvester.ROWS_UPDATED ) {

				ResultSet keys = objPreparedStatement.getGeneratedKeys();

				keys.next();
				recordId = keys.getInt(1);

				log.debug("persistRecordInReservationRoomAllocation: ReservationRoomAllocatin record saved in datbase ");
				log.debug("persistRecordInReservationRoomAllocation: Inserted record Id is: {}", recordId);

			}
			else {
				conn.rollback();
				log.debug("persistRecordInReservationRoomAllocation: Sorry, Record cannot be inserted ");
			}

		}
		catch( Exception exc ) {

			conn.rollback();
			log.error(" persistRecordInReservationRoomAllocation ", exc);
		}

		log.debug("persistRecordInReservationRoomAllocation: Exit persistRecordInReservationRoomAllocation method ");

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

		log.debug("persistRecordInReservationRoomRates: Enter persistRecordInReservationRoomRates method ");

		log.debug("persistRecordInReservationRoomRates: RoomAllocation Record Id: {}", roomAllocationId);

		boolean isPersisted = false;

		int roomRateListSize = 0;

		Connection conn = null;
		String sqlQuery = null;
		PreparedStatement objPreparedStatement = null;

		roomRateListSize = roomRateList.size();

		if( roomRateListSize != IMicrosHarvester.ROWS_UPDATED ) {

			conn= objConn;

			try {

				for( int len = 0; len < roomRateListSize ; len++ ) {

					sqlQuery = IMicrosHarvester.QUERY_RESERVATION_ROOM_RATES_UPLOAD_INSERT;

					log.debug("persistRecordInReservationRoomRates: Insert Query: {}", sqlQuery);

					objPreparedStatement = conn.prepareStatement(sqlQuery);
					RoomRate objRoomRate = roomRateList.get(len);

					objPreparedStatement.setInt(1, roomAllocationId);
					objPreparedStatement.setDouble(2, objRoomRate.getBaseAmount() );
					objPreparedStatement.setString(3, objRoomRate.getPlanCode() );
					objPreparedStatement.setString(4, objRoomRate.getEffectiveDate() );
					objPreparedStatement.setString(5, objRoomRate.getExpirationDate() );

					int rowInserted = objPreparedStatement.executeUpdate();

					if( rowInserted != IMicrosHarvester.ROWS_UPDATED ) {

						log.debug("persistRecordInReservationRoomRates: RoomRate saved");
						isPersisted = true;

						sqlQuery = IMicrosHarvester.QUERY_RESERVATION_ROOM_ALLOCATION_UPLOAD_SELECT_BY_ID;

						objPreparedStatement = conn.prepareStatement(sqlQuery);
						objPreparedStatement.setInt(1, roomAllocationId);

						ResultSet retrievedRows = objPreparedStatement.executeQuery();

						if( retrievedRows != null ) {

							retrievedRows.next();

							int id = retrievedRows.getInt(1);

							sqlQuery = IMicrosHarvester.QUERY_RESERVATION_UPLOAD_UPDATE_BY_ID;

							log.debug("persistRecordInReservationRoomRates: Update Query: {}", sqlQuery);

							objPreparedStatement = conn.prepareStatement(sqlQuery);
							objPreparedStatement.setString(1, IMicrosHarvester.RESERVATON_STATUS_COMPL );
							objPreparedStatement.setInt(2, id);

							int numRows = objPreparedStatement.executeUpdate();

							if( numRows != IMicrosHarvester.ROWS_UPDATED ) {

								log.debug("persistRecordInReservationRoomRates: Status updated in Reservation Upload ");
							}
							else {

								conn.rollback();
								log.debug("persistRecordInReservationRoomRates: Sorry Status cannot be updated.");
							}

						}
						else {

							conn.rollback();
							log.debug("persistRecordInReservationRoomRates: Reservation Id not Collected ");
						}

					}
					else {

						log.debug("persistRecordInReservationRoomRates: RoomRate not saved ");

						conn.rollback();
						isPersisted = false;
					}

				}

			}
			catch( Exception exc ) {

				conn.rollback();
				log.error(" persistRecordInReservationRoomRates ", exc );
			}

		}
		else {

			log.debug("persistRecordInReservationRoomRates: RoomRateList is Empty ");
		}

		log.debug("persistRecordInReservationRoomRates: Exit persistRecordInReservationRoomRates method ");

		return isPersisted;

	}
}
