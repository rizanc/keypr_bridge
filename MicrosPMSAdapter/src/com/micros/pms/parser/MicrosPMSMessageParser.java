package com.micros.pms.parser;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.axis2.AxisFault;

import com.cloudkey.commons.Availability;
import com.cloudkey.commons.OrderDetails;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomRate;
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
import com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInComplete;
import com.micros.adv.reservation.ResvAdvancedServiceStub.FetchRoomStatusRequest;
import com.micros.adv.reservation.ResvAdvancedServiceStub.FetchRoomStatusResponse;
import com.micros.adv.reservation.ResvAdvancedServiceStub.NameCreditCardList;
import com.micros.adv.reservation.ResvAdvancedServiceStub.Room;
import com.micros.availability.AvailabilityServiceStub.CalendarDailyDetail;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarRequest;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarResponse;
import com.micros.availability.AvailabilityServiceStub.RoomTypeInventory;
import com.micros.pms.bean.CreditCard;
import com.micros.pms.bean.CreditCardInfo;
import com.micros.pms.bean.HotelReference;
import com.micros.pms.bean.InvoiceRequest;
import com.micros.pms.bean.InvoiceResponse;
import com.micros.pms.bean.ReservationRequestBase;
import com.micros.pms.bean.UniqueID;
import com.micros.pms.bean.UniqueIDList;
import com.micros.pms.bean.UniqueIDType;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.transport.MicrosMessageTransport;
import com.micros.pms.util.AdapterUtility;
import com.micros.reservation.ReservationServiceStub.AccompanyGuest;
import com.micros.reservation.ReservationServiceStub.AccompanyGuestList;
import com.micros.reservation.ReservationServiceStub.AssignRoomRequest;
import com.micros.reservation.ReservationServiceStub.AssignRoomResponse;
import com.micros.reservation.ReservationServiceStub.CreditCardChoice_type0;
import com.micros.reservation.ReservationServiceStub.EndPoint;
import com.micros.reservation.ReservationServiceStub.FetchBookingFilters;
import com.micros.reservation.ReservationServiceStub.FutureBookingSummaryRequest;
import com.micros.reservation.ReservationServiceStub.FutureBookingSummaryRequestChoice_type1;
import com.micros.reservation.ReservationServiceStub.FutureBookingSummaryResponse;
import com.micros.reservation.ReservationServiceStub.Guarantee;
import com.micros.reservation.ReservationServiceStub.GuaranteeAccepted;
import com.micros.reservation.ReservationServiceStub.GuaranteesAccepted;
import com.micros.reservation.ReservationServiceStub.GuestCount;
import com.micros.reservation.ReservationServiceStub.GuestCountList;
import com.micros.reservation.ReservationServiceStub.HotelReservation;
import com.micros.reservation.ReservationServiceStub.ModifyBookingRequest;
import com.micros.reservation.ReservationServiceStub.ModifyBookingResponse;
import com.micros.reservation.ReservationServiceStub.NameAddress;
import com.micros.reservation.ReservationServiceStub.NameCreditCard;
import com.micros.reservation.ReservationServiceStub.OGHeader;
import com.micros.reservation.ReservationServiceStub.OGHeaderE;
import com.micros.reservation.ReservationServiceStub.PersonName;
import com.micros.reservation.ReservationServiceStub.Profile;
import com.micros.reservation.ReservationServiceStub.ProfileList;
import com.micros.reservation.ReservationServiceStub.RatePlanList;
import com.micros.reservation.ReservationServiceStub.ResGuest;
import com.micros.reservation.ReservationServiceStub.ResGuestList;
import com.micros.reservation.ReservationServiceStub.ResGuestRPH;
import com.micros.reservation.ReservationServiceStub.ResGuestRPHList;
import com.micros.reservation.ReservationServiceStub.ReservationComment;
import com.micros.reservation.ReservationServiceStub.ReservationCommentList;
import com.micros.reservation.ReservationServiceStub.ReservationStatusType;
import com.micros.reservation.ReservationServiceStub.RoomFeature;
import com.micros.reservation.ReservationServiceStub.RoomFeatureList;
import com.micros.reservation.ReservationServiceStub.RoomStay;
import com.micros.reservation.ReservationServiceStub.RoomStayList;
import com.micros.reservation.ReservationServiceStub.RoomType;
import com.micros.reservation.ReservationServiceStub.RoomTypeList;
import com.micros.reservation.ReservationServiceStub.TimeSpan;
import com.micros.reservation.ReservationServiceStub.TimeSpanChoice_type0;
import com.micros.reservation.ReservationServiceStub.TransportInfo;
import com.micros.reservation.ReservationServiceStub.WrittenConfInst;

/**
 * This class is used to process the web service request and return the responseO
 * to the calling application. This class is used to receive the request and
 * convert request into micros specific format. It will receive the response
 * from the MICROS and will convert the response into keypr specific format .
 * 
 * @author niveditat
 * 
 */
public class MicrosPMSMessageParser implements IParserInterface {

