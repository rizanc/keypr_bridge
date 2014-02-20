package com.cloudkey.test.parser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.cloudkey.commons.Availability;
import com.cloudkey.commons.Charges;
import com.cloudkey.commons.Payments;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.StayRate;
import com.cloudkey.constant.ICloudKeyConstants;
import com.cloudkey.logger.MessageLogger;
import com.cloudkey.message.parser.IParserInterface;
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



/**
 * This class simulates as a message parser.
 * It handles all the PMS request  made by web service. It creates response by using dummy data.
 *  
 * @author niveditat
 *
 */
public class TestPMSMessageParser implements IParserInterface {

	@SuppressWarnings("rawtypes")
	private static Class tag = "TestPMSMessageParser".getClass();

	/**
	 * This method accept the serachReservation Request and return the search Reservation response.
	 */
	@Override
	public SearchReservationResponse searchReservationData(SearchReservationRequest reservationRequest) {

		SearchReservationResponse objSearchResvResponse = new SearchReservationResponse(); 

		// get default list of reservation from objSearchResvResponse.
		List<Reservation> resvArrList = objSearchResvResponse.getReservationList();

		String confirmationNumber = reservationRequest.getConfirmationNumber();
		String emailId = reservationRequest.getEmailId();
		String firstName = reservationRequest.getFirstName();
		String lastName = reservationRequest.getLastName();
        String creditCardNumber = reservationRequest.getCreditCard();

		if(!confirmationNumber.equals(ICloudKeyConstants.EMPTY_STRING) || !creditCardNumber.equals(ICloudKeyConstants.EMPTY_STRING) || !emailId.equals(ICloudKeyConstants.EMPTY_STRING) || !firstName.equals(ICloudKeyConstants.EMPTY_STRING) || !lastName.equals(ICloudKeyConstants.EMPTY_STRING)) {

			objSearchResvResponse.setStatus("Success");

			// create reference of reservation object.
			Reservation objResv = new Reservation();

			// set data in reservation object.
			objResv.setAddress("c-81 Rohila Road");
			objResv.setCheckinDate(getCurrentDate());
			objResv.setCheckoutDate(getCheckOutDate());
			objResv.setCompany("Restic Com");
			objResv.setConfirmationNumber(confirmationNumber);
			objResv.setEmail(emailId);
			objResv.setFullName((firstName.equals(ICloudKeyConstants.EMPTY_STRING) && lastName.equals(ICloudKeyConstants.EMPTY_STRING))?ICloudKeyConstants.DUMMY_NAME:firstName.concat(" " + lastName));
			objResv.setId("1");
			objResv.setLoyaltyNumber("12345");
			objResv.setNotes("In First Floor");
			objResv.setNumberOfGuests("2");
			objResv.setPhoneNumber("9123456789");
			objResv.setRoomDetail("Deluxe Room  in FF");
			objResv.setRoomNumber("007");
			objResv.setRoomType("Deluxe Room");
			objResv.setStayLength("5");

			// set day and rate for stayRate Object.
			StayRate objStayRate=new StayRate();
			objStayRate.setDay("Monday");
			objStayRate.setRate(6000);

			// set stayRateObj into resvObject.
			objResv.setRate(objStayRate);
			
			// To set the reservation data into resevArrlist.
			resvArrList.add(objResv);
			
		}
		else {

			objSearchResvResponse.setStatus("Failure");
			// To set the reservation data into resevArrlist.
			resvArrList.add(null);

		}


		MessageLogger.logInfo(tag, "searchReservationData" ,"Response :" + objSearchResvResponse);

		// return searchReservation Response.
		return objSearchResvResponse;
	}

