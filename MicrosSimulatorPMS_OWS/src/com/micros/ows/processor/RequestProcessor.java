package com.micros.ows.processor;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis2.databinding.types.Language;

import com.micros.adv.reservation.ResvAdvancedServiceStub.FetchRoomStatusRequest;
import com.micros.adv.reservation.ResvAdvancedServiceStub.FetchRoomStatusResponse;
import com.micros.availability.AvailabilityServiceStub;
import com.micros.availability.AvailabilityServiceStub.Calendar;
import com.micros.availability.AvailabilityServiceStub.CalendarDailyDetail;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarRequest;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarResponse;
import com.micros.availability.AvailabilityServiceStub.RoomTypeInventory;
import com.micros.availability.AvailabilityServiceStub.RoomTypeInventoryList;
import com.micros.ows.bean.Amount;
import com.micros.ows.bean.BillHeader;
import com.micros.ows.bean.BillItem;
import com.micros.ows.bean.CheckInComplete;
import com.micros.ows.bean.CheckOutComplete;
import com.micros.ows.bean.CheckOutComplete.InvoiceNumber;
import com.micros.ows.bean.CheckOutResponse;
import com.micros.ows.bean.CreditCardSurcharge;
import com.micros.ows.bean.Customer;
import com.micros.ows.bean.InvoiceRequest;
import com.micros.ows.bean.InvoiceResponse;
import com.micros.ows.bean.NameAddress;
import com.micros.ows.bean.NameCreditCard;
import com.micros.ows.bean.NameCreditCardList;
import com.micros.ows.bean.NativeName;
import com.micros.ows.bean.ObjectFactory;
import com.micros.ows.bean.PersonName;
import com.micros.ows.bean.Profile;
import com.micros.ows.bean.ReservationRequestBase;
import com.micros.ows.bean.ResultStatus;
import com.micros.ows.bean.ResultStatusFlag;
import com.micros.ows.bean.Room;
import com.micros.ows.bean.RoomStatus;
import com.micros.ows.bean.RoomType;
import com.micros.ows.bean.UniqueID;
import com.micros.ows.bean.UniqueIDList;
import com.micros.ows.bean.UniqueIDType;
import com.micros.ows.constants.IMicrosOWSConstants;
import com.micros.ows.logger.OWSMessageLogger;
import com.micros.ows.utility.OWSUtility;
import com.micros.reservation.ReservationServiceStub.AdditionalDetail;
import com.micros.reservation.ReservationServiceStub.AdditionalDetailList;
import com.micros.reservation.ReservationServiceStub.AdditionalDetailType;
import com.micros.reservation.ReservationServiceStub.AdditionalGuestAmount;
import com.micros.reservation.ReservationServiceStub.AdditionalGuestAmountList;
import com.micros.reservation.ReservationServiceStub.AgeQualifyingCode;
import com.micros.reservation.ReservationServiceStub.AssignRoomRequest;
import com.micros.reservation.ReservationServiceStub.AssignRoomResponse;
import com.micros.reservation.ReservationServiceStub.Charge;
import com.micros.reservation.ReservationServiceStub.ChargeList;
import com.micros.reservation.ReservationServiceStub.ChargesForTheDay;
import com.micros.reservation.ReservationServiceStub.CreditCardChoice_type0;
import com.micros.reservation.ReservationServiceStub.DailyChargeList;
import com.micros.reservation.ReservationServiceStub.DepositRequirement;
import com.micros.reservation.ReservationServiceStub.FutureBookingSummaryRequest;
import com.micros.reservation.ReservationServiceStub.FutureBookingSummaryResponse;
import com.micros.reservation.ReservationServiceStub.GDSResultStatus;
import com.micros.reservation.ReservationServiceStub.Guarantee;
import com.micros.reservation.ReservationServiceStub.GuaranteeAccepted;
import com.micros.reservation.ReservationServiceStub.GuaranteesAccepted;
import com.micros.reservation.ReservationServiceStub.GuestCount;
import com.micros.reservation.ReservationServiceStub.GuestCountList;
import com.micros.reservation.ReservationServiceStub.HotelReservation;
import com.micros.reservation.ReservationServiceStub.HotelReservation_type0;
import com.micros.reservation.ReservationServiceStub.ModifyBookingRequest;
import com.micros.reservation.ReservationServiceStub.ModifyBookingResponse;
import com.micros.reservation.ReservationServiceStub.NameAddressList;
import com.micros.reservation.ReservationServiceStub.OtherPaymentType;
import com.micros.reservation.ReservationServiceStub.Paragraph;
import com.micros.reservation.ReservationServiceStub.ParagraphChoice;
import com.micros.reservation.ReservationServiceStub.Payment;
import com.micros.reservation.ReservationServiceStub.PaymentType;
import com.micros.reservation.ReservationServiceStub.PaymentTypeChoice_type0;
import com.micros.reservation.ReservationServiceStub.PaymentsAccepted;
import com.micros.reservation.ReservationServiceStub.ProfileChoice_type0;
import com.micros.reservation.ReservationServiceStub.ProfileList;
import com.micros.reservation.ReservationServiceStub.Rate;
import com.micros.reservation.ReservationServiceStub.RateList;
import com.micros.reservation.ReservationServiceStub.RatePlan;
import com.micros.reservation.ReservationServiceStub.RatePlanList;
import com.micros.reservation.ReservationServiceStub.ResGuest;
import com.micros.reservation.ReservationServiceStub.ResGuestList;
import com.micros.reservation.ReservationServiceStub.ReservationComment;
import com.micros.reservation.ReservationServiceStub.ReservationCommentList;
import com.micros.reservation.ReservationServiceStub.RoomFeature;
import com.micros.reservation.ReservationServiceStub.RoomFeatureList;
import com.micros.reservation.ReservationServiceStub.RoomRate;
import com.micros.reservation.ReservationServiceStub.RoomRateList;
import com.micros.reservation.ReservationServiceStub.RoomStay;
import com.micros.reservation.ReservationServiceStub.RoomStayList;
import com.micros.reservation.ReservationServiceStub.RoomTypeList;
import com.micros.reservation.ReservationServiceStub.Text;
import com.micros.reservation.ReservationServiceStub.TimeSpan;
import com.micros.reservation.ReservationServiceStub.TimeSpanChoice_type0;
import com.micros.reservation.ReservationServiceStub.TransportInfo;

/**
 * This class handles the xml request from adapter and data harvester service . 
 * It generate the dummy response for the requested method.The response is converted in to xml
 * and it is return to its caller.
 * 
 * @author niveditat
 * 
 */