	@Override
	public CheckInResponse guestCheckIn(CheckInRequest checkInRequest) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, "guestCheckIn "," Enter in checkin method. ");

		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInRequest objCheckInRequest = null;
		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInResponse objCheckInResponse = null;
		CheckInResponse objResponse = null;
		String xmlRequest = null;
		String xmlResponse = null;

		if(checkInRequest != null && checkInRequest.getReservation() != null && checkInRequest.getReservation().getConfirmationNumber().length() > 0) {

			objCheckInRequest = getCheckInRequestObject( checkInRequest );

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " guestCheckIn "," Convert request into xml form ");

			xmlRequest = AdapterUtility.convertToStreamXML( objCheckInRequest );

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " guestCheckIn ", " Get Request in xml format :: " + xmlRequest);

			/* To send the xml request to the OXI Simulator via Message Transport */
			MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
			xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " guestCheckIn "," Get Response from OXI Simulator in xml format :: " + xmlResponse);

			objCheckInResponse = new com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInResponse();

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " guestCheckIn ",	" Convert xml response into object ");

			objCheckInResponse = (com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInResponse) AdapterUtility.covertToStramObject(xmlResponse);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " guestCheckIn "," Get Response object from response xml ::: " + objCheckInResponse);

			objResponse = getCheckInResponseObject( objCheckInResponse );

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " guestCheckIn "," Response received in message Parser : " + objResponse);
		}
		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " guestCheckIn ", " Exit guestCheckIn method. ");

		return objResponse;
	}

	@Override
	public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," guestCheckOut ", " Enter in guestCheckOut method. ");

		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutRequest objCheckOutRequest = null;
		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutResponse objCheckOutResponse = null;
		CheckOutResponse objResponse = null;

		if( checkOutRequest != null && checkOutRequest.getConfirmationNumber().length() > 0){

			objCheckOutRequest = getCheckOutRequestObject( checkOutRequest );

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," guestCheckOut ", " Convert request into xml form ");

			String xmlRequest = AdapterUtility.convertToStreamXML(objCheckOutRequest);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," guestCheckOut ", " Get Request in xml format :: "
					+ xmlRequest);

			/* To send the xml request to the OXI Simulator via Message Transport. */
			MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
			String xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," guestCheckOut "," Get Response from OXI Simulator in xml format :: "
					+ xmlResponse);

			objCheckOutResponse = new com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutResponse();

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," guestCheckOut ", " Convert xml response into object ");

			objCheckOutResponse = (com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutResponse) AdapterUtility.covertToStramObject( xmlResponse );

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," guestCheckOut "," Get Response object from response xml ::: " + objResponse);

			objResponse = getCheckOutResponseObject( objCheckOutResponse );

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," guestCheckOut ", " Response received in message Parser : "
					+ objCheckOutResponse);
		}
		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," guestCheckOut ", " Exit guestCheckIn method. ");

		return objResponse;
	}

	@Override
	public SearchReservationResponse searchReservationData(
			SearchReservationRequest futureBookingSummaryRequest) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," searchReservationData "," Enter searchReservationData method. ");

		FutureBookingSummaryRequest objFutureBookingSummaryRequest = null;
		FutureBookingSummaryResponse objResponse = null;
		SearchReservationResponse objSearchReservationResponse = null;


		if(futureBookingSummaryRequest != null && (futureBookingSummaryRequest.getFirstName().length() > 0 
				|| futureBookingSummaryRequest.getLastName().length() > 0 || futureBookingSummaryRequest.getConfirmationNumber().length() > 0
				|| futureBookingSummaryRequest.getCreditCardNumber().length() > 0)){

			objFutureBookingSummaryRequest = getFutureBookingRequestObject(futureBookingSummaryRequest);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," searchReservationData ", " Convert request into xml form ");

			String xmlRequest = AdapterUtility.convertToStreamXML(objFutureBookingSummaryRequest);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," searchReservationData ", " Get Request in xml format :: "
					+ xmlRequest);

			/* To send the xml request to the OXI Simulator via Message Transport. */
			MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
			String xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," searchReservationData "," Get Response from OXI Simulator in xml format :: "
					+ xmlResponse);

			objResponse = new FutureBookingSummaryResponse();

			MicrosPMSLogger
			.logInfo(MicrosPMSMessageParser.class," searchReservationData "," Convert xml response into object ");

			objResponse = (FutureBookingSummaryResponse) AdapterUtility.covertToStramObject(xmlResponse);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," searchReservationData "," Get Response object from response xml ::: " + objResponse);

			objSearchReservationResponse = getFutureBookingResponseObject(objResponse);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," searchReservationData "," Response received in message Parser : "+ objSearchReservationResponse);

		}
		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," searchReservationData "," Exit searchReservationData method ");

		return objSearchReservationResponse;
	}

	/**
	 * 
	 * @param objResponse
	 * @return
	 */
	private SearchReservationResponse getFutureBookingResponseObject(
			FutureBookingSummaryResponse objResponse) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject "," Enter getFutureBookingResponseObject method. ");

		String firstName = null;
		String lastName = null;
		Reservation objReservation = null;

		/* Populate response into Reservation instance */
		SearchReservationResponse objSearchReservationResponse = new SearchReservationResponse();
		List<Reservation> objLReservations = objSearchReservationResponse.getReservationList();

		HotelReservation[] arrHotelReservation = objResponse.getHotelReservations().getHotelReservation();

		for (HotelReservation objHotelReservation : arrHotelReservation) { // To traverse the hotel reservation.

			MicrosPMSLogger
			.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject  "," Enter in Hotel Reservation Loop.");

			objReservation = new Reservation();
			StringBuilder objBuilder = new StringBuilder();
			com.micros.reservation.ReservationServiceStub.UniqueID[] arrUniqueID = objHotelReservation.getUniqueIDList().getUniqueID();

			for (com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID : arrUniqueID) { // To traverse Unique Id list.


				MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject  "," Iterating UniqueID list .");
				if (objUniqueID.getType().toString().equalsIgnoreCase("INTERNAL")) {
					objReservation.setConfirmationNumber(objUniqueID.getString());

					MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject  "," Confirmation Number is set.");
				}
				else{

					MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject  "," Confirmation Number is not set.");
				}
			} // End loop for Unique ID .

			ResGuest[] arrGuest = objHotelReservation.getResGuests().getResGuest();

			for (ResGuest objResGuest : arrGuest) { // To traverse ResGuest.
				MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject  "," Iterating ResGuest Array .");

				Profile[] arrProfiles = objResGuest.getProfiles().getProfile();

				for (Profile objProfile : arrProfiles) { // To traverse profile .

					MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject  "," Iterating Profile Array .");

					PersonName objPersonName = objProfile.getProfileChoice_type0().getCustomer().getPersonName();
					NameCreditCard[] arrNameCreditCard = objProfile.getCreditCards().getNameCreditCard();

					/* To set the first name and last name . */
					firstName = objPersonName.getFirstName();
					lastName = objPersonName.getLastName();

					if(firstName != null || lastName != null){
						if (firstName != null) {
							objBuilder.append(firstName);
						}
						if (lastName != null) {
							objBuilder.append(" " + lastName);
						}
						objReservation.setFullName(objBuilder.toString());
						MicrosPMSLogger
						.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject  "," Full Name is set.");
					}

					for (NameCreditCard objNameCreditCard : arrNameCreditCard) { // To traverse name credit card.

						MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject  "," Iterating NameCreditCard  Array .");
						objReservation.setCreditCardNumber(objNameCreditCard.getCreditCardChoice_type0().getCardNumber());

						MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject  "," Credit Card Number is set.");
					} // End loop for name credit card.


					/*	 To set the address on the reservation object . 
	NameAddress[] arrNameAddresses = objProfile.getAddresses()
			.getNameAddress();

	for (NameAddress objAddress : arrNameAddresses) {// To traverse Name Address.

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
" getFutureBookingResponseObject ",
" Iterating NameAddress Array.");

		objReservation.setAddress(objAddress.getCountryCode());

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
" getFutureBookingResponseObject ",
" Address is Set in response.");
	} // end loop for Name Address.

	  To set the phone number . 
	  NamePhone[] arrNamePhones =
	  objProfile.getPhones().getNamePhone();

	  for(NamePhone objNamePhone : arrNamePhones ){ // To traverse Name Phone.

	  objReservation.setPhoneNumber( objNamePhone.getPhoneNumber()
	  ); MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class,
	  " getFutureBookingResponseObject ",
	  " Phone Number  is Set in response." );
	  } // End loop for Phone.

	  To set the email type . 
	  NameEmail[] arrNameEmails =
	  objProfile.getEMails().getNameEmail();

	  for(NameEmail objNameEmail : arrNameEmails){// To traverse Name Email.

	  objReservation.setEmail( objNameEmail.getEmailType());
	  MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class,
	  " getFutureBookingResponseObject ", " Email is Set in response." );
	  } // End loop for Email.

					 */
					MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject ", " Exit Profile .");	


				} // End loop for Profile.

			} // End loop for Res Guest.


			/*	RoomDetails obRoomDetails = null;
			List<RoomDetails> objRDetailList = objReservation.getRoomDetailList();
			RoomStayList objRoomStayList = objHotelReservation.getRoomStays();
			RoomStay[] arrRoomStay = objRoomStayList.getRoomStay();

			 To set the room types attributes with comments. 
			for (RoomStay objRoomStay : arrRoomStay) { // To traverse room stay array.

MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
		" getFutureBookingResponseObject ", " Enter Room Stay Array.");

RoomType[] arrRoomType = objRoomStay.getRoomTypes().getRoomType();

for (RoomType objRType : arrRoomType) {  // To traverse room type 

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
			" getFutureBookingResponseObject ",
			" Iterating Room Type Array.");

	obRoomDetails = new RoomDetails();

	com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();
	objRoomType.setCode(objRType.getRoomTypeCode());

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
			" getFutureBookingResponseObject ",
			" Room Type Code is Set in response.");

	RoomFeature[] arrRoomFeature = objRType.getRoomFeatures()
			.getFeatures();


			 * To set the room Number.
			 *  String [] arrRoomNumber =
			 * objRType.getRoomNumber();
			 * 
			 * for(String roomNumber : arrRoomNumber){
			 * 
			 * obRoomDetails.setRoomNumber(Integer.parseInt(roomNumber)); }


	objBuilder = new StringBuilder();
	StringBuilder objStringBuilder2 = new StringBuilder();
	for (RoomFeature objRFeature : arrRoomFeature) { // To traverse room features.
		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
" getFutureBookingResponseObject ",
" Iterating Room Feature Array.");
		objBuilder.append(objRFeature.getFeature() + ";");
		objStringBuilder2
		.append(objRFeature.getDescription() + ";");

	} // End loop for room features.

	objRoomType.setFeatures(objBuilder.toString());

	objRoomType.setDescription(objStringBuilder2.toString());
	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
			" getFutureBookingResponseObject ",
			" Fetures and Description are Set in response.");
	objStringBuilder2.setLength(0);
	obRoomDetails.setRoomType(objRoomType);
	objRDetailList.add(obRoomDetails);

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
			" getFutureBookingResponseObject ", " Exit Room Type .");		


} // End loop for room Type.

 For guest count. 
GuestCount[] arrGuestCount = objRoomStay.getGuestCounts()
		.getGuestCount();
int guestCount = 0;
for (GuestCount objGuestCount : arrGuestCount) { // To traverse Guest Count.
	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
			" getFutureBookingResponseObject ",
			" Iterating Guest Count Array.");
	guestCount = guestCount + objGuestCount.getCount();

	objReservation.setNumberOfGuests(guestCount);
	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
			" getFutureBookingResponseObject ",
			" Guest Count is Set in response.");
} // End loop for Guest Count.

 To set the checkin and check out date . 
TimeSpan objTimeSpan = objRoomStay.getTimeSpan();
if (objTimeSpan != null) {

	objReservation.setCheckinDate(AdapterUtility
			.getDate(objTimeSpan.getStartDate()));
	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
			" getFutureBookingResponseObject ",
			" CheckIn Date is Set in response.");

	TimeSpanChoice_type0 objTimeSpanChoice_type0 = objTimeSpan
			.getTimeSpanChoice_type0();

	if (objTimeSpanChoice_type0 != null) {

		objReservation.setCheckoutDate(AdapterUtility
.getDate(objTimeSpanChoice_type0.getEndDate()));
		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
" getFutureBookingResponseObject ",
" CheckOut Date is Set in response.");
	}
}

MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
		" getFutureBookingResponseObject ", " Notes are Set in response.");
objBuilder.setLength(0);

MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
		" getFutureBookingResponseObject ", " Exit Room Stay .");	


			} // End loop for room Stay.
			 */		
			// Set the reservation into response.
			objLReservations.add(objReservation);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Exit from Hotel Reservation loop.");

		} // End loop for Hotel Reservation.

		/**
		 * To set the reservation list and status on the response.
		 */
		objSearchReservationResponse.setReservationList(objLReservations);
		objSearchReservationResponse.setStatus(objResponse.getResult().getResultStatusFlag().getValue());

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject "," Exit getFutureBookingResponseObject method. ");

		return objSearchReservationResponse;

	}

	/**
	 * This method accepts the client request for search the reservation and
	 * generate the request object to search the reservation details.
	 * 
	 * @param futureBookingSummaryRequest
	 * @return FutureBookingSummaryRequest
	 */
	private FutureBookingSummaryRequest getFutureBookingRequestObject(
			SearchReservationRequest futureBookingSummaryRequest) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,"getFutureBookingRequestObject"," Enter getFutureBookingRequestObject method ");

		String confirmationNumber = futureBookingSummaryRequest.getConfirmationNumber();
		String creditCardNumber = futureBookingSummaryRequest.getCreditCardNumber();
		// String emailID = futureBookingSummaryRequest.getEmailId();
		String firstName = futureBookingSummaryRequest.getFirstName();
		String lastName = futureBookingSummaryRequest.getLastName();

		// Creates an instance of header
		OGHeader objOGHeader = new OGHeader();
		// Sets Transaction Identifier
		objOGHeader.setTransactionID("123456");

		// creates origin end point of header.
		EndPoint originEndPoint = new EndPoint();
		originEndPoint.setEntityID("WEBHOTEL");
		originEndPoint.setSystemType("WEB");

		// creates destination end point of header.
		EndPoint destinEndPoint = new EndPoint();
		destinEndPoint.setEntityID("WEBHOTEL");
		destinEndPoint.setSystemType("ORS");

		// sets time stamp
		objOGHeader.setTimeStamp(AdapterUtility.getCalender());

		// prepares OGHeader
		objOGHeader.setOrigin(originEndPoint);
		objOGHeader.setDestination(destinEndPoint);

		OGHeaderE objE = new OGHeaderE();
		objE.setOGHeader(objOGHeader);

		/**
		 * Creates an instance of FutureBookingSummaryRequest and populates the
		 * data members.
		 */
		FutureBookingSummaryRequest objFutureBookingSummaryRequest = new FutureBookingSummaryRequest();

		/* Sets confirmation number to the request */

		if (confirmationNumber != null) {
			com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();
			objUniqueID
			.setType(com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL);
			objUniqueID.setString(confirmationNumber);

			FetchBookingFilters objBookingFilters = new FetchBookingFilters();
			objBookingFilters.setConfirmationNumber(objUniqueID);
			objFutureBookingSummaryRequest
			.setAdditionalFilters(objBookingFilters);
		}

		/* Set the credit card number . */
		if (creditCardNumber != null) {
			FutureBookingSummaryRequestChoice_type1 objFuChoice_type01 = new FutureBookingSummaryRequestChoice_type1();
			objFuChoice_type01.setCreditCardNumber(creditCardNumber);
			objFutureBookingSummaryRequest
			.setFutureBookingSummaryRequestChoice_type1(objFuChoice_type01);

		}

		if (firstName != null) {
			objFutureBookingSummaryRequest.setFirstName(firstName);
		}

		if (lastName != null) {
			objFutureBookingSummaryRequest.setLastName(lastName);
		}

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,"getFutureBookingRequestObject"," Exit getFutureBookingRequestObject method ");

		return objFutureBookingSummaryRequest;

	}

	/**
	 * This method is used to generate the checkin response by populating the
	 * response object with simulator response.
	 * 
	 * @param objResponse
	 * @return CheckInResponse
	 */
	private CheckInResponse getCheckInResponseObject(
			com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInResponse objResponse) {

		// Note : rate List not found in xsd  . objResponse contains - profile , checkin compltete and result.

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
				" getCheckInResponseObject ",
				" Enter in getCheckInResponseObject method. ");

		/* Populate response into Reservation instance */
		CheckInResponse objCheckInResponse = new CheckInResponse();
		Reservation objReservation = new Reservation();

		String confirmationNumber = null;
		String status = null;
		String roomTypeCode = null;
		String feature = null;
		String roomNumber = null;
		String firstName = null;
		String lastName = null;
		StringBuffer objStringBuffer = null;

		// set status in the response.
		status = objResponse.getResult().getResultStatusFlag().getValue();
		objCheckInResponse.setStatus( status );

		CheckInComplete objCheckInComplete = objResponse.getCheckInComplete();
		com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = objCheckInComplete.getReservationID();
		com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID[] arrUniqueIDs = objUniqueIDList.getUniqueID();

		/*To set the confirmation number.*/
		for(com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID objUniqueID : arrUniqueIDs){

			confirmationNumber = objUniqueID.getString();
			objReservation.setConfirmationNumber(confirmationNumber);

		}

		List<ReservationRoomAllocation> objRoomAllocationList = objReservation.getReservationRoomAllocationList();		
		ReservationRoomAllocation objReservationRoomAllocation = new ReservationRoomAllocation(); 
		com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();
		//		List<RoomRate> objRoomRateList = objReservationRoomAllocation.getRoomRateList();
		//		RoomRate objRoomRate = new RoomRate();

		Room objRoom = objCheckInComplete.getRoom();

		roomNumber = objRoom.getRoomNumber();
		com.micros.adv.reservation.ResvAdvancedServiceStub.RoomType obRoomType = objRoom.getRoomType();

		roomTypeCode = obRoomType.getRoomTypeCode();
		feature = obRoomType.getFeature();

		/* obRoomType.getRoomTypeDescription().getParagraphChoice()[0].getText()*/

		/*// To set the more than 1 feature.
		com.micros.adv.reservation.ResvAdvancedServiceStub.RoomFeatureList objFeatureList = obRoomType.getRoomFeatures();
		com.micros.adv.reservation.ResvAdvancedServiceStub.RoomFeature [] arrRoomFeatures = objFeatureList.getFeatures();
		 objStringBuffer = new StringBuffer();
		for(com.micros.adv.reservation.ResvAdvancedServiceStub.RoomFeature objRoomFeature : arrRoomFeatures){
			feature = objRoomFeature.getFeature();
			objStringBuffer.append(feature+";");
		}
		objRoomType.setFeatures(objStringBuffer.toString());*/


		//	String roomNumber1[] = obRoomType.getRoomNumber();


		//		   objCheckInComplete.getCheckOutTime();

		// set value in room type object.
		objRoomType.setCode( roomTypeCode );
		objRoomType.setDescription("Not Avail");
		objRoomType.setFeatures(feature);


		objReservationRoomAllocation.setRoomNo(Integer.parseInt(roomNumber));
		objReservationRoomAllocation.setRoomType( objRoomType );
		//		objReservationRoomAllocation.setRoomRateList( objRoomRateList );


		// Note :  checkin response has only 1 profile information.		

		com.micros.adv.reservation.ResvAdvancedServiceStub.Profile objProfile = objResponse.getProfile();
		NameCreditCardList objCardList = objProfile.getCreditCards();

		com.micros.adv.reservation.ResvAdvancedServiceStub.NameCreditCard[] arrNameCreditCard = objCardList.getNameCreditCard();
		for (com.micros.adv.reservation.ResvAdvancedServiceStub.NameCreditCard objNameCreditCard : arrNameCreditCard) { // To traverse name credit card.

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckInResponseObject  "," Iterating NameCreditCard  Array .");

			objReservation.setCreditCardNumber(objNameCreditCard.getCreditCardChoice_type0().getCardNumber());

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckInResponseObject  "," Credit Card Number is set.");
		} // End loop for name credit card.


		com.micros.adv.reservation.ResvAdvancedServiceStub.PersonName objPersonName = objProfile.getProfileChoice_type0().getCustomer().getPersonName();
		objStringBuffer = new StringBuffer();
		/* To set the first name and last name . */
		firstName = objPersonName.getFirstName();
		lastName = objPersonName.getLastName();

		if(firstName != null || lastName != null){
			if (firstName != null) {
				objStringBuffer.append(firstName);
			}
			if (lastName != null) {
				objStringBuffer.append(" " + lastName);
			}
			objReservation.setFullName(objStringBuffer.toString());
			MicrosPMSLogger
			.logInfo(MicrosPMSMessageParser.class," getCheckInResponseObject  "," Full Name is set.");
			objStringBuffer.setLength(0);
		}



		/*	 To set the address on the reservation object . 
NameAddress[] arrNameAddresses = objProfile.getAddresses()
.getNameAddress();

for (NameAddress objAddress : arrNameAddresses) {// To traverse Name Address.

MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
" getCheckInResponseObject ",
" Iterating NameAddress Array.");

objReservation.setAddress(objAddress.getCountryCode());

MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class,
" getCheckInResponseObject ",
" Address is Set in response.");
} // end loop for Name Address.

To set the phone number . 
NamePhone[] arrNamePhones =
objProfile.getPhones().getNamePhone();

for(NamePhone objNamePhone : arrNamePhones ){ // To traverse Name Phone.

objReservation.setPhoneNumber( objNamePhone.getPhoneNumber()
); MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class,
" getCheckInResponseObject ",
" Phone Number  is Set in response." );
} // End loop for Phone.

To set the email type . 
NameEmail[] arrNameEmails =
objProfile.getEMails().getNameEmail();

for(NameEmail objNameEmail : arrNameEmails){// To traverse Name Email.

objReservation.setEmail( objNameEmail.getEmailType());
MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class,
" getCheckInResponseObject ", " Email is Set in response." );
} // End loop for Email.

		 */
		
		
		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFutureBookingResponseObject ", " Exit Profile .");	


		
		objCheckInResponse.setReservation(objReservation);


	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckInResponseObject "," Enter in getCheckInResponseObject method. ");
	return objCheckInResponse;

}