	@Override
	public GetAvailabilityResponse checkAvailability(GetAvailabilityRequest availRequest) {

		GetAvailabilityResponse objAvailabiltyResponse = new GetAvailabilityResponse();

		// get default list of availability from objAvailabiltyResponse 
		List <Availability> objAvailList = objAvailabiltyResponse.getAvailList();

		// get date range from request parameters.
		Date startDate = availRequest.getStartDate();
		Date endDate = availRequest.getEndDate();
	

		// compare the date.
		if( (startDate != null && endDate != null) && (startDate.compareTo(endDate) < 0)){

			// set status and available room with type and amount.
			objAvailabiltyResponse.setStatus("Success");

			Availability objAvailability = new Availability();     
			objAvailability.setAvailablity("VACANT");
			objAvailability.setRoomNumber(10);
			objAvailability.setRoomType("DELUXE");
			objAvailability.setRoomAmount(Double.parseDouble("3000"));

			objAvailList.add(objAvailability);

			Availability objAvailability1 = new Availability();
			objAvailability1.setAvailablity("VACANT");
			objAvailability1.setRoomNumber(40);
			objAvailability1.setRoomType("AC");
			objAvailability1.setRoomAmount(Double.parseDouble("2000"));

			objAvailList.add(objAvailability1);

			Availability objAvailability2 = new Availability();
			objAvailability2.setAvailablity("VACANT");
			objAvailability2.setRoomNumber(33);
			objAvailability2.setRoomType("DELUXE");
			objAvailability2.setRoomAmount(Double.parseDouble("4000"));

			// set available rooms into list.
			objAvailList.add(objAvailability2);


		}
		else{

			// set status.
			objAvailabiltyResponse.setStatus("Failure");
			// set default availability information into list.
			objAvailList.add(null);

		}

		//set list into response object.
		objAvailabiltyResponse.setAvailList(objAvailList);

		// return room availability response.
		return objAvailabiltyResponse;
	}


	/**
	 * This method accepts the CheckInRequest and return the CheckIn response.
	 */
	@Override
	public CheckInResponse guestCheckIn(CheckInRequest checkInRequest) {

		CheckInResponse objCheckInResponse = new CheckInResponse(); 

		Reservation objCheckInReservation = checkInRequest.getReservation();

		// To set the default value if the request reservation is blank.

		String confirmationNumber = objCheckInReservation.getConfirmationNumber();

		// if confirmation number is blank.
		if(confirmationNumber.equals(ICloudKeyConstants.EMPTY_STRING)){
			
			// set data in checkInResponse Object.
			objCheckInResponse.setStatus("Failure");
			// set reservation object into checkIn response object.
			objCheckInResponse.setReservation(null);


		}
		else{


			// set data in checkInResponse Object.
			objCheckInResponse.setStatus("Success");

			if( objCheckInReservation.getAddress().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setAddress("C- 81 New Delhi");
			}

			if( objCheckInReservation.getCheckinDate().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setCheckinDate( getCurrentDate() );
			}

			if( objCheckInReservation.getCheckoutDate().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setCheckoutDate(getCheckOutDate() );
			}

			if(objCheckInReservation.getCompany().equals(ICloudKeyConstants.EMPTY_STRING) ){

				objCheckInReservation.setCompany( "Raxi Ben" );
			}

			if( objCheckInReservation.getEmail().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setEmail("ani@rediff.com");
			}

			objCheckInReservation.setConfirmationNumber(confirmationNumber);


			if( objCheckInReservation.getFullName().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setFullName("Rozer");
			}

			if( objCheckInReservation.getId().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setId("1234" );
			}

			if( objCheckInReservation.getLoyaltyNumber().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setLoyaltyNumber("01");
			}

			if( objCheckInReservation.getNotes().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setNotes("In FF");
			}

			if( objCheckInReservation.getNumberOfGuests().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setNumberOfGuests("2");
			}

			if(objCheckInReservation.getPhoneNumber().equals(ICloudKeyConstants.EMPTY_STRING)){

				objCheckInReservation.setPhoneNumber( "6789544334" );
			}

			if( objCheckInReservation.getRoomDetail().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setRoomDetail("With Sea View");
			}

			if( objCheckInReservation.getRoomNumber().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setRoomNumber("200" );
			}

			if( objCheckInReservation.getRoomType().equals(ICloudKeyConstants.EMPTY_STRING) ) {

				objCheckInReservation.setRoomType("Deluxe");
			}


			StayRate objStayRate = objCheckInReservation.getRate();

			if(objStayRate == null) {

				// create stayRate Object and set values.
				objStayRate = new StayRate();
				objStayRate.setDay("Monday");
				objStayRate.setRate(7000);
				objCheckInReservation.setRate(objStayRate);
			}
			// set reservation object into checkIn response object.
			objCheckInResponse.setReservation(objCheckInReservation);
		}

		MessageLogger.logInfo(tag, "guestCheckIn" ,"Response :" + objCheckInResponse);

		// return checkIn Response.
		return objCheckInResponse;
	}


