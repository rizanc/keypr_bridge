package com.micros.ows.processor;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis2.databinding.types.Language;
import org.apache.axis2.databinding.types.NormalizedString;
import org.apache.axis2.databinding.types.NonNegativeInteger;

import com.micros.ows.resvadvanced.ResvAdvancedServiceStub;
import com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CheckInRequest;
import com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CheckInResponse;
import com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CheckOutRequest;
import com.micros.ows.resvadvanced.ResvAdvancedServiceStub.FetchRoomStatusRequest;
import com.micros.ows.resvadvanced.ResvAdvancedServiceStub.FetchRoomStatusResponse;
import com.micros.ows.availability.AvailabilityServiceStub;
import com.micros.ows.availability.AvailabilityServiceStub.Calendar;
import com.micros.ows.availability.AvailabilityServiceStub.CalendarDailyDetail;
import com.micros.ows.availability.AvailabilityServiceStub.FetchCalendarRequest;
import com.micros.ows.availability.AvailabilityServiceStub.FetchCalendarResponse;
import com.micros.ows.availability.AvailabilityServiceStub.RoomTypeInventory;
import com.micros.ows.availability.AvailabilityServiceStub.RoomTypeInventoryList;
import com.micros.ows.information.InformationStub;
import com.micros.ows.information.InformationStub.Address;
import com.micros.ows.information.InformationStub.AddressList;
import com.micros.ows.information.InformationStub.AttractionInfo;
import com.micros.ows.information.InformationStub.AttractionInfoList;
import com.micros.ows.information.InformationStub.Attraction_type0;
import com.micros.ows.information.InformationStub.AttractionsType;
import com.micros.ows.information.InformationStub.ContactEmailList;
import com.micros.ows.information.InformationStub.Cuisine_type0;
import com.micros.ows.information.InformationStub.Cuisines_type0;
import com.micros.ows.information.InformationStub.DescriptiveText;
import com.micros.ows.information.InformationStub.Email;
import com.micros.ows.information.InformationStub.ExtendedHotelInfo;
import com.micros.ows.information.InformationStub.FacilityInfoType;
import com.micros.ows.information.InformationStub.GuestRoom_type0;
import com.micros.ows.information.InformationStub.GuestRooms_type0;
import com.micros.ows.information.InformationStub.HotelContact;
import com.micros.ows.information.InformationStub.HotelInfo;
import com.micros.ows.information.InformationStub.HotelInfoList;
import com.micros.ows.information.InformationStub.HotelInfoType;
import com.micros.ows.information.InformationStub.HotelInformation_type0;
import com.micros.ows.information.InformationStub.HotelReference;
import com.micros.ows.information.InformationStub.Phone;
import com.micros.ows.information.InformationStub.PhoneData_type0;
import com.micros.ows.information.InformationStub.PhoneList;
import com.micros.ows.information.InformationStub.Restaurant_type0;
import com.micros.ows.information.InformationStub.RestaurantsType;
import com.micros.ows.information.InformationStub.TextList;
import com.micros.meeting.MeetingRoomServiceStub.AvailableProperty;
import com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityRequest;
import com.micros.meeting.MeetingRoomServiceStub.MeetingMultiPropertyAvailabilityRequest;
import com.micros.meeting.MeetingRoomServiceStub.MeetingMultiPropertyAvailabilityResponse;
import com.micros.meeting.MeetingRoomServiceStub.MeetingRoomsType;
import com.micros.meeting.MeetingRoomServiceStub.ResultStatus;
import com.micros.membership.MembershipServiceStub.NameMembership;
import com.micros.membership.MembershipServiceStub.NameMembershipList;
import com.micros.membership.MembershipServiceStub.UniqueID;
import com.micros.membership.MembershipServiceStub.UniqueIDList;
import com.micros.name.NameServiceStub.NameAddress;
import com.micros.name.NameServiceStub.NameIdNameAddress;
import com.micros.name.NameServiceStub.NameIdNameAddressList;
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
import com.micros.reservation.ReservationServiceStub.ReleaseRoomResponse;
import com.micros.reservation.ReservationServiceStub.ResGuest;
import com.micros.reservation.ReservationServiceStub.ResGuestList;
import com.micros.reservation.ReservationServiceStub.ReservationComment;
import com.micros.reservation.ReservationServiceStub.ReservationCommentList;
import com.micros.reservation.ReservationServiceStub.ReservationStatusType;
import com.micros.reservation.ReservationServiceStub.ResultStatusFlag;
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
	private Enumeration<String> parameterNames = null;

	@Override
	protected void doPost( HttpServletRequest request ,	HttpServletResponse response ) {

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " Enter in doPost " );

		PrintWriter out = null;

		try {
			out = response.getWriter();

		} catch ( IOException exc ) {

			OWSMessageLogger.logError( RequestProcessor.class, " doPost ", exc );
		}

		response.setContentType( "text/html" );
		parameterNames = request.getParameterNames();

		/*
		 * It iterates through all elements of request parameters. 
		 */
		while ( parameterNames.hasMoreElements() ) {

			String paramName = parameterNames.nextElement();
			xmlRequestValue = request.getParameter( paramName );
		
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

		if ( xmlRequestValue.contains( IMicrosOWSConstants.CHECKIN_REQUEST ) ) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " enter check in block " );

			xmlOWSResponse = getXMLCheckInResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost check in block ", " response send " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " exit check in block " );

		}
		else if ( xmlRequestValue.contains( IMicrosOWSConstants.CHECKOUT_REQUEST ) ) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost CheckOutRequest block ", " enter CheckOutRequest block " );

			xmlOWSResponse = getXMLCheckOutResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost CheckOutRequest block ", " response send " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost CheckOutRequest block ", " exit CheckOutRequest block " );

		}
		else if( xmlRequestValue.contains( IMicrosOWSConstants.RELEASE_ROOM_REQUEST ) ) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost Release Room block ", " enter Release Room block " );

			xmlOWSResponse = getXMLReleaseRoomResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost Release Room block ", " response send " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost Release Room block ", " exit Release Room block " );

		}
		else if( xmlRequestValue.contains( "com.micros.reservation.ReservationServiceStub_-ModifyBookingRequest" ) ) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ModifyBookingRequest block ", " enter ModifyBookingRequest block " );

			xmlOWSResponse = getXMLModifyBookingResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ModifyBookingRequest block ", " response send " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ModifyBookingRequest block ", " exit ModifyBookingRequest block " );	

		}
		else if( xmlRequestValue.contains( IMicrosOWSConstants.GETFOLIO_REQUEST ) ) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost getFolio block.. ", " enter getFolio block " );

			xmlOWSResponse = getXMLFolioResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost getFolio block ", " response send " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost getFolio block ", " exit getFolio block " );

		}
		else if( xmlRequestValue.contains( IMicrosOWSConstants.ASSIGN_ROOM_REQUEST ) ) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost assign Room block ", " enter assign Room  block " );

			xmlOWSResponse = getXMLAssignRoomResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost assign Room  block ", " response send " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost assign Room  block ", " exit assign Room  block " );
		}

		else if( xmlRequestValue.contains( IMicrosOWSConstants.FUTURE_BOOKING_SUMMARY_REQUEST ) ){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FutureBookingSummaryRequest block ", " enter FutureBookingSummaryRequest block " );

			xmlOWSResponse = getXMLFutureBookingSummaryResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FutureBookingSummaryRequest block ", " response send " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FutureBookingSummaryRequest block ", " exit FutureBookingSummaryRequest block " );

		}
		else if( xmlRequestValue.contains( IMicrosOWSConstants.FETCH_ROOM_STATUS_REQUEST ) ){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " enter FetchRoomStatusRequest block " );

			xmlOWSResponse = getXMLFetchRoomStatusResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " response send " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " exit FetchRoomStatusRequest block " );

		}

		else if ( xmlRequestValue.contains( IMicrosOWSConstants.FETCH_CALENDAR_REQUEST ) ) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchCalendarRequest block ", " enter FetchCalendarRequest block " );

			xmlOWSResponse = getXMLFetchCalendarResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchCalendarRequest block ", " response send " + xmlOWSResponse  );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchCalendarRequest block ", " exit FetchCalendarRequest block " );

		}
		else if(xmlRequestValue.contains(IMicrosOWSConstants.HOTEL_INFORMATION_REQUEST)) {

			OWSMessageLogger.logInfo(RequestProcessor.class, " dopost Hotel informationrequest block ", "enter HotelInformationRequest block" );

			xmlOWSResponse = getXMLHotelInformationResponse();

			OWSMessageLogger.logInfo(RequestProcessor.class, " dopost Hotel informationrequest block ", "exit HotelInformationRequest block" );
		}
		
		else if ( xmlRequestValue.contains ( IMicrosOWSConstants.MEETING_ROOM_REQUEST )) {
			
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost MeetingRoomInformation block ", " enter MeetingRoomInformation block " );
			
			xmlOWSResponse = getXMLMeetingRoomResponse(); 
			
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost MeetingRoomInformation block ", " xml response " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost MeetingRoomInformation block ", " exit MeetingRoomInformation block " );
			
		}
		
		else if (xmlRequestValue.contains(IMicrosOWSConstants.GUEST_MEMBERSHIP_REQUEST)) {
			
           OWSMessageLogger.logInfo( RequestProcessor.class, " doPost GuestMembershipInformation block ", " enter GuestMembershipInformation block " );
			
			xmlOWSResponse = getXMLGuestMembershipResponse(); 
			
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost GuestMembershipInformation block ", " xml response " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost GuestMembershipInformation block ", " exit GuestMembershipInformation block " );
			
		}
		
		else if (xmlRequestValue.contains(IMicrosOWSConstants.MEMBER_POINTS_REQUEST)) {
			
			    OWSMessageLogger.logInfo( RequestProcessor.class, " doPost MemberPointsInformation block ", " enter MemberPointsInformation block " );
				
				xmlOWSResponse = getXMLMemberPointsResponse(); 
				
				OWSMessageLogger.logInfo( RequestProcessor.class, " doPost MemberPointsInformation block ", " xml response " + xmlOWSResponse );
				OWSMessageLogger.logInfo( RequestProcessor.class, " doPost MemberPointsInformation block ", " exit MemberPointsInformation block " );
			
		}
		
		else if (xmlRequestValue.contains(IMicrosOWSConstants.NAME_ID_REQUEST)) {
			
		    OWSMessageLogger.logInfo( RequestProcessor.class, " doPost NameIDInformation block ", " enter NameIDInformation block " );
			
			xmlOWSResponse = getXMLNameIDResponse(); 
			
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost NameIDInformation block ", " xml response " + xmlOWSResponse );
			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost NameIDInformation block ", " exit NameIDInformation block " );
		
	}
		else {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost invalid block ", " enter invalid request block " );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost invalid block ", " exit enter invalid request block " );
		}

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " Exit getOWSResponse " );

		return xmlOWSResponse;
	}

	private String getXMLMeetingRoomResponse() {
        
        OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLMeetingRoomResponse ", " enter getXMLMeetingRoomResponse " );
        
        String meetingRooomInformation = "";
        MeetingAvailabilityRequest obMeetingAvailabilityRequest = null;
        
        obMeetingAvailabilityRequest = new com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityRequest();
        
        obMeetingAvailabilityRequest = ( MeetingAvailabilityRequest )OWSUtility.covertToStreamObject( xmlRequestValue );
 
        int numberOfAttendess = obMeetingAvailabilityRequest.getNumberOfAttendees();
        
        OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLMeetingRoomResponse ", " Number of Attendess " + numberOfAttendess );
        
        com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityResponse objMeetingAvailabilityResponse = new com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityResponse();
        
     ResultStatus objStatus = new ResultStatus();
     
     objStatus.setResultStatusFlag(com.micros.meeting.MeetingRoomServiceStub.ResultStatusFlag.SUCCESS);
     objMeetingAvailabilityResponse.setResult(objStatus);
     
     OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLMeetingRoomResponse ", " ResultStatus Set to Success " );
     
     OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLMeetingRoomResponse ", " Creating First AvailProperty " );
     
     /* Creating first Available Property. */
        AvailableProperty objAvailableProperty = new AvailableProperty();
        
        com.micros.meeting.MeetingRoomServiceStub.HotelReference objHotelReference = new com.micros.meeting.MeetingRoomServiceStub.HotelReference();
        objHotelReference.setString( "Opera Demo Hotel, Small");
        objAvailableProperty.setHotelReference(objHotelReference);
        
        com.micros.meeting.MeetingRoomServiceStub.HotelContact objHotelContact = new com.micros.meeting.MeetingRoomServiceStub.HotelContact();
        com.micros.meeting.MeetingRoomServiceStub.AddressList objAddressList = new com.micros.meeting.MeetingRoomServiceStub.AddressList();
        
        com.micros.meeting.MeetingRoomServiceStub.Address objAddress = new com.micros.meeting.MeetingRoomServiceStub.Address();
        objAddress.setCityName("BERLIN");
        objAddress.setCountryCode("FR");
        objAddress.setPostalCode("44005");
        
        objAddressList.addAddress(objAddress);
        objHotelContact.setAddresses(objAddressList);
        
        objAvailableProperty.setHotelContact(objHotelContact);
        OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLMeetingRoomResponse ", " Hotel Contact added to the response " );
        
        MeetingRoomsType objMeetingRoomsType = new MeetingRoomsType();
        NonNegativeInteger objNegativeInteger = new NonNegativeInteger("12");
        objMeetingRoomsType.setMeetingRoomCount(objNegativeInteger);
        
        NonNegativeInteger objNegativeInteger1 = new NonNegativeInteger("120");
        objMeetingRoomsType.setLargestSeatingCapacity(objNegativeInteger1);
        
        NonNegativeInteger objNegativeInteger2 = new NonNegativeInteger("10");
        objMeetingRoomsType.setSmallestSeatingCapacity(objNegativeInteger2);
        
        com.micros.meeting.MeetingRoomServiceStub.MeetingRoom_type0[] objRoomArray = new com.micros.meeting.MeetingRoomServiceStub.MeetingRoom_type0[2];
        
        for(int objRAray = 0; objRAray<objRoomArray.length; objRAray ++ ) {
 
        if(objRAray == 0){
               
        	com.micros.meeting.MeetingRoomServiceStub.MeetingRoom_type0 objMeetingRoom_type0 = new com.micros.meeting.MeetingRoomServiceStub.MeetingRoom_type0();
        objMeetingRoom_type0.setRoomName( "AWS");
        NonNegativeInteger objNegativeInteger3 = new NonNegativeInteger("10");
        objMeetingRoom_type0.setMeetingRoomCapacity(objNegativeInteger3);
        
        com.micros.meeting.MeetingRoomServiceStub.Code_type0[] objCodesArray = new com.micros.meeting.MeetingRoomServiceStub.Code_type0[1];
        com.micros.meeting.MeetingRoomServiceStub.Code_type0 objC = new com.micros.meeting.MeetingRoomServiceStub.Code_type0();
        objC.setCode("001");
        objC.setCharge("100");
        objCodesArray[0] = objC;
        com.micros.meeting.MeetingRoomServiceStub.Codes_type0 objCode = new com.micros.meeting.MeetingRoomServiceStub.Codes_type0();
        objCode.setCode(objCodesArray);
        
        objMeetingRoom_type0.setCodes(objCode);
        objRoomArray[objRAray] = objMeetingRoom_type0;
        
        }
        else {
               
        	com.micros.meeting.MeetingRoomServiceStub.MeetingRoom_type0 objMeetingRoom_type0 = new com.micros.meeting.MeetingRoomServiceStub.MeetingRoom_type0();
        objMeetingRoom_type0.setRoomName( "PWD");
        NonNegativeInteger objNegativeInteger3 = new NonNegativeInteger("12");
        objMeetingRoom_type0.setMeetingRoomCapacity(objNegativeInteger3);
        
        com.micros.meeting.MeetingRoomServiceStub.Code_type0[] objCodesArray = new com.micros.meeting.MeetingRoomServiceStub.Code_type0[1];
        com.micros.meeting.MeetingRoomServiceStub.Code_type0 objC = new com.micros.meeting.MeetingRoomServiceStub.Code_type0();
        objC.setCode("002");
        objC.setCharge("600");
        objCodesArray[0] = objC;
        com.micros.meeting.MeetingRoomServiceStub.Codes_type0 objCode = new com.micros.meeting.MeetingRoomServiceStub.Codes_type0();
        objCode.setCode(objCodesArray);
        
        objMeetingRoom_type0.setCodes(objCode);
        objRoomArray[objRAray] = objMeetingRoom_type0;
        }
        }
 
        objMeetingRoomsType.setMeetingRoom(objRoomArray);
        
        com.micros.meeting.MeetingRoomServiceStub.ExtendedHotelInfo objHotelInfo = new com.micros.meeting.MeetingRoomServiceStub.ExtendedHotelInfo();
        com.micros.meeting.MeetingRoomServiceStub.FacilityInfoType objFacilityInfoType = new com.micros.meeting.MeetingRoomServiceStub.FacilityInfoType();
        objFacilityInfoType.setMeetingRooms(objMeetingRoomsType);
        
        objHotelInfo.setFacilityInfo(objFacilityInfoType);
        
        objAvailableProperty.setHotelExtendedInformation(objHotelInfo);
        
        /*
        HotelContact objHotelContact = new HotelContact();
        
        AddressList objAddressList = new AddressList();
        Address objAdd = new Address();
        objAdd.addAddressLine( "s-110, turkey mackwell lane ");
        objAdd.setCityName( "New York");
        objAdd.setCountryCode( "A-011");
        objAdd.setPostalCode( "0112176");
        objAddressList.addAddress(objAdd);
        objHotelContact.setAddresses(objAddressList);
        
        PhoneList objPhoneList = new PhoneList();
        Phone obP = new Phone();
        obP.setPhoneNumber("011-89878987");
        obP.setPhoneType( "Business");
        objPhoneList.addPhone(obP);
        objHotelContact.setContactPhones(objPhoneList);
        
        objAvailableProperty.setHotelContact(objHotelContact);
        
        HotelReference objHotelReference = new HotelReference();
        objHotelReference.setChainCode( chainCode);
        objHotelReference.setHotelCode( hotelCode);
        objHotelReference.setString( "Opera Demo Hotel,Small" );
        objAvailableProperty.setHotelReference(objHotelReference);
        
        FunctionSpace_type0 objSpace_type0 = new FunctionSpace_type0();
        objSpace_type0.setLocationType("Main Building");
        
        objSpace_type0.setFloor("1st Floor");
        objSpace_type0.setFloorDescription( "Top Floor");
        
        objSpace_type0.setHandicapFacility(true);
        
        objSpace_type0.setSpaceType( " Maximum Capacity ");
        
        objSpace_type0.setRoom("KIWI");
        
        CateringRateCode objCateringRateCode = new CateringRateCode();
        CateringRate objCateringRate = new CateringRate();
        Amount amount = new Amount();
        
        amount.set_double(3000);
        
        objCateringRate.setTotalRate(amount);
        objCateringRateCode.setRate(objCateringRate);
        CateringRateCode[] cc = new CateringRateCode[1];
        cc[0]= objCateringRateCode;
        objSpace_type0.setRateDetails(cc);
        
        FunctionSpace_type0[] myArray = new FunctionSpace_type0[1];
        myArray[0] = objSpace_type0;
        
        objAvailableProperty.setFunctionSpace(myArray);*/
        
 /*     AvailableProperty[] objAvailArray = new AvailableProperty[1];
        objAvailArray[0] = objAvailableProperty;*/
        objMeetingAvailabilityResponse.setAvailableProperties(objAvailableProperty);
        //objMeetingAvailabilityResponse.setAvailableProperties(objAvailArray);
        
        meetingRooomInformation = OWSUtility.convertToStreamXML( objMeetingAvailabilityResponse ); 
        
        OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLMeetingRoomResponse ", " exit getXMLMeetingRoomResponse " );
        
        return meetingRooomInformation;
 }

	/**
	 * This method returns the response having Name id.
	 * 
	 * @return String
	 */
	private String getXMLNameIDResponse() {
		
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLNameIDResponse ", " enter getXMLNameIDResponse " );
		
		com.micros.name.NameServiceStub.FetchNameIdByMembershipResponse objFetchNameIdByMembershipResponse = null;
		String objNameIdInformation = "";
		
		try {
			
			objFetchNameIdByMembershipResponse = new com.micros.name.NameServiceStub.FetchNameIdByMembershipResponse();
			
			com.micros.name.NameServiceStub.ResultStatus objResultStatus = new com.micros.name.NameServiceStub.ResultStatus();
			objResultStatus.setResultStatusFlag(com.micros.name.NameServiceStub.ResultStatusFlag.SUCCESS);
			objFetchNameIdByMembershipResponse.setResult(objResultStatus);
			
			NameIdNameAddressList objIdNameAddressList = new NameIdNameAddressList();
			NameIdNameAddress[] objIdNameAddresses = new NameIdNameAddress[1];
			NameIdNameAddress objAddress = new NameIdNameAddress();
			
			com.micros.name.NameServiceStub.UniqueID objUniqueID = new com.micros.name.NameServiceStub.UniqueID();
			objUniqueID.setString("100");
			objAddress.setProfileId(objUniqueID);
			
			NameAddress objNameAddress = new NameAddress();
			
			objNameAddress.setOperaId(new Long("200"));
			objNameAddress.setExternalId("300");
			
			objAddress.setAddress(objNameAddress);
			
			objIdNameAddresses[0] = objAddress;
			objIdNameAddressList.setNameAndAddresses(objIdNameAddresses);
			objFetchNameIdByMembershipResponse.setNameIdNameAddressList(objIdNameAddressList);
			
			objNameIdInformation = OWSUtility.convertToStreamXML( objFetchNameIdByMembershipResponse ); 
			OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLNameIDResponse ", " getXMLNameIDResponse Response created " );
			
		}
		catch(Exception exc) {
			
			OWSMessageLogger.logError(RequestProcessor.class, " getXMLNameIDResponse ", exc);
			
		}
		
		
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLNameIDResponse ", " exit getXMLNameIDResponse " );
		
		return objNameIdInformation;
	}
	
	
	/**
	 * This method returns the response having Member points  status.
	 * 
	 * @return String
	 */
	private String getXMLMemberPointsResponse() {
	
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLMemberPointsResponse ", " enter getXMLMemberPointsResponse " );
	
		com.micros.membership.MembershipServiceStub.FetchMemberPointsResponse objFetchMemberPointsResponse = null;
		String memberPointsInformation = "";
		
		try {
			
			objFetchMemberPointsResponse = new com.micros.membership.MembershipServiceStub.FetchMemberPointsResponse();
			
			com.micros.membership.MembershipServiceStub.ResultStatus objResultStatus = new com.micros.membership.MembershipServiceStub.ResultStatus();
			objResultStatus.setResultStatusFlag(com.micros.membership.MembershipServiceStub.ResultStatusFlag.SUCCESS);
			objFetchMemberPointsResponse.setResult(objResultStatus);
			
			com.micros.membership.MembershipServiceStub.Membership memberinfo = new com.micros.membership.MembershipServiceStub.Membership();
			
			memberinfo.setMemberName("White Peterson");
			
			UniqueID objId = new UniqueID();
		
			objId.setString("100");
			memberinfo.setMembershipid(objId);
			memberinfo.setMembershipType("GC");
			memberinfo.setMembershipNumber("TAMMY");
			memberinfo.setMembershipLevel("GOLD");
			
			memberinfo.setEffectiveDate(new Date());
		    memberinfo.setExpirationDate(new Date());
		
			memberinfo.setInactive(true);
			
			UniqueIDList objIdList = new UniqueIDList();
			UniqueID[] objUniqueID = new UniqueID[1];
			UniqueID objUniqueID2 = new UniqueID();
			objUniqueID2.setString("100");
			objUniqueID[0] = objUniqueID2;
			objIdList.setUniqueID(objUniqueID);
			memberinfo.setResvNameId(objIdList);
			
			objFetchMemberPointsResponse.setMemberInfo(memberinfo);
			
			com.micros.membership.MembershipServiceStub.PointsInfo pointsInfo = new com.micros.membership.MembershipServiceStub.PointsInfo();
			com.micros.membership.MembershipServiceStub.AwardPointsInfo obAwardPointsInfo = new com.micros.membership.MembershipServiceStub.AwardPointsInfo();
		  
			obAwardPointsInfo.setTotalPoints(new Double("123"));
		    obAwardPointsInfo.setBonusPoints(new Double("10"));
			
		    pointsInfo.setAwardPointsInfo(obAwardPointsInfo);
			
			com.micros.membership.MembershipServiceStub.StayPointsInfo objStayPointsInfo = new com.micros.membership.MembershipServiceStub.StayPointsInfo();
			objStayPointsInfo.setGuestTotalNights(new Integer("11"));
			objStayPointsInfo.setGuestTotalStays(new Integer("12"));
		
			pointsInfo.setStayPointsInfo(objStayPointsInfo);
			objFetchMemberPointsResponse.setPointsInfo(pointsInfo);
			
			memberPointsInformation = OWSUtility.convertToStreamXML( objFetchMemberPointsResponse ); 
		
			OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLMemberPointsResponse ", " getXMLMemberPointsResponse Response created " );
			
		}
		catch(Exception e) {
			
			OWSMessageLogger.logError(RequestProcessor.class, " getXMLMemberPointsResponse ", e);
			
		}
		
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLMemberPointsResponse ", " exit getXMLMemberPointsResponse " );
	     return memberPointsInformation;
	}
	
	/**
	 * This method returns the response having Guest Membership status.
	 * 
	 * @return String
	 */
	
	private String getXMLGuestMembershipResponse() {
		
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLGuestMembershipResponse ", " enter getXMLGuestMembershipResponse " );
		
		com.micros.membership.MembershipServiceStub.FetchMembershipsResponse objFetchMembershipsResponse = null;
		String guestMembershipInformation = "";
		
		try {
			objFetchMembershipsResponse = new com.micros.membership.MembershipServiceStub.FetchMembershipsResponse();
			
			com.micros.membership.MembershipServiceStub.ResultStatus objResultStatus = new com.micros.membership.MembershipServiceStub.ResultStatus();
			objResultStatus.setResultStatusFlag(com.micros.membership.MembershipServiceStub.ResultStatusFlag.SUCCESS);
			objFetchMembershipsResponse.setResult(objResultStatus);
			
			NameMembershipList objMembershipList = new NameMembershipList();
			NameMembership[] objNameMembership = new NameMembership[1];
			NameMembership objMembership = new NameMembership();
			
			objMembership.setMembershipType("GC");
			objMembership.setMembershipNumber("0209639");
			objMembership.setMembershipLevel("LV2");
			UniqueID objId = new UniqueID();
		
			objId.setString("100");
			objMembership.setMembershipid(objId);
			objMembership.setOperaId(new Long("13748"));
			objMembership.setExternalId("109");
			objMembership.setPoints_label("Golden Circle Points");
			objMembership.setMemberName("ALAN MURRAY SMITH");
			
			objNameMembership[0] = objMembership;
			objMembershipList.setNameMembership(objNameMembership);
			objFetchMembershipsResponse.setNameMembershiphList(objMembershipList);
			
			guestMembershipInformation = OWSUtility.convertToStreamXML( objFetchMembershipsResponse ); 
			
			OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLGuestMembershipResponse ", " GuestMembership Response created " );
		}
		catch (Exception e) {
			
			OWSMessageLogger.logError(RequestProcessor.class, " getXMLGuestMembershipResponse ", e);
		}
		
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLGuestMembershipResponse ", " exit getXMLGuestMembershipResponse " );
		return guestMembershipInformation;
	}


	/**
	 * This method returns the response having relesed room status.
	 * 
	 * @return String
	 */
	private String getXMLReleaseRoomResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost Release Room Request block ", " enter Release Room request block " );

		String releaseRoomResponse = null;	
		ReleaseRoomResponse objReleaseRoomResponse = new ReleaseRoomResponse();

		/* To set the status on the release room response. */
		GDSResultStatus objResultStatus = new GDSResultStatus();

		objResultStatus.setResultStatusFlag( ResultStatusFlag.SUCCESS );
		objReleaseRoomResponse.setResult( objResultStatus );

		releaseRoomResponse = OWSUtility.convertToStreamXML( objReleaseRoomResponse ); 

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost Release Room Request block ", " exit Release Room Request block " );

		return releaseRoomResponse;
	}
	
	/**
	 * This method returns the response having HotelInformation result, HotelName, Address, City, Country, Zip, contactEmails, Phone, Fax, CheckInTime, CheckOutTime, Notes
	 * RoomTypes, Restaurants.
	 * 
	 * @return String
	 */
	private String getXMLHotelInformationResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost Hotel Information Request block ", " enter getXMLHotelInformationResponse request block " );

		com.micros.ows.information.InformationStub.HotelInformationResponse objHotelInformationResponse = null;

		String hotelInformationResponse = null;

		try {

			objHotelInformationResponse = new com.micros.ows.information.InformationStub.HotelInformationResponse();

			com.micros.ows.information.InformationStub.GDSResultStatus objResultStatus = new com.micros.ows.information.InformationStub.GDSResultStatus();
			objResultStatus.setResultStatusFlag( InformationStub.ResultStatusFlag.SUCCESS );
			objHotelInformationResponse.setResult( objResultStatus );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost Hotel Information Request block ", " Result status set " );

			HotelInformation_type0 objHotelInformation_type0 = new HotelInformation_type0();

			/* set hotel name */
			HotelReference objHotelReference = new HotelReference();
			objHotelReference.setString("Opera Demo Hotel");

			/* set hotel contact information */
			HotelContact objHotelContact = new HotelContact();

			/*set email contact list  */
			ContactEmailList obj = new ContactEmailList();
			Email[] objEmail = new Email[1];
			Email email = new Email();

			email.setString("5thavesales@hotels.com");
			objEmail[0] = email;

			obj.setContactEmail(objEmail);
			objHotelContact.setContactEmails(obj);

			/* set address list  */
			AddressList objAddress = new AddressList();
			Address[] objAdd = new Address[1];

			Address address = new Address();
			address.setAddressLine(new String[]{"415 Fifth Ave"});

			address.setCityName("Naples");
			address.setCountryCode("US");
			address.setPostalCode(" 34101 ");

			objAdd[0] = address;
			objAddress.setAddress(objAdd);
			objHotelContact.setAddresses(objAddress);

			/* set phone list   */
			PhoneList objPhone = new PhoneList();
			Phone[] objph = new Phone[2];

			Phone phone = new Phone();
			phone.setPhoneRole("PHONE");

			PhoneData_type0 objPhoneData_type0 = new PhoneData_type0();
			objPhoneData_type0.setAreaCode(" 329 ");
			objPhoneData_type0.setPhoneNumber(" 2397895678 ");
			objPhoneData_type0.setExtension(" 193 ");

			phone.setPhoneData(objPhoneData_type0);
			objph[0] = phone;

			/* set Fax  */
			Phone phone1 = new Phone();

			phone1.setPhoneRole("FAX");
			phone1.setPhoneNumber("9543764555");

			objph[1] = phone1;
			objPhone.setPhone(objph);

			objHotelContact.setContactPhones(objPhone);

			/* set restaurant types information  */
			ExtendedHotelInfo objExtendedHotelInfo = new ExtendedHotelInfo();
			FacilityInfoType objFacilityInfoType = new FacilityInfoType();

			RestaurantsType objRestaurantsType = new RestaurantsType();
			Restaurant_type0[] objRestaurant_type0 = new Restaurant_type0[2];
			Restaurant_type0 objRestaurant_type02 = new Restaurant_type0();

			objRestaurant_type02.setRestaurantName(" Terrace Garden ");

			com.micros.ows.information.InformationStub.Paragraph[] objParagraph = new com.micros.ows.information.InformationStub.Paragraph[1];
			com.micros.ows.information.InformationStub.Paragraph objParagraph2 =new com.micros.ows.information.InformationStub.Paragraph();
			com.micros.ows.information.InformationStub.ParagraphChoice objChoice = new com.micros.ows.information.InformationStub.ParagraphChoice();
			com.micros.ows.information.InformationStub.Text objText = new com.micros.ows.information.InformationStub.Text();

			NormalizedString objString = new NormalizedString();
			objString.setValue(" Full-service dining and outdoor terrace with view of the Puget Sound serving Northwest cuisine ");
			objText.setNormalizedString(objString);
			objChoice.setText(objText);

			objParagraph2.addParagraphChoice(objChoice); 
			objParagraph[0] = objParagraph2;
			objRestaurant_type02.setRestaurantDescription(objParagraph);

			Cuisines_type0 objcCuisines_type0 =new Cuisines_type0();
			Cuisine_type0[] objcCuisine_type0s = new Cuisine_type0[1];
			Cuisine_type0 objCuisine_type0 = new Cuisine_type0();

			objCuisine_type0.setDescription(" FULL-SERVICE DINING ");
			objcCuisine_type0s[0] = objCuisine_type0;
			objcCuisines_type0.setCuisine(objcCuisine_type0s);

			objRestaurant_type02.setCuisines(objcCuisines_type0);

			Restaurant_type0 objRestaurant_type022 = new Restaurant_type0();
			objRestaurant_type022.setRestaurantName(" Elephant and Castle Pub ");

			com.micros.ows.information.InformationStub.Paragraph[] objParagraph1 = new com.micros.ows.information.InformationStub.Paragraph[1];
			com.micros.ows.information.InformationStub.Paragraph objParagraph21 =new com.micros.ows.information.InformationStub.Paragraph();
			com.micros.ows.information.InformationStub.ParagraphChoice objChoice1 = new com.micros.ows.information.InformationStub.ParagraphChoice();
			com.micros.ows.information.InformationStub.Text objText1 = new com.micros.ows.information.InformationStub.Text();

			NormalizedString objString1 = new NormalizedString();
			objString1.setValue(" fireplace or patio seating, authentic English cuisine this is s a test to see how long fireplace or patio seating ");
			objText1.setNormalizedString(objString1);
			objChoice1.setText(objText1);

			objParagraph21.addParagraphChoice(objChoice1); 
			objParagraph1[0] = objParagraph21;

			objRestaurant_type022.setRestaurantDescription(objParagraph1);

			Cuisines_type0 objcCuisines_type01 =new Cuisines_type0();
			Cuisine_type0[] objcCuisine_type0s1 = new Cuisine_type0[1];
			Cuisine_type0 objCuisine_type01 = new Cuisine_type0();

			objCuisine_type01.setDescription(" CASUAL DINING ");
			objcCuisine_type0s1[0] = objCuisine_type01;
			objcCuisines_type01.setCuisine(objcCuisine_type0s1);

			objRestaurant_type022.setCuisines(objcCuisines_type01);

			objRestaurant_type0[0] = objRestaurant_type02;
			objRestaurant_type0[1] = objRestaurant_type022;
			objRestaurantsType.setRestaurant(objRestaurant_type0);

			/*  set room types information  */
			GuestRooms_type0 objGuestRooms_type0 =new GuestRooms_type0();
			GuestRoom_type0[] objGuestRoom_type0 = new GuestRoom_type0[2];
			GuestRoom_type0 objGuestRoom_type02 = new GuestRoom_type0();

			objGuestRoom_type02.setCode(" KNG ");

			DescriptiveText objDescriptiveText = new DescriptiveText();
			TextList objTextList = new TextList();

			com.micros.ows.information.InformationStub.Text[] objText2 = new com.micros.ows.information.InformationStub.Text[1];
			com.micros.ows.information.InformationStub.Text objText3 = new com.micros.ows.information.InformationStub.Text();

			NormalizedString objNormalizedString =new NormalizedString();
			objNormalizedString.setValue(" K - King Room 2 beds ");
			objText3.setNormalizedString(objNormalizedString);

			objText2[0] = objText3;
			objTextList.setTextElement(objText2);
			objDescriptiveText.setText(objTextList);

			objGuestRoom_type02.setRoomDescription(objDescriptiveText);

			GuestRoom_type0 objGuestRoom_type03 = new GuestRoom_type0();
			objGuestRoom_type03.setCode("MLK");

			DescriptiveText objDescriptiveText1 = new DescriptiveText();
			TextList objTextList1 = new TextList();

			com.micros.ows.information.InformationStub.Text[] objText11 = new com.micros.ows.information.InformationStub.Text[1];
			com.micros.ows.information.InformationStub.Text objText44 = new com.micros.ows.information.InformationStub.Text();

			NormalizedString objNormalizedString1 =new NormalizedString();
			objNormalizedString1.setValue(" MLSK - Mid Level King Room  2  beds ");
			objText44.setNormalizedString(objNormalizedString1);

			objText11[0] = objText44;
			objTextList1.setTextElement(objText11);
			objDescriptiveText1.setText(objTextList1);

			objGuestRoom_type03.setRoomDescription(objDescriptiveText1);

			objGuestRoom_type0[0] = objGuestRoom_type02;
			objGuestRoom_type0[1] = objGuestRoom_type03;
			objGuestRooms_type0.setGuestRoom(objGuestRoom_type0);

			/* set attraction type as note. */
			AttractionsType objAttractionsType = new AttractionsType();

			Attraction_type0[] objAttraction_type0 = new Attraction_type0[1];
			Attraction_type0 objAttraction_type02 = new Attraction_type0();
			objAttraction_type02.setAttractionName(" City Center  ");

			AttractionInfoList objAttractionInfoList = new AttractionInfoList();
			AttractionInfo[] objAttractionInfo =new AttractionInfo[1];
			AttractionInfo objAttractionInfo2 =new AttractionInfo();

			TextList objList =new TextList();
			com.micros.ows.information.InformationStub.Text[] objText4 = new com.micros.ows.information.InformationStub.Text[1];
			com.micros.ows.information.InformationStub.Text objText5 = new com.micros.ows.information.InformationStub.Text();

			NormalizedString objNormalizedString2 = new NormalizedString();
			objNormalizedString2.setValue(" Naples ");

			objText5.setNormalizedString(objNormalizedString2); 
			objText4[0] = objText5;

			objList.setTextElement(objText4);

			objAttractionInfo2.setText(objList);
			objAttractionInfo[0] = objAttractionInfo2; 
			objAttractionInfoList.setAttractionInfo(objAttractionInfo);
			objAttraction_type02.setAttractionInformation(objAttractionInfoList);

			objAttraction_type0[0] = objAttraction_type02;
			objAttractionsType.setAttraction(objAttraction_type0);

			objFacilityInfoType.setAttractions(objAttractionsType);

			objFacilityInfoType.setGuestRooms(objGuestRooms_type0);
			objFacilityInfoType.setRestaurants(objRestaurantsType);

			/* set check in info and check out info   */
			HotelInfoList objHotelInfoList = new HotelInfoList();
			HotelInfo[] objHotelInfo = new HotelInfo[2];

			HotelInfo objHotelInfo2 = new HotelInfo();
			objHotelInfo2.setHotelInfoType(HotelInfoType.CHECKININFO);

			TextList objTList = new TextList();
			com.micros.ows.information.InformationStub.Text[] myText = new com.micros.ows.information.InformationStub.Text[1];
			com.micros.ows.information.InformationStub.Text myT = new com.micros.ows.information.InformationStub.Text();

			NormalizedString objNormalizedString3 = new NormalizedString();
			objNormalizedString3.setValue("8:00");
			myT.setNormalizedString(objNormalizedString3);

			myText[0] = myT;
			objTList.setTextElement(myText);
			objHotelInfo2.setText(objTList);

			objHotelInfo[0] = objHotelInfo2;

			HotelInfo objHotelInfo4 = new HotelInfo();
			objHotelInfo4.setHotelInfoType(HotelInfoType.CHECKOUTINFO);
			TextList objTList1 = new TextList();

			com.micros.ows.information.InformationStub.Text[] myText1 = new com.micros.ows.information.InformationStub.Text[1];
			com.micros.ows.information.InformationStub.Text myT1 = new com.micros.ows.information.InformationStub.Text();

			NormalizedString objNormalizedString4 = new NormalizedString();
			objNormalizedString4.setValue("15:00");
			myT1.setNormalizedString(objNormalizedString4);

			myText1[0] = myT1;
			objTList1.setTextElement(myText1);
			objHotelInfo4.setText(objTList1);

			objHotelInfo[1] = objHotelInfo4;
			objHotelInfoList.setHotelInfo(objHotelInfo);

			objExtendedHotelInfo.setHotelInformation(objHotelInfoList);
			objExtendedHotelInfo.setFacilityInfo(objFacilityInfoType);

			objHotelInformation_type0.setHotelExtendedInformation(objExtendedHotelInfo);
			objHotelInformation_type0.setHotelContactInformation(objHotelContact);
			objHotelInformation_type0.setHotelInformation(objHotelReference);

			objHotelInformationResponse.setHotelInformation(objHotelInformation_type0);

			hotelInformationResponse = OWSUtility.convertToStreamXML( objHotelInformationResponse ); 

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost Hotel Information Request block ", " exit Hotel getXMLHotelInformationResponse Requestt block " );

		}
		catch( Exception e) {

			OWSMessageLogger.logError(RequestProcessor.class, " Hotel information Request block", e);

		}

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost Hotel Information Request block ", " exit HotelInformation request block " );

		return hotelInformationResponse;
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
		objFetchCalendarRequest = ( FetchCalendarRequest )OWSUtility.covertToStreamObject( xmlRequestValue );

		FetchCalendarResponse objFetchCalendarResponse = new FetchCalendarResponse();

		/*To set the status on the fetch calendar response.*/
		com.micros.ows.availability.AvailabilityServiceStub.GDSResultStatus  objGResultStatus = new  com.micros.ows.availability.AvailabilityServiceStub.GDSResultStatus();

		objGResultStatus.setResultStatusFlag( AvailabilityServiceStub.ResultStatusFlag.SUCCESS );
		objFetchCalendarResponse.setResult( objGResultStatus );

		Calendar objCalendar = new Calendar();
		CalendarDailyDetail objCalendarDailyDetailArray[] = new CalendarDailyDetail[2];

		//Detail of first calendar day.
		CalendarDailyDetail objCalendarDailyDetail = new CalendarDailyDetail();
		RoomTypeInventoryList objRoomTypeInventoryList = new RoomTypeInventoryList();
		RoomTypeInventory[] objRoomTypeInventoryArray = new com.micros.ows.availability.AvailabilityServiceStub.RoomTypeInventory[2];

		//first details of first calendar day
		RoomTypeInventory objRoomTypeInventory = new RoomTypeInventory();
		objRoomTypeInventory.setRoomTypeCode( "KNG" );

		BigInteger objBigInteger = new BigInteger( "25" );
		objRoomTypeInventory.setTotalRooms( objBigInteger );

		objBigInteger = new BigInteger( "20" );
		objRoomTypeInventory.setTotalAvailableRooms( objBigInteger );

		objBigInteger = new BigInteger( "0" );
		objRoomTypeInventory.setOverBookingLimit( objBigInteger );
		objRoomTypeInventoryArray[0] = objRoomTypeInventory;

		//second details of first calendar day.
		objRoomTypeInventory = new RoomTypeInventory();
		objRoomTypeInventory.setRoomTypeCode("DELUXE");

		objBigInteger = new BigInteger( "5" );
		objRoomTypeInventory.setTotalRooms( objBigInteger );

		objBigInteger = new BigInteger( "0" );
		objRoomTypeInventory.setTotalAvailableRooms( objBigInteger );

		objBigInteger = new BigInteger( "0" );
		objRoomTypeInventory.setOverBookingLimit( objBigInteger );
		objRoomTypeInventoryArray[1] = objRoomTypeInventory;

		objRoomTypeInventoryList.setRoomTypeInventory( objRoomTypeInventoryArray );
		objCalendarDailyDetail.setOccupancy( objRoomTypeInventoryList );

		/*To get the start and end date from request parameters.*/
		com.micros.ows.availability.AvailabilityServiceStub.TimeSpan objTimeSpan =  objFetchCalendarRequest.getStayDateRange();

		java.util.Calendar objCalendar2 = objTimeSpan.getStartDate();
		java.util.Calendar objCalendar3 = objTimeSpan.getTimeSpanChoice_type0().getEndDate();

		String strDate = OWSUtility.getDate( objCalendar2 );
		String endDate = OWSUtility.getDate( objCalendar3 );

		SimpleDateFormat objDateFormat = new SimpleDateFormat( "MM-dd-yyyy" );             

		Date objDate;

		try  {
			objDate = ( Date )objDateFormat.parse( strDate );
			objCalendarDailyDetail.setDate( objDate );

		}  catch ( ParseException exc ) {

			OWSMessageLogger.logError( RequestProcessor.class, " doPost FetchCalendar Request block ", exc );
		}

		objCalendarDailyDetailArray[0] = objCalendarDailyDetail;

		// Detail of second Calendar Day.
		objCalendarDailyDetail = new CalendarDailyDetail();

		objRoomTypeInventoryList = new RoomTypeInventoryList();

		objRoomTypeInventoryArray = new com.micros.ows.availability.AvailabilityServiceStub.RoomTypeInventory[1];

		objRoomTypeInventory = new RoomTypeInventory();
		objRoomTypeInventory.setRoomTypeCode( "LUX" );

		objBigInteger = new BigInteger( "40" );
		objRoomTypeInventory.setTotalRooms( objBigInteger );

		objBigInteger = new BigInteger( "22" );
		objRoomTypeInventory.setTotalAvailableRooms( objBigInteger );

		objBigInteger = new BigInteger( "20" );
		objRoomTypeInventory.setOverBookingLimit( objBigInteger );

		objRoomTypeInventoryArray[0] = objRoomTypeInventory;
		objRoomTypeInventoryList.setRoomTypeInventory( objRoomTypeInventoryArray );

		objCalendarDailyDetail.setOccupancy( objRoomTypeInventoryList );

		try  {
			objDate = ( Date )objDateFormat.parse( endDate );
			objCalendarDailyDetail.setDate( objDate );

		}  catch ( ParseException exc ) {

			OWSMessageLogger.logError( RequestProcessor.class, " doPost FetchCalendar Request block ", exc );		
		}

		objCalendarDailyDetailArray[1] = objCalendarDailyDetail;

		//added calendar day with the calendar
		objCalendar.setCalendarDay( objCalendarDailyDetailArray );

		//added calendar with the response.
		objFetchCalendarResponse.setCalendar( objCalendar );

		fetchCalendarResponse = OWSUtility.convertToStreamXML( objFetchCalendarResponse ); 

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchCalendar Request block ", " exit FetchCalendar request block " +  fetchCalendarResponse );

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
		objFutureBookingSummaryRequest = ( FutureBookingSummaryRequest )OWSUtility.covertToStreamObject( xmlRequestValue );

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

		confirmationNumber = objFutureBookingSummaryRequest.getAdditionalFilters().getConfirmationNumber().getString();

		/*To set the confirmation number.*/
		if( confirmationNumber.length() >= 1 ) {

			objUniqueID.setString( objFutureBookingSummaryRequest.getAdditionalFilters().getConfirmationNumber().getString() );
		}
		else {
			objUniqueID.setString( "400" );
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

		if( creditCardNumber != null ) {

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

		objProfile.setLanguageCode( "EN" );
		objProfile.setNationality( "In" );

		objProfileList.addProfile( objProfile );
		objResGuest.setProfiles( objProfileList );
		objGuestList.addResGuest( objResGuest );

		
		/*To set unique id list on the hotel reservation */
		objHotelReservation_type0.setUniqueIDList( objUniqueIDList );
		objHotelReservation_type0.setResGuests( objGuestList );
		
		/* Added Reservation Status Type. */
		ReservationStatusType obj = ReservationStatusType.Factory.fromValue(ReservationStatusType._CANCELED);
		objHotelReservation_type0.setReservationStatus( obj );
		
		/* Set reservation group */
		objHotelReservation_type0.setGroup( "FinVisitor");
		// to add hotel reservation object into hotel reservation list.
		objHotelReservationList.addHotelReservation( objHotelReservation_type0 );

		/*Set the data into hotel reservation if the confirmation number is not given in request parameters. .*/
		if( confirmationNumber.length() == 0 ) {

			objHotelReservation_type0 = new HotelReservation_type0();
			objUniqueIDList = new com.micros.reservation.ReservationServiceStub.UniqueIDList();
			objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();

			/*To set confirmation number.*/
			objUniqueID.setString( "200" );

			objUniqueID.setType( objFutureBookingSummaryRequest.getAdditionalFilters().getConfirmationNumber().getType() );
			objUniqueIDList.addUniqueID( objUniqueID );

			objGuestList = new ResGuestList();
			objResGuest = new ResGuest();

			objProfileList = new ProfileList();
			objProfile = new com.micros.reservation.ReservationServiceStub.Profile();

			/*To set credit card number.*/
			creditCardNumber =  objFutureBookingSummaryRequest.getFutureBookingSummaryRequestChoice_type1().getCreditCardNumber();

			if( creditCardNumber != null ) {

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

			objProfile.setLanguageCode ( "EN" );
			objProfile.setNationality( "In" );

			objProfileList.addProfile( objProfile );
			objResGuest.setProfiles( objProfileList );
			objGuestList.addResGuest( objResGuest );

			/*To set unique id list on the hotel reservation */

			objHotelReservation_type0.setResGuests( objGuestList );
			objHotelReservation_type0.setUniqueIDList( objUniqueIDList );

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
		objBookingRequest = ( ModifyBookingRequest )OWSUtility.covertToStreamObject( xmlRequestValue );

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

		objUniqueID.setString( objBookingRequest.getHotelReservation().getUniqueIDList().getUniqueID()[0].getString() );
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
		objAmount.set_double( 4656 );

		objDepRequirement.setDepositAmount( objAmount );
		objDepRequirement.setDueDate( new Date() );

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
		objFeature.setDescription( "With Pool Facility" );
		objFeature.setAttachPreferenceToProfile( true );

		objRoomFeatureList.addFeatures( objFeature );

		objFeature = new RoomFeature();
		objFeature.setFeature( "Tile Floor" );
		objFeature.setDescription( "With Tile Floor" );
		objFeature.setAttachPreferenceToProfile( true );

		objRoomFeatureList.addFeatures( objFeature );

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
		objFeature.setDescription( "With DVD Facility" );
		objFeature.setAttachPreferenceToProfile( true );

		objRoomFeatureList1.addFeatures( objFeature );

		objFeature = new RoomFeature();

		/*Set the room features with description.*/
		objFeature.setFeature( "GROUND Floor" );
		objFeature.setDescription( "In Ground Floor" );
		objFeature.setAttachPreferenceToProfile( true );

		objRoomFeatureList1.addFeatures( objFeature );

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
		objRate.setRates( objList );

		/*To set the guest count.*/
		GuestCountList objGuestCountList = new GuestCountList();	
		GuestCount objGuestCount = new GuestCount();

		objGuestCount.setAgeQualifyingCode( AgeQualifyingCode.CHILD );
		objGuestCount.setCount( 1 );
		objGuestCount.setAge( 11 );

		objGuestCountList.addGuestCount( objGuestCount );	

		objGuestCount = new GuestCount();
		objGuestCount.setAgeQualifyingCode( AgeQualifyingCode.ADULT );
		objGuestCount.setCount( 2 );

		/*To add guest count on the guest count list.*/
		objGuestCountList.addGuestCount( objGuestCount );

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
		objCreditCard.setExpirationDate( new Date() );

		CreditCardChoice_type0 objCardChoice_type0 = new CreditCardChoice_type0();
		objCardChoice_type0.setCardNumber( "XXXX_XXXX_XXXX_1234" );
		objCreditCard.setCreditCardChoice_type0 ( objCardChoice_type0 ) ;

		objGuaranteeAccepted.setGuaranteeCreditCard( objCreditCard );
		objGuaranteesAccepted.addGuaranteeAccepted( objGuaranteeAccepted );

		objGuarantee.setGuaranteesAccepted( objGuaranteesAccepted );

		/*To add the payment related information.*/
		Payment objPayment = new Payment();

		PaymentsAccepted objPaymentsAccepted = new PaymentsAccepted();

		PaymentType objPaymentType = new PaymentType();

		PaymentTypeChoice_type0 objChoice_type0 = new PaymentTypeChoice_type0();

		OtherPaymentType objOtherPaymentType = new OtherPaymentType();

		objOtherPaymentType.setType( "AX" );
		objChoice_type0.setOtherPayment( objOtherPaymentType );
		objPaymentType.setPaymentTypeChoice_type0( objChoice_type0 );
		objPaymentsAccepted.addPaymentType( objPaymentType );
		objPayment.setPaymentsAccepted( objPaymentsAccepted );

		/*To set the hotel reference .*/
		com.micros.reservation.ReservationServiceStub.HotelReference objHotelReference = new com.micros.reservation.ReservationServiceStub.HotelReference();
		objHotelReference.setHotelCode( "CASINO" );
		objHotelReference.setChainCode( "CHA" );

		/*To set the daily charge list.*/
		DailyChargeList objChargeList = new DailyChargeList();
		ChargesForTheDay objChargesForTheDay = new ChargesForTheDay();
		objChargesForTheDay.setPostingDate( new Date() );
		ChargeList objChargeList2 = new ChargeList();

		objChargeList2.setTotalCharges( 77 );
		Charge objCharge = new Charge();
		objCharge.setAmount( objAmount );
		objCharge.setDescription( "bike rides" );
		objChargeList2.addCharges( objCharge );

		objChargesForTheDay.setRoomRateAndPackages( objChargeList2 );
		objChargeList.addChargesForPostingDate( objChargesForTheDay );

		/*To add the profile related information.*/
		ResGuestList objGuestList = new ResGuestList();
		ResGuest objResGuest = new ResGuest();

		ProfileList objProfileList = new ProfileList();
		com.micros.reservation.ReservationServiceStub.Profile objProfile = new com.micros.reservation.ReservationServiceStub.Profile();

		com.micros.reservation.ReservationServiceStub.UniqueIDList objIdList = new com.micros.reservation.ReservationServiceStub.UniqueIDList();
		com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID1 = new com.micros.reservation.ReservationServiceStub.UniqueID();
		objUniqueID1.setType( com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL  );

		objUniqueID1.setString( "1234" );

		objIdList.addUniqueID( objUniqueID1 );
		objProfile.setProfileIDs( objIdList );

		ProfileChoice_type0 objChoice_type02 = new ProfileChoice_type0();

		/*To add the full name.*/
		com.micros.reservation.ReservationServiceStub.Customer objCustomer = new com.micros.reservation.ReservationServiceStub.Customer();
		com.micros.reservation.ReservationServiceStub.PersonName objName = new com.micros.reservation.ReservationServiceStub.PersonName();

		objName.setFirstName( "Mike " );
		objName.setLastName( "Haggar " );
		objCustomer.setPersonName( objName );
		objChoice_type02.setCustomer( objCustomer );
		objProfile.setProfileChoice_type0( objChoice_type02 );

		/*To add the address information.*/
		NameAddressList objAddressList = new NameAddressList();
		com.micros.reservation.ReservationServiceStub.NameAddress objNameAddress = new com.micros.reservation.ReservationServiceStub.NameAddress();

		objNameAddress.setCountryCode( "US" );
		objAddressList.addNameAddress( objNameAddress );
		objProfile.setAddresses( objAddressList );

		objProfileList.addProfile( objProfile );
		objResGuest.setProfiles( objProfileList );

		TransportInfo objTransportInfo = new TransportInfo();

		objTransportInfo.setCarrierCode( "AA" );
		objTransportInfo.setId( "421" );
		objTransportInfo.setLocationCode( "HEA" );
		objTransportInfo.setTime( OWSUtility.getCalender() );

		objResGuest.setArrivalTransport( objTransportInfo );

		objTransportInfo = new TransportInfo();
		objTransportInfo.setCarrierCode( "DE" );
		objTransportInfo.setId( "421" );
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

		objCommentList.addComment( objComment );

		/*To set the hotel reservation and dependent object into response.*/
		objRoomStay.setComments( objCommentList );
		objRoomStay.setExpectedCharges( objChargeList );
		objRoomStay.setHotelReference( objHotelReference );
		objRoomStay.setPayment( objPayment );

		objRoomStay.setGuestCounts( objGuestCountList );
		objRoomStay.setTimeSpan( objTimeSpan );
		objRateList.addRoomRate( objRate );
		objRatePlanList.addRatePlan( objPlan );

		objRoomStay.setGuarantee( objGuarantee );
		objRoomStay.setRoomRates( objRateList );
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

		objFetchRoomStatusRequest = ( FetchRoomStatusRequest)OWSUtility.covertToStreamObject( xmlRequestValue );

		FetchRoomStatusResponse objFetchRoomStatusResponse = new FetchRoomStatusResponse();

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " FetchRoomStatusResponse Object created " );

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.RoomStatus[] objRoomStatu =new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.RoomStatus[2] ;

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.RoomStatus objRoomStatus = new 	com.micros.ows.resvadvanced.ResvAdvancedServiceStub.RoomStatus();

		objRoomStatus.setRoomStatus( "IP" );
		objRoomStatus.setFrontOfficeStatus( "VAC" );
		objRoomStatus.setOccupancyCondition( "2");
		objRoomStatus.setHouseKeepingStatus( "Inspected");
		objRoomStatus.setRoomNumber( "1000" );

		objRoomStatus.setRoomType( objFetchRoomStatusRequest.getRoomType() );

		objRoomStatu[0]= objRoomStatus;

		// adding second room status details
		objRoomStatus = new 	com.micros.ows.resvadvanced.ResvAdvancedServiceStub.RoomStatus();

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
		objReuest = ( AssignRoomRequest )OWSUtility.covertToStreamObject( xmlRequestValue );

		/*To create the assign room response object.*/
		objAssignRoomResponse = new AssignRoomResponse();

		/*To set the result status*/
		GDSResultStatus objResultStatus = new GDSResultStatus();
		objResultStatus.setResultStatusFlag( com.micros.reservation.ReservationServiceStub.ResultStatusFlag.SUCCESS );
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

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.InvoiceResponse objInvoiceResponse  = null;
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.InvoiceRequest	objReuest = null;
		double subTotal = 0;

		/* Covert xml into object. */
		objReuest = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.InvoiceRequest() ;
		objReuest = ( com.micros.ows.resvadvanced.ResvAdvancedServiceStub.InvoiceRequest)OWSUtility.covertToStreamObject( xmlRequestValue );

		objInvoiceResponse = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.InvoiceResponse();

		/*To set the result status.*/
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ResultStatus objResultStatus = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ResultStatus();
		objResultStatus.setResultStatusFlag( com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ResultStatusFlag.SUCCESS );

		/*To set the bill header with all values in bill header list.*/
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.BillHeader objBillHeader = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.BillHeader();
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.NameAddress objNameAddress = new  com.micros.ows.resvadvanced.ResvAdvancedServiceStub.NameAddress();

		objNameAddress.setAddressType( "2640 Golden Gate Parkway" );
		objNameAddress.setCountryCode( "IN" );
		objBillHeader.setAddress( objNameAddress );

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.NativeName objNativeName = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.NativeName();

		objNativeName.setFirstName( "tammy" );
		objNativeName.setLastName( "konopik" );;
		objBillHeader.setName( objNativeName );

		/* Sets confirmation number and its type.*/
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueIDList();

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ReservationRequestBase objBase =objReuest.getReservationRequest();
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueID[] objIds = objBase.getReservationID().getUniqueID();
		confirmationNumber =  objIds[0].getString();			

		objIds = objUniqueIDList.getUniqueID();

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueID objUniqueID = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueID();
		objUniqueID.setString( confirmationNumber );
		objUniqueID.setType( com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueIDType.EXTERNAL );
		objUniqueID.setSource( "PMS_ID" );

		objUniqueIDList.addUniqueID( objUniqueID );

		objBillHeader.setProfileIDs( objUniqueIDList );

		objUniqueID = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueID();
		objUniqueID.setString( "2323" );
		objUniqueID.setSource( "OPERA" );
		objUniqueID.setType( com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueIDType.INTERNAL );

		objBillHeader.setBillNumber( objUniqueID );

		/*set bill items into bill header.*/
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.BillItem objBillItem = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.BillItem ();
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Amount objAmount = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Amount();
		objAmount.set_double( 40 );
		objBillItem.setAmount( objAmount );
		objBillItem.setVatCode( objUniqueID );
		objBillItem.setDate( new Date() );
		objBillItem.setDescription( "Transient Room Revenue" );

		subTotal = objAmount.get_double() + subTotal;

		objBillHeader.addBillItems( objBillItem );
		objBillItem = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.BillItem ();
		objAmount =  new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Amount();

		objAmount.set_double( 100 );
		objBillItem.setAmount( objAmount );
		objBillItem.setVatCode( objUniqueID );
		objBillItem.setDate( new Date() );
		objBillItem.setDescription( "Lobby Bar Beverage" );

		objBillHeader.addBillItems( objBillItem );
		subTotal = objAmount.get_double() + subTotal;

		objBillItem = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.BillItem ();
		objAmount =  new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Amount();

		objAmount.set_double( 130 );
		objBillItem.setAmount( objAmount );
		objBillItem.setVatCode( objUniqueID );

		objBillItem.setDate( new Date() );
		objBillItem.setDescription( "Lobby Bar Food" );

		objBillHeader.addBillItems( objBillItem );
		subTotal = objAmount.get_double() + subTotal;

		/*set the surcharge and total amount in credit card surcharge list.*/
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CreditCardSurcharge objCardSurcharge = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CreditCardSurcharge();

		objAmount = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Amount();

		objAmount.set_double( 10 );		
		objCardSurcharge.setSurchargeAmount( objAmount  );
		subTotal = objAmount.get_double() + subTotal;

		objAmount = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Amount();
		objAmount.set_double( subTotal );		
		objCardSurcharge.setTotalBillAmount( objAmount );
		objBillHeader.addCreditCardSurcharges( objCardSurcharge );

		objInvoiceResponse.addInvoice( objBillHeader );	
		objInvoiceResponse.setResult( objResultStatus );

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToStreamXML( objInvoiceResponse );
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

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CheckOutResponse objCheckOutResponse  = null;
		CheckOutRequest	objCheckOutRequest = null;

		/* Covert xml into object. */
		objCheckOutRequest = new CheckOutRequest() ;	
		objCheckOutRequest =( CheckOutRequest ) OWSUtility.covertToStreamObject( xmlRequestValue );

		objCheckOutResponse = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CheckOutResponse();

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ResultStatus objResultStatus = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ResultStatus();
		objResultStatus.setResultStatusFlag( com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ResultStatusFlag.SUCCESS );

		/* Retrieve confirmation number from check out request instance. */
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ReservationRequestBase objRequestBase = objCheckOutRequest.getReservationRequest();
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueID[] objIds = objRequestBase.getReservationID().getUniqueID();
		confirmationNumber =  objIds[0].getString();

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckOutResponse ", " confirmation number is " + confirmationNumber );

		/* Sets confirmation number and its type. */
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueIDList();
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueID objUId = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueID();

		objUId.setString( confirmationNumber );
		objUId.setType( com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueIDType.EXTERNAL );

		objUniqueIDList.addUniqueID( objUId );

		/* Sets the unique identifier list with the reservation identifier. */
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CheckOutComplete objCheckOutComplete = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CheckOutComplete();
		objCheckOutComplete.setReservationID( objUniqueIDList );

		/*	List<InvoiceNumber> objInvoiceNumbers = objCheckOutComplete.getInvoiceNumber();
		InvoiceNumber objInvoiceNumber = new InvoiceNumber();
		objInvoiceNumber.setValue( "647" );
		objInvoiceNumbers.add( objInvoiceNumber );*/

		/*To set the full name.*/
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Profile objProfile = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Profile();

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ProfileChoice_type0 objChoice_type0 = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ProfileChoice_type0();

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Customer objCustomer = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Customer();

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.PersonName objPersonName = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.PersonName();

		objPersonName.setFirstName( "Frank" );
		objPersonName.setLastName( "Peter" );

		objCustomer.setPersonName( objPersonName );	
		objChoice_type0.setCustomer( objCustomer );

		objProfile.setProfileChoice_type0( objChoice_type0 );
		objCheckOutResponse.setProfile( objProfile );


		objCheckOutResponse.setResult( objResultStatus );
		objCheckOutResponse.setCheckOutComplete( objCheckOutComplete );	

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToStreamXML( objCheckOutResponse );
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

		CheckInResponse objCheckInResponse = null;
		CheckInRequest objCheckInRequest = null;
		String creditCardNumber = null;

		/*Covert xml into object.*/		
		objCheckInRequest = new CheckInRequest() ;	
		objCheckInRequest = ( CheckInRequest )OWSUtility.covertToStreamObject( xmlRequestValue );

		objCheckInResponse = new CheckInResponse();

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " check in response object created " );

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CheckInComplete objCheckInComplete = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CheckInComplete();

		/* Retrieve confirmation number from check in request instance. */
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ReservationRequestBase objRequestBase = objCheckInRequest.getReservationRequest();
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueID[] objIds = objRequestBase.getReservationID().getUniqueID();
		confirmationNumber =  objIds[0].getString();

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " confirmation number is " + confirmationNumber );

		/* Sets confirmation number and its type. */
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueIDList();
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueID objUId = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueID();
		objUId.setString( confirmationNumber );
		objUId.setType( com.micros.ows.resvadvanced.ResvAdvancedServiceStub.UniqueIDType.EXTERNAL );

		objUniqueIDList.addUniqueID( objUId );

		/* Sets the unique identifier list with the reservation identifier. */
		objCheckInComplete.setReservationID( objUniqueIDList );

		/* set credit card number. */
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Profile objProfile = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Profile();

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.NameCreditCardList objCardList = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.NameCreditCardList();
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.NameCreditCard objCard = new  com.micros.ows.resvadvanced.ResvAdvancedServiceStub.NameCreditCard();
		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CreditCardChoice_type0 objCardChoice_type0 = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.CreditCardChoice_type0();

		/* Retrieve credit card number from check in request instance. */
		creditCardNumber = objCheckInRequest.getCreditCardInfo().getCreditCard().getCreditCardChoice_type0().getCardNumber();

		if( creditCardNumber != null ) {

			objCardChoice_type0.setCardNumber( creditCardNumber );
		}

		objCard.setCreditCardChoice_type0( objCardChoice_type0 );

		objCard.setSeriesCode( "SSDDD5555DF" );
		objCardList.addNameCreditCard( objCard );
		objProfile.setCreditCards( objCardList );

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ProfileChoice_type0 objChoice_type0 = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ProfileChoice_type0();

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Customer objCustomer = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Customer();

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.PersonName objPersonName = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.PersonName();

		objPersonName.setFirstName( "John" );
		objPersonName.setLastName( "Peter" );

		objCustomer.setPersonName( objPersonName );	
		objChoice_type0.setCustomer( objCustomer );

		objProfile.setProfileChoice_type0( objChoice_type0 );
		objCheckInResponse.setProfile( objProfile );

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Room objRoom = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.Room();
		objRoom.setRoomNumber( "783" );

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.RoomType objRoomType = new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.RoomType();
		objRoomType.setRoomTypeCode( "POQB" );
		objRoomType.setFeature( "KING - SIZE" );

		objRoom.setRoomType( objRoomType );
		objCheckInComplete.setRoom( objRoom );

		/* Sets the check in response with the instance of check in complete. */
		objCheckInResponse.setCheckInComplete( objCheckInComplete );

		com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ResultStatus objRStatus =new com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ResultStatus();

		/* Set the status to the check in response. */
		objRStatus.setResultStatusFlag( com.micros.ows.resvadvanced.ResvAdvancedServiceStub.ResultStatusFlag.SUCCESS );
		objCheckInResponse.setResult( objRStatus );

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToStreamXML( objCheckInResponse );

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " Exit getXMLCheckInResponse method " );	

		return xmlOWSResponse;
	}

}