public class RequestProcessor extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private String confirmationNumber = null;
	private String xmlRequestValue = null;
	private String xmlOWSResponse = null;

	private ObjectFactory objFactory = null;
	private Enumeration<String> parameterNames = null;

	@Override
	protected void doPost( HttpServletRequest request ,	HttpServletResponse response ) {

		OWSMessageLogger.logInfo(RequestProcessor.class, " doPost ", " Enter in doPost ");
		PrintWriter out = null;

		try {

			out = response.getWriter();

		} catch (IOException exc) {

			OWSMessageLogger.logError( RequestProcessor.class, " doPost ", exc );
		}

		response.setContentType("text/html");
		parameterNames = request.getParameterNames();

		/*
		 * It iterates through all elements of request parameters. 
		 */
		while (parameterNames.hasMoreElements()) {

			String paramName = parameterNames.nextElement();
			xmlRequestValue = request.getParameter(paramName);

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " xml request is " + xmlRequestValue );
		}

		xmlOWSResponse = getOWSResponse( xmlRequestValue );

		out.println( xmlOWSResponse );

	}


	/**
	 * To generate the OWS response for the requested service.
	 * 
	 * @param xmlRequest
	 * @return String
	 */
	private String getOWSResponse( String xmlRequest ) {

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " Enter getOWSResponse " );

		if (xmlRequestValue.contains( IMicrosOWSConstants.CHECKIN_REQUEST )) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " enter check in block " );

			xmlOWSResponse = getXMLCheckInResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost check in block ", " response send " + xmlOWSResponse );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " exit check in block " );

		}

		else if ( xmlRequestValue.contains( IMicrosOWSConstants.CHECKOUT_REQUEST )) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost CheckOutRequest block ", " enter CheckOutRequest block " );

			xmlOWSResponse = getXMLCheckOutResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost CheckOutRequest block ", " exit CheckOutRequest block " );
		}

		else if  (xmlRequestValue.contains( IMicrosOWSConstants.SEARCH_RESERVATION_REQUEST ) ) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost SearchReservationRequest block ", " enter SearchReservationRequest block " );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost SearchReservationRequest block ", " exit SearchReservationRequest block " );

		}
		else if(xmlRequestValue.contains("com.micros.reservation.ReservationServiceStub_-ModifyBookingRequest")){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ModifyBookingRequest block ", " enter ModifyBookingRequest block " );

			xmlOWSResponse = getXMLModifyBookingResponse();


			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ModifyBookingRequest block ", " exit ModifyBookingRequest block " );	

		}

		else if(xmlRequestValue.contains( IMicrosOWSConstants.GETFOLIO_REQUEST )){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost getFolio block.. ", " enter getFolio block " );

			xmlOWSResponse = getXMLFolioResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost getFolio block.. ", " exit getFolio block " );
		}
		else if(xmlRequestValue.contains( IMicrosOWSConstants.ASSIGN_ROOM_REQUEST )){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost assign Room block ", " enter assign Room  block " );

			xmlOWSResponse = getXMLAssignRoomResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost assign Room  block ", " exit assign Room  block " );
		}
		 
		else if (xmlRequestValue.contains("com.micros.reservation.ReservationServiceStub_-FutureBookingSummaryRequest")){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FutureBookingSummaryRequest block ", " enter FetchRoomStatusRequest block " );

			xmlOWSResponse = getXMLFutureBookingSummaryResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FutureBookingSummaryRequest block ", " FutureBookingSummaryRequest Xml Response "  );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FutureBookingSummaryRequest block ", " exit FutureBookingSummaryRequest block " );
			
		}
		else if (xmlRequestValue.contains("com.micros.adv.reservation.ResvAdvancedServiceStub_-FetchRoomStatusRequest")){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " enter FetchRoomStatusRequest block " );

			xmlOWSResponse = getXMLFetchRoomStatusResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " FetchRoomStatusRequest Xml Response "  );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " exit FetchRoomStatusRequest block " );
				
		}
		
		else if (xmlRequestValue.contains("com.micros.availability.AvailabilityServiceStub_-FetchCalendarRequest")){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchCalendarRequest block ", " enter FetchCalendarRequest block " );

			xmlOWSResponse = getXMLFetchCalendarResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchCalendarRequest block ", " FetchCalendarRequest Xml Response "  );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchCalendarRequest block ", " exit FetchCalendarRequest block " );
				
		}
		else if (xmlRequestValue.contains( "FetchRoomStatusRequest" ) ){ // For Harvester Service.
			

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " enter FetchRoomStatusRequest block " );

			com.micros.ows.bean.FetchRoomStatusRequest objFetchRoomStatusRequest = null;

			objFetchRoomStatusRequest = new com.micros.ows.bean.FetchRoomStatusRequest();

			objFetchRoomStatusRequest = (com.micros.ows.bean.FetchRoomStatusRequest)OWSUtility.covertToObject(objFetchRoomStatusRequest, xmlRequestValue);

			objFactory = new ObjectFactory();

			com.micros.ows.bean.FetchRoomStatusResponse objFetchRoomStatusResponse = objFactory.createFetchRoomStatusResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " FetchRoomStatusResponse Object created " );

			RoomStatus objRoomStatus = objFactory.createRoomStatus();
			objRoomStatus.setRoomStatus( "IP" );
			objRoomStatus.setFrontOfficeStatus( "VAC" );
			objRoomStatus.setOccupancyCondition( "2");
			objRoomStatus.setHouseKeepingStatus( "Inspected");
			objRoomStatus.setRoomNumber( "0508" );
			objRoomStatus.setRoomType( "SUK" );

			List<RoomStatus> objRoomStatu = objFetchRoomStatusResponse.getRoomStatus();
			objRoomStatu.add(objRoomStatus);

			// adding second room status details
			objRoomStatus = objFactory.createRoomStatus();
			objRoomStatus.setRoomStatus( "IP" );
			objRoomStatus.setFrontOfficeStatus( "VAC" );
			objRoomStatus.setOccupancyCondition( "3");
			objRoomStatus.setHouseKeepingStatus( "Inspected");
			objRoomStatus.setRoomNumber( "0509" );
			objRoomStatus.setRoomType( "SUK" );

			objRoomStatu.add(objRoomStatus);
		
			String fetchRoomStatusResponse = OWSUtility.convertToXML( objFetchRoomStatusResponse );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " FetchRoomStatusResponse Xml Response " + fetchRoomStatusResponse );
		
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " exit FetchRoomStatusRequest block " );
			
			return fetchRoomStatusResponse;

		}
	   		
		else {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost invalid block ", " enter invalid request block " );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost invalid block ", " exit enter invalid request block " );
		}

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " Exit getOWSResponse " );

		return xmlOWSResponse;
	}