	/**
	 * This method accepts the GetFolioRequest and return the search GetFolio response.
	 */
	@Override
	public GetFolioResponse retrieveFolioInfo(GetFolioRequest getFolioRequest) {

		String confirmationNumber = getFolioRequest.getConfirmationNumber();

		GetFolioResponse objGetFolioResponse = new GetFolioResponse();

		List<Charges> objChargeList = objGetFolioResponse.getChargesList();

		// if confirmation number is blank.
		if(confirmationNumber.equals(ICloudKeyConstants.EMPTY_STRING)){

			objGetFolioResponse.setReservation(null);
			objChargeList.add(null);
		}
		else{

			// create reference of reservation object.
			Reservation objResv = new Reservation();
			// set data in reservation object.
			objResv.setAddress("c-81 Rohila Road");
			objResv.setCheckinDate(getCurrentDate());
			objResv.setCheckoutDate(getCheckOutDate());
			objResv.setCompany("Restic Com");
			objResv.setConfirmationNumber(confirmationNumber);
			objResv.setEmail("j@gmail.com");
			objResv.setFullName("Jon Peter");
			objResv.setId("1");
			objResv.setLoyaltyNumber("12345");
			objResv.setNumberOfGuests("2");
			objResv.setPhoneNumber("9123456789");
			objResv.setRoomDetail("Deluxe Room  in FF");
			objResv.setRoomNumber("007");
			objResv.setRoomType("Deluxe Room");
			objResv.setStayLength("5");

			// set day and rate for stayRate Object.
			StayRate stayRateObj=new StayRate();
			stayRateObj.setDay("Monday");
			stayRateObj.setRate(6000);

			// set stayRateObj into resvObject.
			objResv.setRate(stayRateObj);
			objResv.setNotes("Notes");
			/*objGetFolioResponse.setReservation(objResv);*/

			Charges objCharge = new Charges();
			objCharge.setChargeAmount(1000);
			objCharge.setItemDescription("Coffee");
			objCharge.setOrderDate(getCurrentDate());

			Charges objCharge1 = new Charges();
			objCharge1.setChargeAmount(10000);
			objCharge1.setItemDescription("Movie");
			objCharge1.setOrderDate(getCurrentDate());



			objChargeList.add(objCharge);
			objChargeList.add(objCharge1);
			objGetFolioResponse.setReservation(objResv);
		}

		objGetFolioResponse.setChargesList(objChargeList);

		MessageLogger.logInfo(tag, "retrieveFolioInfo" ,"Response :" + objGetFolioResponse);

		// return getFolioResponse.
		return objGetFolioResponse;
	}

	/**
	 * This method accepts the UpdateBookingRequest and return the UpdateBooking response.
	 */

	@Override
	public UpdateBookingResponse updateBooking(UpdateBookingRequest updateBookingRequest) {

		String confirmationNumber = updateBookingRequest.getConfirmationNumber();
		String notes[] = updateBookingRequest.getNotes();

		UpdateBookingResponse objUpBookingResponse = new UpdateBookingResponse();



		// if confirmation number is blank.
		if(confirmationNumber.equals(ICloudKeyConstants.EMPTY_STRING)){

			objUpBookingResponse.setReservation(null);

		}
		else{

			// create reference of reservation object.
			Reservation objResv = new Reservation();
			// set data in reservation object.
			objResv.setAddress("c-81 Rohila Road");
			objResv.setCheckinDate(getCurrentDate());
			objResv.setCheckoutDate(getCheckOutDate());
			objResv.setCompany("Restic Com");
			objResv.setConfirmationNumber(confirmationNumber);
			objResv.setEmail("j@gmail.com");
			objResv.setFullName("Jon Peter");
			objResv.setId("1");
			objResv.setLoyaltyNumber("12345");
			objResv.setNumberOfGuests("2");
			objResv.setPhoneNumber("9123456789");
			objResv.setRoomDetail("Deluxe Room  in FF");
			objResv.setRoomNumber("007");
			objResv.setRoomType("Deluxe Room");
			objResv.setStayLength("5");

			// set day and rate for stayRate Object.
			StayRate stayRateObj=new StayRate();
			stayRateObj.setDay("Monday");
			stayRateObj.setRate(6000);

			// set stayRateObj into resvObject.
			objResv.setRate(stayRateObj);

			StringBuffer strBuffer = new StringBuffer();

			for(String note : notes) {
				strBuffer.append(note);
				strBuffer.append(", ");

			}

			objResv.setNotes(strBuffer.toString());
			objUpBookingResponse.setReservation(objResv);
		}


		MessageLogger.logInfo(tag, "updateBooking" ,"Response :" + objUpBookingResponse);

		// return update booking response.
		return objUpBookingResponse;
	}