/**
 * This method accepts the client request for checkin method and generate
 * the checkin request object to get checkout details.
 * 
 * @param checkInRequest
 * @return CheckInRequest
 */
private com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInRequest getCheckInRequestObject(
		CheckInRequest checkInRequest) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckInRequestObject "," Enter in getCheckInRequestObject method. ");
	String confirmationNumber = null;
	String creditCardNumber = null;

	/* To get the request parameters from the keypr client */
	confirmationNumber = checkInRequest.getReservation().getConfirmationNumber();
	creditCardNumber = checkInRequest.getReservation().getCreditCardNumber();

	/* To set the ogHeader. */ 
	/*	( NOTE : For now OG Header take confirmation number as the transaction id ) */
	OGHeader objHeader = new OGHeader();

	EndPoint objEndPoint = new EndPoint();
	objEndPoint.setEntityID( IMicrosConstants.OWS_ORIGIN_ID );
	objEndPoint.setSystemType( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );

	/* To set the origin . */
	objHeader.setOrigin(objEndPoint);

	objEndPoint = new EndPoint();
	objEndPoint.setEntityID( IMicrosConstants.OWS_DESTINATION_ID );
	objEndPoint.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE);

	objHeader.setDestination(objEndPoint);

	/* To set the confirmation number as transactionID. */
	objHeader.setTransactionID( confirmationNumber );
	objHeader.setTimeStamp( AdapterUtility.getCalender() );

	/* To set the OGHeader into OGHeaderE. */
	OGHeaderE objHeaderE = new OGHeaderE();
	objHeaderE.setOGHeader(objHeader);

	/* To set request into the xsd classes. */
	com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInRequest objCheckInRequest = new com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInRequest();

	/* To set the card number into checkinRequest. */
	com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCard objCreditCard = new com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCard();

	if(creditCardNumber.length() > 0) {

		com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCardChoice_type0 objCardChoice_type0 = new com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCardChoice_type0();
		objCardChoice_type0.setCardNumber( AdapterUtility.getCreditCardNumber(creditCardNumber) );
		objCreditCard.setCreditCardChoice_type0( objCardChoice_type0 );

	}

	//		objCard.setExpirationDate(AdapterUtility.getGregorianDate());

	/*To set credit card into credit card info.*/
	com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCardInfo objCreditCardInfo = new com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCardInfo();
	objCreditCardInfo.setCreditCard(objCreditCard);


	/*To set the confirmation number and hotel code into reservation request base*/

	com.micros.adv.reservation.ResvAdvancedServiceStub.ReservationRequestBase objReservationRequestBase = new com.micros.adv.reservation.ResvAdvancedServiceStub.ReservationRequestBase();

	com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = new com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList();

	com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID objUniqueID = new com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID();
	objUniqueID.setSource(IMicrosConstants.OWS_RESV_NAMEID);
	objUniqueID.setString(confirmationNumber);
	objUniqueID.setType(com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDType.EXTERNAL);

	objUniqueIDList.addUniqueID(objUniqueID);

	// set the confirmation number.
	objReservationRequestBase.setReservationID(objUniqueIDList);

	com.micros.adv.reservation.ResvAdvancedServiceStub.HotelReference objHotelReference = new com.micros.adv.reservation.ResvAdvancedServiceStub.HotelReference();		
	objHotelReference.setHotelCode( IMicrosConstants.HOTEL_CODE );

	// set the hotel code.
	objReservationRequestBase.setHotelReference(objHotelReference);

	/* Set the confirmation . hotel code and credit card info into check in request. */

	objCheckInRequest.setReservationRequest(objReservationRequestBase);
	objCheckInRequest.setCreditCardInfo( objCreditCardInfo );

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckInRequestObject "," Exit getCheckInRequestObject method. ");

	return objCheckInRequest;

}

