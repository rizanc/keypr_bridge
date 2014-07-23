package com.cloudkey.test.parser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import com.cloudkey.test.dao.TestDAOImpl;



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
	 * This method accept the searchReservation Request and return the search Reservation response.
	 */
	@Override
	public SearchReservationResponse searchReservationData(SearchReservationRequest reservationRequest) {

		MessageLogger.logInfo(tag, " searchReservationData "," Enter searchReservationData method ");
		
		SearchReservationResponse objReservationResponse = null;
		TestDAOImpl objTestDAOImpl = new TestDAOImpl();
		
		objReservationResponse = objTestDAOImpl.searchReservationData(reservationRequest);
	
		MessageLogger.logInfo(tag, "searchReservation", "Returning Response" + objReservationResponse);
		
		MessageLogger.logInfo(tag, " searchReservationData "," Exit searchReservationData method");
		
		return objReservationResponse;
	}

	@Override

	public GetAvailabilityResponse checkAvailability(GetAvailabilityRequest objGetAvailabilityRequest) {

		MessageLogger.logInfo(tag, " checkAvailability ", " Enter checkAvailability method ");

		GetAvailabilityResponse objGetAvailabilityResponse = null;
		TestDAOImpl objTestDAOImpl = null;

		objTestDAOImpl = new TestDAOImpl();
		objGetAvailabilityResponse = objTestDAOImpl.checkAvailability(objGetAvailabilityRequest);

		MessageLogger.logInfo(tag, " checkAvailability", " Returning Response " + objGetAvailabilityResponse);

		MessageLogger.logInfo(tag, " checkAvailability ", " Exit checkAvailability method ");

		return objGetAvailabilityResponse;

	}


	/**
	 * This method accepts the CheckInRequest and return the CheckIn response.
	 */
	@Override
	public CheckInResponse guestCheckIn(CheckInRequest checkInRequest) {
		
		MessageLogger.logInfo(tag, " guestCheckIn ", " Enter guestCheckIn method. ");

		CheckInResponse objCheckInResponse = null;
		TestDAOImpl objTestDAOImpl = null;
		
		objTestDAOImpl = new TestDAOImpl();
		objCheckInResponse = objTestDAOImpl.guestCheckIn(checkInRequest);
				
		MessageLogger.logInfo(tag, "guestCheckIn " , " Returning response " + objCheckInResponse);
		
		MessageLogger.logInfo(tag, " guestCheckIn ", " Exit guestCheckIn method. ");
		
		return objCheckInResponse;
	}


	/**
	 * This method accepts the GetFolioRequest and return the search GetFolio response.
	 */
	@Override
	public GetFolioResponse retrieveFolioInfo(GetFolioRequest folioRequest) {

	MessageLogger.logInfo(tag, " retrieveFolioInfo "," Enter retrieveFolioInfo method ");
		
		GetFolioResponse objFolioResponse = null;
		TestDAOImpl objTestDAOImpl = new TestDAOImpl();
		
		objFolioResponse = objTestDAOImpl.retrieveFolioInfo(folioRequest);
	
		MessageLogger.logInfo(tag, "retrieveFolioInfo", "Returning Response" + objFolioResponse);
		
		MessageLogger.logInfo(tag, " retrieveFolioInfo "," Exit retrieveFolioInfo method");
		
		return objFolioResponse;
	}

	/**
	 * This method accepts the UpdateBookingRequest and return the UpdateBooking response.
	 */

	@Override
	public UpdateBookingResponse updateBooking(UpdateBookingRequest updateBookingRequest) {

       MessageLogger.logInfo(tag, " updateBooking "," Enter updateBooking method ");
		
		UpdateBookingResponse objBookingResponse = null;
		TestDAOImpl objTestDAOImpl = new TestDAOImpl();
		
		objBookingResponse = objTestDAOImpl.updateBooking(updateBookingRequest);
	
		MessageLogger.logInfo(tag, "updateBooking", "Returning Response" + objBookingResponse);
		
		MessageLogger.logInfo(tag, " updateBooking "," Exit updateBooking method");
		
		return objBookingResponse;
	}

	/**
	 * This method accepts the UpdatePaymentRequest and return the UpdatePayment response.
	 */
	@Override
	public UpdatePaymentResponse updatePayment(UpdatePaymentRequest updatePaymentRequest) {

		
		return null;
	}


	/**
	 * This method accepts the CheckOutRequest and return the CheckOut response.
	 */
	@Override
	public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) {
		
		MessageLogger.logInfo(tag, " guestCheckOut ", " Enter guestCheckOut method ");
		
		CheckOutResponse objCheckOutResponse = null;
		TestDAOImpl objTestDAOImpl = null;
		
		objTestDAOImpl = new TestDAOImpl();
		objCheckOutResponse = objTestDAOImpl.guestCheckOut(checkOutRequest);
		
		MessageLogger.logInfo(tag, " guestCheckOut", " Returning Response " + objCheckOutResponse);

		MessageLogger.logInfo(tag, " guestCheckOut ", " Exit guestCheckOut method ");
		
		return objCheckOutResponse;
	}

	/**
	 * This method returns current date and time.
	 * 
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

}
