package com.cloudkey.test.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cloudkey.commons.Availability;
import com.cloudkey.commons.OrderDetails;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomRate;
import com.cloudkey.commons.RoomType;
import com.cloudkey.logger.MessageLogger;
import com.cloudkey.pms.request.CheckInRequest;
import com.cloudkey.pms.request.CheckOutRequest;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.request.GetFolioRequest;
import com.cloudkey.pms.request.SearchReservationRequest;
import com.cloudkey.pms.request.UpdateBookingRequest;
import com.cloudkey.pms.request.UpdatePaymentRequest;
import com.cloudkey.pms.response.CheckInResponse;
import com.cloudkey.pms.response.CheckOutResponse;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.cloudkey.pms.response.GetFolioResponse;
import com.cloudkey.pms.response.SearchReservationResponse;
import com.cloudkey.pms.response.UpdateBookingResponse;
import com.cloudkey.pms.response.UpdatePaymentResponse;
import com.cloudkey.test.util.ITestAdapterConstants;

/**
 * This class provides database related operations for the test adapter.
 * It defines all methods for performing keypr web request to the the property management system.
 * @author vinayk2
 *
 */
public class TestDAOImpl implements ITestDAO {

	@Override
	public SearchReservationResponse searchReservationData(SearchReservationRequest reservationRequest) {

		/* Variables used for performing search reservation data request.*/
		Connection conn = null;
		ResultSet rSet = null;

		boolean isEmptySet = true;
		boolean isFreshReservation = true;

		String firstName = null;
		String lastName = null;
		String email = null;
		String creditCard = null;
		String confirmationNumber = null;

		SearchReservationResponse resevResponseObj = null;
		CallableStatement objCallableStatement = null;

		int previousPMSId = 0;
		int previousRoomNumber = 0;

		try {

			resevResponseObj = new SearchReservationResponse();

			/* Read and store value of parameter provided by the user.*/
			firstName = reservationRequest.getFirstName();
			lastName = reservationRequest.getLastName();
			email = reservationRequest.getEmailId();
			creditCard = reservationRequest.getCreditCard();
			confirmationNumber = reservationRequest.getConfirmationNumber();

			/* String Buffer object to store dynamic search query. */
			StringBuffer sqlWhere = new StringBuffer();

			if((firstName.length()>0) && (firstName != null)) {

				sqlWhere = sqlWhere.append("RES.FIRST_NAME = '").append(firstName).append( ITestAdapterConstants.APPEND_AND );
			}

			if((lastName.length()>0) && (lastName != null)) {

				sqlWhere = sqlWhere.append("RES.LAST_NAME = '").append(lastName).append(ITestAdapterConstants.APPEND_AND );
			}

			if((email.length()>0)&& (email != null)) {

				sqlWhere = sqlWhere.append("RES.EMAIL = '").append(email).append(ITestAdapterConstants.APPEND_AND );
			}

			if((creditCard.length()>0 ) && (creditCard != null)) {

				sqlWhere = sqlWhere.append("RES.CREDIT_CARD_NO = '").append(creditCard).append(ITestAdapterConstants.APPEND_AND  );
			}

			if((confirmationNumber.length()>0 ) && (confirmationNumber != null)) {

				sqlWhere = sqlWhere.append("RES.CONFIRMATION_NUMBER = '").append(confirmationNumber).append(ITestAdapterConstants.APPEND_AND  );
			}

			String finalQ = ITestAdapterConstants.EMPTY_STRING;

			/* Removes extra And keyword from the end of the where clause. */
			if(sqlWhere.toString().contains("AND")) {

				finalQ = sqlWhere.substring(0,sqlWhere.lastIndexOf("AND"));   
			}

			if(! finalQ.equals(ITestAdapterConstants.EMPTY_STRING)) {  //block executes when where clause of query is not empty.

				conn = DataBaseHandler.getConnection();

				objCallableStatement = conn.prepareCall("{call procSearchReserv(?)}");
				objCallableStatement.setString(1, finalQ);
				MessageLogger.logInfo(TestDAOImpl.class, " searchReservationData ", "final Q " + finalQ);
				rSet = objCallableStatement.executeQuery();

				MessageLogger.logInfo(TestDAOImpl.class, " searchReservationData ", " ResultSet Created ");

				/* Reference variable to store reservations list. */
				List<Reservation> objResvList = new ArrayList<Reservation>();

				if(rSet == null) {   // block executes when the database does not return any record set.

					MessageLogger.logInfo( TestDAOImpl.class, " searchReservationData ", " ResultSet Object Not Created " );
				}

				else {

					MessageLogger.logInfo( TestDAOImpl.class, " searchReservationData ", " ResultSet Object Created " );
					int index = 0;

					/*
					 * Iterates through each row of the result set.
					 */
					while(rSet.next()) {

						MessageLogger.logInfo( TestDAOImpl.class, " searchReservationData ", " Iterating While Loop " );

						Reservation objReservation = null;

						if(isFreshReservation) { 

							objReservation = new Reservation();

							isEmptySet = false;
							isFreshReservation = false;

							/* Populate reservation instance data member with the data of the result set. */
							previousPMSId = rSet.getInt("PMS_ID");
							previousRoomNumber = rSet.getInt("room_number");

							objReservation.setAddress(rSet.getString("address"));
							objReservation.setCheckinDate(rSet.getString("check_in_date"));
							objReservation.setCheckoutDate(rSet.getString("check_out_date"));
							objReservation.setConfirmationNumber(rSet.getString("confirmation_number"));

							objReservation.setCompany(rSet.getString("company_name"));
							objReservation.setFullName(rSet.getString("first_name") + " " + rSet.getString("last_name"));
							objReservation.setLoyaltyNumber(rSet.getString("loyalty_number"));
							objReservation.setNumberOfGuests(Integer.parseInt(rSet.getString("number_of_guest")));

							objReservation.setPhoneNumber(rSet.getString("phone"));
							if(email.equalsIgnoreCase("")) {

								objReservation.setEmail("not provided");
							}
							else {

								objReservation.setEmail(email);
							}
							objReservation.setCreditCardNumber(rSet.getString("credit_card_no"));
							objReservation.setReservationSource(rSet.getString("reservation_source"));

							objReservation.setDateCreated(rSet.getDate("date_created"));
							objReservation.setNotes(rSet.getString("notes"));
							objReservation.setMessage(rSet.getString("messages"));

							objReservation.setAffilateId(rSet.getString("affiliate_id"));
							objReservation.setLoyaltyProgram(rSet.getString("loyalty_program"));
							objReservation.setPropertyId(rSet.getString("pms_id"));
							objReservation.setStayLength(Integer.parseInt(rSet.getString("stay_length")));

							RoomType objRoomType = new RoomType();
							objRoomType.setCode(rSet.getString("code"));
							objRoomType.setDescription(rSet.getString("description"));
							objRoomType.setFeatures(rSet.getString("features"));

							RoomRate objRoomRate = new RoomRate();
							objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
							objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));
							objRoomRate.setEffectiveDate(rSet.getString("effective_date"));
							objRoomRate.setExpirationDate(rSet.getString("expiration_date"));

							RoomDetails objRoomDetails = new RoomDetails();
							objRoomDetails.setRoomNumber(rSet.getInt("room_number"));
							objRoomDetails.setHouseKeeepingStatus(rSet.getString("house_keeping_status"));
							objRoomDetails.setFrontOfficeStatus(rSet.getString("front_office_status"));
							objRoomDetails.setRoomType(objRoomType);

							// add room rate with the current rate list of the room detail instance.
							objRoomDetails.getRateList().add(objRoomRate);
							// add room detail reference with the current room detail list of the reservation instance.
							objReservation.getRoomDetailList().add(objRoomDetails);
							// add reservation instance to the current reservation list.
							objResvList.add(objReservation);
							// add reservation list to the current reservation response instance.
							resevResponseObj.setReservationList(objResvList);
						}
						else {  // block executes when there is more detail linked with single reservation instance.

							if(rSet.getInt("PMS_ID") == previousPMSId) { // block executes when next record has same reservation id as previous.

								RoomDetails objRoomDetails = null;

								if(previousRoomNumber == rSet.getInt("room_number")) { // block executes when current record room number is same as previous.

									RoomRate objRoomRate = new RoomRate();
									objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
									objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));

									resevResponseObj.getReservationList().get(index).getRoomDetailList().get(index).getRateList().add(objRoomRate);

								}
								else { // block executes when current record room number is not the same as previous record room number.

									RoomType objRoomType = new RoomType();
									objRoomType.setCode(rSet.getString("code"));
									objRoomType.setDescription(rSet.getString("description"));
									objRoomType.setFeatures(rSet.getString("features"));

									RoomRate objRoomRate = new RoomRate();
									objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
									objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));
									objRoomRate.setEffectiveDate(rSet.getString("effective_date"));
									objRoomRate.setExpirationDate(rSet.getString("expiration_date"));

									objRoomDetails = new RoomDetails();
									objRoomDetails.setRoomNumber(rSet.getInt("room_number"));
									objRoomDetails.setHouseKeeepingStatus(rSet.getString("house_keeping_status"));
									objRoomDetails.setFrontOfficeStatus(rSet.getString("front_office_status"));
									objRoomDetails.setRoomType(objRoomType);
									objRoomDetails.getRateList().add(objRoomRate);

									resevResponseObj.getReservationList().get(index).getRoomDetailList().add(objRoomDetails);
								}

							}
							else {  // block executes when next record reservation number is not the same as previoud record reservation number.

								isFreshReservation = true;
								++index; 
							}
						}
						index = 0;
					}//end while loop

					resevResponseObj.setReservationList(objResvList);
					resevResponseObj.setStatus(ITestAdapterConstants.RESULT_SUCCESS);

				}// end else block.

				if(isEmptySet) { // block executes if result set is empty.

					MessageLogger.logInfo( TestDAOImpl.class, " searchReservationData ", " ResultSet empty no Reservation data found for request " );

					resevResponseObj.setReservationList(objResvList );
					resevResponseObj.setStatus(ITestAdapterConstants.RESULT_FAILURE);
				}

				MessageLogger.logInfo(TestDAOImpl.class, " searchReservationData ", " Size of list " + resevResponseObj.getReservationList().size());

			}
			else {

				// creates failure reservation response for empty result set.
				resevResponseObj.setReservationList(null);
				resevResponseObj.setStatus(ITestAdapterConstants.RESULT_FAILURE);
			}
		}
		catch( Exception exc) {

			MessageLogger.logError(TestDAOImpl.class,"searchReservation",exc);
		}

		return resevResponseObj;	



	}



	@Override
	public CheckInResponse guestCheckIn(CheckInRequest objCheckInRequest) {
		MessageLogger.logInfo(TestDAOImpl.class, " guestCheckIn ", " Enter guestCheckIn Request");

		/* Variables declaration to store data for performing guest check in request. */
		Connection conn = null;
		ResultSet rSet = null;

		CheckInResponse objCheckInResponse = null;
		Reservation objReservation = null;
		Reservation objCheckInReservation = null;
		CallableStatement	cstmt = null;

		boolean isEmptySet = true;
		boolean isFreshReservation = true;

		int roomNumber = 0;
		String creditCardNumber;
		String confirmationNumber;

		// retrieves guest reservation information from guest check in request object.
		objCheckInReservation = objCheckInRequest.getReservation();

		// retrieve guest check in request information from check in request object.
		roomNumber = objCheckInReservation.getRoomDetailList().get(0).getRoomNumber();
		creditCardNumber = objCheckInReservation.getCreditCardNumber();
		confirmationNumber = objCheckInReservation.getConfirmationNumber();

		MessageLogger.logInfo(TestDAOImpl.class, "guestCheckIn", "user provided" );
		MessageLogger.logInfo(TestDAOImpl.class, "guestCheckIn", "room number " + roomNumber);
		MessageLogger.logInfo(TestDAOImpl.class, "guestCheckIn"," credit card number " + creditCardNumber );
		MessageLogger.logInfo(TestDAOImpl.class, "guestCheckIn", "confirmation number " + confirmationNumber );

		objCheckInResponse = new CheckInResponse();

		try {

			conn = DataBaseHandler.getConnection();

			if(roomNumber == 0 || creditCardNumber.length() == 0 || confirmationNumber.length() == 0) { //block executes when guest data is insufficient

				// create failure response when user provides insufficient guest check in information.
				objCheckInResponse.setReservation(objReservation);
				objCheckInResponse.setStatus(ITestAdapterConstants.RESULT_FAILURE);

			}
			else { // block executes when user has provided all required data for check in request.

				cstmt = conn.prepareCall("{call procCheckIn(?,?,?)}");

				cstmt.setString(1, creditCardNumber);
				cstmt.setString(2, confirmationNumber);
				cstmt.setInt(3, roomNumber);

				rSet = cstmt.executeQuery();
				ResultSetMetaData metaData = rSet.getMetaData();

				if((rSet != null) && (metaData.getColumnCount()!=0)) { // block executes when the result set is not null.

					MessageLogger.logInfo( TestDAOImpl.class, " guestCheckIn ", " result set not null " );

					/*
					 * Iterates through each record of the result set.
					 */
					while(rSet.next()) {

						//String reservationNum = rSet.getString("pms_id");
						String reservationNum =String.valueOf(rSet.getInt("pms_id"));
						MessageLogger.logInfo( TestDAOImpl.class, " guestCheckIn ", " Iterating While Loop " );
						MessageLogger.logInfo( TestDAOImpl.class, " guestCheckIn ", " Row Count is " + rSet.getRow() + "Reservation no " + reservationNum);

						if( (isFreshReservation) && !(reservationNum.equalsIgnoreCase(ITestAdapterConstants.EMPTY_STRING))) {

							objReservation = new Reservation();

							isEmptySet = false;
							isFreshReservation = false;

							objReservation.setId(String.valueOf(rSet.getInt("pms_id")));
							objReservation.setAddress(rSet.getString("address"));
							objReservation.setCheckinDate(rSet.getString("check_in_date"));
							objReservation.setCheckoutDate(rSet.getString("check_out_date"));
							objReservation.setConfirmationNumber(rSet.getString("confirmation_number"));

							objReservation.setCompany(rSet.getString("company_name"));
							objReservation.setFullName(rSet.getString("first_name") + " " + rSet.getString("last_name"));
							objReservation.setLoyaltyNumber(rSet.getString("loyalty_number"));
							objReservation.setNumberOfGuests(Integer.parseInt(rSet.getString("number_of_guest")));

							objReservation.setPhoneNumber(rSet.getString("phone"));
							objReservation.setEmail("not provided");
							objReservation.setCreditCardNumber(rSet.getString("credit_card_no"));
							objReservation.setReservationSource(rSet.getString("reservation_source"));

							objReservation.setDateCreated(rSet.getDate("date_created"));
							objReservation.setNotes(rSet.getString("notes"));
							objReservation.setMessage(rSet.getString("messages"));

							objReservation.setAffilateId(rSet.getString("affiliate_id"));
							objReservation.setLoyaltyProgram(rSet.getString("loyalty_program"));
							objReservation.setPropertyId(rSet.getString("pms_id"));
							objReservation.setStayLength(Integer.parseInt(rSet.getString("stay_length")));

							RoomType objRoomType = new RoomType();
							objRoomType.setCode(rSet.getString("code"));
							objRoomType.setDescription(rSet.getString("description"));
							objRoomType.setFeatures(rSet.getString("features"));

							RoomRate objRoomRate = new RoomRate();
							objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
							objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));
							objRoomRate.setEffectiveDate(rSet.getString("effective_date"));
							objRoomRate.setExpirationDate(rSet.getString("expiration_date"));

							RoomDetails objRoomDetails = new RoomDetails();
							objRoomDetails.setRoomNumber(rSet.getInt("room_number"));
							objRoomDetails.setHouseKeeepingStatus(rSet.getString("house_keeping_status"));
							objRoomDetails.setFrontOfficeStatus(rSet.getString("front_office_status"));
							objRoomDetails.setRoomType(objRoomType);

							objRoomDetails.getRateList().add(objRoomRate);

							objReservation.getRoomDetailList().add(objRoomDetails);

						}

						objCheckInResponse.setReservation(objReservation);
						objCheckInResponse.setStatus(ITestAdapterConstants.RESULT_SUCCESS);
					}//ends while loop
				}//ends if resultSet

				else { // block executes when the result set is null.

					MessageLogger.logInfo( TestDAOImpl.class, " guestCheckIn ", " ResultSet Object is null" );

					// creates failure check in response when result set is null.
					objCheckInResponse.setReservation(objReservation);
					objCheckInResponse.setStatus(ITestAdapterConstants.RESULT_FAILURE);

				}
				if(isEmptySet) { //block executes when the result set does not contain any record.

					MessageLogger.logInfo( TestDAOImpl.class, " guestCheckIn ", " ResultSet Object is Empty" );

					// creates failure check in response when result set is empty.
					objCheckInResponse.setReservation(objReservation);
					objCheckInResponse.setStatus(ITestAdapterConstants.RESULT_FAILURE);
				}
			}//ends else block if non of user data is empty.
		}//ends try block

		catch( Exception exc) {

			MessageLogger.logError(TestDAOImpl.class,"guestCheckIn", exc);
		}

		MessageLogger.logInfo(TestDAOImpl.class, " guestCheckIn ", " Returning from guestCheckIn request " + objCheckInResponse);
		MessageLogger.logInfo(TestDAOImpl.class, " guestCheckIn ", " Exit guestCheckIn Request");

		return objCheckInResponse;
	}

	@Override
	public UpdateBookingResponse updateBooking(UpdateBookingRequest upBookingRequest) {

		MessageLogger.logInfo(TestDAOImpl.class, "updateBooking", " Enter updateBooking");

		/* Variables used for performing update booking data request.*/
		Connection conn = null;
		ResultSet rSet = null;
		UpdateBookingResponse objBookingResponse = null;

		int previousPMSId = 0;
		int previousRoomNumber = 0;
		int index =0;
		boolean isFirst = true;

		try{

			/* Read and store value of parameter provided by the user.*/
			String confirmationNumber = upBookingRequest.getConfirmationNumber();
			String [] notes = upBookingRequest.getNotes();

			/*Iterate notes*/
			StringBuffer strBuffer = new StringBuffer();
			for (String note : notes){
				strBuffer.append(note);
				strBuffer.append(" ; ");
			}

			objBookingResponse = new UpdateBookingResponse();

			// To get the connection.
			conn = DataBaseHandler.getConnection();

			MessageLogger.logInfo(TestDAOImpl.class,"updateBooking","confirmation number " + strBuffer.toString());
			MessageLogger.logInfo(TestDAOImpl.class,"updateBooking","notes " + confirmationNumber);

			// call and execute procedure to get the reservation data.
			CallableStatement callStatament = conn.prepareCall("{call procUpdateBooking(? , ?)}");
			callStatament.setString(1, confirmationNumber);
			callStatament.setString(2, strBuffer.toString());
			rSet=  callStatament.executeQuery();

			ResultSetMetaData metaData = rSet.getMetaData();

			if(rSet != null && (metaData.getColumnCount()!=0)){

				// iterate reesultSet.
				while(rSet.next()){

					Reservation objReservation = null;

					if(isFirst){

						// To create reference of reservation.
						objReservation = new Reservation();

						/* Populate reservation instance data member with the data of the result set. */
						previousPMSId = rSet.getInt("PMS_ID");
						previousRoomNumber = rSet.getInt("room_number");

						isFirst = false;

						objReservation.setId(String.valueOf(previousPMSId));
						objReservation.setAddress(rSet.getString("address"));
						objReservation.setCheckinDate(rSet.getString("check_in_date"));
						objReservation.setCheckoutDate(rSet.getString("check_out_date"));
						objReservation.setConfirmationNumber(rSet.getString("confirmation_number"));
						objReservation.setCompany(rSet.getString("company_name"));
						objReservation.setFullName(rSet.getString("first_name") + " " + rSet.getString("last_name"));
						objReservation.setLoyaltyNumber(rSet.getString("loyalty_number"));
						objReservation.setNumberOfGuests(Integer.parseInt(rSet.getString("number_of_guest")));
						objReservation.setPhoneNumber(rSet.getString("phone"));
						objReservation.setEmail("not provided");
						objReservation.setCreditCardNumber(rSet.getString("credit_card_no"));
						objReservation.setReservationSource(rSet.getString("reservation_source"));
						objReservation.setDateCreated(rSet.getDate("date_created"));
						objReservation.setNotes(rSet.getString("notes"));
						objReservation.setMessage(rSet.getString("messages"));
						objReservation.setAffilateId(rSet.getString("affiliate_id"));
						objReservation.setLoyaltyProgram(rSet.getString("loyalty_program"));
						objReservation.setPropertyId(rSet.getString("pms_id"));
						objReservation.setStayLength(Integer.parseInt(rSet.getString("stay_length")));

						/* To set the room type attributes.*/
						RoomType objRoomType = new RoomType();
						objRoomType.setCode(rSet.getString("code"));
						objRoomType.setDescription(rSet.getString("description"));
						objRoomType.setFeatures(rSet.getString("features"));

						/* To set the room rate attributes.*/
						RoomRate objRoomRate = new RoomRate();
						objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
						objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));
						objRoomRate.setEffectiveDate(rSet.getString("effective_date"));
						objRoomRate.setExpirationDate(rSet.getString("expiration_date"));

						/*To set the room details attributes.*/
						RoomDetails objRoomDetails = new RoomDetails();
						objRoomDetails.setRoomNumber(rSet.getInt("room_number"));
						objRoomDetails.setHouseKeeepingStatus(rSet.getString("house_keeping_status"));
						objRoomDetails.setFrontOfficeStatus(rSet.getString("front_office_status"));
						objRoomDetails.setRoomType(objRoomType);

						/* To set rate into room details list.*/
						objRoomDetails.getRateList().add(objRoomRate);

						/*To set room details into reservation list.*/
						objReservation.getRoomDetailList().add(objRoomDetails);

						/*To set reservation object into update  booking response*/
						objBookingResponse.setReservation(objReservation);

					}  // if  block close
					else { // block executes when there is more detail linked with single reservation instance.

						if(rSet.getInt("PMS_ID") == previousPMSId) { // block executes when next record has same reservation id as previous.

							if(!(previousRoomNumber == rSet.getInt("room_number"))){ // block executes when next record reservation number is not the same as previoud record reservation number.

								/*To add room details with room rate and room type*/
								RoomType objRoomType = new RoomType();
								objRoomType.setCode(rSet.getString("code"));
								objRoomType.setDescription(rSet.getString("description"));
								objRoomType.setFeatures(rSet.getString("features"));

								RoomRate objRoomRate = new RoomRate();
								objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
								objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));
								objRoomRate.setEffectiveDate(rSet.getString("effective_date"));
								objRoomRate.setExpirationDate(rSet.getString("expiration_date"));

								RoomDetails	objRoomDetails = new RoomDetails();
								objRoomDetails.setRoomNumber(rSet.getInt("room_number"));
								objRoomDetails.setHouseKeeepingStatus(rSet.getString("house_keeping_status"));
								objRoomDetails.setFrontOfficeStatus(rSet.getString("front_office_status"));
								objRoomDetails.setRoomType(objRoomType);
								objRoomDetails.getRateList().add(objRoomRate);

								/*To add room details object into update booking response.*/
								objBookingResponse.getReservation().getRoomDetailList().add(objRoomDetails);

							}
							else{

								RoomRate objRoomRate = new RoomRate();
								objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
								objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));

								objBookingResponse.getReservation().getRoomDetailList().get(index).getRateList().add(objRoomRate);	

							}
						}

						else {  // block executes when next record reservation number is not  same as previous record reservation number.
							isFirst = true;
							++index;
						}
					}

				}//end while loop		

				index = 0;
			} // End If
			else{

				MessageLogger.logInfo(TestDAOImpl.class, "updateBooking", " ResultSet is null");	
			} // End Else.
		}
		catch(Exception exc){

			MessageLogger.logError(TestDAOImpl.class, " updateBooking ", exc);
		}


		MessageLogger.logInfo(TestDAOImpl.class, "updateBooking", " Exit updateBooking");

		MessageLogger.logInfo(TestDAOImpl.class, "updateBooking", " Return resposne " + objBookingResponse);

		return objBookingResponse;

	}

	@Override
	public UpdatePaymentResponse updatePayment(UpdatePaymentRequest upPatmentReq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetAvailabilityResponse checkAvailability(
			GetAvailabilityRequest objGetAvailabilityRequest) {
		MessageLogger.logInfo(TestDAOImpl.class, "checkAvailability", " Enter checkAvailability");

		/* Variables declaration to store data for performing guest check availability request. */
		boolean isEmptySet = true;

		Connection conn = null;
		ResultSet rSet = null;
		Date startDate = null;
		Date endDate = null;

		GetAvailabilityResponse objGetAvailabilityResponse = null;
		CallableStatement objCallableStatement = null;

		List <Availability> availList = null;

		try {

			startDate = objGetAvailabilityRequest.getStartDate();
			endDate = objGetAvailabilityRequest.getEndDate();
			availList = new ArrayList<Availability>();

			objGetAvailabilityResponse = new GetAvailabilityResponse();

			if((startDate == null) || (endDate == null)) { // block executes when required data is not provided by the guest.

				MessageLogger.logInfo(TestDAOImpl.class, "checkAvailability", " Data Provided is not suffiecient. Sorry ! ");

				objGetAvailabilityResponse.setStatus(ITestAdapterConstants.RESULT_FAILURE);
				objGetAvailabilityResponse.setAvailList(availList);

			}
			else {  // block executes when required data for check availability is provided by the user.

				if(startDate.before(endDate)) { // block executes when data range is not valid for request.

					MessageLogger.logInfo(TestDAOImpl.class, "checkAvailability", " Date Range is Correct. Continue with processing ! ");

					conn = DataBaseHandler.getConnection();
					objCallableStatement = conn.prepareCall("{call procCheckAvail(?,?)}");

					java.sql.Date sqlStartDate = new java.sql.Date(startDate.getTime());
					objCallableStatement.setDate(1, sqlStartDate);

					java.sql.Date sqlEndDate = new java.sql.Date(endDate.getTime());
					objCallableStatement.setDate(2, sqlEndDate);

					rSet = objCallableStatement.executeQuery();

					MessageLogger.logInfo(TestDAOImpl.class, "checkAvailability", " CallableStatement Executed ");

					if(rSet != null) {

						while(rSet.next()) {

							MessageLogger.logInfo(TestDAOImpl.class, "checkAvailability", " About to iterate resultset");

							isEmptySet = false;
							Availability objAvailability = new Availability();
							objAvailability.setAvailablity(rSet.getString("front_office_status"));
							objAvailability.setRoomAmount(Double.valueOf(rSet.getString("base_amount")));
							objAvailability.setRoomType(rSet.getString("id"));
							objAvailability.setRoomNumber(Integer.parseInt(rSet.getString("room_number")));

							availList.add(objAvailability);

							objGetAvailabilityResponse.setStatus(ITestAdapterConstants.RESULT_SUCCESS);
							objGetAvailabilityResponse.setAvailList(availList);

						}

						if(isEmptySet) { //block executes when result set is empty

							MessageLogger.logInfo(TestDAOImpl.class, "checkAvailability", " Result Set is Empty ");

							objGetAvailabilityResponse.setStatus(ITestAdapterConstants.RESULT_FAILURE);
							objGetAvailabilityResponse.setAvailList(availList);
						}

					}
					else { // block executes when result set is empty.

						MessageLogger.logInfo(TestDAOImpl.class, "checkAvailability", " Resultset object not created ");

						objGetAvailabilityResponse.setStatus(ITestAdapterConstants.RESULT_FAILURE);
						objGetAvailabilityResponse.setAvailList(availList);
					}

				}
				else { // block executes when date range is not valid

					MessageLogger.logInfo(TestDAOImpl.class, "checkAvailability", " Date Range is Not Correct. Sorry ! ");

					objGetAvailabilityResponse.setStatus(ITestAdapterConstants.RESULT_FAILURE);
					objGetAvailabilityResponse.setAvailList(availList);
				}
			}// ends else block when user provide sufficient data for request.
		}
		catch(Exception exc){

			MessageLogger.logError(TestDAOImpl.class, "checkAvailability", exc);
		}

		MessageLogger.logInfo(TestDAOImpl.class, "checkAvailability", " returnign from checkAvailability " + objGetAvailabilityResponse);
		MessageLogger.logInfo(TestDAOImpl.class, "checkAvailability", " Exit checkAvailability");

		return objGetAvailabilityResponse;
	}

	@Override
	public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) {

		MessageLogger.logInfo(TestDAOImpl.class, "guestCheckOut", " Enter guestCheckOut");

		/* Variables used for performing guest checkout data request.*/

		Connection conn = null;
		ResultSet rSet = null;
		CheckOutResponse objCheckOutResponse = null;

		try{

			/* Read and store value of parameter provided by the user.*/
			String confirmationNumber = checkOutRequest.getConfirmationNumber();

			objCheckOutResponse = new CheckOutResponse();

			/* To get the connection.*/
			conn = DataBaseHandler.getConnection();

			MessageLogger.logInfo(TestDAOImpl.class,"guestCheckOut","confirmation number " + confirmationNumber);

			/* To call and execute procedure to get the reservation data.*/
			CallableStatement callStatament = conn.prepareCall("{call procCheckOut(?)}");
			callStatament.setString(1, confirmationNumber);
			rSet=  callStatament.executeQuery();
			ResultSetMetaData metaData = rSet.getMetaData();


			Reservation objReservation = null;

			if((rSet != null) && (metaData.getColumnCount()!=0)) { // block executes when the result set is not null.

				/* iterate reesultSet.*/
				while(rSet.next()){

					MessageLogger.logInfo(TestDAOImpl.class,"guestCheckOut"," iterate resultset " );

					/* To create reference of reservation.*/
					objReservation = new Reservation();

					/* Populate reservation instance data member with the data of the result set. */
					objReservation.setAddress(rSet.getString("address"));
					objReservation.setCheckinDate(rSet.getString("check_in_date"));
					objReservation.setCheckoutDate(rSet.getString("check_out_date"));
					objReservation.setConfirmationNumber(rSet.getString("confirmation_number"));
					objReservation.setCompany(rSet.getString("company_name"));
					objReservation.setFullName(rSet.getString("first_name") + " " + rSet.getString("last_name"));
					objReservation.setLoyaltyNumber(rSet.getString("loyalty_number"));
					objReservation.setNumberOfGuests(Integer.parseInt(rSet.getString("number_of_guest")));
					objReservation.setPhoneNumber(rSet.getString("phone"));
					objReservation.setEmail("not provided");
					objReservation.setCreditCardNumber(rSet.getString("credit_card_no"));
					objReservation.setReservationSource(rSet.getString("reservation_source"));
					objReservation.setDateCreated(rSet.getDate("date_created"));
					objReservation.setNotes(rSet.getString("notes"));
					objReservation.setMessage(rSet.getString("messages"));
					objReservation.setAffilateId(rSet.getString("affiliate_id"));
					objReservation.setLoyaltyProgram(rSet.getString("loyalty_program"));
					objReservation.setPropertyId(rSet.getString("pms_id"));
					objReservation.setStayLength(Integer.parseInt(rSet.getString("stay_length")));

					/* To set the room type attributes.*/
					RoomType objRoomType = new RoomType();
					objRoomType.setCode(rSet.getString("code"));
					objRoomType.setDescription(rSet.getString("description"));
					objRoomType.setFeatures(rSet.getString("features"));

					/* To set the room rate attributes.*/
					RoomRate objRoomRate = new RoomRate();
					objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
					objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));
					objRoomRate.setEffectiveDate(rSet.getString("effective_date"));
					objRoomRate.setExpirationDate(rSet.getString("expiration_date"));

					/*To set the room details attributes.*/
					RoomDetails objRoomDetails = new RoomDetails();
					objRoomDetails.setRoomNumber(rSet.getInt("room_number"));
					objRoomDetails.setHouseKeeepingStatus(rSet.getString("house_keeping_status"));
					objRoomDetails.setFrontOfficeStatus(rSet.getString("front_office_status"));
					objRoomDetails.setRoomType(objRoomType);

					/* To set rate into room details list.*/
					objRoomDetails.getRateList().add(objRoomRate);
					/* To set room details into reservation list.*/
					objReservation.getRoomDetailList().add(objRoomDetails);


				}  // End While loop.

				/* To set reservation into checkout response.*/
				objCheckOutResponse.setReservation(objReservation);

				/*To set status into checkout response.*/
				objCheckOutResponse.setStatus(ITestAdapterConstants.RESULT_SUCCESS);  


			} // End If
			else{

				MessageLogger.logInfo(TestDAOImpl.class, "guestCheckOut", " ResultSet is null");	
			} // End Else.
		}
		catch(Exception exc){

			MessageLogger.logError(TestDAOImpl.class, " guestCheckOut ", exc);
		}


		MessageLogger.logInfo(TestDAOImpl.class, "guestCheckOut", " Exit guestCheckOut");

		MessageLogger.logInfo(TestDAOImpl.class, "guestCheckOut", " Return resposne " + objCheckOutResponse);

		return objCheckOutResponse;

	}


	public java.sql.Date getCurrentDatetime() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}

	/**
	 * This method returns current date and time.
	 * @return
	 */
	public static String getDateAndTime()
	{
		String dateTime = null;
		Date date = null;
		DateFormat dateFormat = null;

		date = new Date();
		dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );

		dateTime = dateFormat.format(date);

		dateFormat = new SimpleDateFormat( "HH:mm:ss" );
		dateTime += "|"+ dateFormat.format(date);

		return dateTime;
	}


	public GetFolioResponse retrieveFolioInfo(GetFolioRequest folioRequest) {

		MessageLogger.logInfo(TestDAOImpl.class, "retrieveFolioInfo", " Enter retrieveFolioInfo");

		/* Variables used for performing get folio data request.*/

		Connection conn = null;
		ResultSet rSet = null;
		GetFolioResponse objFolioResponse = null;

		boolean isFirst = true;

		int previousPMSId = 0;
		int previousRoomNumber = 0;
		int orderId = 0;
		int index = 0;

		try{
			List<Integer> orderList = new ArrayList<Integer>() ;
			/* Read and store value of parameter provided by the user.*/

			String confirmationNumber = folioRequest.getConfirmationNumber();

			objFolioResponse = new GetFolioResponse();

			/* To get the connection.*/
			conn = DataBaseHandler.getConnection();

			MessageLogger.logInfo(TestDAOImpl.class,"retrieveFolioInfo","confirmation number: " + confirmationNumber);

			/*To call and execute procedure to get the reservation data with order details.*/
			CallableStatement callStatament = conn.prepareCall("{call procGetFolio(?)}");
			callStatament.setString(1, confirmationNumber);
			rSet=  callStatament.executeQuery();
			ResultSetMetaData    metaData = rSet.getMetaData();

			if((rSet != null) && (metaData.getColumnCount()!=0)) { // block executes when the result set is not null.

				MessageLogger.logInfo( TestDAOImpl.class, " retrieveFolioInfo ", " ResultSet Object Created " );

				/*
				 * Iterates through each row of the result set.
				 */
				while(rSet.next()){

					MessageLogger.logInfo( TestDAOImpl.class, " retrieveFolioInfo ", " Iterating While Loop " );

					Reservation objReservation = null;		

					if(isFirst){

						MessageLogger.logInfo( TestDAOImpl.class, " retrieveFolioInfo ", " First Time  " );

						objReservation = new Reservation();

						previousPMSId = rSet.getInt("PMS_ID");
						previousRoomNumber = rSet.getInt("room_number");
						orderId = rSet.getInt("order_id");


						orderList.add(orderId);

						isFirst = false;

						/* Populate reservation instance data member with the data of the result set. */
						objReservation.setAddress(rSet.getString("address"));
						objReservation.setCheckinDate(rSet.getString("check_in_date"));
						objReservation.setCheckoutDate(rSet.getString("check_out_date"));
						objReservation.setConfirmationNumber(rSet.getString("confirmation_number"));
						objReservation.setCompany(rSet.getString("company_name"));
						objReservation.setFullName(rSet.getString("first_name") + " " + rSet.getString("last_name"));
						objReservation.setLoyaltyNumber(rSet.getString("loyalty_number"));
						objReservation.setNumberOfGuests(Integer.parseInt(rSet.getString("number_of_guest")));
						objReservation.setPhoneNumber(rSet.getString("phone"));
						objReservation.setEmail("not provided");
						objReservation.setCreditCardNumber(rSet.getString("credit_card_no"));
						objReservation.setReservationSource(rSet.getString("reservation_source"));
						objReservation.setDateCreated(rSet.getDate("date_created"));
						objReservation.setNotes(rSet.getString("notes"));
						objReservation.setMessage(rSet.getString("messages"));
						objReservation.setAffilateId(rSet.getString("affiliate_id"));
						objReservation.setLoyaltyProgram(rSet.getString("loyalty_program"));
						objReservation.setPropertyId(rSet.getString("pms_id"));
						objReservation.setStayLength(Integer.parseInt(rSet.getString("stay_length")));

						RoomType objRoomType = new RoomType();
						objRoomType.setCode(rSet.getString("code"));
						objRoomType.setDescription(rSet.getString("description"));
						objRoomType.setFeatures(rSet.getString("features"));

						RoomRate objRoomRate = new RoomRate();
						objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
						objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));
						objRoomRate.setEffectiveDate(rSet.getString("effective_date"));
						objRoomRate.setExpirationDate(rSet.getString("expiration_date"));

						RoomDetails objRoomDetails = new RoomDetails();
						objRoomDetails.setRoomNumber(rSet.getInt("room_number"));
						objRoomDetails.setHouseKeeepingStatus(rSet.getString("house_keeping_status"));
						objRoomDetails.setFrontOfficeStatus(rSet.getString("front_office_status"));
						objRoomDetails.setRoomType(objRoomType);

						/* To add room rate object into room details object.*/
						objRoomDetails.getRateList().add(objRoomRate);

						/* To add room details object into reservation object.*/
						objReservation.getRoomDetailList().add(objRoomDetails);

						ReservationOrders objReservationOrders = new ReservationOrders();

						/*Populate reservation order instance data member with the data of the result set.*/
						objReservationOrders.setTotalAmount(rSet.getDouble("total_amount"));
						objReservationOrders.setOrderDate(rSet.getDate("order_date"));

						OrderDetails objOrderDetails = new OrderDetails();

						/*Populate order details instance data member with the data of the result set.*/
						objOrderDetails.setChargeAmount(rSet.getDouble("charge_amount"));
						objOrderDetails.setItemCode(rSet.getString("item_code"));
						objOrderDetails.setItemDescription(rSet.getString("item_description"));
						objOrderDetails.setQuantity(rSet.getInt("quantity"));
						objOrderDetails.setUnitPrice(rSet.getDouble("unit_price"));

						/*To add order details object into reservation order object*/
						objReservationOrders.getOrderDetailList().add(objOrderDetails);

						/*To add reservation object into folio response.*/
						objFolioResponse.setReservation(objReservation);

						/*To add reservation orders into folio response object.*/
						objFolioResponse.getReservationOrderList().add(objReservationOrders);


					}
					else {   // block executes when there is more detail associate with single reservation instance.

						if(rSet.getInt("PMS_ID") == previousPMSId){ // block executes when next record has same reservation id as previous.

							RoomDetails objRoomDetails = new RoomDetails();

							if(! (previousRoomNumber == rSet.getInt("room_number"))) { // block executes when next record reservation number is not the same as previoud record reservation number.

								previousRoomNumber = rSet.getInt("room_number");

								/*To store room details with the rate and type into reservation object.*/
								RoomType objRoomType = new RoomType();
								objRoomType.setCode(rSet.getString("code"));
								objRoomType.setDescription(rSet.getString("description"));
								objRoomType.setFeatures(rSet.getString("features"));

								RoomRate objRoomRate = new RoomRate();
								objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
								objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));
								objRoomRate.setEffectiveDate(rSet.getString("effective_date"));
								objRoomRate.setExpirationDate(rSet.getString("expiration_date"));

								objRoomDetails = new RoomDetails();
								objRoomDetails.setRoomNumber(rSet.getInt("room_number"));
								objRoomDetails.setHouseKeeepingStatus(rSet.getString("house_keeping_status"));
								objRoomDetails.setFrontOfficeStatus(rSet.getString("front_office_status"));
								objRoomDetails.setRoomType(objRoomType);
								objRoomDetails.getRateList().add(objRoomRate);

								/*To add room details object into folio response*/
								objFolioResponse.getReservation().getRoomDetailList().add(objRoomDetails); 
							}
							else{

								RoomRate objRoomRate = new RoomRate();
								objRoomRate.setBaseAmount(Double.valueOf(rSet.getString("amount")));
								objRoomRate.setOccurrenceType(rSet.getString("occurrence_type"));

								objFolioResponse.getReservation().getRoomDetailList().get(index).getRateList().add(objRoomRate);

							}


							if(!( orderList.contains(rSet.getInt("order_id")))){ 

								orderList.add(rSet.getInt("order_id"));
								ReservationOrders objReservationOrders = new ReservationOrders();

								/*Populate reservation order instance data member with the data of the result set.*/
								objReservationOrders.setTotalAmount(rSet.getDouble("total_amount"));
								objReservationOrders.setOrderDate(rSet.getDate("order_date"));

								OrderDetails objOrderDetails = new OrderDetails();

								/*Populate order details instance data member with the data of the result set.*/
								objOrderDetails.setChargeAmount(rSet.getDouble("charge_amount"));
								objOrderDetails.setItemCode(rSet.getString("item_code"));
								objOrderDetails.setItemDescription(rSet.getString("item_description"));
								objOrderDetails.setQuantity(rSet.getInt("quantity"));
								objOrderDetails.setUnitPrice(rSet.getDouble("unit_price"));

								/*To add order details into reservation order object.*/
								objReservationOrders.getOrderDetailList().add(objOrderDetails);

								/*To add reservation order into folio response.*/
								objFolioResponse.getReservationOrderList().add(objReservationOrders);

							}

						}

						else {  // block executes when next record reservation number is not  same as previous record reservation number.
							isFirst = true;
							++index;
						}
					}
					index =0;
				}//end while loop


			}
			else {

				MessageLogger.logInfo( TestDAOImpl.class, " retrieveFolioInfo ", " ResultSet Object Not Created " );
			}
		}

		catch( Exception exc) {

			MessageLogger.logError(TestDAOImpl.class,"retrieveFolioInfo",exc);

		}

		return objFolioResponse;
	}


}