/**
 * This method returns the response having room inventory and Fetch calendar response status .
 * 
 * @return String
 */
	private String getXMLFetchCalendarResponse() {
	
        
        OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchCalendar Request block ", " enter FetchCalendar request block " );
        String fetchCalendarResponse = null;
        FetchCalendarRequest objFetchCalendarRequest = new FetchCalendarRequest();
        
        /*To convert the request xml into request object .*/
        objFetchCalendarRequest = ( FetchCalendarRequest )OWSUtility.covertToStramObject( xmlRequestValue );
     
        FetchCalendarResponse objFetchCalendarResponse = new FetchCalendarResponse();
        
        /*To set the status on the fetch calendar response.*/
        com.micros.availability.AvailabilityServiceStub.GDSResultStatus  objGResultStatus = new  com.micros.availability.AvailabilityServiceStub.GDSResultStatus();
        objGResultStatus.setResultStatusFlag(AvailabilityServiceStub.ResultStatusFlag.SUCCESS);
        objFetchCalendarResponse.setResult(objGResultStatus);
        
        Calendar objCalendar = new Calendar();
        CalendarDailyDetail objCalendarDailyDetailArray[] = new CalendarDailyDetail[2];
        
        //Detail of first calendar day.
        CalendarDailyDetail objCalendarDailyDetail = new CalendarDailyDetail();
        RoomTypeInventoryList objRoomTypeInventoryList = new RoomTypeInventoryList();
        RoomTypeInventory[] objRoomTypeInventoryArray = new com.micros.availability.AvailabilityServiceStub.RoomTypeInventory[2];
      
        //first details of first calendar day
        RoomTypeInventory objRoomTypeInventory = new RoomTypeInventory();
        objRoomTypeInventory.setRoomTypeCode( "KNG");
        BigInteger objBigInteger = new BigInteger("25");
        objRoomTypeInventory.setTotalRooms(objBigInteger);
        objBigInteger = new BigInteger("20");
        objRoomTypeInventory.setTotalAvailableRooms(objBigInteger);
        objBigInteger = new BigInteger("0");
        objRoomTypeInventory.setOverBookingLimit(objBigInteger);
        objRoomTypeInventoryArray[0] = objRoomTypeInventory;
        
        //second details of first calendar day.
        objRoomTypeInventory = new RoomTypeInventory();
        objRoomTypeInventory.setRoomTypeCode("DELUXE");
        objBigInteger = new BigInteger("5");
        objRoomTypeInventory.setTotalRooms(objBigInteger);
        objBigInteger = new BigInteger("0");
        objRoomTypeInventory.setTotalAvailableRooms(objBigInteger);
        objBigInteger = new BigInteger("0");
        objRoomTypeInventory.setOverBookingLimit(objBigInteger);
        objRoomTypeInventoryArray[1] = objRoomTypeInventory;
              
        objRoomTypeInventoryList.setRoomTypeInventory(objRoomTypeInventoryArray);
        objCalendarDailyDetail.setOccupancy(objRoomTypeInventoryList);
       
        /*To get the start and end date from request parameters.*/
        
       com.micros.availability.AvailabilityServiceStub.TimeSpan objTimeSpan =  objFetchCalendarRequest.getStayDateRange();
       java.util.Calendar objCalendar2 = objTimeSpan.getStartDate();
       java.util.Calendar objCalendar3 = objTimeSpan.getTimeSpanChoice_type0().getEndDate();
       
        String strDate = OWSUtility.getDate(objCalendar2);
        String endDate = OWSUtility.getDate(objCalendar3);
        SimpleDateFormat objDateFormat = new SimpleDateFormat("MM-dd-yyyy");             
       
        Date objDate;
        
		try {
			objDate = (Date)objDateFormat.parse(strDate);
			objCalendarDailyDetail.setDate( objDate );
		} catch (ParseException exc) {
			
			  OWSMessageLogger.logError( RequestProcessor.class, " doPost FetchCalendar Request block ", exc);
		}
               
        objCalendarDailyDetailArray[0] = objCalendarDailyDetail;
        
        // Detail of second Calendar Day.
        objCalendarDailyDetail = new CalendarDailyDetail();
        objRoomTypeInventoryList = new RoomTypeInventoryList();
        objRoomTypeInventoryArray = new com.micros.availability.AvailabilityServiceStub.RoomTypeInventory[1];
        
        objRoomTypeInventory = new RoomTypeInventory();
        objRoomTypeInventory.setRoomTypeCode("LUX");
        objBigInteger = new BigInteger("40");
        objRoomTypeInventory.setTotalRooms(objBigInteger);
        objBigInteger = new BigInteger("22");
        objRoomTypeInventory.setTotalAvailableRooms(objBigInteger);
        objBigInteger = new BigInteger("20");
        objRoomTypeInventory.setOverBookingLimit(objBigInteger);
        objRoomTypeInventoryArray[0] = objRoomTypeInventory;
        
        objRoomTypeInventoryList.setRoomTypeInventory( objRoomTypeInventoryArray );
        objCalendarDailyDetail.setOccupancy( objRoomTypeInventoryList );
        
        try {
			objDate = (Date)objDateFormat.parse(endDate);
			objCalendarDailyDetail.setDate( objDate );
		} catch (ParseException exc) {
		    OWSMessageLogger.logError( RequestProcessor.class, " doPost FetchCalendar Request block ", exc);		
		}
             
        objCalendarDailyDetailArray[1] = objCalendarDailyDetail;
        
        //added calendar day with the calendar
        objCalendar.setCalendarDay(objCalendarDailyDetailArray);
            
        //added calendar with the response.
        objFetchCalendarResponse.setCalendar(objCalendar);
     
        fetchCalendarResponse = OWSUtility.convertToStreamXML( objFetchCalendarResponse ); 
        
        OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchCalendar Request block ", " exit FetchCalendar request block " +  fetchCalendarResponse);

        return fetchCalendarResponse;
	}


	/**
	 * This method generates the response for the search reservation request . It accepts the request into xml format , convert it into search reservation request object .
	 * It populates the search reservation response object with the required details  , converts it to xml and returns to it caller .
	 * 
	 * @return String
	 */
	private String getXMLFutureBookingSummaryResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLFutureBookingSummaryResponse  ", " Enter getXMLFutureBookingSummaryResponse method" );	

		String futureBookingSummaryResponse = null;
		String creditCardNumber = null;
		String confirmationNumber = null;
		FutureBookingSummaryRequest objFutureBookingSummaryRequest = null;
		FutureBookingSummaryResponse objFutureBookingSummaryResponse  = null;

		objFutureBookingSummaryRequest = new FutureBookingSummaryRequest();

		/*To convert the request xml into request object .*/
		objFutureBookingSummaryRequest = ( FutureBookingSummaryRequest )OWSUtility.covertToStramObject( xmlRequestValue );

		/*To create the dummy response for modify booking*/		
		objFutureBookingSummaryResponse = new FutureBookingSummaryResponse();

		/* Response By name and credit card .*/
		GDSResultStatus objGStatus = new GDSResultStatus();
		objGStatus.setResultStatusFlag( com.micros.reservation.ReservationServiceStub.ResultStatusFlag.SUCCESS );
		objFutureBookingSummaryResponse.setResult( objGStatus );

		/* FutureSummaryResponse contains a list of hotelReservations. */
		com.micros.reservation.ReservationServiceStub.HotelReservationList objHotelReservationList = new com.micros.reservation.ReservationServiceStub.HotelReservationList();

		HotelReservation_type0 objHotelReservation_type0 = new HotelReservation_type0();

		com.micros.reservation.ReservationServiceStub.UniqueIDList objUniqueIDList = new com.micros.reservation.ReservationServiceStub.UniqueIDList();
		com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();
		confirmationNumber = objFutureBookingSummaryRequest.getAdditionalFilters().getConfirmationNumber().getSource();

		/*To set the confirmation number.*/
		if(confirmationNumber.length() >= 1){
			objUniqueID.setString( objFutureBookingSummaryRequest.getAdditionalFilters().getConfirmationNumber().getSource() );
		}
		else{
			objUniqueID.setString( "400");
		}

		objUniqueID.setType( objFutureBookingSummaryRequest.getAdditionalFilters().getConfirmationNumber().getType() );
		objUniqueIDList.addUniqueID( objUniqueID );

		/*To set the profile related information into res guestlist.*/
		ResGuestList objGuestList = new ResGuestList();
		ResGuest objResGuest = new ResGuest();

		ProfileList objProfileList = new ProfileList();
		com.micros.reservation.ReservationServiceStub.Profile objProfile = new com.micros.reservation.ReservationServiceStub.Profile();

		/*To set the credit card information.*/
		creditCardNumber =  objFutureBookingSummaryRequest.getFutureBookingSummaryRequestChoice_type1().getCreditCardNumber();

		if(creditCardNumber != null){

			com.micros.reservation.ReservationServiceStub.NameCreditCardList objCardList = new  com.micros.reservation.ReservationServiceStub.NameCreditCardList();
			com.micros.reservation.ReservationServiceStub.NameCreditCard objCard = new com.micros.reservation.ReservationServiceStub.NameCreditCard();
			CreditCardChoice_type0 objCardChoice_type0 = new CreditCardChoice_type0();
			objCardChoice_type0.setCardNumber( OWSUtility.getCreditCardNumber( creditCardNumber ) );
			objCard.setCreditCardChoice_type0( objCardChoice_type0 );
			objCardList.addNameCreditCard( objCard );
			objProfile.setCreditCards( objCardList );
		}

		/*To create reference for the profile.*/
		ProfileChoice_type0 objChoice_type02 = new ProfileChoice_type0();
		com.micros.reservation.ReservationServiceStub.Customer objCustomer = new com.micros.reservation.ReservationServiceStub.Customer();
		com.micros.reservation.ReservationServiceStub.PersonName objName = new com.micros.reservation.ReservationServiceStub.PersonName();
		objName.setFirstName( objFutureBookingSummaryRequest.getFirstName() );
		objName.setLastName( objFutureBookingSummaryRequest.getLastName() );
		objCustomer.setPersonName( objName );
		objChoice_type02.setCustomer( objCustomer );
		objProfile.setProfileChoice_type0( objChoice_type02 );

		objProfile.setLanguageCode("EN");
		objProfile.setNationality("In");

		objProfileList.addProfile( objProfile );
		objResGuest.setProfiles( objProfileList );
		objGuestList.addResGuest( objResGuest );

		/*To set unique id list on the hotel reservation */
		objHotelReservation_type0.setUniqueIDList( objUniqueIDList );
		objHotelReservation_type0.setResGuests( objGuestList );
		// to add hotel reservation object into hotel reservation list.
		objHotelReservationList.addHotelReservation( objHotelReservation_type0 );

		/*Set the data into hotel reservation if the confirmation number is not given in request parameters. .*/
		if(confirmationNumber.length() == 0){

			objHotelReservation_type0 = new HotelReservation_type0();
		    objUniqueIDList = new com.micros.reservation.ReservationServiceStub.UniqueIDList();
			objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();

			/*To set confirmation number.*/
			objUniqueID.setString( "200");

			objUniqueID.setType( objFutureBookingSummaryRequest.getAdditionalFilters().getConfirmationNumber().getType() );
			objUniqueIDList.addUniqueID( objUniqueID );

			objGuestList = new ResGuestList();
			objResGuest = new ResGuest();

			objProfileList = new ProfileList();
			objProfile = new com.micros.reservation.ReservationServiceStub.Profile();

			/*To set credit card number.*/
			creditCardNumber =  objFutureBookingSummaryRequest.getFutureBookingSummaryRequestChoice_type1().getCreditCardNumber();

			if(creditCardNumber != null){

				com.micros.reservation.ReservationServiceStub.NameCreditCardList objCardList = new  com.micros.reservation.ReservationServiceStub.NameCreditCardList();
				com.micros.reservation.ReservationServiceStub.NameCreditCard objCard = new com.micros.reservation.ReservationServiceStub.NameCreditCard();
				CreditCardChoice_type0 objCardChoice_type0 = new CreditCardChoice_type0();
				objCardChoice_type0.setCardNumber( OWSUtility.getCreditCardNumber( creditCardNumber ) );
				objCard.setCreditCardChoice_type0( objCardChoice_type0 );
				objCardList.addNameCreditCard( objCard );
				objProfile.setCreditCards( objCardList );
			}

			/*To add the first and last name.*/
			objChoice_type02 = new ProfileChoice_type0();
			objCustomer = new com.micros.reservation.ReservationServiceStub.Customer();
			objName = new com.micros.reservation.ReservationServiceStub.PersonName();
			objName.setFirstName( objFutureBookingSummaryRequest.getFirstName() );
			objName.setLastName( objFutureBookingSummaryRequest.getLastName() );
			objCustomer.setPersonName( objName );
			objChoice_type02.setCustomer( objCustomer );
			objProfile.setProfileChoice_type0( objChoice_type02 );

			objProfile.setLanguageCode("EN");
			objProfile.setNationality("In");

			objProfileList.addProfile( objProfile );
			objResGuest.setProfiles( objProfileList );
			objGuestList.addResGuest( objResGuest );

			/*To set unique id list on the hotel reservation */

			objHotelReservation_type0.setResGuests( objGuestList );
			objHotelReservation_type0.setUniqueIDList(objUniqueIDList);
			/*To set the hotel reservation object into hReservation list.*/
			objHotelReservationList.addHotelReservation( objHotelReservation_type0 );
		}

		/*To add the hotel reservation list into response.*/
		objFutureBookingSummaryResponse.setHotelReservations( objHotelReservationList );

		/*To convert the response object to response xml .*/
		futureBookingSummaryResponse = OWSUtility.convertToStreamXML( objFutureBookingSummaryResponse );

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLFutureBookingSummaryResponse  ", " Enter getXMLFutureBookingSummaryResponse method" );

		return futureBookingSummaryResponse;
	}


	/**
	 * This metod generates the response for the modify booking request . It accepts the request into xml format , convert it into update booking request object .
	 * It populates the update booking response object with the required details  , converts it to xml and returns to it caller .
	 * 
	 * @return String
	 */
	private String getXMLModifyBookingResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLModifyBookingResponse  ", " Enter getXMLModifyBookingResponse method" );

		String modifyBookingResponse = null;
		ModifyBookingRequest objBookingRequest = null;
		ModifyBookingResponse objBookingResponse = null;

		objBookingRequest = new ModifyBookingRequest();

		/*To convert the request xml into request object .*/
		objBookingRequest = ( ModifyBookingRequest )OWSUtility.covertToStramObject( xmlRequestValue );

		/*To create the dummy response for modify booking*/		
		objBookingResponse = new ModifyBookingResponse();

		GDSResultStatus objResultStatus = new GDSResultStatus();
		objResultStatus.setResultStatusFlag( com.micros.reservation.ReservationServiceStub.ResultStatusFlag.SUCCESS );

		/*To set the hotel reservation reference.*/
		HotelReservation objHotelReservation = new HotelReservation();

		objHotelReservation.setMarketSegment( "BASE" );
		objHotelReservation.setSourceCode( "WEN CHANNEL" );

		/*To set the confirmation number from the request.*/
		com.micros.reservation.ReservationServiceStub.UniqueIDList objUniqueIDList = new com.micros.reservation.ReservationServiceStub.UniqueIDList();
		com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();
		objUniqueID.setSource( objBookingRequest.getHotelReservation().getUniqueIDList().getUniqueID()[0].getSource() );
		objUniqueID.setType( com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL );
		objUniqueIDList.addUniqueID( objUniqueID );

		/*To set the room stay related attributes.*/
		RoomStayList objRoomStayList = new RoomStayList();
		RoomStay objRoomStay = new RoomStay();
		RatePlanList objRatePlanList = new RatePlanList();
		RatePlan objPlan = new RatePlan();

		ParagraphChoice objChoice = new ParagraphChoice();
		Text objText = new Text();
		Language objLanguage = new Language();
		objLanguage.setValue( "LOVIN THE TIME" );
		objText.setLanguage( objLanguage );
		objChoice.setText( objText );
		Paragraph objParagraph = new Paragraph();
		objParagraph.addParagraphChoice( objChoice );

		objPlan.setRatePlanDescription( objParagraph );
		objPlan.setRatePlanShortDescription( objParagraph );

		AdditionalDetailList objAdditionalDetailList = new AdditionalDetailList();
		AdditionalDetail objAdditionalDetail = new AdditionalDetail();
		objAdditionalDetail.setDetailType( AdditionalDetailType.CommissionPolicy );

		objChoice = new ParagraphChoice();
		objText = new Text();
		objLanguage = new Language();
		objLanguage.setValue( "NO COMMISSION AVAILABLE" );
		objText.setLanguage( objLanguage );
		objChoice.setText( objText );
		objParagraph = new Paragraph();
		objParagraph.addParagraphChoice( objChoice );

		objAdditionalDetail.setAdditionalDetailDescription( objParagraph );

		AdditionalDetail objAdditionalDetail1 = new AdditionalDetail();
		objAdditionalDetail.setDetailType( AdditionalDetailType.TaxInformation );
		objChoice = new ParagraphChoice();
		objText = new Text();
		objLanguage = new Language();
		objLanguage.setValue( "Tax not included Sales Tax - 7 PCT" );
		objText.setLanguage( objLanguage );
		objChoice.setText( objText );
		objParagraph = new Paragraph();
		objParagraph.addParagraphChoice( objChoice );
		objAdditionalDetail1.setAdditionalDetailDescription( objParagraph );

		objAdditionalDetailList.addAdditionalDetail( objAdditionalDetail );
		objAdditionalDetailList.addAdditionalDetail( objAdditionalDetail1 );

		DepositRequirement objDepRequirement = new DepositRequirement();
		com.micros.reservation.ReservationServiceStub.Amount  objAmount = new com.micros.reservation.ReservationServiceStub.Amount();
		objAmount.setDecimals((short) 2);
		objAmount.set_double(4656);
		objDepRequirement.setDepositAmount( objAmount );
		objDepRequirement.setDueDate( new Date());

		objPlan.setRatePlanCode( "LOV" );
		objPlan.setSuppressRate( false );
		objPlan.setRatePlanName( "LOV" );
		objPlan.setAdditionalDetails( objAdditionalDetailList );
		objPlan.setDepositRequired( objDepRequirement );

		/*To add the room type information.*/
		RoomTypeList objRoomTypeList = new RoomTypeList();
		com.micros.reservation.ReservationServiceStub.RoomType objRoomType = new com.micros.reservation.ReservationServiceStub.RoomType();
		objRoomType.setRoomTypeCode( "POKB" );
		objRoomType.setNumberOfUnits( 1 );

		objChoice = new ParagraphChoice();
		objText = new Text();
		objLanguage = new Language();
		objLanguage.setValue( "Pool Side - King" );
		objText.setLanguage( objLanguage );
		objChoice.setText( objText );
		objParagraph = new Paragraph();
		objParagraph.addParagraphChoice( objChoice );

		/*To add the room type description in the room type.*/
		objRoomType.setRoomTypeDescription( objParagraph );
		objRoomType.setRoomTypeShortDescription( objParagraph );

		/*To add the room features */
		RoomFeatureList objRoomFeatureList = new RoomFeatureList();
		RoomFeature objFeature = new RoomFeature();
		objFeature.setFeature( "POOL" );
		objFeature.setDescription("With Pool Facility");
		objFeature.setAttachPreferenceToProfile( true );
		objRoomFeatureList.addFeatures( objFeature);

		objFeature = new RoomFeature();
		objFeature.setFeature( "Tile Floor" );
		objFeature.setDescription( "With Tile Floor" );
		objFeature.setAttachPreferenceToProfile( true );
		objRoomFeatureList.addFeatures( objFeature);

		/*To add room feature list on room type.*/
		objRoomType.setRoomFeatures( objRoomFeatureList );
		/*To add the */
		objRoomTypeList.addRoomType( objRoomType );


		// To add the another room details.	
		objRoomType = new com.micros.reservation.ReservationServiceStub.RoomType();
		objRoomType.setRoomTypeCode( "KNG" );
		objRoomType.setNumberOfUnits( 1 );

		objChoice = new ParagraphChoice();
		objText = new Text();
		objLanguage = new Language();
		objLanguage.setValue( "Pool Side - King" );
		objText.setLanguage( objLanguage );
		objChoice.setText( objText );
		objParagraph = new Paragraph();
		objParagraph.addParagraphChoice( objChoice );

		objRoomType.setRoomTypeDescription( objParagraph );
		objRoomType.setRoomTypeShortDescription( objParagraph );

		/*To add the room features*/
		RoomFeatureList objRoomFeatureList1 = new RoomFeatureList();
		objFeature = new RoomFeature();
		/*Set the room features with description.*/
		objFeature.setFeature( "DVD" );
		objFeature.setDescription("With DVD Facility");
		objFeature.setAttachPreferenceToProfile( true );
		objRoomFeatureList1.addFeatures( objFeature);

		objFeature = new RoomFeature();
		/*Set the room features with description.*/
		objFeature.setFeature( "GROUND Floor" );
		objFeature.setDescription( "In Ground Floor" );
		objFeature.setAttachPreferenceToProfile( true );
		objRoomFeatureList1.addFeatures( objFeature);

		/*To add the room feature list into room type.*/
		objRoomType.setRoomFeatures( objRoomFeatureList1 );
		objRoomTypeList.addRoomType( objRoomType );

		/*To set the rate list.*/
		RoomRateList objRateList = new RoomRateList();
		RoomRate objRate = new RoomRate();
		objRate.setRoomTypeCode( "POKB" );
		objRate.setRatePlanCode( "LOV" );
		objRate.setSuppressRate( false );

		RateList objList = new RateList();
		Rate objRate1 = new Rate();
		objRate1.setBase( objAmount );

		AdditionalGuestAmountList objAdditionalGuestAmountList = new AdditionalGuestAmountList();
		AdditionalGuestAmount objAdditionalGuestAmount = new AdditionalGuestAmount();
		objAdditionalGuestAmount.setAdditionalGuestType( AgeQualifyingCode.ADULT );
		objAdditionalGuestAmount.setQuantity( 0 );
		objAdditionalGuestAmount.setAmount( objAmount );
		objRate1.setAdditionalGuestAmounts( objAdditionalGuestAmountList );
		/*add rate into rate list.*/
		objList.addRate( objRate1 );
		objRate.setRates(objList);

		/*To set the guest count.*/
		GuestCountList objGuestCountList = new GuestCountList();	
		GuestCount objGuestCount = new GuestCount();
		objGuestCount.setAgeQualifyingCode(AgeQualifyingCode.CHILD);
		objGuestCount.setCount( 1 );
		objGuestCount.setAge( 11 );
		objGuestCountList.addGuestCount(objGuestCount);	

		objGuestCount = new GuestCount();
		objGuestCount.setAgeQualifyingCode(AgeQualifyingCode.ADULT);
		objGuestCount.setCount( 2 );

		/*To add guest count on the guest count list.*/
		objGuestCountList.addGuestCount(objGuestCount);

		/*To add the start and end date .*/
		TimeSpan objTimeSpan = new TimeSpan();
		objTimeSpan.setStartDate( OWSUtility.getCalender() );
		TimeSpanChoice_type0 objTimeSpanChoice_type0 = new TimeSpanChoice_type0();
		objTimeSpanChoice_type0.setEndDate( OWSUtility.getCalender() );		
		objTimeSpan.setTimeSpanChoice_type0( objTimeSpanChoice_type0 );

		Guarantee objGuarantee = new Guarantee();
		GuaranteesAccepted objGuaranteesAccepted = new GuaranteesAccepted();
		GuaranteeAccepted objGuaranteeAccepted = new GuaranteeAccepted();

		/*To add the credit card related information.*/
		com.micros.reservation.ReservationServiceStub.CreditCard objCreditCard = new com.micros.reservation.ReservationServiceStub.CreditCard();
		objCreditCard.setCardCode( "AN" );
		objCreditCard.setCardHolderName( "Mike Haggar" );
		objCreditCard.setExpirationDate( new Date());

		CreditCardChoice_type0 objCardChoice_type0 = new CreditCardChoice_type0();
		objCardChoice_type0.setCardNumber( "XXXX_XXXX_XXXX_1234" );
		objCreditCard.setCreditCardChoice_type0 (objCardChoice_type0 ) ;
		objGuaranteeAccepted.setGuaranteeCreditCard( objCreditCard );
		objGuaranteesAccepted.addGuaranteeAccepted( objGuaranteeAccepted );
		objGuarantee.setGuaranteesAccepted( objGuaranteesAccepted );

		/*To add the payment related information.*/
		Payment objPayment = new Payment();
		PaymentsAccepted objPaymentsAccepted = new PaymentsAccepted();
		PaymentType objPaymentType = new PaymentType();
		PaymentTypeChoice_type0 objChoice_type0 = new PaymentTypeChoice_type0();
		OtherPaymentType objOtherPaymentType = new OtherPaymentType();
		objOtherPaymentType.setType( "AX");
		objChoice_type0.setOtherPayment(objOtherPaymentType);
		objPaymentType.setPaymentTypeChoice_type0(objChoice_type0);
		objPaymentsAccepted.addPaymentType(objPaymentType);
		objPayment.setPaymentsAccepted(objPaymentsAccepted);

		/*To set the hotel reference .*/
		com.micros.reservation.ReservationServiceStub.HotelReference objHotelReference = new com.micros.reservation.ReservationServiceStub.HotelReference();
		objHotelReference.setHotelCode( "CASINO" );
		objHotelReference.setChainCode( "CHA");

		/*To set the daily charge list.*/
		DailyChargeList objChargeList = new DailyChargeList();
		ChargesForTheDay objChargesForTheDay = new ChargesForTheDay();
		objChargesForTheDay.setPostingDate( new Date() );
		ChargeList objChargeList2 = new ChargeList();
		objChargeList2.setTotalCharges(77);
		Charge objCharge = new Charge();
		objCharge.setAmount(objAmount);
		objCharge.setDescription( "bike rides" );
		objChargeList2.addCharges(objCharge);

		objChargesForTheDay.setRoomRateAndPackages( objChargeList2 );
		objChargeList.addChargesForPostingDate(objChargesForTheDay);

		/*To add the profile related information.*/
		ResGuestList objGuestList = new ResGuestList();
		ResGuest objResGuest = new ResGuest();

		ProfileList objProfileList = new ProfileList();
		com.micros.reservation.ReservationServiceStub.Profile objProfile = new com.micros.reservation.ReservationServiceStub.Profile();

		com.micros.reservation.ReservationServiceStub.UniqueIDList objIdList = new com.micros.reservation.ReservationServiceStub.UniqueIDList();
		com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID1 = new com.micros.reservation.ReservationServiceStub.UniqueID();
		objUniqueID1.setType( com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL  );

		objUniqueID1.setSource( "1234" );

		objIdList.addUniqueID( objUniqueID1 );
		objProfile.setProfileIDs( objIdList );
		/*	
		 objMembership = new NameMembership();
		objMembership.set*/
		ProfileChoice_type0 objChoice_type02 = new ProfileChoice_type0();

		/*To add the full name.*/
		com.micros.reservation.ReservationServiceStub.Customer objCustomer = new com.micros.reservation.ReservationServiceStub.Customer();
		com.micros.reservation.ReservationServiceStub.PersonName objName = new com.micros.reservation.ReservationServiceStub.PersonName();
		objName.setFirstName( "Mike " );
		objName.setLastName("Haggar ");
		objCustomer.setPersonName( objName );
		objChoice_type02.setCustomer( objCustomer );
		objProfile.setProfileChoice_type0( objChoice_type02 );

		/*To add the address information.*/
		NameAddressList objAddressList = new NameAddressList();
		com.micros.reservation.ReservationServiceStub.NameAddress objNameAddress = new com.micros.reservation.ReservationServiceStub.NameAddress();
		objNameAddress.setCountryCode( "US");
		objAddressList.addNameAddress( objNameAddress );
		objProfile.setAddresses( objAddressList );

		objProfileList.addProfile( objProfile );
		objResGuest.setProfiles( objProfileList );

		TransportInfo objTransportInfo = new TransportInfo();
		objTransportInfo.setCarrierCode( "AA" );
		objTransportInfo.setId( "421");
		objTransportInfo.setLocationCode( "HEA" );
		objTransportInfo.setTime( OWSUtility.getCalender() );

		objResGuest.setArrivalTransport( objTransportInfo );

		objTransportInfo = new TransportInfo();
		objTransportInfo.setCarrierCode( "DE" );
		objTransportInfo.setId( "421");
		objTransportInfo.setLocationCode( "HEA" );
		objTransportInfo.setTime( OWSUtility.getCalender() );

		objResGuest.setDepartureTransport( objTransportInfo );

		objGuestList.addResGuest( objResGuest );

		/*To add the comments from the request parameters.*/
		ReservationCommentList objCommentList = new ReservationCommentList();
		ReservationComment objComment = new ReservationComment();
		objComment.setGuestViewable( true );
		objComment.setCommentType( objBookingRequest.getHotelReservation().getRoomStays().getRoomStay()[0].getComments().getComment()[0].getCommentType() );
		objCommentList.addComment( objComment );

		objComment = new ReservationComment();
		objComment.setGuestViewable( true );
		objComment.setCommentType( objBookingRequest.getHotelReservation().getRoomStays().getRoomStay()[0].getComments().getComment()[1].getCommentType() );


		objCommentList.addComment( objComment);
		//ParagraphChoice objParagraphChoice = new ParagraphChoice();

		/*	Text objText2 = new Text();
		Language objLanguage2 = new Language();
		objLanguage2.setValue( objBookingRequest.getHotelReservation().getRoomStays().getRoomStay()[0].getComments().getComment()[0].getParagraphChoice()[0].getText().getLanguage());
		objText2.setLanguage( objLanguage2 );
		objParagraphChoice.setText( objText2 );
		objComment.addParagraphChoice( objParagraphChoice );
		objCommentList.addComment(objComment);
		 */

		/*To set the hotel reservation and dependent object into response.*/
		objRoomStay.setComments( objCommentList );
		objRoomStay.setExpectedCharges( objChargeList );
		objRoomStay.setHotelReference( objHotelReference );
		objRoomStay.setPayment( objPayment );
		objRoomStay.setGuestCounts( objGuestCountList );
		objRoomStay.setTimeSpan( objTimeSpan );
		objRateList.addRoomRate( objRate );
		objRatePlanList.addRatePlan( objPlan );
		objRoomStay.setGuarantee(objGuarantee);
		objRoomStay.setRoomRates(objRateList);
		objRoomStay.setRoomTypes( objRoomTypeList );
		objRoomStay.setRatePlans( objRatePlanList );
		objRoomStayList.addRoomStay( objRoomStay );		
		objHotelReservation.setResGuests( objGuestList );
		objHotelReservation.setRoomStays( objRoomStayList );
		objHotelReservation.setUniqueIDList( objUniqueIDList );
		objBookingResponse.setResult( objResultStatus );
		objBookingResponse.setHotelReservation( objHotelReservation );

		/*To convert the response object to response xml .*/
		modifyBookingResponse = OWSUtility.convertToStreamXML( objBookingResponse );

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLModifyBookingResponse  ", " Exit getXMLModifyBookingResponse method" );

		return modifyBookingResponse;			

	}


	/**
	 * This method generates response for the fetch room status request . It accepts the request in xml format, convert it to 
	 * fetch room status request object. It populates the fetch room status response object with the required details , convert it to
	 * xml and return it to its caller.
	 * 
	 * @return String
	 */
	private String getXMLFetchRoomStatusResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLFetchRoomResponse  ", " Enter getXMLFetchRoomResponse method" );		
		String fetchRoomStatusResponse = null;

	
    FetchRoomStatusRequest	objFetchRoomStatusRequest = new FetchRoomStatusRequest();

		objFetchRoomStatusRequest = (FetchRoomStatusRequest)OWSUtility.covertToStramObject( xmlRequestValue );

		FetchRoomStatusResponse objFetchRoomStatusResponse = new FetchRoomStatusResponse();

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " FetchRoomStatusResponse Object created " );
		
		com.micros.adv.reservation.ResvAdvancedServiceStub.RoomStatus[] objRoomStatu =new com.micros.adv.reservation.ResvAdvancedServiceStub.RoomStatus[2] ;
		
		com.micros.adv.reservation.ResvAdvancedServiceStub.RoomStatus objRoomStatus = new 	com.micros.adv.reservation.ResvAdvancedServiceStub.RoomStatus();
		objRoomStatus.setRoomStatus( "IP" );
		objRoomStatus.setFrontOfficeStatus( "VAC" );
		objRoomStatus.setOccupancyCondition( "2");
		objRoomStatus.setHouseKeepingStatus( "Inspected");
		objRoomStatus.setRoomNumber( "1000" );
		objRoomStatus.setRoomType( objFetchRoomStatusRequest.getRoomType() );
		
		objRoomStatu[0]= objRoomStatus;

		// adding second room status details
		 objRoomStatus = new 	com.micros.adv.reservation.ResvAdvancedServiceStub.RoomStatus();
		objRoomStatus.setRoomStatus( "IP" );
		objRoomStatus.setFrontOfficeStatus( "VAC" );
		objRoomStatus.setOccupancyCondition( "3");
		objRoomStatus.setHouseKeepingStatus( "Inspected");
		objRoomStatus.setRoomNumber( "1001" );
		objRoomStatus.setRoomType( objFetchRoomStatusRequest.getRoomType() );
		objRoomStatu[1]= objRoomStatus;
		
		/*To add the room status arry on the response.*/
		objFetchRoomStatusResponse.setRoomStatus( objRoomStatu );
		/*To convert the response into xml.*/
		fetchRoomStatusResponse = OWSUtility.convertToStreamXML( objFetchRoomStatusResponse );
		
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLFetchRoomResponse  ", " Exit getXMLFetchRoomResponse method" );
		return fetchRoomStatusResponse;
	}


	/**
	 * This method generates response for the assign room request . It accepts the request in xml format, convert it to 
	 * assign request object. It populates the assign response object with the required details , convert it to
	 * xml and return it to its caller.
	 * 
	 * @return String
	 */
	private String getXMLAssignRoomResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLAssignRoomResponse  ", " Enter getXMLAssignRoomResponse method" );
		AssignRoomResponse objAssignRoomResponse  = null;
		AssignRoomRequest	objReuest = null;

		/* Covert xml into object.*/
		objReuest = new AssignRoomRequest() ;	
		objReuest = (AssignRoomRequest)OWSUtility.covertToStramObject( xmlRequestValue );
		
		/*To create the assign room response object.*/
		 objAssignRoomResponse = new AssignRoomResponse();
	
		 /*To set the result status*/
		 GDSResultStatus objResultStatus = new GDSResultStatus();
		 objResultStatus.setResultStatusFlag(com.micros.reservation.ReservationServiceStub.ResultStatusFlag.SUCCESS);
		 objAssignRoomResponse.setResult( objResultStatus );
	
		 /*To set the assigned  room number in to response.*/
		 objAssignRoomResponse.setRoomNoAssigned( objReuest.getRoomNoRequested() );

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToStreamXML( objAssignRoomResponse );
		OWSMessageLogger.logInfo( RequestProcessor.class, "  getXMLAssignRoomResponse  ", " Exit getXMLAssignRoomResponse method " );

		return xmlOWSResponse;

	}


	/**
	 * This method generates response for the guest bill items request . It accepts the request in xml format, convert it to 
	 * invoice request object. It populates the invoice response object with the required details , convert it to
	 * xml and return it to its caller.
	 * 
	 * @return String
	 */
	private String getXMLFolioResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLFolioResponse ", " Enter getXMLFolioResponse method " );

		InvoiceResponse objInvoiceResponse  = null;
		InvoiceRequest	objReuest = null;
		double subTotal = 0;

		/* Covert xml into object. */
		objReuest = new InvoiceRequest() ;	
		objReuest = (InvoiceRequest)OWSUtility.covertToObject( objReuest , xmlRequestValue );

		objFactory = new ObjectFactory();
		objInvoiceResponse = objFactory.createInvoiceResponse();

		/*To set the result status.*/
		ResultStatus objResultStatus = objFactory.createResultStatus();
		objResultStatus.setResultStatusFlag( ResultStatusFlag.SUCCESS );

		/*To set the bill header with all values in bill header list.*/
		List<BillHeader> objBillHeaders = objInvoiceResponse.getInvoice();
		BillHeader objBillHeader = objFactory.createBillHeader();

		NameAddress objNameAddress = objFactory.createNameAddress();
		objNameAddress.setAddressType( "address change" );
		objNameAddress.setCountryCode( "IN" );
		objBillHeader.setAddress( objNameAddress );

		NativeName objNativeName = objFactory.createNativeName();
		objNativeName.setFirstName( "tammy" );
		objNativeName.setLastName( "konopik" );;
		objBillHeader.setName(objNativeName);

		/* Sets confirmation number and its type.*/
		UniqueIDList objUniqueIDList = objFactory.createUniqueIDList();

		ReservationRequestBase objBase = objReuest.getReservationRequest();
		List<UniqueID> objIds = objBase.getReservationID().getUniqueID();
		confirmationNumber =  objIds.get(0).getValue();			

		objIds = objUniqueIDList.getUniqueID();

		UniqueID uID = objFactory.createUniqueID();
		uID.setValue( confirmationNumber );
		uID.setType( UniqueIDType.EXTERNAL );
		uID.setSource( "PMS_ID" );
		objIds.add( uID );

		objBillHeader.setProfileIDs( objUniqueIDList );

		uID = objFactory.createUniqueID();
		uID.setValue( "2323" );
		uID.setSource( "OPERA" );
		uID.setType( UniqueIDType.INTERNAL );

		objBillHeader.setBillNumber( uID );

		/*set bill items into bill header.*/
		List<BillItem> objBillItems = objBillHeader.getBillItems();

		BillItem objBillItem = objFactory.createBillItem();
		Amount objAmount = objFactory.createAmount();
		objAmount.setValue( 110 );
		objBillItem.setAmount( objAmount );
		objBillItem.setVatCode( uID );
		objBillItem.setDate( OWSUtility.getGregorianDate() );
		objBillItem.setDescription( "Transient Room Revenue" );
		objBillItems.add( objBillItem );
		subTotal = objAmount.getValue() + subTotal;

		objBillItems = objBillHeader.getBillItems();

		objBillItem = objFactory.createBillItem();
		objAmount = objFactory.createAmount();
		objAmount.setValue( 120 );
		objBillItem.setAmount( objAmount );
		objBillItem.setVatCode(uID );
		objBillItem.setDate( OWSUtility.getGregorianDate() );
		objBillItem.setDescription( "Lobby Bar Beverage" );
		objBillItems.add( objBillItem );
		subTotal = objAmount.getValue() + subTotal;

		objBillItems = objBillHeader.getBillItems();

		objBillItem = objFactory.createBillItem();
		objAmount = objFactory.createAmount();
		objAmount.setValue( 130 );
		objBillItem.setAmount( objAmount );
		objBillItem.setVatCode( uID );
		objBillItem.setDate( OWSUtility.getGregorianDate() );
		objBillItem.setDescription( "Lobby Bar Food" );
		objBillItems.add( objBillItem );
		subTotal = objAmount.getValue() + subTotal;

		objBillHeaders.add( objBillHeader );

		/*set the surcharge and total amount in credit card surcharge list.*/
		List< CreditCardSurcharge > objCardSurcharges = objBillHeader.getCreditCardSurcharges();
		CreditCardSurcharge objCardSurcharge = objFactory.createCreditCardSurcharge();



		objAmount = objFactory.createAmount();
		objAmount.setValue( 10 );		
		objCardSurcharge.setSurchargeAmount( objAmount  );
		subTotal = objAmount.getValue() + subTotal;

		objAmount = objFactory.createAmount();
		objAmount.setValue( subTotal );
		objCardSurcharge.setTotalBillAmount( objAmount );

		objCardSurcharges.add( objCardSurcharge );

		objInvoiceResponse.setResult(objResultStatus);

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToXML( objInvoiceResponse );
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLFolioResponse ", " Exit getXMLFolioResponse method " );

		return xmlOWSResponse;
	}


	/**
	 * This method generates response for the check out request . It accepts the request in xml format, convert it to 
	 * check out request object. It populates the check out response object with the required details , convert it to
	 * xml and return it to its caller.
	 * 
	 * @return String
	 */
	private String getXMLCheckOutResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckOutResponse ", " Enter getXMLCheckOutResponse method" );

		CheckOutResponse objCheckOutResponse  = null;
		com.micros.ows.bean.CheckOutRequest	objReuest = null;

		/* Covert xml into object. */
		objReuest = new com.micros.ows.bean.CheckOutRequest() ;	
		objReuest = (com.micros.ows.bean.CheckOutRequest)OWSUtility.covertToObject( objReuest , xmlRequestValue );

		objFactory = new ObjectFactory();
		objCheckOutResponse = objFactory.createCheckOutResponse();

		ResultStatus objResultStatus = objFactory.createResultStatus();
		objResultStatus.setResultStatusFlag( ResultStatusFlag.SUCCESS );

		/* Retrieve confirmation number from check in request instance. */
		ReservationRequestBase objBase = objReuest.getReservationRequest();
		List<UniqueID> objIds = objBase.getReservationID().getUniqueID();
		confirmationNumber =  objIds.get(0).getValue();

		/* Sets confirmation number and its type.*/
		UniqueIDList objUniqueIDList = objFactory.createUniqueIDList();
		List<UniqueID> objUniqueIDs = objUniqueIDList.getUniqueID();

		UniqueID uID = objFactory.createUniqueID();
		uID.setValue( confirmationNumber );
		uID.setType( UniqueIDType.INTERNAL );
		objUniqueIDs.add( uID );

		/* Sets the unique identifier list with the reservation identifier. */
		CheckOutComplete objCheckOutComplete = objFactory.createCheckOutComplete();
		objCheckOutComplete.setReservationID( objUniqueIDList );

		List<InvoiceNumber> objInvoiceNumbers = objCheckOutComplete.getInvoiceNumber();
		InvoiceNumber objInvoiceNumber = new InvoiceNumber();
		objInvoiceNumber.setValue( "647" );
		objInvoiceNumbers.add( objInvoiceNumber );

		objCheckOutResponse.setResult(objResultStatus);
		objCheckOutResponse.setCheckOutComplete(objCheckOutComplete);	

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToXML( objCheckOutResponse );
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckOutResponse ", " Exit getXMLCheckOutResponse method " );

		return xmlOWSResponse;
	}


	/**
	 * This method generates response for the check in request . It accepts the request in xml format, convert it to 
	 * check in request object. It populates the check in response object with the required details , convert it to
	 * xml and return it to its caller.
	 * 
	 * @return String
	 */
	private String getXMLCheckInResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " Enter getXMLCheckInResponse method " );

		com.micros.ows.bean.CheckInResponse objCheckInResponse = null;

		/*Covert xml into object.*/
		com.micros.ows.bean.CheckInRequest	objCheckInRequest = new com.micros.ows.bean.CheckInRequest() ;	
		objCheckInRequest = (com.micros.ows.bean.CheckInRequest)OWSUtility.covertToObject( objCheckInRequest , xmlRequestValue );

		objFactory = new ObjectFactory();
		objCheckInResponse = objFactory.createCheckInResponse();
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " check in response object created " );

		CheckInComplete objCheckInComplete = objFactory.createCheckInComplete();

		/* Retrieve confirmation number from check in request instance. */
		ReservationRequestBase objBase = objCheckInRequest.getReservationRequest();
		List<UniqueID> objIds = objBase.getReservationID().getUniqueID();
		confirmationNumber =  objIds.get(0).getValue();

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " confirmation number is " + confirmationNumber );

		/* Sets confirmation number and its type. */
		UniqueIDList objUniqueIDList = objFactory.createUniqueIDList();
		List<UniqueID> objUniqueIDs = objUniqueIDList.getUniqueID();

		UniqueID uID = objFactory.createUniqueID();
		uID.setValue( confirmationNumber );
		uID.setType( UniqueIDType.EXTERNAL );
		objUniqueIDs.add( uID );

		/* Sets the unique identifier list with the reservation identifier. */
		objCheckInComplete.setReservationID( objUniqueIDList );

		/* set credit card number. */
		Profile objProfile =objFactory.createProfile();

		NameCreditCardList objCardList =  objFactory.createNameCreditCardList();
		NameCreditCard objCard =  objFactory.createNameCreditCard();

		if( objCheckInRequest.getCreditCardInfo().getCreditCard().getCardNumber() != null){
		objCard.setCardNumber( OWSUtility.getCreditCardNumber( objCheckInRequest.getCreditCardInfo().getCreditCard().getCardNumber()) );
		 }
		objCard.setSeriesCode( "SSDDD5555DF" );
		objCard.setExpirationDate( OWSUtility.getGregorianDate() );

		objCardList.getNameCreditCard().add( objCard );
		objProfile.setCreditCards( objCardList );

		Customer objCustomer = objFactory.createCustomer();
		PersonName objPersonName = objFactory.createPersonName();
		objPersonName.setFirstName( "John" );
		objPersonName.setLastName( "Peter" );
		objCustomer.setPersonName(objPersonName);	

		objProfile.setCustomer( objCustomer );
		objCheckInResponse.setProfile( objProfile );

		Room objRoom = objFactory.createRoom();
		objRoom.setRoomNumber( "783" );
		RoomType objRoomType = objFactory.createRoomType();
		objRoomType.setRoomTypeCode( "POQB" );
		objRoom.setRoomType( objRoomType );
		objCheckInComplete.setRoom( objRoom );

		/* Sets the check in response with the instance of check in complete. */
		objCheckInResponse.setCheckInComplete( objCheckInComplete );

		ResultStatus objRStatus = objFactory.createResultStatus();

		/* Set the status to the check in response. */
		objRStatus.setResultStatusFlag( ResultStatusFlag.SUCCESS );
		objCheckInResponse.setResult( objRStatus );

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToXML( objCheckInResponse );

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " Exit getXMLCheckInResponse method " );	

		return xmlOWSResponse;
	}

}