	/**
	 * This method accepts the UpdatePaymentRequest and return the UpdatePayment response.
	 */
	@Override
	public UpdatePaymentResponse updatePayment(UpdatePaymentRequest updatePaymentRequest) {

		String confirmationNumber = updatePaymentRequest.getConfirmationNumber();

		List<Payments> paymentList = updatePaymentRequest.getPayments();

		for(Payments payment : paymentList) {

			MessageLogger.logInfo(tag, "updatePayment", "Payment Amount :" + payment.getAmount());
			MessageLogger.logInfo(tag, "updatePayment", "Payment CreditCard Number : :" + payment.getCreditCard());

		}

		UpdatePaymentResponse objUpPaymentResponse = new UpdatePaymentResponse();
		// if confirmation number or amount or credit card number is blank.
		if(confirmationNumber.equals(ICloudKeyConstants.EMPTY_STRING) || paymentList.isEmpty() || (paymentList.size()==1 && (paymentList.get(0).getAmount()==0.0 || paymentList.get(0).getCreditCard().equals(ICloudKeyConstants.EMPTY_STRING)))){
			//set status .
			objUpPaymentResponse.setStatus("Failure");

		}
		else{
			//set status .
			objUpPaymentResponse.setStatus("Success");
		}

		MessageLogger.logInfo(tag, "updatePayment" ,"Response :" + objUpPaymentResponse);

		// return updatePaymentResponse.
		return objUpPaymentResponse;
	}


	/**
	 * This method accepts the CheckOutRequest and return the CheckOut response.
	 */
	@Override
	public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) {

		CheckOutResponse objCheckOutResponse = new CheckOutResponse();

		String confirmationNumber =  checkOutRequest.getConfirmationNumber();	

		// if confirmation number is blank.
		if(confirmationNumber.equals(ICloudKeyConstants.EMPTY_STRING)){

			// set status.
			objCheckOutResponse.setStatus("Failure");
			//set reservation into response.
			objCheckOutResponse.setReservation(null);



		}
		else{
			// create reference of reservation object.
			Reservation objResv = new Reservation();

			objCheckOutResponse.setStatus("Success");

			// set data in reservation object.
			objResv.setAddress("c-81 Rohila Road");
			objResv.setCheckinDate(getCurrentDate());
			objResv.setCheckoutDate(getCheckOutDate());
			objResv.setCompany("Restic Com");
			objResv.setConfirmationNumber(confirmationNumber);
			objResv.setEmail("j@gmail.com");
			objResv.setFullName("John Peter");
			objResv.setId("1");
			objResv.setLoyaltyNumber("12345");
			objResv.setNotes("In First Floor");
			objResv.setNumberOfGuests("2");
			objResv.setPhoneNumber("9123456789");
			objResv.setRoomDetail("Deluxe Room  in FF");
			objResv.setRoomNumber("007");
			objResv.setRoomType("Deluxe Room");
			objResv.setStayLength("5");

			// set day and rate for stayRate Object.
			StayRate stayRateObj=new StayRate();
			stayRateObj.setDay("Monday");
			stayRateObj.setRate(6000);
			// set stayRateObj into resvObject.
			objResv.setRate(stayRateObj);
			//set reservation into response.
			objCheckOutResponse.setReservation(objResv);

		}


		MessageLogger.logInfo(tag, "guestCheckOut" ,"Response :" + objCheckOutResponse);

		// return checkOut Response.
		return objCheckOutResponse;
	}



	/**
	 * To get the current date .
	 * 
	 * @return String.
	 */
	String getCurrentDate(){

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		//get current date time with Date()
		Date date = new Date();
		Calendar cal =   Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}


	/**
	 * To get the checkout date .
	 * 
	 * @return String
	 */
	String getCheckOutDate(){
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		//get current date time with Date()
		Date date = new Date();
		Calendar cal =   Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH,3);
		return dateFormat.format(cal.getTime());
	}
}