/**
 * This method is used to generate the checkout response by populating the
 * response object with simulator response.
 * 
 * @param objCheckOutResponse2
 * @return
 */
private CheckOutResponse getCheckOutResponseObject(
		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutResponse objCheckOutResponse2) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckOutResponseObject ","  Enter getCheckOutResponseObject method ");

	/* Populate response into Reservation instance */
	CheckOutResponse objCheckOutResponse = new CheckOutResponse();
	Reservation objReservation = new Reservation();
	
	/*objReservation.setConfirmationNumber(objCheckOutResponse2.getCheckOutComplete().getReservationID().getUniqueID().get(0).getValue());

	objCheckOutResponse.setStatus(objCheckOutResponse2.getResult().getResultStatusFlag().toString());
	objCheckOutResponse.setReservation(objReservation);*/
	
	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckOutResponseObject "," Exit getCheckOutResponseObject method ");

	return objCheckOutResponse;
}

/**
 * This method accepts the client request for checkout method and generate
 * the checkout request object to get checkout details.
 * 
 * @param checkOutRequest
 * @return
 */
private com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutRequest getCheckOutRequestObject(
		CheckOutRequest checkOutRequest) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckOutRequestObject "," Enter getCheckOutRequestObject method. ");

	/* To get the request parameters. */
	String confirmationNumber = checkOutRequest.getConfirmationNumber();

	/* To set the ogHeader. */ 
	/*	( NOTE : For now OG Header take confirmation number as the transaction id ) */
	OGHeader objHeader = new OGHeader();

	EndPoint objEndPoint = new EndPoint();
	objEndPoint.setEntityID( IMicrosConstants.OWS_ORIGIN_ID );
	objEndPoint.setSystemType( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );

	/* To set the origin . */
	objHeader.setOrigin(objEndPoint);

	objEndPoint = new EndPoint();
	objEndPoint.setEntityID( IMicrosConstants.OWS_DESTINATION_ID );
	objEndPoint.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE);

	objHeader.setDestination(objEndPoint);

	/* To set the confirmation number as transactionID. */
	objHeader.setTransactionID( confirmationNumber );
	objHeader.setTimeStamp( AdapterUtility.getCalender() );

	/* To set the OGHeader into OGHeaderE. */
	OGHeaderE objHeaderE = new OGHeaderE();
	objHeaderE.setOGHeader(objHeader);
		
	/* To set request into the xsd classes. */
	
	com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutRequest objCheckOutRequest = new com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutRequest();
	
	/*To set the confirmation number and hotel code into reservation request base*/

	com.micros.adv.reservation.ResvAdvancedServiceStub.ReservationRequestBase objReservationRequestBase = new com.micros.adv.reservation.ResvAdvancedServiceStub.ReservationRequestBase();

	com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = new com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList();

	com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID objUniqueID = new com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID();
	objUniqueID.setSource(IMicrosConstants.OWS_RESV_NAMEID);
	objUniqueID.setString(confirmationNumber);
	objUniqueID.setType(com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDType.EXTERNAL);

	objUniqueIDList.addUniqueID(objUniqueID);

	// set the confirmation number.
	objReservationRequestBase.setReservationID(objUniqueIDList);

	com.micros.adv.reservation.ResvAdvancedServiceStub.HotelReference objHotelReference = new com.micros.adv.reservation.ResvAdvancedServiceStub.HotelReference();
	objHotelReference.setHotelCode(IMicrosConstants.HOTEL_CODE);
	objReservationRequestBase.setHotelReference(objHotelReference);

	objCheckOutRequest.setReservationRequest(objReservationRequestBase);

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckOutRequestObject "," Exit getCheckOutRequestObject method ");

	return objCheckOutRequest;
}

@Override
public GetFolioResponse retrieveFolioInfo(GetFolioRequest folioRequest) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," retrieveFolioInfo ", " Enter in retrieveFolioInfo method. ");

	com.micros.pms.bean.InvoiceRequest objfolioRequest = null;
	com.micros.pms.bean.InvoiceResponse objResponse = null;
	GetFolioResponse objGetFolioResponse = null;

	if(folioRequest != null && folioRequest.getConfirmationNumber().length() > 0){

		objfolioRequest = getFolioRequestObject(folioRequest);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," retrieveFolioInfo ", " Convert request into xml form ");

		String xmlRequest = AdapterUtility.convertToXML(objfolioRequest);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," retrieveFolioInfo ", " Get Request in xml format :: "+ xmlRequest);

		/* To send the xml request to the OXI Simulator via Message Transport. */
		MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
		String xmlResponse = objMessageTransport.handlePMSRequest( xmlRequest );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," retrieveFolioInfo "," Get Response from OXI Simulator in xml format :: "
				+ xmlResponse);

		objResponse = new com.micros.pms.bean.InvoiceResponse();

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," retrieveFolioInfo ", " Convert xml response into object ");

		objResponse = (com.micros.pms.bean.InvoiceResponse) AdapterUtility.covertToObject(objResponse, xmlResponse);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," retrieveFolioInfo "," Get Response object from response xml ::: " + objResponse);

		objGetFolioResponse = getFolioResponseObject(objResponse);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " retrieveFolioInfo "," Response received in message Parser : "+ objGetFolioResponse);

	}
	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," retrieveFolioInfo ", " Exit retrieveFolioInfo method ");
	return objGetFolioResponse;
}

/**
 * This method is used to generate the folio response by populating the
 * response object with simulator response.
 * 
 * @param objResponse
 * @return
 */
private GetFolioResponse getFolioResponseObject(InvoiceResponse objResponse) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFolioResponseObject "," Enter in getFolioResponseObject method ");

	/* Populate response into Reservation instance */
	GetFolioResponse objFolioResponse = new GetFolioResponse();
	Reservation objReservation = new Reservation();

	objReservation.setAddress(objResponse.getInvoice().get(0).getAddress().toString());
	objReservation.setFullName(objResponse.getInvoice().get(0).getName().getFirstName());
	List<ReservationOrders> objReservationOrders = objFolioResponse.getReservationOrderList();
	ReservationOrders objOrders = new ReservationOrders();

	List<OrderDetails> objDetails = objOrders.getOrderDetailList();

	/*Traversing bill Items.*/
	for (int i = 0; i < objResponse.getInvoice().get(0).getBillItems().size(); i++) {

		OrderDetails objOrderDetails = new OrderDetails();
		objOrderDetails.setUnitPrice(objResponse.getInvoice().get(0).getBillItems().get(i).getAmount().getValue());
		objOrderDetails.setItemDescription(objResponse.getInvoice().get(0).getBillItems().get(i).getDescription());
		objDetails.add(objOrderDetails);

	} // End loop.

	objOrders.setTotalAmount(objResponse.getInvoice().get(0).getCreditCardSurcharges().get(0).getTotalBillAmount().getValue());
	objReservationOrders.add(objOrders);
	objFolioResponse.setReservationOrderList(objReservationOrders);

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFolioResponseObject "," Exit  getFolioResponseObject method ");
	return objFolioResponse;

}

/**
 * This method accepts the client request for getFolio method and generate
 * the invoice request object to get the bill items details.
 * 
 * @param folioRequest
 * @return
 */
private InvoiceRequest getFolioRequestObject(GetFolioRequest folioRequest) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFolioRequestObject "," Enter getFolioRequestObject method ");

	/* To get the request parameters. */
	String confirmationNumber = folioRequest.getConfirmationNumber();

	/* To set request into the xsd classes. */
	com.micros.pms.factory.ObjectFactory objFactory = new com.micros.pms.factory.ObjectFactory();
	InvoiceRequest objInvoiceRequest = objFactory.createInvoiceRequest();

	HotelReference objHotelReference = objFactory.createHotelReference();
	objHotelReference.setHotelCode("CASINO");

	UniqueIDList objUniqueIDList = objFactory.createUniqueIDList();
	List<UniqueID> objUniqueIDs = objUniqueIDList.getUniqueID();
	UniqueID uId = objFactory.createUniqueID();
	uId.setValue(confirmationNumber);
	uId.setSource("PMS_ID");
	uId.setType(UniqueIDType.EXTERNAL);
	objUniqueIDs.add(uId);

	ReservationRequestBase objRequestBase = objFactory.createReservationRequestBase();
	objRequestBase.setReservationID(objUniqueIDList);
	objRequestBase.setHotelReference(objHotelReference);

	/*To set the reservation base into invoice request.*/
	objInvoiceRequest.setReservationRequest(objRequestBase);

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFolioRequestObject ","  Exit getFolioRequestObject method ");

	return objInvoiceRequest;

}

@Override
public UpdateBookingResponse updateBooking(
		UpdateBookingRequest updateBookingRequest) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," updateBooking ", " Enter in updateBooking method ");

	ModifyBookingRequest objModifyBookingRequest = null;
	ModifyBookingResponse objResponse = null;
	UpdateBookingResponse objUpdateBookingResponse = null;

	if(updateBookingRequest != null && updateBookingRequest.getConfirmationNumber().length() > 0){

		try {

			objModifyBookingRequest = getUpdateBookingRequestObject(updateBookingRequest);

		} catch (AxisFault exc) {

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class," updateBooking ", exc);

		}

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," updateBooking ", " Convert request into xml form ");

		String xmlRequest = AdapterUtility.convertToStreamXML(objModifyBookingRequest);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," updateBooking ", " Get Request in xml format :: "
				+ xmlRequest);

		/* To send the xml request to the OXI Simulator via Message Transport. */
		MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
		String xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," updateBooking "," Get Response from OXI Simulator in xml format :: "
				+ xmlResponse);

		objResponse = new ModifyBookingResponse();

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," updateBooking ", " Convert xml response into object ");

		objResponse = (ModifyBookingResponse) AdapterUtility.covertToStramObject(xmlResponse);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," updateBooking "," Get Response object from response xml ::: " + objResponse);

		objUpdateBookingResponse = getModifyBookingResponseObject( objResponse );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," updateBooking ", " Response received in message Parser : "+ objUpdateBookingResponse);
	}

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," updateBooking ", " Exit updateBooking method ");

	return objUpdateBookingResponse;

}

/**
 * 
 * 
 * @param objResponse
 * @return UpdateBookingResponse
 */
private UpdateBookingResponse getModifyBookingResponseObject(
		ModifyBookingResponse objResponse) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Enter getModifyBookingObject method ");

	/* Populate response into Reservation instance */
	UpdateBookingResponse objUpdateBookingResponse = new UpdateBookingResponse();
	/* Reference to set the values for reservation. */
	Reservation objReservation = new Reservation();

	/* To set the confirmation number . */
	HotelReservation objHotelReservation = objResponse.getHotelReservation();
	com.micros.reservation.ReservationServiceStub.UniqueID[] arrUniIds = objHotelReservation.getUniqueIDList().getUniqueID();

	/*
	 * Traverse unique id list and set the confirmation number id the unique
	 * id type is internal.
	 */
	for (com.micros.reservation.ReservationServiceStub.UniqueID objId : arrUniIds) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject ", " Iterating UniqueID List.");

		if (objId.getType().toString().equalsIgnoreCase("INTERNAL")) {

			objReservation.setConfirmationNumber(objId.getString());

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Confirmation number is Set in response.");
		} else {

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Confirmation number is not Set in response.");
		}
	} // End loop for unique Id.

	/* To set the profile related information. */

	String firstName = null;
	String lastName = null;
	StringBuilder objBuilder = null;

	ResGuest[] objGuests = objHotelReservation.getResGuests().getResGuest();
	objBuilder = new StringBuilder();

	for (ResGuest objResGuest : objGuests) { // To traverse the res guest
		// related information.
		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject ", " Enter ResGuest Array");
		Profile[] arrProfile = objResGuest.getProfiles().getProfile();

		for (Profile objProfile : arrProfile) { // To traverse profile.

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Iterating Profile Array.");

			firstName = objProfile.getProfileChoice_type0().getCustomer().getPersonName().getFirstName();
			lastName = objProfile.getProfileChoice_type0().getCustomer().getPersonName().getLastName();

			if (firstName != null || lastName != null) {

				if (firstName != null) {
					objBuilder.append(firstName);
				}
				if (lastName != null) {
					objBuilder.append(" " + lastName);
				}

				/* To set the full name . */
				objReservation.setFullName(objBuilder.toString());

				MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Full Name is Set in response.");

			}

			/* To set the address on the reservation object . */
			NameAddress[] arrNameAddresses = objProfile.getAddresses().getNameAddress();

			for (NameAddress objAddress : arrNameAddresses) {// To traverse Name Address.

				MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Iterating NameAddress Array.");

				objReservation.setAddress(objAddress.getCountryCode());
				MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Address is Set in response.");
			} // end loop for Name Address.

			/*
			 * To set the phone number . NamePhone[] arrNamePhones =
			 * objProfile.getPhones().getNamePhone();
			 * 
			 * for(NamePhone objNamePhone : arrNamePhones ){
			 * 
			 * objReservation.setPhoneNumber( objNamePhone.getPhoneNumber()
			 * ); MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class,
			 * " getModifyBookingObject ",
			 * " Phone Number  is Set in response." ); }
			 * 
			 * To set the email type . NameEmail[] arrNameEmails =
			 * objProfile.getEMails().getNameEmail();
			 * 
			 * for(NameEmail objNameEmail : arrNameEmails){
			 * 
			 * objReservation.setEmail( objNameEmail.getEmailType());
			 * MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class,
			 * " getModifyBookingObject ", " Email is Set in response." ); }
			 */

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject ", " Exit Profile .");	


		} // End Profile loop.

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject ", " Exit Res Guest  .");	

	} // End ResGuest loop.

	RoomDetails obRoomDetails = null;
	List<RoomDetails> objRDetailList = objReservation.getRoomDetailList();
	RoomStayList objRoomStayList = objHotelReservation.getRoomStays();
	RoomStay[] arrRoomStay = objRoomStayList.getRoomStay();

	/* To set the room types attributes with comments. */
	for (RoomStay objRoomStay : arrRoomStay) { // To traverse room stay array.

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject ", " Enter Room Stay Array.");

		RoomType[] arrRoomType = objRoomStay.getRoomTypes().getRoomType();
		ReservationComment arrComment[] = objRoomStay.getComments().getComment();

		for (RoomType objRType : arrRoomType) {  // To traverse room type 

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Iterating Room Type Array.");
			obRoomDetails = new RoomDetails();

			com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();
			objRoomType.setCode(objRType.getRoomTypeCode());

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Room Type Code is Set in response.");
			RoomFeature[] arrRoomFeature = objRType.getRoomFeatures().getFeatures();

			/*
			 * To set the room Number. String [] arrRoomNumber =
			 * objRType.getRoomNumber();
			 * 
			 * for(String roomNumber : arrRoomNumber){
			 * 
			 * obRoomDetails.setRoomNumber(Integer.parseInt(roomNumber)); }
			 */

			objBuilder = new StringBuilder();
			StringBuilder objStringBuilder2 = new StringBuilder();
			for (RoomFeature objRFeature : arrRoomFeature) { // To traverse room features.
				MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Iterating Room Feature Array.");
				objBuilder.append(objRFeature.getFeature() + ";");
				objStringBuilder2.append(objRFeature.getDescription() + ";");

			} // End loop for room features.

			objRoomType.setFeatures(objBuilder.toString());
			objRoomType.setDescription(objStringBuilder2.toString());
			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Fetures and Description are Set in response.");
			objStringBuilder2.setLength(0);
			obRoomDetails.setRoomType(objRoomType);
			objRDetailList.add(obRoomDetails);

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject ", " Exit Room Type .");		


		} // End loop for room Type.

		/* For guest count. */
		GuestCount[] arrGuestCount = objRoomStay.getGuestCounts().getGuestCount();
		int guestCount = 0;
		for (GuestCount objGuestCount : arrGuestCount) { // To traverse Guest Count.
			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Iterating Guest Count Array.");
			guestCount = guestCount + objGuestCount.getCount();

			objReservation.setNumberOfGuests(guestCount);
			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Guest Count is Set in response.");
		} // End loop for Guest Count.

		/* To set the checkin and check out date . */
		TimeSpan objTimeSpan = objRoomStay.getTimeSpan();
		if (objTimeSpan != null) {

			objReservation.setCheckinDate(AdapterUtility.getDate(objTimeSpan.getStartDate()));
			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," CheckIn Date is Set in response.");

			TimeSpanChoice_type0 objTimeSpanChoice_type0 = objTimeSpan.getTimeSpanChoice_type0();

			if (objTimeSpanChoice_type0 != null) {

				objReservation.setCheckoutDate(AdapterUtility.getDate(objTimeSpanChoice_type0.getEndDate()));
				MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," CheckOut Date is Set in response.");
			}
		}

		/* To add notes. */
		objBuilder = new StringBuilder();
		for (ReservationComment objReservationComment : arrComment) {// To traverse reservation notes.
			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Iterating Reservation Comment Array.");
			objBuilder.append(objReservationComment.getCommentType() + ";");
		} // End loop for notes.

		objReservation.setNotes(objBuilder.toString());
		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject ", " Notes are Set in response.");
		objBuilder.setLength(0);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject ", " Exit Room Stay .");	


	} // End loop for room Stay.

	/*
	 * To set the reservation having room details in update booking response
	 * object.
	 */
	objReservation.setRoomDetailList(objRDetailList);
	objUpdateBookingResponse.setReservation(objReservation);

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getModifyBookingObject "," Exit  getModifyBookingObject method ");

	return objUpdateBookingResponse;
}

/**
 * This method is used to make the request for update the booking (pre -
 * checkin.
 * 
 * @param updateBookingRequest
 * @return
 * @throws AxisFault
 */
private ModifyBookingRequest getUpdateBookingRequestObject(
		UpdateBookingRequest updateBookingRequest) throws AxisFault {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getUpdateBookingRequestObject "," Enter getUpdateBookingRequestObject method ");

	/* To set the request parameters. */
	String confirmationNumber = updateBookingRequest.getConfirmationNumber();
	String notes[] = updateBookingRequest.getNotes();

	/* To create Reservation Stub. */
	// ReservationServiceStub objReservationServiceStub = new
	// ReservationServiceStub();

	/* To set the ogHeader. */
	OGHeader objHeader = new OGHeader();

	EndPoint objEndPoint = new EndPoint();
	objEndPoint.setEntityID("WEST");
	objEndPoint.setSystemType("OWS");

	/* To set the origin . */
	objHeader.setOrigin(objEndPoint);

	objEndPoint = new EndPoint();
	objEndPoint.setEntityID("TI");
	objEndPoint.setSystemType("ORS");

	objHeader.setDestination(objEndPoint);

	/* To set the confirmation number as transactionID. */
	objHeader.setTransactionID(confirmationNumber);
	objHeader.setTimeStamp(AdapterUtility.getCalender());

	/* To set the OGHeader into OGHeaderE. */
	OGHeaderE objHeaderE = new OGHeaderE();
	objHeaderE.setOGHeader(objHeader);

	/* To create ModifyBookingRequest Object. */
	ModifyBookingRequest objModifyBookingRequest = new ModifyBookingRequest();

	// objModifyBookingRequest.setCancelUpsell(true);
	// objModifyBookingRequest.setCanHandleVaultedCreditCard(true);
	// objModifyBookingRequest.setOverrideInventoryCheck(true);
	// objModifyBookingRequest.setOverrideRestrictionCheck(true);

	/* To create the HOtel Reservation. */

	HotelReservation objHotelReservation = new HotelReservation();
	objHotelReservation.setTracesCount(1);
	objHotelReservation.setCommentsCount(2);
	objHotelReservation.setAlertExists(true);

	/* To add AccompanyGuest on AccompanyGuest List for Hotel Reservation. */
	AccompanyGuestList objAccompanyGuestList = new AccompanyGuestList();

	AccompanyGuest objAccompanyGuest = new AccompanyGuest();
	objAccompanyGuest.setFirstName("John");
	objAccompanyGuest.setLastName("Michel");

	com.micros.reservation.ReservationServiceStub.UniqueID objId = new com.micros.reservation.ReservationServiceStub.UniqueID();

	objId.setString("4627013");

	objId.setType(com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL);
	objAccompanyGuest.setNameID(objId);

	objAccompanyGuestList.addAccompanyGuest(objAccompanyGuest);
	objHotelReservation.setAccompanyGuests(objAccompanyGuestList);

	/* To set the status type. */
	objHotelReservation
	.setComputedReservationStatus(ReservationStatusType.CANCELED);

	/* To set the room stay information into room stay list. */
	RoomStayList objRoomStayList = new RoomStayList();
	RoomStay objRoomStay = new RoomStay();

	RatePlanList objRatePlanList = new RatePlanList();
	com.micros.reservation.ReservationServiceStub.RatePlan objRatePlan = new com.micros.reservation.ReservationServiceStub.RatePlan();
	objRatePlan.setRatePlanCode("ABC");
	objRatePlanList.addRatePlan(objRatePlan);
	objRoomStay.setRatePlans(objRatePlanList);

	RoomTypeList objRoomTypeList = new RoomTypeList();
	RoomType objRoomType = new RoomType();
	objRoomType.setRoomTypeCode("KNG");
	objRoomType.setNumberOfUnits(1);

	RoomFeatureList objRoomFeatureList = new RoomFeatureList();
	RoomFeature objRoomFeature = new RoomFeature();
	objRoomFeature.setFeature("POOL");
	RoomFeature objRoomFeature1 = new RoomFeature();
	objRoomFeature.setFeature("DVD");

	objRoomFeatureList.addFeatures(objRoomFeature);
	objRoomFeatureList.addFeatures(objRoomFeature1);

	/*
	 * RoomRateList objRoomRateList = new RoomRateList(); RoomRate
	 * objRoomRate = new RoomRate(); objRoomRate.setRoomTypeCode( "KNG" );
	 * objRoomRate.setRatePlanCode( "ABC" );
	 */
	GuestCountList objGuestCountList = new GuestCountList();
	GuestCount objGuestCount = new GuestCount();

	objGuestCount
	.setAgeQualifyingCode(com.micros.reservation.ReservationServiceStub.AgeQualifyingCode.CHILD);
	objGuestCount.setCount(1);

	TimeSpan objTimeSpan = new TimeSpan();
	objTimeSpan.setStartDate(AdapterUtility.getCalender());
	TimeSpanChoice_type0 objTimeSpanChoice_type0 = new TimeSpanChoice_type0();
	objTimeSpanChoice_type0.setEndDate(AdapterUtility.getCalender());
	objRoomStay.setTimeSpan(objTimeSpan);

	Guarantee objGuarantee = new Guarantee();

	GuaranteesAccepted objGuaranteesAccepted = new GuaranteesAccepted();
	GuaranteeAccepted objGuaranteeAccepted = new GuaranteeAccepted();

	com.micros.reservation.ReservationServiceStub.CreditCard objCreditCard = new com.micros.reservation.ReservationServiceStub.CreditCard();
	objCreditCard.setCardCode("AN");
	objCreditCard.setCardHolderName("Mike Haggar ");
	objCreditCard.setExpirationDate(new Date());

	CreditCardChoice_type0 objCardChoice_type0 = new CreditCardChoice_type0();
	objCardChoice_type0.setCardNumber("XXXX_XXXX_XXXX_1234");
	objCreditCard.setCreditCardChoice_type0(objCardChoice_type0);
	objGuaranteeAccepted.setGuaranteeCreditCard(objCreditCard);
	objGuaranteesAccepted.addGuaranteeAccepted(objGuaranteeAccepted);

	com.micros.reservation.ReservationServiceStub.HotelReference objHotelReference = new com.micros.reservation.ReservationServiceStub.HotelReference();
	objHotelReference.setHotelCode("SEFIVE");
	objHotelReference.setChainCode("WS");

	ResGuestRPHList objGuestRPHList = new ResGuestRPHList();
	ResGuestRPH objResGuestRPH = new ResGuestRPH();
	objResGuestRPH.setRPH(0);

	/*
	 * SpecialRequestList objSpecialRequestList = new SpecialRequestList();
	 * SpecialRequest objSpecialRequest = new SpecialRequest();
	 * objSpecialRequest.setRequestCode( "Request Code" );
	 */

	ReservationCommentList objReservationCommentList = new ReservationCommentList();
	ReservationComment objComment = new ReservationComment();
	objComment.setCommentOriginatorCode("CRO");
	objComment.setGuestViewable(false);
	objComment.setCommentType(notes[0]);

	ReservationComment objComment1 = new ReservationComment();
	objComment1.setCommentOriginatorCode("CRO");
	objComment1.setGuestViewable(false);
	objComment1.setCommentType(notes[1]);

	/* To add guest count list into room stay object. */
	objGuestCountList.addGuestCount(objGuestCount);
	objRoomStay.setGuestCounts(objGuestCountList);

	/* To add room rate list into room stay object. */
	/*
	 * objRoomRateList.addRoomRate( objRoomRate ); objRoomStay.setRoomRates(
	 * objRoomRateList );
	 */

	/* To add guest count list into room stay object. */
	objRoomType.setRoomFeatures(objRoomFeatureList);
	objRoomTypeList.addRoomType(objRoomType);
	objRoomStay.setRoomTypes(objRoomTypeList);

	/* To add Guarantees accepted into room stay object. */
	objGuarantee.setGuaranteesAccepted(objGuaranteesAccepted);
	objRoomStay.setGuarantee(objGuarantee);

	/* To add RPH into room stay list. */
	objGuestRPHList.addResGuestRPH(objResGuestRPH);
	objRoomStay.setResGuestRPHs(objGuestRPHList);

	/* To add special request into room stay list. */
	/*
	 * objSpecialRequestList.addSpecialRequest( objSpecialRequest );
	 * objRoomStay.setSpecialRequests( objSpecialRequestList );
	 */

	/* To add comments into room stay object. */
	objReservationCommentList.addComment(objComment);
	objReservationCommentList.addComment(objComment1);
	objRoomStay.setComments(objReservationCommentList);

	/* To add hotel reference into room stay object. */
	/* objRoomStay.setHotelReference( objHotelReference ); */

	/* To add room stay into room stay list. */
	objRoomStayList.addRoomStay(objRoomStay);

	objHotelReservation.setRoomStays(objRoomStayList);

	ResGuestList objGuestList = new ResGuestList();
	ResGuest objResGuest = new ResGuest();
	ProfileList objProfileList = new ProfileList();
	Profile objProfile = new Profile();

	com.micros.reservation.ReservationServiceStub.UniqueIDList objIdList = new com.micros.reservation.ReservationServiceStub.UniqueIDList();
	com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();
	objUniqueID
	.setType(com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL);

	objUniqueID.setString(confirmationNumber);
	objIdList.addUniqueID(objUniqueID);
	objProfile.setProfileIDs(objIdList);
	objHotelReservation.setUniqueIDList(objIdList);
	objProfileList.addProfile(objProfile);
	objResGuest.setProfiles(objProfileList);

	TransportInfo objTransportInfo = new TransportInfo();
	objTransportInfo.setCarrierCode("AA");
	objTransportInfo.setId("421");
	objTransportInfo.setLocationCode("HEA");
	objTransportInfo.setTime(AdapterUtility.getCalender());

	objResGuest.setArrivalTransport(objTransportInfo);

	objTransportInfo = new TransportInfo();
	objTransportInfo.setCarrierCode("DE");
	objTransportInfo.setId("421");
	objTransportInfo.setLocationCode("HEA");
	objTransportInfo.setTime(AdapterUtility.getCalender());

	objResGuest.setDepartureTransport(objTransportInfo);

	objGuestList.addResGuest(objResGuest);

	WrittenConfInst objWrittenConfInst = new WrittenConfInst();
	objWrittenConfInst.setEmail("ASURENDRA@micros.com");

	/* To add hotelReservation into modify booking request . */
	objHotelReservation.setResGuests(objGuestList);
	objHotelReservation.setWrittenConfInst(objWrittenConfInst);
	objModifyBookingRequest.setHotelReservation(objHotelReservation);

	// objModifyBookingRequest.setCanHandleVaultedCreditCard( true );

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getUpdateBookingRequestObject "," Exit getUpdateBookingRequestObject method "+ objModifyBookingRequest);
	return objModifyBookingRequest;
}

@Override
public UpdatePaymentResponse updatePayment(UpdatePaymentRequest arg0) {

	return null;
}

@Override
public GetAvailabilityResponse checkAvailability(
		GetAvailabilityRequest availabilityRequest) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," checkAvailability ", " Enter checkAvailability method. ");

	FetchCalendarRequest objFetchCalendarRequest = null;
	FetchCalendarResponse objResponse = null;
	GetAvailabilityResponse objGetAvailabilityResponse = null;
	/*To get the request parameters*/
	Date objSDate = availabilityRequest.getStartDate();
	Date objEDate = availabilityRequest.getEndDate();

	if(objEDate.before(objSDate)){

		objGetAvailabilityResponse = new GetAvailabilityResponse();
		objGetAvailabilityResponse.setStatus("FAILURE");

	}
	else
	{
		objFetchCalendarRequest = getAvailabiltyRequestObject( availabilityRequest );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," checkAvailability ", " Convert request into xml form ");

		String xmlRequest = AdapterUtility.convertToStreamXML( objFetchCalendarRequest );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," checkAvailability ", " Get Request in xml format :: "+ xmlRequest);

		/* To send the xml request to the OXI Simulator via Message Transport. */
		MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
		String xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," checkAvailability "," Get Response from OXI Simulator in xml format :: "+ xmlResponse);

		objResponse = new FetchCalendarResponse();

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," checkAvailability ", " Convert xml response into object ");

		objResponse = ( FetchCalendarResponse ) AdapterUtility.covertToStramObject( xmlResponse );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," checkAvailability "," Get Response object from response xml ::: " + objResponse);

		objGetAvailabilityResponse = getAvailabilityResponseObject( objResponse );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," checkAvailability "," Response received in message Parser : "+ objGetAvailabilityResponse);


	}
	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," checkAvailability ", " Exit checkAvailability method ");
	return objGetAvailabilityResponse;

}


/**
 * This method is used to generate the response for the GetAvailability.
 * 
 * @param objResponse
 * @return
 */
private GetAvailabilityResponse getAvailabilityResponseObject(
		FetchCalendarResponse objResponse) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAvailabilityResponseObject "," Enter getAvailabilityResponseObject method. ");

	GetAvailabilityResponse objAvailabilityResponse = new GetAvailabilityResponse();
	/*To set status in response.*/
	objAvailabilityResponse.setStatus(objResponse.getResult().getResultStatusFlag().toString());

	/*To get the list from availability response.*/
	List<Availability> objLiAvailabilities = objAvailabilityResponse.getAvailList();

	/*To get the calendar daily detail array from response.*/
	CalendarDailyDetail[] arrCalendarDailyDetail = objResponse.getCalendar().getCalendarDay();

	for(CalendarDailyDetail objCalendarDailyDetail : arrCalendarDailyDetail){ // To traverse calendar daily detail.

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAvailabilityResponseObject "," Enter for traversing calendar details. ");	

		/*To set the date in response.*/
		Availability objAvailability = new Availability();		
		objAvailability.setDate(objCalendarDailyDetail.getDate());      

		/*To set the roomInventory in response.*/
		List<com.cloudkey.commons.RoomTypeInventory> objLInventories = objAvailability.getRoomTypeInventoryList();			 

		RoomTypeInventory[] arrRoomTypeInventories =  objCalendarDailyDetail.getOccupancy().getRoomTypeInventory();

		for(RoomTypeInventory objRTypeInventory : arrRoomTypeInventories){ // To traverse room type inventory.

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAvailabilityResponseObject "," Traversing room type inventory. ");

			com.cloudkey.commons.RoomTypeInventory objRoomTypeInventory = new com.cloudkey.commons.RoomTypeInventory();	

			/*To set room type on room inventory.*/
			com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();
			objRoomType.setCode( objRTypeInventory.getRoomTypeCode() );
			objRoomTypeInventory.setRoomType( objRoomType );

			//objRoomTypeInventory.setRoomDescription( objRTypeInventory.get );
			objRoomTypeInventory.setRoomsAvailable( objRTypeInventory.getTotalAvailableRooms().intValue() );
			objRoomTypeInventory.setTotalRooms( objRTypeInventory.getTotalRooms().intValue() );

			/*To add roomtype inventory in inventory list.*/
			objLInventories.add( objRoomTypeInventory );

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAvailabilityResponseObject "," Exit loop for room type inventory. ");	

		}// End room type inventory loop.

		/*To add availability object into list.*/
		objLiAvailabilities.add( objAvailability );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAvailabilityResponseObject "," Exit traversing calendar details. ");
	} // End loop for calendar details.


	objAvailabilityResponse.setAvailList( objLiAvailabilities );

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAvailabilityResponseObject "," Exit getAvailabilityResponseObject method. ");	
	return objAvailabilityResponse;
}

/**
 * This method is used to create the request object for check the
 * availability on a certain date range.
 * 
 * @param availabilityRequest
 * @return AvailabilityRequest
 */
private FetchCalendarRequest getAvailabiltyRequestObject(
		GetAvailabilityRequest availabilityRequest) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAvailabiltyRequestObject "," Enter getAvailabiltyRequestObject method. ");

	FetchCalendarRequest objFetchCalendarRequest = null;
	/*To get the request parameters*/
	Date objSDate = availabilityRequest.getStartDate();
	Date objEDate = availabilityRequest.getEndDate();

	/*To create the request for availability.*/
	objFetchCalendarRequest = new FetchCalendarRequest();

	Calendar objCalendar = Calendar.getInstance();
	com.micros.availability.AvailabilityServiceStub.TimeSpan objTimeSpan = new com.micros.availability.AvailabilityServiceStub.TimeSpan();

	/*To send the hotel code in request parameters.*/
	com.micros.availability.AvailabilityServiceStub.HotelReference objHotelReference = new  com.micros.availability.AvailabilityServiceStub.HotelReference();
	objHotelReference.setHotelCode(  IMicrosConstants.HOTEL_CODE );
	objFetchCalendarRequest.setHotelReference( objHotelReference );

	/*To set start and end date.*/
	objCalendar.setTime(objSDate);
	objTimeSpan.setStartDate( objCalendar );	

	com.micros.availability.AvailabilityServiceStub.TimeSpanChoice_type0 objType0 = new com.micros.availability.AvailabilityServiceStub.TimeSpanChoice_type0();
	objCalendar = Calendar.getInstance();
	objCalendar.setTime(objEDate);
	objType0.setEndDate( objCalendar );
	objTimeSpan.setTimeSpanChoice_type0(objType0); 

	/*To set time span in fetch calendar request.*/
	objFetchCalendarRequest.setStayDateRange(objTimeSpan);

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAvailabiltyRequestObject "," Exit getAvailabiltyRequestObject method. ");

	return objFetchCalendarRequest;
}



/**
 * This method is used to make the request for the assignment of requested
 * room.
 * @param assignRoomRequest 
 * 
 * @return AssignRoomAdvRequest
 */
private AssignRoomRequest getAssignRoomRequestObject(com.cloudkey.pms.request.AssignRoomRequest assignRoomRequest) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAssignRoomRequestObject "," Enter getAssignRoomRequestObject method ");

	String roomTypeCode = assignRoomRequest.getRoomTypeCode();
	String confirmationNumber =  assignRoomRequest.getReservation().getConfirmationNumber();
	FetchRoomStatusResponse objFetchRoomStatusResponse = null;

	objFetchRoomStatusResponse =  callFetchRoomStatus(roomTypeCode);

	AssignRoomRequest objAssignRoomRequest = new AssignRoomRequest();

	/*To set the room number.*/
	objAssignRoomRequest.setRoomNoRequested( objFetchRoomStatusResponse .getRoomStatus()[0].getRoomNumber());

	/*To set the confirmation number.*/
	com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();
	objUniqueID.setSource("OPERA-ID");
	objUniqueID.setString( confirmationNumber );
	objUniqueID.setType(com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL);
	objAssignRoomRequest.setResvNameId( objUniqueID );

	/*To set the hotel reference.*/
	com.micros.reservation.ReservationServiceStub.HotelReference objHotelReference = new  com.micros.reservation.ReservationServiceStub.HotelReference();
	objHotelReference.setHotelCode(  IMicrosConstants.HOTEL_CODE );
	objAssignRoomRequest.setHotelReference( objHotelReference );

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAssignRoomRequestObject "," Exit getAssignRoomRequestObject method ");

	return objAssignRoomRequest;
}


/**
 * This method is used to make request for the room numbers on the basis of room type.
 * 
 * @param roomTypeCode
 * @return
 */
private FetchRoomStatusResponse callFetchRoomStatus(String roomTypeCode) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," callFetchRoomStatus "," Enter callFetchRoomStatus method ");

	FetchRoomStatusRequest objFetchRoomStatusRequest = null;
	FetchRoomStatusResponse objResponse = null;

	objFetchRoomStatusRequest = getFetchRoomRequestObject( roomTypeCode );

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," callFetchRoomStatus ", " Convert request into xml form ");

	String xmlRequest = AdapterUtility.convertToStreamXML( objFetchRoomStatusRequest );

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," callFetchRoomStatus ", " Get Request in xml format :: "+ xmlRequest);

	/* To send the xml request to the OXI Simulator via Message Transport. */
	MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
	String xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," callFetchRoomStatus "," Get Response from OXI Simulator in xml format :: "+ xmlResponse);

	objResponse = new FetchRoomStatusResponse();

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," callFetchRoomStatus ", " Convert xml response into object ");

	objResponse = ( FetchRoomStatusResponse ) AdapterUtility.covertToStramObject(xmlResponse);

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," callFetchRoomStatus "," Get Response object from response xml ::: " + objResponse);

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," callFetchRoomStatus "," Exit assignRoom method ");


	return objResponse ;
}

/**
 * This method is used to create the request object for fetching the room status with room number.
 * 
 * @param roomTypeCode
 * @return
 */
private FetchRoomStatusRequest getFetchRoomRequestObject(String roomTypeCode) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFetchRoomRequestObject "," Enter getFetchRoomRequestObject method ");

	FetchRoomStatusRequest objFetchRoomStatusRequest = new FetchRoomStatusRequest();
	objFetchRoomStatusRequest.setRoomType(roomTypeCode);

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getFetchRoomRequestObject "," Enter getFetchRoomRequestObject method ");
	return objFetchRoomStatusRequest;
}

@Override
public com.cloudkey.pms.response.AssignRoomResponse assignRoom(
		com.cloudkey.pms.request.AssignRoomRequest assignRoomRequest ) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," assignRoom "," Enter assignRoom method ");

	AssignRoomRequest objAssignRoomRequest = null;
	AssignRoomResponse objResponse = null;
	com.cloudkey.pms.response.AssignRoomResponse objRoomResponse = null;

	if(assignRoomRequest != null && assignRoomRequest.getReservation() != null && assignRoomRequest.getReservation().getConfirmationNumber().length() > 0){


		objAssignRoomRequest = getAssignRoomRequestObject( assignRoomRequest );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," assignRoom ", " Convert request into xml form ");

		String xmlRequest = AdapterUtility.convertToStreamXML( objAssignRoomRequest );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," assignRoom ", " Get Request in xml format :: "+ xmlRequest);

		/* To send the xml request to the OXI Simulator via Message Transport. */
		MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
		String xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," assignRoom "," Get Response from OXI Simulator in xml format :: "+ xmlResponse);

		objResponse = new AssignRoomResponse();

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," assignRoom ", " Convert xml response into object ");

		objResponse = ( AssignRoomResponse ) AdapterUtility.covertToStramObject(xmlResponse);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," assignRoom "," Get Response object from response xml ::: " + objResponse);

		objRoomResponse = getAssignRoomResponseObject(objResponse);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," assignRoom "," Response received in message Parser : "+ objRoomResponse);

	}
	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," assignRoom "," Exit assignRoom method ");

	return objRoomResponse;
}


/**
 * This method is used to get the assign room response 
 * and return the status with the assigned room number.
 * 
 * @param objResponse
 * @return
 */
private com.cloudkey.pms.response.AssignRoomResponse getAssignRoomResponseObject(
		AssignRoomResponse objResponse) {

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAssignRoomResponseObject "," Enter getAssignRoomResponseObject method ");	

	com.cloudkey.pms.response.AssignRoomResponse objAssignRoomResponse = new com.cloudkey.pms.response.AssignRoomResponse();
	/*To populate the response into assign Room Response class.*/
	objAssignRoomResponse.setAssignRoomNumber(objResponse.getRoomNoAssigned());
	objAssignRoomResponse.setStatus( objResponse.getResult().getResultStatusFlag().toString());

	MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getAssignRoomResponseObject "," Exit getAssignRoomResponseObject method ");	
	return objAssignRoomResponse;
}

}
