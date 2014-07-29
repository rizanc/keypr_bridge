package com.micros.pms.parser;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.cloudkey.pms.request.*;
import com.cloudkey.pms.response.*;
import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.types.NormalizedString;
import org.apache.axis2.databinding.types.Time;

import com.cloudkey.commons.Availability;
import com.cloudkey.commons.OrderDetails;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.constant.ICloudKeyConstants;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.util.BaseConfigurationReader;
import com.micros.adv.reservation.ResvAdvancedServiceStub;
import com.micros.adv.reservation.ResvAdvancedServiceStub.BillHeader;
import com.micros.adv.reservation.ResvAdvancedServiceStub.BillItem;
import com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInComplete;
import com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutComplete;
import com.micros.adv.reservation.ResvAdvancedServiceStub.FetchRoomStatusRequest;
import com.micros.adv.reservation.ResvAdvancedServiceStub.FetchRoomStatusResponse;
import com.micros.adv.reservation.ResvAdvancedServiceStub.NameCreditCardList;
import com.micros.adv.reservation.ResvAdvancedServiceStub.Room;
import com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID;
import com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList;
import com.micros.availability.AvailabilityServiceStub.Authentication_type0;
import com.micros.availability.AvailabilityServiceStub.CalendarDailyDetail;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarRequest;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarResponse;
import com.micros.availability.AvailabilityServiceStub.RoomTypeInventory;
import com.micros.availability.AvailabilityServiceStub.UserCredentials_type0;
import com.micros.information.InformationStub;
import com.micros.information.InformationStub.ArrayOfEmail;
import com.micros.information.InformationStub.ArrayOfTextElement;
import com.micros.information.InformationStub.FacilityInfoTypeGuestRoomsGuestRoom;
import com.micros.information.InformationStub.HotelInformationResponseHotelInformation;
import com.micros.information.InformationStub.ParagraphChoice_type0;
import com.micros.information.InformationStub.RestaurantsTypeRestaurant;
import com.micros.information.InformationStub.RestaurantsTypeRestaurantCuisine;
import com.micros.information.InformationStub.TextElement;
import com.micros.meeting.MeetingRoomServiceStub.AvailableProperty;
import com.micros.meeting.MeetingRoomServiceStub.FacilityInfoType;
import com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityRequest;
import com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityResponse;
import com.micros.meeting.MeetingRoomServiceStub.MeetingRoomsType;
import com.micros.membership.MembershipServiceStub;
import com.micros.membership.MembershipServiceStub.AwardPointsInfo;
import com.micros.membership.MembershipServiceStub.FetchMemberPointsRequest;
import com.micros.membership.MembershipServiceStub.FetchMemberPointsResponse;
import com.micros.membership.MembershipServiceStub.StayPointsInfo;
import com.micros.name.NameServiceStub.FetchNameIdByMembershipRequest;
import com.micros.name.NameServiceStub.FetchNameIdByMembershipResponse;
import com.micros.name.NameServiceStub.NameIdNameAddress;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.transport.MicrosMessageTransport;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import com.micros.pms.util.TransIdGenerator;
import com.micros.reservation.ReservationServiceStub;
import com.micros.reservation.ReservationServiceStub.AssignRoomRequest;
import com.micros.reservation.ReservationServiceStub.AssignRoomResponse;
import com.micros.reservation.ReservationServiceStub.EndPoint;
import com.micros.reservation.ReservationServiceStub.FetchBookingFilters;
import com.micros.reservation.ReservationServiceStub.FutureBookingSummaryRequest;
import com.micros.reservation.ReservationServiceStub.FutureBookingSummaryRequestChoice_type1;
import com.micros.reservation.ReservationServiceStub.FutureBookingSummaryResponse;
import com.micros.reservation.ReservationServiceStub.GuestCount;
import com.micros.reservation.ReservationServiceStub.HotelReference;
import com.micros.reservation.ReservationServiceStub.HotelReservation;
import com.micros.reservation.ReservationServiceStub.ModifyBookingRequest;
import com.micros.reservation.ReservationServiceStub.ModifyBookingResponse;
import com.micros.reservation.ReservationServiceStub.NameAddress;
import com.micros.reservation.ReservationServiceStub.NameCreditCard;
import com.micros.reservation.ReservationServiceStub.PersonName;
import com.micros.reservation.ReservationServiceStub.Profile;
import com.micros.reservation.ReservationServiceStub.ResGuest;
import com.micros.reservation.ReservationServiceStub.ReservationComment;
import com.micros.reservation.ReservationServiceStub.ReservationStatusType;
import com.micros.reservation.ReservationServiceStub.RoomFeature;
import com.micros.reservation.ReservationServiceStub.RoomStay;
import com.micros.reservation.ReservationServiceStub.RoomType;
import com.micros.reservation.ReservationServiceStub.TimeSpan;
import com.micros.reservation.ReservationServiceStub.TimeSpanChoice_type0;
import org.apache.commons.lang3.NotImplementedException;

/**
 * This class is used to process the web service request and return the responseO
 * to the calling application. This class is used to receive the request and
 * convert request into micros specific format. It will receive the response
 * from the MICROS and will convert the response into keypr specific format.
 * 
 * This file was modified to give server time out error to the keypr when the
 * property management system does not give any response within specified time interval.
 * 
 * @author niveditat
 * @modified vinayk2
 * 
 */
public class MicrosPMSMessageParser implements IParserInterface {

	@Override
	public CheckInResponse guestCheckIn( CheckInRequest checkInRequest ) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, "guestCheckIn "," Enter in checkin method. ");

		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInRequest objCheckInRequest = null;
		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInResponse objCheckInResponse = null;

		ResvAdvancedServiceStub objAdvancedServiceStub = null;

		CheckInResponse objResponse = null;

		try {

			String endPointUrl = ParserConfigurationReader.getProperty( IMicrosConstants.ADV_RESERVATION_URL);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn ", " AdvReservation Service Url " + endPointUrl );

			objAdvancedServiceStub = new ResvAdvancedServiceStub( endPointUrl );

			/* To set the ogHeader. */ 
			/*	( NOTE : For now OG Header take confirmation number as the transaction id ) */
			com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeader objHeader = new com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeader();

			/* To set the confirmation number as transactionID. */
			objHeader.setTransactionID( String.valueOf(TransIdGenerator.getTransactionId() ));
			objHeader.setTimeStamp( AdapterUtility.getCalender() );

			com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint objEndPoint = new com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint();
			String entityId = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORIGIN_ID);
			objEndPoint.setEntityID( entityId );

			String systemType = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
			objEndPoint.setSystemType( systemType );

			/* To set the origin . */
			objHeader.setOrigin(objEndPoint);

			objEndPoint = new com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint();
			String destEntityId = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_DESTINATION_ID);
			objEndPoint.setEntityID( destEntityId );

			String destSystemType = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORI_DEST_TYPE);
			objEndPoint.setSystemType( destSystemType);

			objHeader.setDestination(objEndPoint);


			/* To set the OGHeader into OGHeaderE. */
			com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeaderE objHeaderE = new com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeaderE();
			objHeaderE.setOGHeader(objHeader);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn ", " Header Created ");

			//timeUnitCounter = Integer.parseInt( BaseConfigurationReader.getProperty( ICloudKeyConstants.SERVER_TIME_OUT ) );
			//threadTime = Integer.parseInt( BaseConfigurationReader.getProperty( ICloudKeyConstants.SERVER_THREAD_TIME ) );

			objCheckInRequest = getCheckInRequestObject( checkInRequest);


			objCheckInResponse = objAdvancedServiceStub.checkIn(objCheckInRequest, objHeaderE);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn ", " Response received from real OWS " );

			objResponse = getCheckInResponseObject( objCheckInResponse );

		}
		catch ( AxisFault axe) {

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " guestCheckIn ", axe );
		}
		catch (RemoteException rme ){

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " guestCheckIn ", rme );
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn ", " Exit guestCheckIn method." );

		return objResponse;
	}

	@Override
	public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," guestCheckOut ", " Enter in guestCheckOut method. ");

		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutRequest objCheckOutRequest = null;
		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutResponse objCheckOutResponse = null;

		ResvAdvancedServiceStub objAdvancedServiceStub = null;

		CheckOutResponse objResponse = null;

		try {

			String endPointUrl = ParserConfigurationReader.getProperty( IMicrosConstants.ADV_RESERVATION_URL);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut ", " AdvReservation Service Url " + endPointUrl );

			objAdvancedServiceStub = new ResvAdvancedServiceStub( endPointUrl );

			/* To set the ogHeader. */ 
			/*	( NOTE : For now OG Header take confirmation number as the transaction id ) */
			com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeader objHeader = new com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeader();

			/* To set the confirmation number as transactionID. */
			objHeader.setTransactionID(String.valueOf(TransIdGenerator.getTransactionId() ) );
			objHeader.setTimeStamp( AdapterUtility.getCalender() );

			com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint objEndPoint = new com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint();
			String entityId = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORIGIN_ID);
			objEndPoint.setEntityID( entityId );

			String systemType = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
			objEndPoint.setSystemType( systemType );

			/* To set the origin . */
			objHeader.setOrigin(objEndPoint);

			objEndPoint = new com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint();

			String destEntityId = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_DESTINATION_ID);
			objEndPoint.setEntityID( destEntityId );
			String destSystemType = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORI_DEST_TYPE);
			objEndPoint.setSystemType( destSystemType );

			objHeader.setDestination(objEndPoint);

			/* To set the OGHeader into OGHeaderE. */
			com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeaderE objHeaderE = new com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeaderE();
			objHeaderE.setOGHeader(objHeader);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut ", " Header Created ");

			objCheckOutRequest = getCheckOutRequestObject( checkOutRequest );

			objCheckOutResponse = objAdvancedServiceStub.checkOut(objCheckOutRequest, objHeaderE);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut ", " Response received from real OWS " );

			objResponse = getCheckOutResponseObject( objCheckOutResponse );
		}
		catch ( AxisFault axe) {

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " guestCheckOut ", axe );
		}
		catch (RemoteException rme ){

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " guestCheckOut ", rme );
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," guestCheckOut ", " Exit guestCheckIn method." );

		return objResponse;
	}

	@Override
	public SearchReservationResponse searchReservationData( SearchReservationRequest futureBookingSummaryRequest ) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," searchReservationData "," Enter searchReservationData method. ");

		com.micros.reservation.ReservationServiceStub.FutureBookingSummaryRequestE objFutureBookingSummaryRequestE = null;
		FutureBookingSummaryRequest objFutureBookingSummaryRequest = null;

		com.micros.reservation.ReservationServiceStub.FutureBookingSummaryResponseE objFutureBookingSummaryResponseE = null;
		FutureBookingSummaryResponse objResponse = null;

		SearchReservationResponse objSearchReservationResponse = null;
		com.micros.reservation.ReservationServiceStub objReservationServiceStub = null;

		try {

			String endPointUrl = ParserConfigurationReader.getProperty( IMicrosConstants.RESERVATION_URL);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " searchReservationData ", " Reservation Service Url " + endPointUrl );

			objReservationServiceStub = new ReservationServiceStub(endPointUrl);

		     ReservationServiceStub.OGHeaderE obhHeaderE = getFutureBookingSummaryRequestHeader();
		
			objFutureBookingSummaryRequestE = new com.micros.reservation.ReservationServiceStub.FutureBookingSummaryRequestE();			

			objFutureBookingSummaryRequest = getFutureBookingRequestObject(futureBookingSummaryRequest);
			objFutureBookingSummaryRequestE.setFutureBookingSummaryRequest(objFutureBookingSummaryRequest);

			objFutureBookingSummaryResponseE = objReservationServiceStub.futureBookingSummary(objFutureBookingSummaryRequestE, obhHeaderE);
			objResponse = objFutureBookingSummaryResponseE.getFutureBookingSummaryResponse();

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " searchReservationData ", " Response received from real OWS " );

			String responseStatus = objResponse.getResult().getResultStatusFlag().getValue();
			String responseCode = objResponse.getResult().getOperaErrorCode();

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " searchReservationData ", " Response Status " + responseStatus );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " searchReservationData ", " Response Code " + responseCode );

			objSearchReservationResponse = getFutureBookingResponseObject( objResponse );

		}
		catch ( AxisFault axe) {

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " searchReservationData ", axe );
		}
		catch (RemoteException rme ){

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " searchReservationData ", rme );
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," searchReservationData "," Exit searchReservationData method " );

		return objSearchReservationResponse;
	}

	private ReservationServiceStub.OGHeaderE getFutureBookingSummaryRequestHeader()
	{
		// Creates an instance of header
		com.micros.reservation.ReservationServiceStub.OGHeader objOGHeader = new com.micros.reservation.ReservationServiceStub.OGHeader();

		/*int transactionId = TransIdGenerator.getTransactionId();
		// Sets Transaction Identifier
		objOGHeader.setTransactionID( String.valueOf(transactionId ));

		// sets time stamp
		
		/*objOGHeader.setTimeStamp( AdapterUtility.getCalender() );
			 
			 com.micros.reservation.ReservationServiceStub.Authentication_type0 objAuthentication_type0 = new  com.micros.reservation.ReservationServiceStub.Authentication_type0();
	        com.micros.reservation.ReservationServiceStub.UserCredentials_type0 objCredentials_type0 = new  com.micros.reservation.ReservationServiceStub.UserCredentials_type0();

	        objCredentials_type0.setUserName(IMicrosConstants.OWS_USER_NAME );
	        objCredentials_type0.setUserPassword(IMicrosConstants.OWS_USER_PASS);
	        objAuthentication_type0.setUserCredentials(objCredentials_type0);
	        objOGHeader.setAuthentication(objAuthentication_type0);

	        MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " searchReservationData ", "  Authentication UserCredentials Set  " );*/

			// prepares OGHeader
		 
		// creates origin end point of header.
		com.micros.reservation.ReservationServiceStub.EndPoint originEndPoint = new com.micros.reservation.ReservationServiceStub.EndPoint();

		String entityId = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORIGIN_ID);
		originEndPoint.setEntityID( entityId);

		String systemType = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
		originEndPoint.setSystemType( systemType );

		// creates destination end point of header.
		EndPoint destinEndPoint = new com.micros.reservation.ReservationServiceStub.EndPoint();
		String destEntityId = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_DESTINATION_ID);

		destinEndPoint.setEntityID( destEntityId );
		String destSystemType = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORI_DEST_TYPE);
		destinEndPoint.setSystemType( destSystemType);

		objOGHeader.setOrigin( originEndPoint );
		objOGHeader.setDestination( destinEndPoint );

		com.micros.reservation.ReservationServiceStub.OGHeaderE objE = new com.micros.reservation.ReservationServiceStub.OGHeaderE();
		objE.setOGHeader( objOGHeader );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " searchReservationData ", " Header Created ");

		return objE;
	}
	/**
	 * 
	 * @param objResponse
	 * @return
	 */
	private SearchReservationResponse getFutureBookingResponseObject( FutureBookingSummaryResponse objResponse ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFutureBookingResponseObject ", " Enter getFutureBookingResponseObject method." );

		Reservation objReservation = null;

		/* Populate response into Reservation instance */
		SearchReservationResponse objSearchReservationResponse = new SearchReservationResponse();
		List<Reservation> objLReservations = objSearchReservationResponse.getReservationList();

		if( objLReservations == null ) {

			objLReservations = new ArrayList<Reservation>();
		}

		String responseStatus = objResponse.getResult().getResultStatusFlag().getValue();

		if( responseStatus.equalsIgnoreCase( IMicrosConstants.RESPONSE_SUCCESS )) {

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Response is Success From PMS OWS" );

			com.micros.reservation.ReservationServiceStub.ArrayOfHotelReservation objArrayOfHotelReservation = objResponse.getHotelReservations();

			HotelReservation[] objHotelReservations = objArrayOfHotelReservation.getHotelReservation();

			int noOfReservationsFound = objHotelReservations.length;

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Number Of Reservations Found " + noOfReservationsFound );

			for( int index = 0; index < noOfReservationsFound; index++ ) {

				HotelReservation objHotelReservation = objHotelReservations[index];

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Iterating Reservation Number " + (index + 1 ) );

				objReservation = new Reservation();
				
				/*ReservationActionType objReservationActionType = objHotelReservation.getReservationAction();
				if( objReservationActionType != null ) {
					
					String reservationAction = objReservationActionType.getValue();
					
					if( reservationAction != null ) {
						
						objReservation.setReservationAction(reservationAction);
						MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Reservation Action " + reservationAction);
					}
					
				}*/
				
				String sourceCode = objHotelReservation.getSourceCode();
				objReservation.setReservationSource( sourceCode );
				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Source Code " + sourceCode );

				ReservationStatusType objReservationStatusType = objHotelReservation.getReservationStatus();
				String reservationStatus = objReservationStatusType.getValue();
				
				objReservation.setReservationStatus(reservationStatus);
				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Reservation Status " + reservationStatus );

				String groupName = objHotelReservation.getGroup();
				objReservation.setGroup( groupName );
				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Group Name Set " + groupName );

				Time objTime = objHotelReservation.getCheckOutTime();
				//objReservation.setCheckoutDate( objTime.toString());
				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Check Out Time  " + objTime.toString() );
				
				//com.micros.reservation.ReservationServiceStub.ArrayOfPreference objArrayPreference = objHotelReservation.getPreferences();
				//Preference[] objPrefenceArray = objArrayPreference.getPreference();
				//objPrefenceArray[0].get

				com.micros.reservation.ReservationServiceStub.ArrayOfUniqueID arrayUniqueId = objHotelReservation.getUniqueIDList();
				
				if( arrayUniqueId != null ) {
					
					com.micros.reservation.ReservationServiceStub.UniqueID objUArray[] = arrayUniqueId.getUniqueID();
					
					if( objUArray != null ){
						
						int noOfUniqueId = objUArray.length;
						MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Number of Id " + noOfUniqueId );
						
						for(com.micros.reservation.ReservationServiceStub.UniqueID uniID: objUArray) {
							
							String source = uniID.getSource();
							if (source != null ) {
								
								if(source.equalsIgnoreCase( IMicrosConstants.RESERVATION_ID )) {
									
									String idValue = uniID.getString();
									
									objReservation.setPmsId(idValue);
									objReservation.setConfirmationNumber(idValue);
								}
							}
							
						}
					}
					
				}
				
				com.micros.reservation.ReservationServiceStub.ReservationActionType objReservationAct = objHotelReservation.getReservationAction();
				if( objReservationAct != null ){
					
					String resActionType = objReservationAct.getValue();
					if(resActionType != null ){
						
						objReservation.setReservationAction(resActionType);
					}
				}
				
				com.micros.reservation.ReservationServiceStub.ArrayOfResGuest objArrayOfResGuest = objHotelReservation.getResGuests();
				ResGuest[] objResGuest =  objArrayOfResGuest.getResGuest();

				int noOfGuestStaying = objResGuest.length;
				objReservation.setNumberOfGuests( noOfGuestStaying );
				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Number Of Guest Staying " + noOfGuestStaying );

				for( int iterator = 0; iterator < noOfGuestStaying; iterator++ ) {

					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Iterating Guest Info for Guest " + (iterator + 1) );

					ResGuest objRGuest = objResGuest[iterator];
					Time arrivalTime = objRGuest.getArrivalTime();
					Time departureTime = objRGuest.getDepartureTime();
					if(arrivalTime != null) {

						objReservation.setArrivalTime( arrivalTime.toString() );
						MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Arrival Time " + arrivalTime.toString() );
					}

					if( departureTime != null){

						objReservation.setDepartureTime( departureTime.toString() );
						MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Departure Time " + departureTime.toString() );
					}

					com.micros.reservation.ReservationServiceStub.ArrayOfProfile arrayOfProfile = objRGuest.getProfiles();
					Profile[] objProfiles = arrayOfProfile.getProfile();

					int noOfProfiles = objProfiles.length;
					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Number Of Profile " + noOfProfiles );

					for( int profileIndex = 0; profileIndex < noOfProfiles; profileIndex++ ) {

						Profile objProfile = objProfiles[profileIndex];
						com.micros.reservation.ReservationServiceStub.ArrayOfNameAddress objAddress = objProfile.getAddresses();
						
						NameAddress[] objNameAdress= objAddress.getNameAddress();
						int noOfNameAddress = objNameAdress.length;
						
						MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Number of Name Addresses " + noOfNameAddress );

						for(int nmAddrIndex = 0 ; nmAddrIndex < noOfNameAddress; nmAddrIndex++ ) {

							NameAddress objNmAddress = objNameAdress[nmAddrIndex];
							String address = "";
							
							String[] addressArr = objNmAddress.getAddressLine();
							
							if( addressArr != null ){

								for( int stIndex = 0 ; stIndex<addressArr.length; stIndex++ ) {

									address = address + " " +addressArr[stIndex];
								}
							}

							MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Address Line " + address );

							String stateProv = objNmAddress.getStateProv();

							if(stateProv != null){

								address = address + "," + stateProv;
							}

							String cityName = objNmAddress.getCityName();

							if( cityName != null){

								address = address + "," + cityName;
							}

							String countryCode = objNmAddress.getCountryCode();

							if(countryCode != null){
								address = address + "," + countryCode;
							}

							objReservation.setAddress( address );
							MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " CompletAdddress " + address );

						} //end name address for iterator block

						com.micros.reservation.ReservationServiceStub.ArrayOfNameCreditCard objArrayOfNameCreditCard = objProfile.getCreditCards();

						if( objArrayOfNameCreditCard != null ) {

							NameCreditCard[] objArrayNameCreditCard = objArrayOfNameCreditCard.getNameCreditCard();

							for( int creditCardIndex = 0; creditCardIndex < objArrayNameCreditCard.length; creditCardIndex ++ ){

								NameCreditCard objNameCreditCard = objArrayNameCreditCard[creditCardIndex ];

								if ( objNameCreditCard!= null) {

									String cardCode = objNameCreditCard.getCardCode();
									String cardHolderName = objNameCreditCard.getCardHolderName();

									MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Credit card number " + cardCode );
									MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Credit holder name " + cardHolderName );
									
									if( cardCode != null ){

										objReservation.setCreditCardNumber(cardCode);
									}
								}

							} 
						}
						else {

							MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " No CreditCard Information" );
						}// end credit card block
						com.micros.reservation.ReservationServiceStub.ArrayOfNameEmail objArrayOfNameEmail = objProfile.getEMails();

						if ( objArrayOfNameEmail != null ){

							com.micros.reservation.ReservationServiceStub.NameEmail[] objNameEmailArray = objArrayOfNameEmail.getNameEmail();

							for( int nameEmailIndex = 0; nameEmailIndex < objNameEmailArray.length; nameEmailIndex++ ) {

								com.micros.reservation.ReservationServiceStub.NameEmail objNameEmail = objNameEmailArray[nameEmailIndex];
								String nameEmail = objNameEmail.getString();
								
								MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Email is " + nameEmail);
								objReservation.setEmail(nameEmail);
								
								if( objNameEmail != null ){

									String emailFormat = objNameEmail.getEmailFormat();
									String emailType = objNameEmail.getEmailType();

									MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Email format is " + emailFormat);
									MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Email Type is " + emailType);
								}

							}


						} // end name email block

						com.micros.reservation.ReservationServiceStub.ArrayOfNamePhone objArrayNamePhone = objProfile.getPhones();

						if( objArrayNamePhone!= null ){

							com.micros.reservation.ReservationServiceStub.NamePhone[] objNamePhoneArray = objArrayNamePhone.getNamePhone();

							if( objNamePhoneArray != null ){

								for(int indexPhone = 0; indexPhone< objNamePhoneArray.length; indexPhone++ ) {

									com.micros.reservation.ReservationServiceStub.NamePhone objNamePhone = objNamePhoneArray[indexPhone];

									if( objNamePhone != null ) {

										String extension = objNamePhone.getExtension();

										if( extension == null) {

											extension = "";
										}

										com.micros.reservation.ReservationServiceStub.PhoneChoice_type0 objChoice = objNamePhone.getPhoneChoice_type0();

										if (objChoice != null ){

											String  phoneNumber = objChoice.getPhoneNumber();

											if( phoneNumber != null) {

												objReservation.setPhoneNumber(phoneNumber + "Ext " + extension);
												MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Phone Number is " + phoneNumber);
											}
										}
										else {

											MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " PhoneChoiceType_0 is null ");
										}

									}

								} // end phone iterator block
							}
						}
						else {

							MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " PhoneArrayName is Null ");
						}

						com.micros.reservation.ReservationServiceStub.ProfileChoice_type0 objProfileChoice_type0 = objProfile.getProfileChoice_type0();
						

						if( objProfileChoice_type0 != null ){

							com.micros.reservation.ReservationServiceStub.Company objCompany = objProfileChoice_type0.getCompany();

							if ( objCompany!= null ){

								String companyName = objCompany.getCompanyName();

								if( companyName != null ){

									objReservation.setCompany(companyName);
									MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Company Name is " + companyName );
								}
							}
							
							com.micros.reservation.ReservationServiceStub.Customer objCustomer = objProfileChoice_type0.getCustomer();

							if( objCustomer != null ){

								PersonName objPersonName = objCustomer.getPersonName();
								
								if( objPersonName != null) {

									String firstName = objPersonName.getFirstName();
									String[] middleName = objPersonName.getMiddleName();
									String midContent = "";
									
									if( middleName != null ) {

										for(int mIndex=0; mIndex<middleName.length; mIndex++) {

											if( middleName[mIndex] != null ) {

												midContent = midContent + middleName[mIndex];
											}

										}
									}

									String lastName = objPersonName.getLastName();

									if( lastName == null){

										lastName = "";
									}
									
									String customerName = firstName + " " + midContent + " " + lastName;

									if( customerName != null) {

										objReservation.setFullName(customerName);
									}
									
									if( firstName != null ){

										objReservation.setFirstName( firstName );
									}

									if( lastName != null ){

										objReservation.setLastName( lastName);
									}

								}

								else {

									MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Person name is null " );
								}
							}
							else {

								MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Customer is null " );
							}
						}

					} // end profile iterator block

				} // end Guest iterator block 
				
				{ // reservation room allocation list block begin
					
					List<ReservationRoomAllocation> objResvRoomAllocationList = objReservation.getReservationRoomAllocationList();
					
					if( objResvRoomAllocationList == null ){
						
						 objResvRoomAllocationList = new ArrayList<ReservationRoomAllocation>();
						 System.out.println("Create new List of ReservatinRoomAllocation");
						
					}
					
					// Creates an instance of ReservationRoom Allocation
					ReservationRoomAllocation objReservationRoomAllocation = null;
					
					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Enter RoomStay block " );

					com.micros.reservation.ReservationServiceStub.ArrayOfRoomStay objArrayRoomStays = objHotelReservation.getRoomStays();
					RoomStay[] objRoomStay = objArrayRoomStays.getRoomStay();

					int noOfRoomStay = objRoomStay.length;
					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Number Of RoomStay Element is " + noOfRoomStay );
					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Number Of ReservationRoomAllocation Object " + noOfRoomStay );
					
					for( int roomDetailsIndex = 0; roomDetailsIndex < noOfRoomStay; roomDetailsIndex++ ){

						objReservationRoomAllocation = new ReservationRoomAllocation();
						
						RoomStay objStay = objRoomStay[roomDetailsIndex];
						
						if( objStay != null ) {
							
							com.micros.reservation.ReservationServiceStub.ArrayOfRoomType objArrRoomType = objStay.getRoomTypes();
							if( objArrRoomType != null) {
								
								RoomType[] arrayRoomType = objArrRoomType.getRoomType();
								
								if( arrayRoomType != null) {
									
									//objReservationRoomAllocation = new ReservationRoomAllocation();
									
									com.cloudkey.commons.RoomType objRoomType = null;
									
									for(int roomIndex = 0; roomIndex<arrayRoomType.length; roomIndex++ ) {

										
										objRoomType = new com.cloudkey.commons.RoomType();
										
										RoomType objRoomType1 = arrayRoomType[roomIndex];
										if( objRoomType1 != null ){
											
											String[] roomNumber = objRoomType1.getRoomNumber();
											if(roomNumber != null ){
												
												int noOfroom = roomNumber.length;
												for(int j=0; j<noOfroom;j++){
													
													objReservationRoomAllocation.setRoomNo( Integer.parseInt(roomNumber[j]));
												}
											}
											String roomFeatures = objRoomType1.getFeature();//room type features
											
											com.micros.reservation.ReservationServiceStub.Paragraph objPra = objRoomType1.getRoomTypeDescription();
											
											if( objPra != null) {
												
												com.micros.reservation.ReservationServiceStub.ParagraphChoice_type0[] paraChoice = objPra.getParagraphChoice_type0();
												String desc = "";
												
												 if (paraChoice != null) {
													 
													 for(int inPar=0; inPar<paraChoice.length; inPar++){

															desc = desc + paraChoice[inPar].getText();
														}
												 }
												 objRoomType.setDescription(desc);
											}
											
											if( roomFeatures != null) {
												
												objRoomType.setFeatures(roomFeatures);
												
											}
											
											String roomStatus = objRoomType1.getRoomServiceStatus();//room Status
											String roomCode = objRoomType1.getRoomTypeCode();
											if( roomCode != null ){
												
												objRoomType.setCode(roomCode);
											}
											
										}//end room type block
										
										//String roomStatus = objRoomType1.getRoomStatus();

									}// add room type to roomallocation
									
									objReservationRoomAllocation.setRoomType(objRoomType);	
								}
								
							}
							{// block to add room rate begins...
								
								com.micros.reservation.ReservationServiceStub.ArrayOfRoomRate objArrayOfRoomRate = objStay.getRoomRates();
								
								if(objArrayOfRoomRate != null ) {
									
									com.micros.reservation.ReservationServiceStub.RoomRate[] objRoomRates = objArrayOfRoomRate.getRoomRate();
									
									com.cloudkey.commons.RoomRate  objCloudRoomRate = null;
									
									List<com.cloudkey.commons.RoomRate> objRoomRateColections = objReservationRoomAllocation.getRoomRateList();
									
									if( objRoomRateColections == null) {
										
										objRoomRateColections = new ArrayList<com.cloudkey.commons.RoomRate>();
									}
									 
									
									for( int indexOfRoomRate = 0; indexOfRoomRate< objRoomRates.length; indexOfRoomRate++) {
										
										objCloudRoomRate = new com.cloudkey.commons.RoomRate();
										
										com.micros.reservation.ReservationServiceStub.RoomRate objRate = objRoomRates[indexOfRoomRate];
										
										if(objRate != null){
											 
											Date effectiveDate = objRate.getEffectiveDate();
											Date expirationDate = objRate.getExpirationDate();
											String planCode = objRate.getRatePlanCode();
											com.micros.reservation.ReservationServiceStub.Amount objAmout = objRate.getTotal();
										    double totalAmt = objAmout.get_double();
										    
										    if( effectiveDate != null){
										    	
										    	objCloudRoomRate.setEffectiveDate(String.valueOf(effectiveDate));
										    }
										    if( expirationDate != null ){
										    	
										    	objCloudRoomRate.setExpirationDate( String.valueOf(expirationDate));
										    }
										    if(planCode != null ){
										    	
										    	objCloudRoomRate.setPlanCode( planCode);
										    }
										    if( totalAmt != 0.0){
										    	 
										    	objCloudRoomRate.setBaseAmount( totalAmt);
										    	
										    }
											
										}
										
										objRoomRateColections.add(objCloudRoomRate);//must be the last line of the for loop
									}
									
									objReservationRoomAllocation.setRoomRateList(objRoomRateColections);
									
								}
							}// block to add room rate ends.....

						}
						
						objResvRoomAllocationList.add(objReservationRoomAllocation);
					}
					
					objReservation.setReservationRoomAllocationList(objResvRoomAllocationList);
				} // reservation room allocation list block ends

			
			} // end reservation iterator block

			objLReservations.add(objReservation);
			
			objSearchReservationResponse.setReservationList( objLReservations );
			objSearchReservationResponse.setStatus( objResponse.getResult().getResultStatusFlag().getValue() );
			objSearchReservationResponse.setErrorMessage( "OK");


		}
		else {


			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject  ", " Response is Failure From PMS OWS " );
			objSearchReservationResponse.setReservationList( objLReservations );
			objSearchReservationResponse.setStatus( objResponse.getResult().getResultStatusFlag().getValue() );
			objSearchReservationResponse.setErrorMessage( objResponse.getResult().getOperaErrorCode() );


		}

		
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFutureBookingResponseObject ", " Exit getFutureBookingResponseObject method." );

		return objSearchReservationResponse;

	}

	/**
	 * This method accepts the client request for search the reservation and
	 * generate the request object to search the reservation details.
	 * 
	 * @param futureBookingSummaryRequest
	 * @return FutureBookingSummaryRequest
	 */
	private FutureBookingSummaryRequest getFutureBookingRequestObject( SearchReservationRequest futureBookingSummaryRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFutureBookingRequestObject ", " Enter getFutureBookingRequestObject method " );

		String confirmationNumber = futureBookingSummaryRequest.getConfirmationNumber();
		String creditCardNumber = futureBookingSummaryRequest.getCreditCardNumber();
		// String emailID = futureBookingSummaryRequest.getEmailId();

		String firstName = futureBookingSummaryRequest.getFirstName();
		String lastName = futureBookingSummaryRequest.getLastName();

		/**
		 * Creates an instance of FutureBookingSummaryRequest and populates the
		 * data members.
		 */
		FutureBookingSummaryRequest objFutureBookingSummaryRequest = new FutureBookingSummaryRequest();


		FetchBookingFilters objBookingFilters = new FetchBookingFilters();

		com.micros.reservation.ReservationServiceStub.HotelReference objHotelReference = null;

		objHotelReference = new com.micros.reservation.ReservationServiceStub.HotelReference();

		String hotelCode = ParserConfigurationReader.getProperty( IMicrosConstants.HOTEL_CODE );
		String chainCode  = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFutureBookingRequestObject ", " Hotel Code " + hotelCode );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFutureBookingRequestObject ", " Chain Code " + chainCode );

		objHotelReference.setChainCode( chainCode );
		objHotelReference.setHotelCode(hotelCode);
		objHotelReference.setString( IMicrosConstants.EMPTY_STRING);

		objBookingFilters.setHotelReference(objHotelReference);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFutureBookingRequestObject ", " HotelReference Set to the Additional Filter"  );

		//==============

		com.micros.reservation.ReservationServiceStub.FutureBookingSummaryRequestChoice_type0 objChoice_type0 = null;
		objChoice_type0 = new com.micros.reservation.ReservationServiceStub.FutureBookingSummaryRequestChoice_type0();
		objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type0(objChoice_type0);

		FutureBookingSummaryRequestChoice_type1 obChoice_type1 = null;
		obChoice_type1 = new FutureBookingSummaryRequestChoice_type1();
		objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type1(obChoice_type1);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFutureBookingRequestObject ", " objChoice_type0 and objChoice_type1 added to Additional Filter " );
		//===============

		/* Sets confirmation number to the request */

		if ( confirmationNumber != null ) {

			com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();

			objUniqueID.setType(com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL);
			objUniqueID.setString(confirmationNumber);

			objBookingFilters.setConfirmationNumber(objUniqueID);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFutureBookingRequestObject ", " Confirmation Number Set " + confirmationNumber );
		}

		objFutureBookingSummaryRequest.setAdditionalFilters(objBookingFilters);
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFutureBookingRequestObject ", " Additional Filter added to the Request Object " );

		/* Set the credit card number . */
		if ( creditCardNumber != null ) {

			final FutureBookingSummaryRequestChoice_type1 objFuChoice_type01 = new FutureBookingSummaryRequestChoice_type1();
			objFuChoice_type01.setCreditCardNumber( creditCardNumber );

			objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type1( objFuChoice_type01 );

		}

		if ( firstName != null ) { 

			objFutureBookingSummaryRequest.setFirstName( firstName );
		}

		if ( lastName != null ) {

			objFutureBookingSummaryRequest.setLastName( lastName );
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, "getFutureBookingRequestObject", " Exit getFutureBookingRequestObject method " );

		return objFutureBookingSummaryRequest;

	}

	/**
	 * This method is used to generate the checkin response by populating the
	 * response object with simulator response.
	 * 
	 * @param objResponse
	 * @return CheckInResponse
	 */
	private CheckInResponse getCheckInResponseObject( com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInResponse objResponse ) {

		// Note : rate List not found in xsd  . objResponse contains - profile , checkin compltete and result.

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckInResponseObject ", " Enter in getCheckInResponseObject method." );

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

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckInResponseObject ", " ResultStatus is " + status );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckInResponseObject ", " ErrorCode is  " +  objResponse.getResult().getOperaErrorCode() );

		CheckInComplete objCheckInComplete = objResponse.getCheckInComplete();

		com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = objCheckInComplete.getReservationID();
		com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID[] arrUniqueIDs = objUniqueIDList.getUniqueID();

		/*To set the confirmation number.*/
		for( com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID objUniqueID : arrUniqueIDs ) {

			confirmationNumber = objUniqueID.getString();
			objReservation.setConfirmationNumber(confirmationNumber);

		}

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
		objRoomType.setDescription( IMicrosConstants.ROOM_DESCRIPTION );
		objRoomType.setFeatures( feature );


		objReservationRoomAllocation.setRoomNo( Integer.parseInt(roomNumber) );
		objReservationRoomAllocation.setRoomType( objRoomType );
		//		objReservationRoomAllocation.setRoomRateList( objRoomRateList );


		// Note :  checkin response has only 1 profile information.		

		com.micros.adv.reservation.ResvAdvancedServiceStub.Profile objProfile = objResponse.getProfile();
		NameCreditCardList objCardList = objProfile.getCreditCards();

		com.micros.adv.reservation.ResvAdvancedServiceStub.NameCreditCard[] arrNameCreditCard = objCardList.getNameCreditCard();

		for ( com.micros.adv.reservation.ResvAdvancedServiceStub.NameCreditCard objNameCreditCard : arrNameCreditCard ) { // To traverse name credit card.

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckInResponseObject  ", " Iterating NameCreditCard  Array." );

			objReservation.setCreditCardNumber( objNameCreditCard.getCreditCardChoice_type0().getCardNumber() );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckInResponseObject  ", " Credit Card Number is set." );
		} // End loop for name credit card.


		com.micros.adv.reservation.ResvAdvancedServiceStub.PersonName objPersonName = objProfile.getProfileChoice_type0().getCustomer().getPersonName();

		objStringBuffer = new StringBuffer();

		/* To set the first name and last name . */
		firstName = objPersonName.getFirstName();
		lastName = objPersonName.getLastName();


		if( firstName != null || lastName != null ) {

			if ( firstName != null ) {

				objStringBuffer.append( firstName );
				objReservation.setFirstName( firstName );
			}
			if ( lastName != null ) {

				objStringBuffer.append( " " + lastName );
				objReservation.setLastName( lastName );
			}

			objReservation.setFullName(objStringBuffer.toString());

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getCheckInResponseObject  "," Full Name is set." );

			objStringBuffer.setLength( IMicrosConstants.COUNT_ZERO );
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


		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckInResponseObject ", " Exit Profile." );	

		objCheckInResponse.setReservation( objReservation );


		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckInResponseObject "," Enter in getCheckInResponseObject method." );

		return objCheckInResponse;
	}

	/**
	 * This method accepts the client request for checkin method and generate
	 * the checkin request object to get checkout details.
	 * 
	 * @param checkInRequest
	 * @return CheckInRequest
	 */
	private com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInRequest getCheckInRequestObject( CheckInRequest checkInRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckInRequestObject ", " Enter in getCheckInRequestObject method" );

		String confirmationNumber = null;
		String creditCardNumber = null;

		/* To get the request parameters from the keypr client */
		confirmationNumber = checkInRequest.getReservation().getConfirmationNumber();
		creditCardNumber = checkInRequest.getReservation().getCreditCardNumber();


		/* To set request into the xsd classes. */
		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInRequest objCheckInRequest = new com.micros.adv.reservation.ResvAdvancedServiceStub.CheckInRequest();

		/* To set the card number into checkinRequest. */
		com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCard objCreditCard = new com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCard();

		if( creditCardNumber.length() > IMicrosConstants.COUNT_ZERO ) {

			final com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCardChoice_type0 objCardChoice_type0 = new com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCardChoice_type0();

			objCardChoice_type0.setCardNumber( AdapterUtility.getCreditCardNumber(creditCardNumber) );
			objCreditCard.setCreditCardChoice_type0( objCardChoice_type0 );

		}

		//		objCard.setExpirationDate(AdapterUtility.getGregorianDate());

		/*To set credit card into credit card info.*/
		com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCardInfo objCreditCardInfo = new com.micros.adv.reservation.ResvAdvancedServiceStub.CreditCardInfo();
		objCreditCardInfo.setCreditCard( objCreditCard );

		/*To set the confirmation number and hotel code into reservation request base*/

		com.micros.adv.reservation.ResvAdvancedServiceStub.ReservationRequestBase objReservationRequestBase = new com.micros.adv.reservation.ResvAdvancedServiceStub.ReservationRequestBase();

		com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = new com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList();

		com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID objUniqueID = new com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID();

		objUniqueID.setSource( IMicrosConstants.OWS_RESV_NAMEID );
		objUniqueID.setString( confirmationNumber);
		objUniqueID.setType( com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDType.EXTERNAL );

		objUniqueIDList.addUniqueID( objUniqueID );

		// set the confirmation number.
		objReservationRequestBase.setReservationID( objUniqueIDList );

		com.micros.adv.reservation.ResvAdvancedServiceStub.HotelReference objHotelReference = new com.micros.adv.reservation.ResvAdvancedServiceStub.HotelReference();

		String hotelCode = ParserConfigurationReader.getProperty( IMicrosConstants.HOTEL_CODE );
		objHotelReference.setString( "Opera Demo Hotel");
		objHotelReference.setHotelCode( hotelCode );

		// set the hotel code.
		objReservationRequestBase.setHotelReference( objHotelReference );

		/* Set the confirmation . hotel code and credit card info into check in request. */

		objCheckInRequest.setReservationRequest( objReservationRequestBase ); 

		objCheckInRequest.setCreditCardInfo( objCreditCardInfo );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckInRequestObject ", " Exit getCheckInRequestObject method." );

		return objCheckInRequest;

	}

	/**
	 * This method is used to generate the checkout response by populating the
	 * response object with simulator response.
	 * 
	 * @param checkOutResponse
	 * @return
	 */
	private CheckOutResponse getCheckOutResponseObject( com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutResponse checkOutResponse ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutResponseObject ", " Enter getCheckOutResponseObject method " );

		/* Populate response into Reservation instance */
		CheckOutResponse objCheckOutResponse = new CheckOutResponse();
		Reservation objReservation = new Reservation();

		String confirmationNumber = null;
		String status = null;
		String firstName = null;
		String lastName = null;
		StringBuffer objStringBuffer = null;

		// set status in the response.
		status = checkOutResponse.getResult().getResultStatusFlag().toString();
		objCheckOutResponse.setStatus( status );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutResponseObject ", "  Status Set " );

		CheckOutComplete objCheckOutComplete = checkOutResponse.getCheckOutComplete();
		com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = objCheckOutComplete.getReservationID();
		com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID[] arrUniqueIDs = objUniqueIDList.getUniqueID();

		/*To set the confirmation number.*/
		for(com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID objUniqueID : arrUniqueIDs){

			confirmationNumber = objUniqueID.getString();
			objReservation.setConfirmationNumber( confirmationNumber );

			objReservation.setPmsId(confirmationNumber);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutResponseObject ", "  confirmation Number is  Set " );
		}

		// Note :  checkOut response has only 1 profile information.		

		com.micros.adv.reservation.ResvAdvancedServiceStub.Profile objProfile = checkOutResponse.getProfile();
		/*NameCreditCardList objCardList = objProfile.getCreditCards();

		com.micros.adv.reservation.ResvAdvancedServiceStub.NameCreditCard[] arrNameCreditCard = objCardList.getNameCreditCard();
		for (com.micros.adv.reservation.ResvAdvancedServiceStub.NameCreditCard objNameCreditCard : arrNameCreditCard) { // To traverse name credit card.

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckOutResponseObject  "," Iterating NameCreditCard  Array .");

			creditCardNumber = objNameCreditCard.getCreditCardChoice_type0().getCardNumber();
			objReservation.setCreditCardNumber( creditCardNumber );

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," getCheckOutResponseObject  "," Credit Card Number is set.");
		} // End loop for name credit card.

		 */
		com.micros.adv.reservation.ResvAdvancedServiceStub.PersonName objPersonName = objProfile.getProfileChoice_type0().getCustomer().getPersonName();

		objStringBuffer = new StringBuffer();

		/* To set the first name and last name . */
		firstName = objPersonName.getFirstName();
		lastName = objPersonName.getLastName();

		if( firstName != null || lastName != null ) {

			if ( firstName != null ) {

				objStringBuffer.append( firstName );
				objReservation.setFirstName( firstName );
			}
			if ( lastName != null ) {

				objStringBuffer.append( " " + lastName );
				objReservation.setLastName( lastName );
			}
			objReservation.setFullName(objStringBuffer.toString());

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutResponseObject  ", " Full Name is set." );

			objStringBuffer.setLength(IMicrosConstants.COUNT_ZERO);
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


		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutResponseObject ", " Exit Profile." );	

		objCheckOutResponse.setReservation( objReservation );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutResponseObject ", " Exit getCheckOutResponseObject method" );

		return objCheckOutResponse;
	}

	/**
	 * This method accepts the client request for checkout method and generate
	 * the checkout request object to get checkout details.
	 * 
	 * @param checkOutRequest
	 * @return
	 */
	private com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutRequest getCheckOutRequestObject( CheckOutRequest checkOutRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutRequestObject ", " Enter getCheckOutRequestObject method." );

		/* To get the request parameters. */
		String confirmationNumber = checkOutRequest.getConfirmationNumber();

		/* To set request into the xsd classes. */

		com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutRequest objCheckOutRequest = new com.micros.adv.reservation.ResvAdvancedServiceStub.CheckOutRequest();

		/*To set the confirmation number and hotel code into reservation request base*/

		com.micros.adv.reservation.ResvAdvancedServiceStub.ReservationRequestBase objReservationRequestBase = new com.micros.adv.reservation.ResvAdvancedServiceStub.ReservationRequestBase();

		com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = new com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList();

		com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID objUniqueID = new com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID();

		objUniqueID.setSource( IMicrosConstants.OWS_RESV_NAMEID );

		objUniqueID.setString( confirmationNumber);
		objUniqueID.setType( com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDType.EXTERNAL );

		objUniqueIDList.addUniqueID(objUniqueID);

		// set the confirmation number.
		objReservationRequestBase.setReservationID(objUniqueIDList);

		com.micros.adv.reservation.ResvAdvancedServiceStub.HotelReference objHotelReference = new com.micros.adv.reservation.ResvAdvancedServiceStub.HotelReference();
		String hotelCode = ParserConfigurationReader.getProperty( IMicrosConstants.HOTEL_CODE );
		objHotelReference.setHotelCode( hotelCode );

		objReservationRequestBase.setHotelReference( objHotelReference );

		objCheckOutRequest.setReservationRequest( objReservationRequestBase );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutRequestObject ", " Exit getCheckOutRequestObject method " );

		return objCheckOutRequest;
	}

	@Override
	public GetFolioResponse retrieveFolioInfo( GetFolioRequest folioRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo ", " Enter in retrieveFolioInfo method." );

		com.micros.adv.reservation.ResvAdvancedServiceStub.InvoiceRequest objfolioRequest = null;
		com.micros.adv.reservation.ResvAdvancedServiceStub.InvoiceResponse objResponse = null;

		GetFolioResponse objGetFolioResponse = null;

		com.micros.adv.reservation.ResvAdvancedServiceStub objAdvancedServiceStub = null;

		try {

			String endPointUrl = ParserConfigurationReader.getProperty( IMicrosConstants.ADV_RESERVATION_URL);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo ", " AdvReservation Service Url " + endPointUrl );

			objAdvancedServiceStub = new ResvAdvancedServiceStub( endPointUrl );


			com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeader objHeader = new com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeader();

			int transactionIdentifier = TransIdGenerator.getTransactionId();
			String transId = String.valueOf( transactionIdentifier );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo ", " Current transaction Id = " + transId );

			objHeader.setTransactionID( transId );

			com.micros.adv.reservation.ResvAdvancedServiceStub.PrimaryLangID_type0 objId_type0 = new  com.micros.adv.reservation.ResvAdvancedServiceStub.PrimaryLangID_type0();
			objId_type0.setPrimaryLangID_type0( IMicrosConstants.ENG_LANG );
			objHeader.setPrimaryLangID( objId_type0 );

			Calendar objCalendar = Calendar.getInstance();
			objHeader.setTimeStamp( objCalendar );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo ", " Current TimeStamp :: " + objCalendar );

			com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint origin = new  com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint();

			origin.setEntityID( IMicrosConstants.OWS_ORIGIN_ID);
			origin.setSystemType( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
			objHeader.setOrigin(origin);

			com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint destination = new  com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint();

			destination.setEntityID( IMicrosConstants.OWS_DESTINATION_ID );
			destination.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE );
			objHeader.setDestination(destination);

			com.micros.adv.reservation.ResvAdvancedServiceStub.Authentication_type0 objAuthentication_type0 = new  com.micros.adv.reservation.ResvAdvancedServiceStub.Authentication_type0();
			com.micros.adv.reservation.ResvAdvancedServiceStub.UserCredentials_type0 objCredentials_type0 = new  com.micros.adv.reservation.ResvAdvancedServiceStub.UserCredentials_type0();
			objCredentials_type0.setUserName(IMicrosConstants.OWS_USER_NAME );
			objCredentials_type0.setUserPassword(IMicrosConstants.OWS_USER_PASS);
			objAuthentication_type0.setUserCredentials(objCredentials_type0);
			objHeader.setAuthentication(objAuthentication_type0);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo ", "  Authentication UserCredentials Set  " );

			com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeaderE objHeaderE = new com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeaderE();
			objHeaderE.setOGHeader(objHeader);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo ", " Header Created ");

			objfolioRequest = getFolioRequestObject( folioRequest );

			objResponse = objAdvancedServiceStub.invoice(objfolioRequest, objHeaderE);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo ", " Response received from real OWS " );

			objGetFolioResponse = getFolioResponseObject( objResponse );

		}
		catch ( AxisFault axe) {

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " retrieveFolioInfo ", axe );
		}
		catch (RemoteException rme ){

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " retrieveFolioInfo ", rme );
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo ", " Exit retrieveFolioInfo method " );

		return objGetFolioResponse;
	}

	/**
	 * This method is used to generate the folio response by populating the
	 * response object with simulator response.
	 * 
	 * @param objResponse
	 * @return
	 */
	private GetFolioResponse getFolioResponseObject( com.micros.adv.reservation.ResvAdvancedServiceStub.InvoiceResponse objResponse ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioResponseObject ", " Enter in getFolioResponseObject method " );

		/* Populate response into Reservation instance */
		String addressType = null;
		String countryCode = null;
		String firstName = null;
		String lastName = null;
		String description = null;

		double unitPrice ;
		double totalBillAmount ;

		/* Populate response into Reservation instance */
		GetFolioResponse objFolioResponse = new GetFolioResponse();
		Reservation objReservation = new Reservation();

		// set confirmation number.

		BillHeader[] arrBillHeader = objResponse.getInvoice();

		for( BillHeader objBillHeader : arrBillHeader ) { // Traversing Bill Header

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioResponseObject ", " Enter to traverse Bill Header " );

			addressType = objBillHeader.getAddress().getAddressType();
			countryCode = objBillHeader.getAddress().getCountryCode();

			objReservation.setAddress( addressType.concat(" ; "+countryCode) );

			firstName = objBillHeader.getName().getFirstName();
			lastName = objBillHeader.getName().getLastName();

			objReservation.setFirstName( firstName );
			objReservation.setLastName( lastName );

			objReservation.setFullName( firstName.concat(" "+ lastName));

			List<ReservationOrders> objReservationOrders = objFolioResponse.getReservationOrderList();

			if( objReservationOrders == null) {

				objReservationOrders = new ArrayList<ReservationOrders>();
			}

			ReservationOrders objOrders = new ReservationOrders();

			List<OrderDetails> objDetails = objOrders.getOrderDetailList();

			if( objDetails == null ) {

				objDetails = new ArrayList<OrderDetails>();
			}

			BillItem[] arrBillItem = objBillHeader.getBillItems();

			for ( int i = IMicrosConstants.COUNT_ZERO; i < arrBillItem.length ; i++ ) { // Traversing bill Items.

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioResponseObject ", " Enter to traverse Bill Items " );
				OrderDetails objOrderDetails = new OrderDetails();

				unitPrice = arrBillItem[i].getAmount().get_double();
				description = arrBillItem[i].getDescription();

				objOrderDetails.setUnitPrice( unitPrice );
				objOrderDetails.setItemDescription( description );
				objDetails.add( objOrderDetails );

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioResponseObject ", " Exit to traverse Bill Items " );

			} // End bill items traversing loop.

			// add order details.
			objOrders.setOrderDetailList(objDetails);
			//		surchargeAmount = objBillHeader.getCreditCardSurcharges()[0].getSurchargeAmount().get_double();
			totalBillAmount = objBillHeader.getCreditCardSurcharges()[0].getTotalBillAmount().get_double();
			objOrders.setTotalAmount( totalBillAmount );
			objReservationOrders.add( objOrders );
			objFolioResponse.setReservationOrderList( objReservationOrders );

			//************************************
			// set confirmation number.
			UniqueIDList objUniqueIDList = objBillHeader.getProfileIDs();
			UniqueID arrUniqueID[] = objUniqueIDList.getUniqueID();
			for(UniqueID uniqueID : arrUniqueID){

				String confirmationNumber = uniqueID.getString();
				objReservation.setConfirmationNumber(confirmationNumber);
				objReservation.setPmsId(confirmationNumber);
			}
			//***************************
			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getFolioResponseObject "," Exit to traverse Bill Header " );


		} // End Bill Header loop.

		objFolioResponse.setReservation( objReservation );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioResponseObject ", " Exit  getFolioResponseObject method " );

		return objFolioResponse;
	}

	/**
	 * This method accepts the client request for getFolio method and generate
	 * the invoice request object to get the bill items details.
	 * 
	 * @param folioRequest
	 * @return
	 */
	private com.micros.adv.reservation.ResvAdvancedServiceStub.InvoiceRequest getFolioRequestObject( GetFolioRequest folioRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioRequestObject ", " Enter getFolioRequestObject method " );

		/* To get the request parameters. */
		String confirmationNumber = folioRequest.getConfirmationNumber();
		com.micros.adv.reservation.ResvAdvancedServiceStub.InvoiceRequest objInvoiceRequest = null;

		if( (folioRequest != null) && (folioRequest.getConfirmationNumber().length() > 0 ) ) {

			/* To set request using stub classes. */

			objInvoiceRequest = new com.micros.adv.reservation.ResvAdvancedServiceStub.InvoiceRequest();

			com.micros.adv.reservation.ResvAdvancedServiceStub.HotelReference objHotelReference = new com.micros.adv.reservation.ResvAdvancedServiceStub.HotelReference();

			String hotelCode = ParserConfigurationReader.getProperty( IMicrosConstants.HOTEL_CODE );
			objHotelReference.setHotelCode( hotelCode );

			com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList objUniqueIDList = new com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDList();
			com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID objUId = new com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueID();

			objUId.setString( confirmationNumber );
			objUId.setSource( IMicrosConstants.PMS_ID );
			objUId.setType(com.micros.adv.reservation.ResvAdvancedServiceStub.UniqueIDType.EXTERNAL);
			objUniqueIDList.addUniqueID( objUId );

			com.micros.adv.reservation.ResvAdvancedServiceStub.ReservationRequestBase objRequestBase = new com.micros.adv.reservation.ResvAdvancedServiceStub.ReservationRequestBase();

			objRequestBase.setReservationID( objUniqueIDList );
			objRequestBase.setHotelReference( objHotelReference );

			/*To set the reservation base into invoice request.*/
			objInvoiceRequest.setReservationRequest( objRequestBase );

		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioRequestObject ", "  Exit getFolioRequestObject method " );

		return objInvoiceRequest;

	}

	@Override
	public UpdateBookingResponse updateBooking( UpdateBookingRequest updateBookingRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," updateBooking ", " Enter in updateBooking method " );

		ModifyBookingRequest objModifyBookingRequest = null;
		ModifyBookingResponse objResponse = null;
		UpdateBookingResponse objUpdateBookingResponse = null;

		com.micros.reservation.ReservationServiceStub objReservationServiceStub = null;

		try {

			String endPointUrl = ParserConfigurationReader.getProperty( IMicrosConstants.RESERVATION_URL);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " updateBooking ", " AdvReservation Service Url " + endPointUrl );

			objReservationServiceStub = new com.micros.reservation.ReservationServiceStub( endPointUrl );

			/* To set the ogHeader. */
			com.micros.reservation.ReservationServiceStub.OGHeader objHeader = new com.micros.reservation.ReservationServiceStub.OGHeader();

			com.micros.reservation.ReservationServiceStub.EndPoint objEndPoint = new com.micros.reservation.ReservationServiceStub.EndPoint();
			String entityId = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORIGIN_ID);
			objEndPoint.setEntityID( entityId);
			String systemType = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
			objEndPoint.setSystemType( systemType );

			/* To set the origin . */
			objHeader.setOrigin(objEndPoint);

			objEndPoint = new com.micros.reservation.ReservationServiceStub.EndPoint();
			String destEntityId = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_DESTINATION_ID);
			objEndPoint.setEntityID( destEntityId );
			String destSystemType = ParserConfigurationReader.getProperty( IMicrosConstants.OWS_ORI_DEST_TYPE);
			objEndPoint.setSystemType( destSystemType );

			objHeader.setDestination(objEndPoint);

			/* To set the confirmation number as transactionID. */
			objHeader.setTransactionID(String.valueOf(TransIdGenerator.getTransactionId() ));
			objHeader.setTimeStamp(AdapterUtility.getCalender());

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " updateBooking ", "  Authentication UserCredentials Set  " );

			/* To set the OGHeader into OGHeaderE. */
			com.micros.reservation.ReservationServiceStub.OGHeaderE objHeaderE = new com.micros.reservation.ReservationServiceStub.OGHeaderE();
			objHeaderE.setOGHeader(objHeader);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " updateBooking ", " Header Created ");

			objModifyBookingRequest = getUpdateBookingRequestObject(updateBookingRequest);

			//objResponse = objReservationServiceStub.modifyBooking(objModifyBookingRequest, objHeaderE);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " updateBooking ", " Response received from real OWS " );

			objUpdateBookingResponse = getModifyBookingResponseObject( objResponse );

		}
		catch ( AxisFault axe) {

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " updateBooking ", axe );
		}
		catch (RemoteException rme ){

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " updateBooking ", rme );
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " updateBooking ", " Exit updateBooking method " );

		return objUpdateBookingResponse;

	}

    @Override
    public MakePaymentResponse makePayment(MakePaymentRequest request) {
        // TODO
        throw new NotImplementedException("MICROS implementation of MakePaymentResponse not implemented yet");
    }

    /**
	 * 
	 * 
	 * @param objResponse
	 * @return UpdateBookingResponse
	 */
	private UpdateBookingResponse getModifyBookingResponseObject( ModifyBookingResponse objResponse) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Enter getModifyBookingObject method " );

		String firstName = null;
		String lastName = null;

		int guestCount = 0;

		StringBuilder objBuilder = null;
		RoomDetails obRoomDetails = null;

		List<RoomDetails> objRDetailList = null;
		//RoomStayList objRoomStayList = null;
		RoomStay[] arrRoomStay = null;
		Reservation objReservation = null;

		UpdateBookingResponse objUpdateBookingResponse = null;
		HotelReservation objHotelReservation = null;

		com.micros.reservation.ReservationServiceStub.UniqueID[] arrUniIds = null;
		ResGuest[] objGuests = null;
		NameAddress[] arrNameAddresses = null;
		GuestCount[] arrGuestCount = null;

		/* Populate response into Reservation instance */
		objUpdateBookingResponse = new UpdateBookingResponse();
		/* Reference to set the values for reservation. */
		objReservation = new Reservation();

		/* To set the confirmation number . */
		objHotelReservation = objResponse.getHotelReservation();
		arrUniIds = objHotelReservation.getUniqueIDList().getUniqueID();


		/*
		 * Traverse unique id list and set the confirmation number id the unique
		 * id type is internal.
		 */
		for ( com.micros.reservation.ReservationServiceStub.UniqueID objId : arrUniIds ) {

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Iterating UniqueID List." );

			if ( objId.getType().toString().equalsIgnoreCase("INTERNAL") ) {

				objReservation.setConfirmationNumber(objId.getString());
				objReservation.setPmsId( objId.getString());

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Confirmation number is Set in response." );
			} else {

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Confirmation number is not Set in response." );
			}
		} // End loop for unique Id.

		/* To set the profile related information. */

		objGuests = objHotelReservation.getResGuests().getResGuest();
		objBuilder = new StringBuilder();

		for ( ResGuest objResGuest : objGuests ) { // To traverse the res guest
			// related information.
			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Enter ResGuest Array" );

			Profile[] arrProfile = objResGuest.getProfiles().getProfile();

			for ( Profile objProfile : arrProfile ) { // To traverse profile.

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Iterating Profile Array." );

				firstName = objProfile.getProfileChoice_type0().getCustomer().getPersonName().getFirstName();
				lastName = objProfile.getProfileChoice_type0().getCustomer().getPersonName().getLastName();

				if( (firstName != null ) || (lastName != null ) ) {

					if (firstName != null) {

						objBuilder.append(firstName);
					}
					if( lastName != null ) { 

						objBuilder.append(" " + lastName);
					}

					/* To set the full name . */
					objReservation.setFullName( objBuilder.toString() );

					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Full Name is Set in response." );

				}

				/* To set the address on the reservation object . */
				arrNameAddresses = objProfile.getAddresses().getNameAddress();

				for ( NameAddress objAddress : arrNameAddresses ) {// To traverse Name Address.

					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject "," Iterating NameAddress Array." );

					objReservation.setAddress( objAddress.getCountryCode() );

					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Address is Set in response." );
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

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Exit Profile ." );	


			} // End Profile loop.

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Exit Res Guest." );	

		} // End ResGuest loop.


		objRDetailList = objReservation.getRoomDetailList();
		//objRoomStayList = objHotelReservation.getRoomStays();

		if( objRDetailList == null ) {

			objRDetailList = new ArrayList<RoomDetails>();
		}

		//arrRoomStay = objRoomStayList.getRoomStay();

		/* To set the room types attributes with comments. */
		for( RoomStay objRoomStay : arrRoomStay ) { // To traverse room stay array.

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Enter Room Stay Array." );

			RoomType[] arrRoomType = objRoomStay.getRoomTypes().getRoomType();
			ReservationComment arrComment[] = objRoomStay.getComments().getComment();

			for( RoomType objRType : arrRoomType ) {  // To traverse room type 

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Iterating Room Type Array." );

				obRoomDetails = new RoomDetails();

				com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();
				objRoomType.setCode( objRType.getRoomTypeCode() );

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Room Type Code is Set in response." );

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

				for ( RoomFeature objRFeature : arrRoomFeature ) { // To traverse room features.

					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Iterating Room Feature Array." );

					objBuilder.append( objRFeature.getFeature() + ";" );
					objStringBuilder2.append( objRFeature.getDescription() + ";" );

				} // End loop for room features.

				objRoomType.setFeatures( objBuilder.toString() );
				objRoomType.setDescription( objStringBuilder2.toString() );

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Fetures and Description are Set in response." );
				objStringBuilder2.setLength( IMicrosConstants.COUNT_ZERO );
				obRoomDetails.setRoomType( objRoomType );

				objRDetailList.add( obRoomDetails );

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Exit Room Type." );		


			} // End loop for room Type.

			/* For guest count. */
			arrGuestCount = objRoomStay.getGuestCounts().getGuestCount();

			for( GuestCount objGuestCount : arrGuestCount ) { // To traverse Guest Count.

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Iterating Guest Count Array." );

				guestCount = guestCount + objGuestCount.getCount();
				objReservation.setNumberOfGuests(guestCount);

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Guest Count is Set in response." );
			} // End loop for Guest Count.

			/* To set the checkin and check out date . */
			TimeSpan objTimeSpan = objRoomStay.getTimeSpan();

			if(objTimeSpan != null) {

				objReservation.setCheckinDate(AdapterUtility.getDate (objTimeSpan.getStartDate()) );

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " CheckIn Date is Set in response." );

				final TimeSpanChoice_type0 objTimeSpanChoice_type0 = objTimeSpan.getTimeSpanChoice_type0();

				if( objTimeSpanChoice_type0 != null ) {

					objReservation.setCheckoutDate(AdapterUtility.getDate( objTimeSpanChoice_type0.getEndDate()) ); 

					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " CheckOut Date is Set in response." );
				}
			}

			/* To add notes. */
			objBuilder = new StringBuilder(); 

			for ( ReservationComment objReservationComment : arrComment ) {// To traverse reservation notes.

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Iterating Reservation Comment Array." );

				objBuilder.append(objReservationComment.getCommentType() + ";");
			} // End loop for notes.

			objReservation.setNotes(objBuilder.toString());

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Notes are Set in response." );

			objBuilder.setLength( IMicrosConstants.COUNT_ZERO );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Exit Room Stay." );	

		} // End loop for room Stay.

		/*
		 * To set the reservation having room details in update booking response
		 * object.
		 */
		objReservation.setRoomDetailList( objRDetailList );
		objUpdateBookingResponse.setReservation( objReservation );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getModifyBookingObject ", " Exit  getModifyBookingObject method " );

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
	private ModifyBookingRequest getUpdateBookingRequestObject( UpdateBookingRequest updateBookingRequest ) throws AxisFault {

		/*MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getUpdateBookingRequestObject ", " Enter getUpdateBookingRequestObject method " );

		 To set the request parameters. 
		String confirmationNumber = updateBookingRequest.getConfirmationNumber();
		String notes[] = updateBookingRequest.getNotes();

		 To create Reservation Stub. 
		// ReservationServiceStub objReservationServiceStub = new
		// ReservationServiceStub();

		 To create ModifyBookingRequest Object. 
		ModifyBookingRequest objModifyBookingRequest = new ModifyBookingRequest();

		// objModifyBookingRequest.setCancelUpsell(true);
		// objModifyBookingRequest.setCanHandleVaultedCreditCard(true);
		// objModifyBookingRequest.setOverrideInventoryCheck(true);
		// objModifyBookingRequest.setOverrideRestrictionCheck(true);

		 To create the HOtel Reservation. 

		com.micros.reservation.ReservationServiceStub.HotelReservation objHotelReservation = new HotelReservation();
		//objHotelReservation.setTracesCount( IMicrosConstants.COUNT_ONE );
		//objHotelReservation.setCommentsCount( IMicrosConstants.COUNT_TWO );
		objHotelReservation.setAlertExists(true);
		
		 To add AccompanyGuest on AccompanyGuest List for Hotel Reservation. 
		//AccompanyGuestList objAccompanyGuestList = new AccompanyGuestList();

		AccompanyGuest objAccompanyGuest = new AccompanyGuest();
		objAccompanyGuest.setFirstName( IMicrosConstants.NAME_FIRST );
		objAccompanyGuest.setLastName( IMicrosConstants.NAME_LAST );

		com.micros.reservation.ReservationServiceStub.UniqueID objId = new com.micros.reservation.ReservationServiceStub.UniqueID();
		objId.setString( IMicrosConstants.VALUE_UNIQUE_ID );

		objId.setType( com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL );
		objAccompanyGuest.setNameID( objId );

		//objAccompanyGuestList.addAccompanyGuest( objAccompanyGuest );
		//objHotelReservation.setAccompanyGuests( objAccompanyGuestList );

		 To set the status type. 
		objHotelReservation.setComputedReservationStatus( ReservationStatusType.CANCELED );

		 To set the room stay information into room stay list. 
		RoomStayList objRoomStayList = new RoomStayList();
		RoomStay objRoomStay = new RoomStay();

		RatePlanList objRatePlanList = new RatePlanList();
		com.micros.reservation.ReservationServiceStub.RatePlan objRatePlan = new com.micros.reservation.ReservationServiceStub.RatePlan();

		objRatePlan.setRatePlanCode( IMicrosConstants.VALUE_PLAN_CODE );
		objRatePlanList.addRatePlan(objRatePlan);
		objRoomStay.setRatePlans(objRatePlanList);

		RoomTypeList objRoomTypeList = new RoomTypeList();
		RoomType objRoomType = new RoomType();
		objRoomType.setRoomTypeCode( IMicrosConstants.VALUE_ROOM_TYPE_CODE );
		objRoomType.setNumberOfUnits(IMicrosConstants.COUNT_ONE );

		RoomFeatureList objRoomFeatureList = new RoomFeatureList();

		RoomFeature objRoomFeature = new RoomFeature();
		objRoomFeature.setFeature( IMicrosConstants.VALUE_FEATURE_ONE );
		RoomFeature objRoomFeature1 = new RoomFeature();
		objRoomFeature.setFeature( IMicrosConstants.VALUE_FEATURE_TWO );

		objRoomFeatureList.addFeatures(objRoomFeature);
		objRoomFeatureList.addFeatures(objRoomFeature1);

		
		 * RoomRateList objRoomRateList = new RoomRateList(); RoomRate
		 * objRoomRate = new RoomRate(); objRoomRate.setRoomTypeCode( "KNG" );
		 * objRoomRate.setRatePlanCode( "ABC" );
		 
		GuestCountList objGuestCountList = new GuestCountList();
		GuestCount objGuestCount = new GuestCount();

		objGuestCount.setAgeQualifyingCode( com.micros.reservation.ReservationServiceStub.AgeQualifyingCode.CHILD );
		objGuestCount.setCount( IMicrosConstants.COUNT_ONE );

		TimeSpan objTimeSpan = new TimeSpan();

		objTimeSpan.setStartDate( AdapterUtility.getCalender() );
		final TimeSpanChoice_type0 objTimeSpanChoice_type0 = new TimeSpanChoice_type0();

		objTimeSpanChoice_type0.setEndDate( AdapterUtility.getCalender() );
		objRoomStay.setTimeSpan( objTimeSpan );

		Guarantee objGuarantee = new Guarantee();

		GuaranteesAccepted objGuaranteesAccepted = new GuaranteesAccepted();
		GuaranteeAccepted objGuaranteeAccepted = new GuaranteeAccepted();

		com.micros.reservation.ReservationServiceStub.CreditCard objCreditCard = new com.micros.reservation.ReservationServiceStub.CreditCard();
		objCreditCard.setCardCode( IMicrosConstants.VALUE_CARD_CODE );
		objCreditCard.setCardHolderName( IMicrosConstants.VALUE_CARD_HOLDER_NAME );
		objCreditCard.setExpirationDate( new Date() );

		final CreditCardChoice_type0 objCardChoice_type0 = new CreditCardChoice_type0();
		objCardChoice_type0.setCardNumber( IMicrosConstants.VALUE_CARD_NUMBER );
		objCreditCard.setCreditCardChoice_type0(objCardChoice_type0);
		objGuaranteeAccepted.setGuaranteeCreditCard(objCreditCard);
		objGuaranteesAccepted.addGuaranteeAccepted(objGuaranteeAccepted);

		com.micros.reservation.ReservationServiceStub.HotelReference objHotelReference = new com.micros.reservation.ReservationServiceStub.HotelReference();

		String hotelCode = ParserConfigurationReader.getProperty( IMicrosConstants.HOTEL_CODE );
		objHotelReference.setHotelCode( hotelCode);

		String chainCode = ParserConfigurationReader.getProperty( IMicrosConstants.CHAIN_CODE );
		objHotelReference.setChainCode( chainCode );

		ResGuestRPHList objGuestRPHList = new ResGuestRPHList();
		ResGuestRPH objResGuestRPH = new ResGuestRPH();
		objResGuestRPH.setRPH( IMicrosConstants.COUNT_ZERO );

		
		 * SpecialRequestList objSpecialRequestList = new SpecialRequestList();
		 * SpecialRequest objSpecialRequest = new SpecialRequest();
		 * objSpecialRequest.setRequestCode( "Request Code" );
		 

		ReservationCommentList objReservationCommentList = new ReservationCommentList();
		ReservationComment objComment = new ReservationComment();
		objComment.setCommentOriginatorCode( IMicrosConstants.VALUE_ORIGINATOR_CODE );
		objComment.setGuestViewable( false );
		objComment.setCommentType( notes[IMicrosConstants.COUNT_ZERO] );

		ReservationComment objComment1 = new ReservationComment();
		objComment1.setCommentOriginatorCode( IMicrosConstants.VALUE_ORIGINATOR_CODE );
		objComment1.setGuestViewable( false );
		objComment1.setCommentType( notes[IMicrosConstants.COUNT_ONE] );

		 To add guest count list into room stay object. 
		objGuestCountList.addGuestCount(objGuestCount);
		objRoomStay.setGuestCounts(objGuestCountList);

		 To add room rate list into room stay object. 
		
		 * objRoomRateList.addRoomRate( objRoomRate ); objRoomStay.setRoomRates(
		 * objRoomRateList );
		 

		 To add guest count list into room stay object. 
		objRoomType.setRoomFeatures( objRoomFeatureList );
		objRoomTypeList.addRoomType( objRoomType );
		objRoomStay.setRoomTypes( objRoomTypeList );

		 To add Guarantees accepted into room stay object. 
		objGuarantee.setGuaranteesAccepted( objGuaranteesAccepted );
		objRoomStay.setGuarantee( objGuarantee );

		 To add RPH into room stay list. 
		objGuestRPHList.addResGuestRPH( objResGuestRPH );
		objRoomStay.setResGuestRPHs( objGuestRPHList );

		 To add special request into room stay list. 
		
		 * objSpecialRequestList.addSpecialRequest( objSpecialRequest );
		 * objRoomStay.setSpecialRequests( objSpecialRequestList );
		 

		 To add comments into room stay object. 
		objReservationCommentList.addComment( objComment );
		objReservationCommentList.addComment( objComment1 );
		objRoomStay.setComments( objReservationCommentList );

		 To add hotel reference into room stay object. 
		 objRoomStay.setHotelReference( objHotelReference ); 

		 To add room stay into room stay list. 
		objRoomStayList.addRoomStay( objRoomStay );

		objHotelReservation.setRoomStays( objRoomStayList );

		ResGuestList objGuestList = new ResGuestList();
		ResGuest objResGuest = new ResGuest();
		ProfileList objProfileList = new ProfileList();
		Profile objProfile = new Profile();

		com.micros.reservation.ReservationServiceStub.UniqueIDList objIdList = new com.micros.reservation.ReservationServiceStub.UniqueIDList();
		com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();
		objUniqueID.setType( com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL );

		objUniqueID.setString( confirmationNumber );
		objIdList.addUniqueID( objUniqueID );
		objProfile.setProfileIDs( objIdList );

		objHotelReservation.setUniqueIDList( objIdList );
		objProfileList.addProfile( objProfile );
		objResGuest.setProfiles( objProfileList );

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
		objWrittenConfInst.setEmail( IMicrosConstants.VALUE_EMAIL_ID );

		 To add hotelReservation into modify booking request . 
		objHotelReservation.setResGuests( objGuestList );
		objHotelReservation.setWrittenConfInst( objWrittenConfInst );
		objModifyBookingRequest.setHotelReservation( objHotelReservation );

		// objModifyBookingRequest.setCanHandleVaultedCreditCard( true );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getUpdateBookingRequestObject ", " Exit getUpdateBookingRequestObject method " + objModifyBookingRequest );
		return objModifyBookingRequest;*/
		return null;
	}

	@Override
	public UpdatePaymentResponse updatePayment( UpdatePaymentRequest arg0 ) {

		return null;
	}

	@Override
	public GetAvailabilityResponse checkAvailability( GetAvailabilityRequest availabilityRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " Enter checkAvailability method. " );

		FetchCalendarRequest objFetchCalendarRequest = null;
		FetchCalendarResponse objResponse = null;
		GetAvailabilityResponse objGetAvailabilityResponse = null;
		/*To get the request parameters*/
		Date objSDate = availabilityRequest.getStartDate();
		Date objEDate = availabilityRequest.getEndDate();

		String xmlResponse = "";

		int counter = 0;
		int threadTime = 0;
		int timeUnitCounter = 0;

		if( objEDate.before(objSDate) ) {

			objGetAvailabilityResponse = new GetAvailabilityResponse();
			objGetAvailabilityResponse.setStatus( IMicrosConstants.RESPONSE_FAIL);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " Start Date " + objSDate );
			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " End Date " + objEDate );

		}
		else {

			objFetchCalendarRequest = getAvailabiltyRequestObject( availabilityRequest );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " Start Date " + objSDate );
			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " End Date " + objEDate );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " Convert request into xml form " );

			timeUnitCounter = Integer.parseInt( BaseConfigurationReader.getProperty( ICloudKeyConstants.SERVER_TIME_OUT));

			threadTime = Integer.parseInt( BaseConfigurationReader.getProperty( ICloudKeyConstants.SERVER_THREAD_TIME));

			String xmlRequest = AdapterUtility.convertToStreamXML( objFetchCalendarRequest );

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," checkAvailability ", " Get Request in xml format :: "+ xmlRequest);

			/* To send the xml request to the OXI Simulator via Message Transport. */
			MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();

			while( !(xmlResponse.contains( IMicrosConstants.RESPONSE_FETCH_CALENDAR )) && ( counter < timeUnitCounter ) ) {

				if(xmlResponse.contains( IMicrosConstants.RESPONSE_SERVER_NOT_FOUND) ) {

					break;
				}

				xmlResponse = objMessageTransport.handlePMSRequest( xmlRequest );

				try {

					Thread.sleep( threadTime );
					counter = counter + IMicrosConstants.COUNT_ONE ;

					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," checkAvailability ", " Thread Sleeping Counter " + counter );

				}
				catch ( Exception exc) {

					MicrosPMSLogger.logError( MicrosPMSMessageParser.class, " checkAvailability ", exc);
				}

			}

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " Get Response from PMS " + xmlResponse );

			if( xmlResponse.contains( ICloudKeyConstants.SERVER_TIME_OUT_CRITERIA ) ) {

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " No Response from PMS " );

				objGetAvailabilityResponse = null;

			}
			else {
				objResponse = new FetchCalendarResponse();

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " Convert xml response into object " );

				objResponse = ( FetchCalendarResponse ) AdapterUtility.covertToStramObject( xmlResponse );

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " Get Response object from response xml " + objResponse );

				objGetAvailabilityResponse = getAvailabilityResponseObject( objResponse );
			}
			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " Response received in message Parser : " + objGetAvailabilityResponse );

		}
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " checkAvailability ", " Exit checkAvailability method " );

		return objGetAvailabilityResponse;

	}


	/**
	 * This method is used to generate the response for the GetAvailability.
	 * 
	 * @param objResponse
	 * @return
	 */
	private GetAvailabilityResponse getAvailabilityResponseObject( FetchCalendarResponse objResponse ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Enter getAvailabilityResponseObject method." );

		GetAvailabilityResponse objAvailabilityResponse = new GetAvailabilityResponse();
		/*To set status in response.*/
		objAvailabilityResponse.setStatus( objResponse.getResult().getResultStatusFlag().toString() );

		/*To get the list from availability response.*/
		List<Availability> objLiAvailabilities = new ArrayList<Availability>();
		/*To get the calendar daily detail array from response.*/
		CalendarDailyDetail[] arrCalendarDailyDetail = objResponse.getCalendar().getCalendarDay();

		for( CalendarDailyDetail objCalendarDailyDetail : arrCalendarDailyDetail ) { // To traverse calendar daily detail.

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Enter for traversing calendar details." );	

			/*To set the date in response.*/
			Availability objAvailability = new Availability();		
			objAvailability.setDate( objCalendarDailyDetail.getDate() );      

			/*To set the roomInventory in response.*/
			List<com.cloudkey.commons.RoomTypeInventory> objLInventories = new ArrayList<com.cloudkey.commons.RoomTypeInventory>();

			RoomTypeInventory[] arrRoomTypeInventories =  objCalendarDailyDetail.getOccupancy().getRoomTypeInventory();

			for( RoomTypeInventory objRTypeInventory : arrRoomTypeInventories ) { // To traverse room type inventory.

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Traversing room type inventory. " );

				com.cloudkey.commons.RoomTypeInventory objRoomTypeInventory = new com.cloudkey.commons.RoomTypeInventory();	

				/*To set room type on room inventory.*/
				com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType(); 

				objRoomType.setCode( objRTypeInventory.getRoomTypeCode() );
				objRoomTypeInventory.setRoomType( objRoomType );

				//objRoomTypeInventory.setRoomDescription( objRTypeInventory.get );
				objRoomTypeInventory.setTotalRoomsAvailable( objRTypeInventory.getTotalAvailableRooms().intValue() );
				objRoomTypeInventory.setTotalRooms( objRTypeInventory.getTotalRooms().intValue() );

				/*To add roomtype inventory in inventory list.*/
				objLInventories.add( objRoomTypeInventory );

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Exit loop for room type inventory. " );	

			}// End room type inventory loop.
			objAvailability.setRoomTypeInventoryList( objLInventories );

			/*To add availability object into list.*/
			objLiAvailabilities.add( objAvailability );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Exit traversing calendar details. " );
		} // End loop for calendar details.

		objAvailabilityResponse.setAvailList( objLiAvailabilities );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Exit getAvailabilityResponseObject method. " );	

		return objAvailabilityResponse;
	}

	/**
	 * This method is used to create the request object for check the
	 * availability on a certain date range.
	 * 
	 * @param availabilityRequest
	 * @return AvailabilityRequest
	 */
	private FetchCalendarRequest getAvailabiltyRequestObject( GetAvailabilityRequest availabilityRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabiltyRequestObject ", " Enter getAvailabiltyRequestObject method. " );

		FetchCalendarRequest objFetchCalendarRequest = null;
		/*To get the request parameters*/
		Date objSDate = availabilityRequest.getStartDate();
		Date objEDate = availabilityRequest.getEndDate();

		/*To create the request for availability.*/
		objFetchCalendarRequest = new FetchCalendarRequest();

		com.micros.availability.AvailabilityServiceStub.OGHeader objHeader = new com.micros.availability.AvailabilityServiceStub.OGHeader();

		int transactionIdentifier = TransIdGenerator.getTransactionId();
		String transId = String.valueOf( transactionIdentifier );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabiltyRequestObject ", " Current transaction Id = " + transId );

		objHeader.setTransactionID( transId );

		com.micros.availability.AvailabilityServiceStub.PrimaryLangID_type0 objId_type0 = new  com.micros.availability.AvailabilityServiceStub.PrimaryLangID_type0();
		objId_type0.setPrimaryLangID_type0( IMicrosConstants.ENG_LANG );
		objHeader.setPrimaryLangID( objId_type0 );

		Calendar objCalendar = Calendar.getInstance();
		objHeader.setTimeStamp( objCalendar );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabiltyRequestObject ", " Current TimeStamp :: " + objCalendar );

		com.micros.availability.AvailabilityServiceStub.EndPoint origin = new com.micros.availability.AvailabilityServiceStub.EndPoint();
		origin.setEntityID( IMicrosConstants.OWS_ORIGIN_ID);
		origin.setSystemType( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
		objHeader.setOrigin(origin);

		com.micros.availability.AvailabilityServiceStub.EndPoint destination = new com.micros.availability.AvailabilityServiceStub.EndPoint();
		destination.setEntityID( IMicrosConstants.OWS_DESTINATION_ID );
		destination.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE );
		objHeader.setDestination(destination);

		Authentication_type0 objAuthentication_type0 = new Authentication_type0();
		UserCredentials_type0 objCredentials_type0 = new UserCredentials_type0();

		objCredentials_type0.setUserName(IMicrosConstants.OWS_USER_NAME );
		objCredentials_type0.setUserPassword(IMicrosConstants.OWS_USER_PASS);
		objAuthentication_type0.setUserCredentials(objCredentials_type0);
		objHeader.setAuthentication(objAuthentication_type0);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabiltyRequestObject ", "  Authentication UserCredentials Set  " );

		com.micros.availability.AvailabilityServiceStub.OGHeaderE objHeaderE = new  com.micros.availability.AvailabilityServiceStub.OGHeaderE();
		objHeaderE.setOGHeader(objHeader);

		com.micros.availability.AvailabilityServiceStub.TimeSpan objTimeSpan = new com.micros.availability.AvailabilityServiceStub.TimeSpan();

		/*To send the hotel code in request parameters.*/
		com.micros.availability.AvailabilityServiceStub.HotelReference objHotelReference = new  com.micros.availability.AvailabilityServiceStub.HotelReference();

		String hotelCode = ParserConfigurationReader.getProperty( IMicrosConstants.HOTEL_CODE );
		objHotelReference.setHotelCode(  hotelCode );
		objFetchCalendarRequest.setHotelReference( objHotelReference );

		/*To set start and end date.*/
		//objCalendar.setTime( objSDate );
		objCalendar.setTimeInMillis(objSDate.getTime());

		objTimeSpan.setStartDate( objCalendar );	

		System.out.println("Start Date " + objSDate.getTime());
		com.micros.availability.AvailabilityServiceStub.TimeSpanChoice_type0 objType0 = new com.micros.availability.AvailabilityServiceStub.TimeSpanChoice_type0();

		objCalendar = Calendar.getInstance();
		//objCalendar.setTime( objEDate );
		objCalendar.setTimeInMillis( objEDate.getTime());
		objType0.setEndDate( objCalendar );

		System.out.println("End Date " + objEDate.getTime());
		objTimeSpan.setTimeSpanChoice_type0(objType0); 

		/*To set time span in fetch calendar request.*/
		objFetchCalendarRequest.setStayDateRange(objTimeSpan);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAvailabiltyRequestObject ", " Exit getAvailabiltyRequestObject method. " );

		return objFetchCalendarRequest;
	}

	/**
	 * This method is used to make request for the room numbers on the basis of room type.
	 * 
	 * @param roomTypeCode
	 * @return
	 */
	private FetchRoomStatusResponse callFetchRoomStatus( String roomTypeCode ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " callFetchRoomStatus ", " Enter callFetchRoomStatus method " );

		FetchRoomStatusRequest objFetchRoomStatusRequest = null;
		FetchRoomStatusResponse objResponse = null;
		String xmlResponse = "";

		int counter = 0;
		int threadTime = 0;
		int timeUnitCounter = 0;

		objFetchRoomStatusRequest = getFetchRoomRequestObject( roomTypeCode );

		timeUnitCounter = Integer.parseInt( BaseConfigurationReader.getProperty( ICloudKeyConstants.SERVER_TIME_OUT));

		threadTime = Integer.parseInt( BaseConfigurationReader.getProperty( ICloudKeyConstants.SERVER_THREAD_TIME));

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " callFetchRoomStatus ", " Convert request into xml form " );

		String xmlRequest = AdapterUtility.convertToStreamXML( objFetchRoomStatusRequest );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class," callFetchRoomStatus ", " Get Request in xml format " + xmlRequest);

		/* To send the xml request to the OXI Simulator via Message Transport. */
		MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();


		while( !(xmlResponse.contains( IMicrosConstants.RESPONSE_FETCH_ROOM_STATUS_RESPONSE ) ) && ( counter < timeUnitCounter ) ) {

			if( xmlResponse.contains( IMicrosConstants.RESPONSE_SERVER_NOT_FOUND)) {

				break;
			}

			xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

			try {

				Thread.sleep( threadTime );
				counter = counter + IMicrosConstants.COUNT_ONE ;

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," callFetchRoomStatus ", " Thread Sleeping Counter " + counter );

			}
			catch ( Exception exc) {

				MicrosPMSLogger.logError( MicrosPMSMessageParser.class, " callFetchRoomStatus ", exc);
			}

		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," callFetchRoomStatus "," Get Response from PMS " + xmlResponse) ;

		if( xmlResponse.contains( ICloudKeyConstants.SERVER_TIME_OUT_CRITERIA ) ) {

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " callFetchRoomStatus ", " No Response from PMS " );

			objResponse = null;

		} else {

			objResponse = new FetchRoomStatusResponse();

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " callFetchRoomStatus ",  " Convert xml response into object " );

			objResponse = ( FetchRoomStatusResponse ) AdapterUtility.covertToStramObject(xmlResponse); }

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " callFetchRoomStatus ", " Get Response object from response xml " + objResponse );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " callFetchRoomStatus ", " Exit assignRoom method ");

		return objResponse ;
	}

	/**
	 * This method is used to create the request object for fetching the room status with room number.
	 * 
	 * @param roomTypeCode
	 * @return
	 */
	private FetchRoomStatusRequest getFetchRoomRequestObject(String roomTypeCode) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchRoomRequestObject "," Enter getFetchRoomRequestObject method " );

		FetchRoomStatusRequest objFetchRoomStatusRequest = new FetchRoomStatusRequest();
		objFetchRoomStatusRequest.setRoomType(roomTypeCode);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchRoomRequestObject ", " Enter getFetchRoomRequestObject method " );

		return objFetchRoomStatusRequest;
	}

	@Override
	public com.cloudkey.pms.response.AssignRoomResponse assignRoom( com.cloudkey.pms.request.AssignRoomRequest assignRoomRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," assignRoom "," Enter assignRoom method " );

		AssignRoomRequest objAssignRoomRequest = null;
		AssignRoomResponse objResponse = null;
		com.cloudkey.pms.response.AssignRoomResponse objRoomResponse = null;

		com.micros.reservation.ReservationServiceStub objReservationServiceStub = null;

		try {

			String endPointUrl = ParserConfigurationReader.getProperty( IMicrosConstants.RESERVATION_URL);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoom ", " AdvReservation Service Url " + endPointUrl );

			objReservationServiceStub = new ReservationServiceStub( endPointUrl );

			com.micros.reservation.ReservationServiceStub.OGHeader objHeader = new com.micros.reservation.ReservationServiceStub.OGHeader();

			int transactionIdentifier = TransIdGenerator.getTransactionId();
			String transId = String.valueOf( transactionIdentifier );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoom ", " Current transaction Id = " + transId );

			objHeader.setTransactionID( transId );

			Calendar objCalendar = Calendar.getInstance();
			objHeader.setTimeStamp( objCalendar );
			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoom ", " Current TimeStamp :: " + objCalendar );

			com.micros.reservation.ReservationServiceStub.EndPoint origin = new com.micros.reservation.ReservationServiceStub.EndPoint();
			origin.setEntityID( IMicrosConstants.OWS_ORIGIN_ID);
			origin.setSystemType( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
			objHeader.setOrigin(origin);

			com.micros.reservation.ReservationServiceStub.EndPoint destination = new com.micros.reservation.ReservationServiceStub.EndPoint();

			destination.setEntityID( IMicrosConstants.OWS_DESTINATION_ID );
			destination.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE );
			objHeader.setDestination(destination);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoom ", "  Authentication UserCredentials Set  " );

			com.micros.reservation.ReservationServiceStub.OGHeaderE objHeaderE = new com.micros.reservation.ReservationServiceStub.OGHeaderE();
			objHeaderE.setOGHeader(objHeader);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoom ", " Header Created ");

			objAssignRoomRequest = getAssignRoomRequestObject( assignRoomRequest );

			//objReservationServiceStub.assignRoom(objAssignRoomRequest, objHeaderE);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoom ", " Response received from real OWS " );

			objRoomResponse = getAssignRoomResponseObject(objResponse);

		}
		catch ( AxisFault axe) {

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " assignRoom ", axe );
		}
		catch (RemoteException rme ){

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " assignRoom ", rme );
		}


		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoom ", " Exit assignRoom method " );

		return objRoomResponse;
	}

	/**
	 * This method is used to make the request for the assignment of requested
	 * room.
	 * @param assignRoomRequest 
	 * 
	 * @return AssignRoomAdvRequest
	 */
	private AssignRoomRequest getAssignRoomRequestObject( com.cloudkey.pms.request.AssignRoomRequest assignRoomRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAssignRoomRequestObject ", " Enter getAssignRoomRequestObject method " );

		String roomTypeCode = assignRoomRequest.getRoomTypeCode();
		String confirmationNumber =  assignRoomRequest.getReservation().getConfirmationNumber();
		FetchRoomStatusResponse objFetchRoomStatusResponse = null;

		objFetchRoomStatusResponse =  callFetchRoomStatus(roomTypeCode);

		AssignRoomRequest objAssignRoomRequest = new AssignRoomRequest();

		if( objFetchRoomStatusResponse == null ) {

			objAssignRoomRequest = null;
		} 
		else {


			/*To set the room number.*/
			objAssignRoomRequest.setRoomNoRequested( objFetchRoomStatusResponse .getRoomStatus()[IMicrosConstants.COUNT_ZERO].getRoomNumber() );

			/*To set the confirmation number.*/
			com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();
			objUniqueID.setSource( IMicrosConstants.VALUE_SOURCE_ID );
			objUniqueID.setString( confirmationNumber );
			objUniqueID.setType( com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL );
			objAssignRoomRequest.setResvNameId( objUniqueID );

			/*To set the hotel reference.*/
			com.micros.reservation.ReservationServiceStub.HotelReference objHotelReference = new  com.micros.reservation.ReservationServiceStub.HotelReference();

			String hotelCode = ParserConfigurationReader.getProperty( IMicrosConstants.HOTEL_CODE );
			objHotelReference.setHotelCode(  hotelCode );
			objAssignRoomRequest.setHotelReference( objHotelReference );}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAssignRoomRequestObject ", " Exit getAssignRoomRequestObject method " );

		return objAssignRoomRequest;
	}


	/**
	 * This method is used to get the assign room response 
	 * and return the status with the assigned room number.
	 * 
	 * @param objResponse
	 * @return
	 */
	private com.cloudkey.pms.response.AssignRoomResponse getAssignRoomResponseObject( AssignRoomResponse objResponse ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAssignRoomResponseObject ", " Enter getAssignRoomResponseObject method " );	

		com.cloudkey.pms.response.AssignRoomResponse objAssignRoomResponse = new com.cloudkey.pms.response.AssignRoomResponse();
		/*To populate the response into assign Room Response class.*/
		objAssignRoomResponse.setAssignRoomNumber( objResponse.getRoomNoAssigned() );
		objAssignRoomResponse.setStatus( objResponse.getResult().getResultStatusFlag().toString() );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAssignRoomResponseObject ", " Exit getAssignRoomResponseObject method " );	

		return objAssignRoomResponse;
	}

	@Override
	public ReleaseRoomResponse releaseRoom( ReleaseRoomRequest releaseRoomRequest ) {

		MicrosPMSLogger.logInfo (MicrosPMSMessageParser.class, "releaseRoom ", " Enter in releaseRoom method. " );

		com.micros.reservation.ReservationServiceStub.ReleaseRoomRequest objReleaseRoomRequest = null;
		com.micros.reservation.ReservationServiceStub.ReleaseRoomResponse objReleaseRoomResponse = null;

		ReleaseRoomResponse objResponse = null;

		com.micros.reservation.ReservationServiceStub objReservationServiceStub = null;

		try {

			String endPointUrl = ParserConfigurationReader.getProperty( IMicrosConstants.RESERVATION_URL);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " releaseRoom ", " AdvReservation Service Url " + endPointUrl );

			objReservationServiceStub = new ReservationServiceStub( endPointUrl );

			com.micros.reservation.ReservationServiceStub.OGHeader objHeader = new com.micros.reservation.ReservationServiceStub.OGHeader();

			int transactionIdentifier = TransIdGenerator.getTransactionId();
			String transId = String.valueOf( transactionIdentifier );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " releaseRoom ", " Current transaction Id = " + transId );

			objHeader.setTransactionID( transId );

		
			Calendar objCalendar = Calendar.getInstance();
			objHeader.setTimeStamp( objCalendar );
			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " releaseRoom ", " Current TimeStamp :: " + objCalendar );

			com.micros.reservation.ReservationServiceStub.EndPoint origin = new com.micros.reservation.ReservationServiceStub.EndPoint();
			origin.setEntityID( IMicrosConstants.OWS_ORIGIN_ID);
			origin.setSystemType( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
			objHeader.setOrigin(origin);

			com.micros.reservation.ReservationServiceStub.EndPoint destination = new com.micros.reservation.ReservationServiceStub.EndPoint();
			destination.setEntityID( IMicrosConstants.OWS_DESTINATION_ID );
			destination.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE );
			objHeader.setDestination(destination);

		

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " releaseRoom ", "  Authentication UserCredentials Set  " );

			com.micros.reservation.ReservationServiceStub.OGHeaderE objHeaderE = new com.micros.reservation.ReservationServiceStub.OGHeaderE();
			objHeaderE.setOGHeader(objHeader);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " releaseRoom ", " Header Created ");

			objReleaseRoomRequest = getReleaseRoomRequestObject( releaseRoomRequest );

			//objReservationServiceStub.releaseRoom(objReleaseRoomRequest, objHeaderE);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " releaseRoom ", " Response received from real OWS " );

			objResponse = getReleaseRoomResponseObject( objReleaseRoomResponse );

		}
		catch ( AxisFault axe) {

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " releaseRoom ", axe );
		}
		catch (RemoteException rme ){

			MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " releaseRoom ", rme );
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " releaseRoom ", " Exit releaseRoom method." );

		return objResponse;
	}

	/**
	 * 
	 * This method is used to generate the response for release room 
	 * by populating the release room response into base release room class. 
	 * 
	 * @param objReleaseRoomResponse
	 * @return
	 */
	private ReleaseRoomResponse getReleaseRoomResponseObject( com.micros.reservation.ReservationServiceStub.ReleaseRoomResponse objReleaseRoomResponse ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getReleaseRoomResponseObject ", " Enter getReleaseRoomResponseObject method " );	

		ReleaseRoomResponse objReleaseRoomRespons = null;
		String status = null;

		objReleaseRoomRespons = new ReleaseRoomResponse();

		// get the status from release room response.
		status = objReleaseRoomResponse.getResult().getResultStatusFlag().toString();
		// set the released room status.
		objReleaseRoomRespons.setStatus(status);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getReleaseRoomResponseObject ", " Exit getReleaseRoomResponseObject method " );

		return objReleaseRoomRespons;
	}



	/**
	 * This method is used to create the release room request .
	 * it uses reservation id and hotel code to release the rooms.
	 * 
	 * @param releaseRoomRequest
	 * @return
	 */
	private com.micros.reservation.ReservationServiceStub.ReleaseRoomRequest getReleaseRoomRequestObject( ReleaseRoomRequest releaseRoomRequest ) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getReleaseRoomRequestObject "," Enter getReleaseRoomRequestObject method " );

		String reservationId = releaseRoomRequest.getReservationId();

		com.micros.reservation.ReservationServiceStub.ReleaseRoomRequest objReleaseRoomRequest = new com.micros.reservation.ReservationServiceStub.ReleaseRoomRequest();

		/*To set the reservation name  number.*/
		com.micros.reservation.ReservationServiceStub.UniqueID objUniqueID = new com.micros.reservation.ReservationServiceStub.UniqueID();
		objUniqueID.setSource( IMicrosConstants.VALUE_SOURCE );
		objUniqueID.setString( reservationId );
		objUniqueID.setType(com.micros.reservation.ReservationServiceStub.UniqueIDType.INTERNAL);
		objReleaseRoomRequest.setResvNameId( objUniqueID );

		/*To set the hotel reference having chain and hotel code.*/
		HotelReference objHotelReference = new HotelReference();
		String hotelCode = ParserConfigurationReader.getProperty( IMicrosConstants.HOTEL_CODE );
		objHotelReference.setHotelCode( hotelCode );

		String chainCode = ParserConfigurationReader.getProperty( IMicrosConstants.CHAIN_CODE);
		objHotelReference.setHotelCode(  chainCode );

		objReleaseRoomRequest.setHotelReference(objHotelReference);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getReleaseRoomRequestObject "," Exit getReleaseRoomRequestObject method " ); 

		return objReleaseRoomRequest;

	}

	@Override
	public MeetingRoomInformationResponse getMeetingInformation( MeetingRoomInformationRequest arg0) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetingInformation "," Enter getMeetingInformation method " );

		com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityRequest objAvailabilityRequest = null;
		com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityResponse objAvailabilityResponse = null;

		com.micros.meeting.MeetingRoomServiceStub objMeetingRoomServiceStub = null;

		com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityRequestE objMeetingAvailabilityRequestE = null;
		com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityResponseE objMeetingAvailabilityResponseE = null;

		MeetingRoomInformationResponse objResponse = null;


		if( arg0.getNumberOfAttendees().length() > 0) {

			objAvailabilityRequest = getMeetingRoomInformationRequestObject( arg0 );

			objMeetingAvailabilityRequestE = new com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityRequestE();

			objMeetingAvailabilityRequestE.setMeetingAvailabilityRequest(objAvailabilityRequest);

			try {

				String endPointUrl = ParserConfigurationReader.getProperty( IMicrosConstants.MEETINGROOM_URL);

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetingInformation ", " getMeetingInformation Service Url " + endPointUrl );

				objMeetingRoomServiceStub = new com.micros.meeting.MeetingRoomServiceStub(endPointUrl);

				com.micros.meeting.MeetingRoomServiceStub.OGHeaderE objOGE = getMeetingRoomInformationRequestHeader();

				objMeetingAvailabilityResponseE = objMeetingRoomServiceStub.meetingAvailability(objMeetingAvailabilityRequestE, objOGE);
				
				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetingInformation ", " Response received from real OWS " );

				objAvailabilityResponse = objMeetingAvailabilityResponseE.getMeetingAvailabilityResponse();

				objResponse = getMeetinRoomInformationResponse( objAvailabilityResponse );
			}
			catch( Exception exe){

				MicrosPMSLogger.logError(MicrosPMSMessageParser.class, " getMeetingInformation ", exe );

			}

		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetingInformation "," Exit getMeetingInformation method " );

		return objResponse;
	}

	private MeetingRoomInformationResponse getMeetinRoomInformationResponse( MeetingAvailabilityResponse objAvailabilityResponse) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse "," Enter getMeetinRoomInformationResponse method " );

		MeetingRoomInformationResponse objMeetingInformationResponse = new MeetingRoomInformationResponse();

		String responseStatus = objAvailabilityResponse.getResult().getResultStatusFlag().getValue();

		if (responseStatus.equalsIgnoreCase( IMicrosConstants.RESPONSE_SUCCESS)) {

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse "," Response from OWS is Success " );
			objMeetingInformationResponse.setStatus(responseStatus);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse "," ResultStatus Set to the response " );

			AvailableProperty objAvailableProperty =  objAvailabilityResponse.getAvailableProperties();

			//MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse "," Number of Available Property is " + noOfAvailableProperty );

			List<com.cloudkey.commons.AvailableProperty> availPropertyList = objMeetingInformationResponse.getAvailableProperty();

			if ( availPropertyList == null ) {

				List<com.cloudkey.commons.AvailableProperty> myPropertyList = new ArrayList<com.cloudkey.commons.AvailableProperty>();

				com.cloudkey.commons.AvailableProperty objParserAvailableProperty = new com.cloudkey.commons.AvailableProperty();

				//for (int index = IMicrosConstants.COUNT_ZERO; index < noOfAvailableProperty; index ++ ) {

				AvailableProperty objAvailablePropertyPms = objAvailableProperty;

				String hotelName = objAvailablePropertyPms.getHotelReference().getString();
				objParserAvailableProperty.setHotel(hotelName);

				com.micros.meeting.MeetingRoomServiceStub.HotelContact objHotelContact = objAvailablePropertyPms.getHotelContact();
				com.micros.meeting.MeetingRoomServiceStub.ArrayOfAddress objArrayAddress = objHotelContact.getAddresses();

				//com.micros.meeting.MeetingRoomServiceStub.AddressList objAddressList = objHotelContact.getAddresses();

				com.micros.meeting.MeetingRoomServiceStub.Address[] objArray = objArrayAddress.getAddress();

				String cityName = objArray[IMicrosConstants.COUNT_ZERO].getCityName();
				objParserAvailableProperty.setCity(cityName);

				String postalCode = objArray[IMicrosConstants.COUNT_ZERO].getPostalCode();
				objParserAvailableProperty.setPostal(postalCode);

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse ", " Hotel Contact added to the Available Property " );

				FacilityInfoType objFacilityInfor = objAvailablePropertyPms.getHotelExtendedInformation().getFacilityInfo();
				MeetingRoomsType objMeetingRoomTye = objFacilityInfor.getMeetingRooms();

				byte meetingRoomCount = objMeetingRoomTye.getMeetingRoomCount().byteValue();
				objParserAvailableProperty.setTotalMeetingRooms(String.valueOf(meetingRoomCount));

				byte smallestCapacity = objMeetingRoomTye.getSmallestSeatingCapacity().byteValue();
				objParserAvailableProperty.setSmallestSeatingCapacity(String.valueOf(smallestCapacity));

				byte largestCapacity = objMeetingRoomTye.getLargestSeatingCapacity().byteValue();
				objParserAvailableProperty.setLargestSeatingCapacity( String.valueOf( largestCapacity));

				com.micros.meeting.MeetingRoomServiceStub.MeetingRoomsTypeMeetingRoom[] meetingRoomsArray = objMeetingRoomTye.getMeetingRoom();

				int lengthArray =  meetingRoomsArray.length;

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse ", " Number of Meeting room information is " + lengthArray );

				List<com.cloudkey.commons.MeetingRoom> meetingRoomsList = objParserAvailableProperty.getMeetingRoom();

				if( meetingRoomsList == null) {

					List<com.cloudkey.commons.MeetingRoom> meetingRoomsList1 = new ArrayList<com.cloudkey.commons.MeetingRoom>();

					com.cloudkey.commons.MeetingRoom objMRoom =  null;

					for ( int inde = IMicrosConstants.COUNT_ZERO; inde < lengthArray; inde++ ) {

						objMRoom = new com.cloudkey.commons.MeetingRoom();

						com.micros.meeting.MeetingRoomServiceStub.MeetingRoomsTypeMeetingRoom objMeetingRoomType = meetingRoomsArray[inde];
						String roomName = objMeetingRoomType.getRoomName();
						byte  roomCap = objMeetingRoomType.getMeetingRoomCapacity().byteValue();
						String valueCap = String.valueOf( roomCap );

						com.micros.meeting.MeetingRoomServiceStub.ArrayOfMeetingRoomsTypeMeetingRoomCode objCodes_type0 = objMeetingRoomType.getCodes();

						com.micros.meeting.MeetingRoomServiceStub.MeetingRoomsTypeMeetingRoomCode[] arrayCode = objCodes_type0.getCode();
						int codelengh = arrayCode.length;

						for( int len = IMicrosConstants.COUNT_ZERO; len<codelengh ;len++ ){

							com.micros.meeting.MeetingRoomServiceStub.MeetingRoomsTypeMeetingRoomCode typeCode = arrayCode[len];
							String code = typeCode.getCode();

							objMRoom.setCode(code);
							String charge = typeCode.getCharge();
							objMRoom.setCharge(charge);
						}

						objMRoom.setCapacity(valueCap);
						objMRoom.setName(roomName);

						meetingRoomsList1.add(objMRoom);
						MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse ", " Meeting Room added to the MeetingRoom List " );

					}
					objParserAvailableProperty.setMeetingRoom(meetingRoomsList1);

					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse ", " Meeting Room List added to the Available Property " );
				}

				myPropertyList.add(objParserAvailableProperty);

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse ", " Available Property added to the Available Property List " );

				//}

				objMeetingInformationResponse.setAvailableProperty(myPropertyList);
				objMeetingInformationResponse.setStatus( objAvailabilityResponse.getResult().getResultStatusFlag().getValue() );
			}

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse ", " Available Property List added to the response " );

		}
		else {

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse "," Response from OWS is Failure " );

			objMeetingInformationResponse.setStatus( objAvailabilityResponse.getResult().getResultStatusFlag().getValue() );
			objMeetingInformationResponse.setStatus( objAvailabilityResponse.getResult().getOperaErrorCode() );
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetinRoomInformationResponse "," Exit getMeetinRoomInformationResponse method " );

		return objMeetingInformationResponse;
	}

	private com.micros.meeting.MeetingRoomServiceStub.OGHeaderE getMeetingRoomInformationRequestHeader() {

		com.micros.meeting.MeetingRoomServiceStub.OGHeader objHeader = new com.micros.meeting.MeetingRoomServiceStub.OGHeader();

		int transactionIdentifier = TransIdGenerator.getTransactionId();
		String transId = String.valueOf( transactionIdentifier );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetingRoomInformationRequestObject ", " Current transaction Id = " + transId );

		objHeader.setTransactionID( transId );

		objHeader.setPrimaryLangID(IMicrosConstants.ENG_LANG);
		Calendar objCalendar = Calendar.getInstance();
		objHeader.setTimeStamp( objCalendar );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetingRoomInformationRequestObject ", " Current TimeStamp :: " + objCalendar );

		com.micros.meeting.MeetingRoomServiceStub.EndPoint origin = new com.micros.meeting.MeetingRoomServiceStub.EndPoint();

		origin.setEntityID( IMicrosConstants.OWS_ORIGIN_ID);
		origin.setSystemType( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
		objHeader.setOrigin(origin);

		com.micros.meeting.MeetingRoomServiceStub.EndPoint destination = new com.micros.meeting.MeetingRoomServiceStub.EndPoint();

		destination.setEntityID( IMicrosConstants.OWS_DESTINATION_ID );
		destination.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE );
		objHeader.setDestination(destination);

		com.micros.meeting.MeetingRoomServiceStub.OGHeaderE objHeader2 = new com.micros.meeting.MeetingRoomServiceStub.OGHeaderE();
		objHeader2.setOGHeader(objHeader);

		return objHeader2;

	}

	private MeetingAvailabilityRequest getMeetingRoomInformationRequestObject( MeetingRoomInformationRequest objRequest) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetingRoomInformationRequestObject ", " Enter getMeetingRoomInformationRequestObject method " );

		String hotelCode = "";
		com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityRequest objAvailabilityRequest = null;

		objAvailabilityRequest = new com.micros.meeting.MeetingRoomServiceStub.MeetingAvailabilityRequest();

		hotelCode = ParserConfigurationReader.getProperty( IMicrosConstants.MEETING_HOTEL_CODE);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetingRoomInformationRequestObject ", " Hotel Code for Meeting Availability = " + hotelCode );

		objAvailabilityRequest.setSummaryOnly( true );
		objAvailabilityRequest.setAlternateInventory( true );

		int numberOfAttendees = Integer.parseInt(objRequest.getNumberOfAttendees() );
		objAvailabilityRequest.setNumberOfAttendees( numberOfAttendees );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetingRoomInformationRequestObject ", " Number Of Attendees :: " + numberOfAttendees );

		com.micros.meeting.MeetingRoomServiceStub.HotelReference objHotelReference = new com.micros.meeting.MeetingRoomServiceStub.HotelReference();//hotelCode
		objHotelReference.setHotelCode( hotelCode );
		objAvailabilityRequest.setHotelReference( objHotelReference );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMeetingRoomInformationRequestObject "," Exit getMeetingRoomInformationRequestObject method " );

		return objAvailabilityRequest;
	}


	/**
	 * This method accepts the client request for Guest Membership method and generate
	 * the Guest membership request and provide response.
	 * 
	 * @param objGuestMembershipsRequest
	 * @return objResponse
	 */

	@Override
	public GuestMembershipResponse getMembershipInformation( GuestMembershipsRequest objGuestMembershipsRequest) {

		/*	MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMembershipInformation "," Enter getMembershipInformation method " );

		String xmlRequest = null;
		String xmlResponse ="";

		MicrosMessageTransport objMicrosMessageTransport = null;
		com.micros.membership.MembershipServiceStub.FetchMembershipsRequest objFetchMembershipsRequest = null;
		com.micros.membership.MembershipServiceStub.FetchMembershipsResponse objFetchMembershipsResponse = null;
		GuestMembershipResponse objResponse = null;

		int counter = 0;
		int threadTime = 0;
		int timeUnitCounter = 0;

		if( objGuestMembershipsRequest.getNameId().length() > 0) {

			objFetchMembershipsRequest = getFetchGuestMembershipRequestObject( objGuestMembershipsRequest );

			timeUnitCounter = Integer.parseInt( BaseConfigurationReader.getProperty( ICloudKeyConstants.SERVER_TIME_OUT ) );
			threadTime = Integer.parseInt( BaseConfigurationReader.getProperty( ICloudKeyConstants.SERVER_THREAD_TIME ) );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMembershipInformation ", " Convert request into xml form " );

			xmlRequest = AdapterUtility.convertToStreamXML( objFetchMembershipsRequest );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMembershipInformation ", " Get Request in xml format :: " + xmlRequest );

			// To send the xml request to the OXI Simulator via Message Transport 
			objMicrosMessageTransport = new MicrosMessageTransport();

			while( !(xmlResponse.contains( IMicrosConstants.RESPONSE_GUEST_MEMBERSHIP) ) && ( counter < timeUnitCounter ) ) {

				xmlResponse = objMicrosMessageTransport.handlePMSRequest(xmlRequest);

				try {

					Thread.sleep( threadTime );
					counter = counter + IMicrosConstants.COUNT_ONE ;

					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getMembershipInformation ", " Thread Sleeping Counter " + counter );

				}
				catch ( Exception exc) {

					MicrosPMSLogger.logError( MicrosPMSMessageParser.class, " getMembershipInformation ", exc );
				}

			}

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getMembershipInformation "," Get Response from OXI Simulator in xml format :: " + xmlResponse);

			if( xmlResponse.contains( ICloudKeyConstants.SERVER_TIME_OUT_CRITERIA )) {

				MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getMembershipInformation ", " No Response from MicrosPMS_OWS ");

				objResponse = null;

			}
			else {
				objFetchMembershipsResponse = new com.micros.membership.MembershipServiceStub.FetchMembershipsResponse();

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMembershipInformation ",	" Convert xml response into object " );

				objFetchMembershipsResponse = (FetchMembershipsResponse) AdapterUtility.covertToStramObject( xmlResponse );

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMembershipInformation "," Get Response object from response xml ::: " + objFetchMembershipsResponse );

				objResponse = getMembershipResponse( objFetchMembershipsResponse );

			}

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMembershipInformation "," Response received in message Parser : " + objResponse );
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMembershipInformation "," Exit getMembershipInformation method " );

		return objResponse;*/
		return null;
	}


	/*
	 * This method is used to set response for Guest membership.
	 */
	/*private GuestMembershipResponse getMembershipResponse(FetchMembershipsResponse objFetchMembershipsResponse) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMembershipResponse "," Enter getMembershipResponse method " );

		GuestMembershipResponse objGuestMembershipResponse = new GuestMembershipResponse();

		//objGuestMembershipResponse.setResult(objFetchMembershipsResponse.getResult().getResultStatusFlag().getValue());
		objGuestMembershipResponse.setStatus(objFetchMembershipsResponse.getResult().getResultStatusFlag().getValue());

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMembershipResponse "," Result Status Set to the response " );

		NameMembership[] objMembership = objFetchMembershipsResponse.getNameMembershiphList().getNameMembership();

		int len = objMembership.length;

		List<com.cloudkey.commons.Membership> membershipList = objGuestMembershipResponse.getMembershipList();

		if ( membershipList == null ) {

			List<com.cloudkey.commons.Membership> myPropertyList = new ArrayList<com.cloudkey.commons.Membership>();

			com.cloudkey.commons.Membership objList = null;

			for (int index = IMicrosConstants.COUNT_ZERO; index < len; index ++ ) {

				objList = new com.cloudkey.commons.Membership();

				String membershipType = objMembership[index].getMembershipType();
				String membershipNumber = objMembership[index].getMembershipNumber();
				String membershipLevel = objMembership[index].getMembershipLevel();
				String membershipId = objMembership[index].getMembershipid().getString();

				long operaId = objMembership[index].getOperaId();
				String opId = String.valueOf(operaId);
				String externalId = objMembership[index].getExternalId();
				String pointLabel = objMembership[index].getPoints_label();
				String memberName =  objMembership[index].getMemberName();

				objList.setMembershipType(membershipType);
				objList.setMembershipNumber(membershipNumber);
				objList.setMembershipLevel(membershipLevel);
				objList.setOperaId(opId);
				objList.setExternalId(externalId);
				objList.setPointsLabel(pointLabel);
				objList.setMembershipId(membershipId);
				objList.setMemberName(memberName);

				myPropertyList.add(objList);
			}

			objGuestMembershipResponse.setMembershipList(myPropertyList);
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMembershipResponse "," Exit getMeetinRoomInformationResponse method " );

		return objGuestMembershipResponse;	
	}
	 */

	/*
	 * this method is used to set request for Guest membership.
	 */
	/*private FetchMembershipsRequest getFetchGuestMembershipRequestObject( GuestMembershipsRequest objRequest) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchGuestMembershipRequestObject "," Enter getFetchGuestMembershipRequestObject method " );

		com.micros.membership.MembershipServiceStub.FetchMembershipsRequest objMembershipsRequest = null;

		objMembershipsRequest = new com.micros.membership.MembershipServiceStub.FetchMembershipsRequest();

		com.micros.membership.MembershipServiceStub.OGHeader objHeader = new com.micros.membership.MembershipServiceStub.OGHeader();

		int transactionIdentifier = TransIdGenerator.getTransactionId();
		String transId = String.valueOf( transactionIdentifier );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchGuestMembershipRequestObject ", " Current transaction Id = " + transId );

		objHeader.setTransactionID( transId );

		com.micros.membership.MembershipServiceStub.PrimaryLangID_type0 objId_type0 = new com.micros.membership.MembershipServiceStub.PrimaryLangID_type0();
		objId_type0.setPrimaryLangID_type0( IMicrosConstants.ENG_LANG );
		objHeader.setPrimaryLangID( objId_type0 );

		Calendar objCalendar = Calendar.getInstance();
		objHeader.setTimeStamp( objCalendar );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchGuestMembershipRequestObject ", " Current TimeStamp :: " + objCalendar );

		com.micros.membership.MembershipServiceStub.EndPoint origin = new com.micros.membership.MembershipServiceStub.EndPoint();
		origin.setEntityID(IMicrosConstants.OWS_ORIGIN_ID);
		origin.setSystemType(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
		objHeader.setOrigin(origin);

		com.micros.membership.MembershipServiceStub.EndPoint destination = new com.micros.membership.MembershipServiceStub.EndPoint();
		destination.setEntityID( IMicrosConstants.OWS_DESTINATION_ID );
		destination.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE );
		objHeader.setDestination(destination);

		com.micros.membership.MembershipServiceStub.Authentication_type0 objAuthentication_type0 = new com.micros.membership.MembershipServiceStub.Authentication_type0();
		com.micros.membership.MembershipServiceStub.UserCredentials_type0 objCredentials_type0 = new com.micros.membership.MembershipServiceStub.UserCredentials_type0();

		objCredentials_type0.setUserName(IMicrosConstants.OWS_USER_NAME );
		objCredentials_type0.setUserPassword(IMicrosConstants.OWS_USER_PASS);
		objAuthentication_type0.setUserCredentials(objCredentials_type0);
		objHeader.setAuthentication(objAuthentication_type0);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchGuestMembershipRequestObject ", "  Authentication UserCredentials Set  " );

		com.micros.membership.MembershipServiceStub.OGHeaderE objHeaderE = new com.micros.membership.MembershipServiceStub.OGHeaderE();
		objHeaderE.setOGHeader(objHeader);

		com.micros.membership.MembershipServiceStub.UniqueID objId = new com.micros.membership.MembershipServiceStub.UniqueID();
		objId.setString(objRequest.getNameId());
		objMembershipsRequest.setNameID(objId);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchGuestMembershipRequestObject "," Exit getFetchGuestMembershipRequestObject method " );

		return objMembershipsRequest;
	}
	 */

	/**
	 * This method is used to create the Hotel information request .
	 * it uses Hotel code  and gives details response about hotel .
	 * 
	 * @param informationRequest
	 * @return
	 */
	public HotelInformationResponse hotelInformationQuery(HotelInformationRequest informationRequest )
	{
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " hotelInformationQuery "," Enter hotelInformationQuery method " );

		com.micros.information.InformationStub.HotelInformationRequest objHotelInformationRequest = null;
		com.micros.information.InformationStub.HotelInformationRequestE objHotelInformationRequestE = null;

		com.micros.information.InformationStub.HotelInformationResponse objHotelInformationResponse = null;
		com.micros.information.InformationStub.HotelInformationResponseE objHotelInformationResponseE = null;

		HotelInformationResponse objResponse = null;
		com.micros.information.InformationStub objInformationStub = null;

		if( informationRequest.getHotelCode().length() > 0) {

			objHotelInformationRequest = getHotelInformationRequestObject( informationRequest );

			objHotelInformationRequestE = new com.micros.information.InformationStub.HotelInformationRequestE();
			objHotelInformationRequestE.setHotelInformationRequest(objHotelInformationRequest);

			try {

				String endPointUrl = ParserConfigurationReader.getProperty( IMicrosConstants.INFORMATION_URL);

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " hotelInformationQuery ", " Information Service Url " + endPointUrl );

				objInformationStub = new com.micros.information.InformationStub(endPointUrl);

				com.micros.information.InformationStub.OGHeaderE objHeaderE = getHotelInformationRequestHeader();
				objHotelInformationResponseE = objInformationStub.queryHotelInformation(objHotelInformationRequestE, objHeaderE);

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " hotelInformationQuery ", " Response received from real OWS " );
				
				objHotelInformationResponse = objHotelInformationResponseE.getHotelInformationResponse();

				objResponse = getHotelInformationResponseObject( objHotelInformationResponse );
			}
			catch (Exception exc) {

				MicrosPMSLogger.logError( MicrosPMSMessageParser.class, " hotelInformationQuery ", exc );
			}

		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " hotelInformationQuery "," Exit hotelInformationQuery method " );

		return objResponse;
	}

	private InformationStub.OGHeaderE getHotelInformationRequestHeader() {

		com.micros.information.InformationStub.OGHeader objHeader = new com.micros.information.InformationStub.OGHeader();

		int transactionIdentifier = TransIdGenerator.getTransactionId();
		String transId = String.valueOf( transactionIdentifier );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationRequestHeader ", " Current transaction Id = " + transId );

		objHeader.setTransactionID( transId );

		Calendar objCalendar = Calendar.getInstance();
		objHeader.setTimeStamp( objCalendar );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationRequestObject ", " Current TimeStamp :: " + objCalendar );

		com.micros.information.InformationStub.EndPoint objOrigin = new com.micros.information.InformationStub.EndPoint();
		objOrigin.setEntityID(IMicrosConstants.OWS_ORIGIN_ID);
		objOrigin.setSystemType( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
		objHeader.setOrigin(objOrigin);

		com.micros.information.InformationStub.EndPoint objDest = new  com.micros.information.InformationStub.EndPoint();
		objDest.setEntityID(IMicrosConstants.OWS_DESTINATION_ID);
		objDest.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE);
		objHeader.setDestination(objDest);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationRequestObject ", "  Authentication UserCredentials Set  " );

		com.micros.information.InformationStub.OGHeaderE objE = new  com.micros.information.InformationStub.OGHeaderE();
		objE.setOGHeader( objHeader );

		return objE;

	}


	private com.micros.information.InformationStub.HotelInformationRequest getHotelInformationRequestObject( HotelInformationRequest objRequest) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationRequestObject "," Enter getHotelInformationRequestObject method " );

		com.micros.information.InformationStub.HotelInformationRequest objHotelInformationRequest = null;

		objHotelInformationRequest = new com.micros.information.InformationStub.HotelInformationRequest();

		com.micros.information.InformationStub.HotelReference objHotelReference = new com.micros.information.InformationStub.HotelReference();
		objHotelReference.setHotelCode(objRequest.getHotelCode());
		objHotelInformationRequest.setHotelInformationQuery(objHotelReference);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationRequestObject ", " HotelInformationRequest Instace created " );	
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationRequestObject "," Exit getHotelInformationRequestObject method " );

		return objHotelInformationRequest;
	}

	/**
	 * This method is used to generate the response for Hotel information .
	 * 
	 * @param objHotelInformationResponse
	 * @return
	 */
	private HotelInformationResponse getHotelInformationResponseObject(com.micros.information.InformationStub.HotelInformationResponse objHotelInformationResponse) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationResponseObject ", " Enter getHotelInformationResponseObject method " );	

		HotelInformationResponse objHotelInformationResponse2 = null;

		String result = null;
		String contactEmail = " ";
		String phoneNo = " ";
		String addressLine = " ";
		String cityName = " ";
		String countryCode = " ";
		String postalCode = " ";
		String fax = " ";
		String hotelName = " ";
		String notes = " ";
		String checkinTime = "";
		String checkoutTime = "";
		String roomDesc = "";

		objHotelInformationResponse2 = new HotelInformationResponse();

		result = objHotelInformationResponse.getResult().getResultStatusFlag().toString();
		hotelName = objHotelInformationResponse.getHotelInformation().getHotelInformation().getString();

		objHotelInformationResponse2.setStatus(result);
		//objHotelInformationResponse2.setResult(result);
		objHotelInformationResponse2.setHotelName(hotelName);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationResponseObject "," ResultStatus Set to the response " );

		HotelInformationResponseHotelInformation objHotelInformationResponseHotelInformation = objHotelInformationResponse.getHotelInformation();
		com.micros.information.InformationStub.HotelContact objContact =  objHotelInformationResponseHotelInformation.getHotelContactInformation();

		//populate  contactEmail details
		ArrayOfEmail objArrayOfEmail = objContact.getContactEmails();
		com.micros.information.InformationStub.Email[] emailObj = objArrayOfEmail.getContactEmail();

		int emailLength = emailObj.length;
		String emails = "";

		for( int emailIndex = 0; emailIndex < emailLength; emailIndex++) {

			com.micros.information.InformationStub.Email mail = emailObj[emailIndex];
			contactEmail = mail.toString();
			emails.concat(" ").concat( contactEmail );
		}
		objHotelInformationResponse2.setContactEmails(emails);

		/* populate  contact phone list */ 
		com.micros.information.InformationStub.Phone[] phoneObj = objContact.getContactPhones().getPhone();

		int phoneLength = phoneObj.length;
		String phoneNumbers = " ";
		String faxs = " ";

		for( int phoneIndex = 0; phoneIndex < phoneLength; phoneIndex ++ ) {

			String textValue =  phoneObj[phoneIndex].getPhoneRole();

			if(textValue.equalsIgnoreCase("PHONE")) {

				String AreaCode = phoneObj[phoneIndex].getPhoneChoice_type0().getPhoneData().getAreaCode();
				String phoneNumber = phoneObj[phoneIndex].getPhoneChoice_type0().getPhoneData().getPhoneNumber();
				String extension = phoneObj[phoneIndex].getPhoneChoice_type0().getPhoneData().getExtension();

				phoneNo = "AreaCode : ".concat(AreaCode).concat(" Number : ").concat(phoneNumber).concat(" Ext : ").concat(extension);
				phoneNumbers.concat(phoneNo).concat("   ");
			}

			if(textValue.equalsIgnoreCase("FAX")) {

				fax = phoneObj[phoneIndex].getPhoneChoice_type0().getPhoneNumber();
				faxs.concat(fax).concat(" ");
			}

		}
		objHotelInformationResponse2.setFax(faxs);
		objHotelInformationResponse2.setContactPhones(phoneNumbers);

		/* populate addresslist  */
		com.micros.information.InformationStub.Address[] objAddress = objContact.getAddresses().getAddress();

		int addressLength = objAddress.length;

		for( int addressIndex = 0 ; addressIndex < addressLength; addressIndex++ ) {

			com.micros.information.InformationStub.Address objAdd = objAddress[addressIndex];

			cityName = objAdd.getCityName();
			addressLine = objAdd.getAddressLine()[0];
			countryCode = objAdd.getCountryCode();
			postalCode = objAdd.getPostalCode();
		}
		objHotelInformationResponse2.setCity(cityName);
		objHotelInformationResponse2.setAddress(addressLine);
		objHotelInformationResponse2.setCountry(countryCode);
		objHotelInformationResponse2.setPostalCode(postalCode);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationResponseObject ", " Hotel Contact added to the Hotel Information property " );

		/*populate attraction details for note */
		com.micros.information.InformationStub.Attraction_type0[] objAttraction_type0 = objHotelInformationResponseHotelInformation.getHotelExtendedInformation().getFacilityInfo().getAttractions().getAttraction();
		int attractionTypeLength = objAttraction_type0.length;

		for( int attractionTypeIndex = 0; attractionTypeIndex < attractionTypeLength; attractionTypeIndex++ ) {

			String attractionName = objAttraction_type0[attractionTypeIndex].getAttractionName();
			com.micros.information.InformationStub.AttractionInfo[] objAttractionInfo = objAttraction_type0[attractionTypeIndex].getAttractionInformation().getAttractionInfo();

			int attractionInfoLength = objAttractionInfo.length;
			String info= " ";
			String attractionInformation =" ";
			for(int attractionInfoIndex = 0 ; attractionInfoIndex < attractionInfoLength; attractionInfoIndex++ ) {

				info = objAttractionInfo[attractionInfoIndex].getAttractionInfoType().getValue();
				attractionInformation.concat(info).concat(" ");
			}

			notes = attractionName.concat("  ").concat(attractionInformation);
		}

		objHotelInformationResponse2.setNotes(notes);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationResponseObject ", " NOTES added to the sucessfully " );

		/* populate check in and checkout info details.*/
		com.micros.information.InformationStub.HotelInfo[] objHotelInfo1 = objHotelInformationResponseHotelInformation.getHotelExtendedInformation().getHotelInformation().getHotelInfo();

		int hotelInfoLength = objHotelInfo1.length;

		for( int hotelInfoIndex = 0; hotelInfoIndex < hotelInfoLength; hotelInfoIndex++ ) {

			String textValue =  objHotelInfo1[hotelInfoIndex].getHotelInfoType().getValue();

			if(textValue.equalsIgnoreCase(objHotelInfo1[hotelInfoIndex].getHotelInfoType()._CHECKININFO)) {

				ArrayOfTextElement objText = objHotelInfo1[hotelInfoIndex].getDescriptiveTextChoice_type0().getText();
				TextElement[] objTextElement = objText.getTextElement();

				int textElementLength = objTextElement.length;

				for( int textIndex = 0; textIndex<textElementLength; textIndex++ ) {

					String textElementValue = objTextElement[textIndex].toString();
					checkinTime.concat( textElementValue ).concat( " ");
				}
			}

			if(textValue.equalsIgnoreCase(objHotelInfo1[hotelInfoIndex].getHotelInfoType()._CHECKOUTINFO)) {

				ArrayOfTextElement objText = objHotelInfo1[hotelInfoIndex].getDescriptiveTextChoice_type0().getText();
				TextElement[] objTextElement = objText.getTextElement();

				int textElementLength = objTextElement.length;

				for(int textIndex = 0; textIndex<textElementLength; textIndex++) {

					String textElementValue = objTextElement[textIndex].toString();
					checkoutTime.concat(textElementValue).concat(" ");
				}
			}
		}	

		objHotelInformationResponse2.setCheckInTime(checkinTime);
		objHotelInformationResponse2.setCheckOutTime(checkoutTime);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationResponseObject ", " CHECKININFO AND CHECKOUTINFO added to the sucessfully " );

		/*  populate details information of restaurants type */
		RestaurantsTypeRestaurant[] objRestaurantsTypeRestaurant = objHotelInformationResponseHotelInformation.getHotelExtendedInformation().getFacilityInfo().getRestaurants().getRestaurant();
		List<com.cloudkey.commons.Restaurants> restaurantList = objHotelInformationResponse2.getRestaurantsList();

		if(restaurantList == null ) {

			restaurantList = new ArrayList<com.cloudkey.commons.Restaurants>();
		}

		int resturantTypeLength =objRestaurantsTypeRestaurant.length;
		com.cloudkey.commons.Restaurants obRestaurants = null;

		for(int resturantTypeIndex=0; resturantTypeIndex < resturantTypeLength; resturantTypeIndex++) {

			obRestaurants = new com.cloudkey.commons.Restaurants() ;
			obRestaurants.setName(objRestaurantsTypeRestaurant[resturantTypeIndex].getRestaurantName());

			com.micros.information.InformationStub.Paragraph[] objParagraph = objRestaurantsTypeRestaurant[resturantTypeIndex].getRestaurantDescription();

			int paragraphlength = objParagraph.length;

			for(int paragraphIndex = 0;paragraphIndex<paragraphlength;paragraphIndex++ ) {

				ParagraphChoice_type0[] objParagraphChoice_type0 = objParagraph[paragraphIndex].getParagraphChoice_type0();

				int paragraphChoiceLength = objParagraphChoice_type0.length;
				String restaruantDesc = " ";
				String desc = " ";

				for(int paragraphChoiceIndex = 0 ;paragraphChoiceIndex <paragraphChoiceLength; paragraphChoiceIndex ++) {

					com.micros.information.InformationStub.Text objType0 = objParagraphChoice_type0[paragraphChoiceIndex].getText();
					NormalizedString objNormalizedString = objType0.getNormalizedString();

					desc = objNormalizedString.toString();
					restaruantDesc.concat(desc).concat(" ");

					obRestaurants.setDescription(restaruantDesc);
				}
			}

			RestaurantsTypeRestaurantCuisine[] objTypeRestaurantCuisine = objRestaurantsTypeRestaurant[resturantTypeIndex].getCuisines().getCuisine();

			int restaurantCuisinelength = objTypeRestaurantCuisine.length;
			String cusisine = " ";
			String cuisines = " ";

			for( int restaurantCuisineIndex = 0; restaurantCuisineIndex < restaurantCuisinelength; restaurantCuisineIndex++ ) {

				cusisine = objTypeRestaurantCuisine[restaurantCuisineIndex].getDescription();
				cuisines.concat(cusisine).concat(" ");

				obRestaurants.setCuisine(cuisines);
				restaurantList.add(obRestaurants);
			}

		}

		objHotelInformationResponse2.setRestaurantsList(restaurantList);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationResponseObject ", " RESTAURANTLIST added to the sucessfully " );

		/* populate guestRoom information */
		FacilityInfoTypeGuestRoomsGuestRoom[] objFacilityInfoTypeGuestRoomsGuestRoom = objHotelInformationResponseHotelInformation.getHotelExtendedInformation().getFacilityInfo().getGuestRooms().getGuestRoom();

		List<com.cloudkey.commons.RoomType> roomList = objHotelInformationResponse2.getRoomTypeList();

		if(roomList == null ){

			roomList = new ArrayList<com.cloudkey.commons.RoomType>();
		}

		int FacilityinfoTypeGuestRoomLength = objFacilityInfoTypeGuestRoomsGuestRoom.length;
		com.cloudkey.commons.RoomType roomType =  null;

		for( int facilityInfoTypeGuestRoomindex = 0 ; facilityInfoTypeGuestRoomindex < FacilityinfoTypeGuestRoomLength; facilityInfoTypeGuestRoomindex ++) {

			roomType = new com.cloudkey.commons.RoomType();
			roomType.setCode( objFacilityInfoTypeGuestRoomsGuestRoom[facilityInfoTypeGuestRoomindex].getCode() );

			TextElement[] objTextElement = objFacilityInfoTypeGuestRoomsGuestRoom[facilityInfoTypeGuestRoomindex].getRoomDescription().getDescriptiveTextChoice_type0().getText().getTextElement();
			int textElementLength = objTextElement.length;

			for( int textElementIndex = 0; textElementIndex < textElementLength ; textElementIndex ++ ) {

				String textElementValue = objTextElement[textElementIndex].toString();
				roomDesc = roomDesc.concat(textElementValue);
				roomType.setDescription(roomDesc);
				roomList.add(roomType);

			}
		}

		objHotelInformationResponse2.setRoomTypeList(roomList);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationResponseObject ", " ROOMLIST added to the sucessfully " );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getHotelInformationResponseObject ", " Exit getHotelInformationResponseObject method " );	

		return objHotelInformationResponse2;
	}

	/**
	 * This method is used to create the  guest member points request .
	 * it uses membership  id and gives details response about guest membership points .
	 * 
	 * @param objMemberPointsRequest
	 * @return
	 */

	public MemberPointsResponse memberPointsQuery(MemberPointsRequest objMemberPointsRequest )
	{
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " processFetchMemberPoints "," Enter processFetchMemberPoints method " );

		com.micros.membership.MembershipServiceStub.FetchMemberPointsRequest objFetchMemberPointsRequest = null;
		com.micros.membership.MembershipServiceStub.FetchMemberPointsResponse objFetchMemberPointsResponse = null;
		com.micros.membership.MembershipServiceStub objMembershipServiceStub = null;

		MemberPointsResponse objMemberPointsResponse = null;

		if( objMemberPointsRequest.getMembershipNumber().length() > 0) {

			objFetchMemberPointsRequest = getFetchMemberPointsRequestObject( objMemberPointsRequest );

			try {
				
				String endPointUrl = ParserConfigurationReader.getProperty( IMicrosConstants.MEMBERSHIP_URL);

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " processFetchMemberPoints ", " Membership Service Url " + endPointUrl );

				objMembershipServiceStub = new MembershipServiceStub(endPointUrl);

				com.micros.membership.MembershipServiceStub.OGHeaderE objE = getMemberPointsRequestHeader();

				objFetchMemberPointsResponse = objMembershipServiceStub.fetchMemberPoints(objFetchMemberPointsRequest, objE);
				
				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " processFetchMemberPoints ", " Response received from real OWS " );

				objMemberPointsResponse = getMemberPointsResponse( objFetchMemberPointsResponse );

			}
			catch(Exception exc) {

				MicrosPMSLogger.logError( MicrosPMSMessageParser.class, " processFetchMemberPoints ", exc );

			}
		}
		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processFetchMemberPoints ", " Exit processFetchMemberPoints block");

		return objMemberPointsResponse;
	}

	private MembershipServiceStub.OGHeaderE getMemberPointsRequestHeader() {

		com.micros.membership.MembershipServiceStub.OGHeader objHeader = new com.micros.membership.MembershipServiceStub.OGHeader();

		int transactionIdentifier = TransIdGenerator.getTransactionId();
		String transId = String.valueOf( transactionIdentifier );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchMemberPointsRequestObject ", " Current transaction Id = " + transId );

		objHeader.setTransactionID( transId );

		Calendar objCalendar = Calendar.getInstance();
		objHeader.setTimeStamp( objCalendar );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchMemberPointsRequestObject ", " Current TimeStamp :: " + objCalendar );

		com.micros.membership.MembershipServiceStub.EndPoint objOrigin = new com.micros.membership.MembershipServiceStub.EndPoint();

		objOrigin.setEntityID( IMicrosConstants.OWS_ORIGIN_ID);
		objOrigin.setSystemType( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
		objHeader.setOrigin(objOrigin);

		com.micros.membership.MembershipServiceStub.EndPoint objDest = new com.micros.membership.MembershipServiceStub.EndPoint();
		objDest.setEntityID( IMicrosConstants.OWS_DESTINATION_ID );
		objDest.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE );
		objHeader.setDestination(objDest);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchMemberPointsRequestObject ", "  Authentication UserCredentials Set  " );

		com.micros.membership.MembershipServiceStub.OGHeaderE objE= new com.micros.membership.MembershipServiceStub.OGHeaderE();
		objE.setOGHeader( objHeader );

		return objE;
	}

	/*
	 * this method is used to set request for member points.
	 */
	private FetchMemberPointsRequest getFetchMemberPointsRequestObject(MemberPointsRequest objMemberPointsRequest) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchMemberPointsRequestObject "," Enter getFetchMemberPointsRequestObject method " );

		com.micros.membership.MembershipServiceStub.FetchMemberPointsRequest objFetchMemberPointsRequest = null;

		objFetchMemberPointsRequest = new com.micros.membership.MembershipServiceStub.FetchMemberPointsRequest();
		objFetchMemberPointsRequest.setMembershipNumber(objMemberPointsRequest.getMembershipNumber());

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchMemberPointsRequestObject "," Exit getFetchMemberPointsRequestObject method " );
		return objFetchMemberPointsRequest;
	}

	/*
	 * This method is used to set response for Member points.
	 */
	private MemberPointsResponse getMemberPointsResponse(FetchMemberPointsResponse objFetchMemberPointsResponse) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMemberPointsResponse "," Enter getMemberPointsResponse method " );

		MemberPointsResponse objMemberPointsResponse = new MemberPointsResponse();

		//objMemberPointsResponse.setResult(objFetchMemberPointsResponse.getResult().getResultStatusFlag().getValue());
		objMemberPointsResponse.setStatus(objFetchMemberPointsResponse.getResult().getResultStatusFlag().getValue());

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMemberPointsResponse "," Result Status Set to the response " );

		com.micros.membership.MembershipServiceStub.Membership objMembership = objFetchMemberPointsResponse.getMemberInfo();

		String membername = objMembership.getMemberName();
		String membershipId = objMembership.getMembershipid().getString();

		String membershipType = objMembership.getMembershipType();
		String membershipNumber = objMembership.getMembershipNumber();

		String membershipLevel = objMembership.getMembershipLevel();
		Date effectiveDate = objMembership.getEffectiveDate();
		Date expiredate = objMembership.getExpirationDate();

		Boolean objBoolean = objMembership.getInactive();
		String inactive = String.valueOf(objBoolean);

		com.micros.membership.MembershipServiceStub.UniqueID[] objId =  objMembership.getResvNameId().getUniqueID();

		int uniqueIdLength = objId.length;
		String revId = " ";
		String rev = " ";
		for( int uniqueIdIndex =0; uniqueIdIndex < uniqueIdLength; uniqueIdIndex++) {

			rev = objId[uniqueIdIndex].getString();
			revId.concat(rev).concat(" ");
		}

        AwardPointsInfo objAwardPointsInfo = objFetchMemberPointsResponse.getPointsInfo().getAwardPointsInfo();

        double bonusPoint = objAwardPointsInfo.getBasePoints();
        double totalPoint = objAwardPointsInfo.getTotalPoints();

        StayPointsInfo objStayPointsInfo = objFetchMemberPointsResponse.getPointsInfo().getStayPointsInfo();

        int totalNight = objStayPointsInfo.getGuestTotalNights();
        int totalStay = objStayPointsInfo.getGuestTotalStays();

		String totalPoints = String.valueOf(totalPoint);
		String bonusPoints = String.valueOf(bonusPoint);
		String guestTotalNight = String.valueOf(totalNight);
		String guestTotalStay = String.valueOf(totalStay);

		objMemberPointsResponse.setMemberName(membername);
		objMemberPointsResponse.setMembershipId(membershipId);
		objMemberPointsResponse.setMembershipType(membershipType);

		objMemberPointsResponse.setMembershipNumber(membershipNumber);
		objMemberPointsResponse.setMembershipLevel(membershipLevel);
		objMemberPointsResponse.setEffectiveDate(effectiveDate);
		objMemberPointsResponse.setExpireDate(expiredate);
		objMemberPointsResponse.setInactive(inactive);

		objMemberPointsResponse.setResvnameId(revId);
		objMemberPointsResponse.setTotalPoints(totalPoints);
		objMemberPointsResponse.setBonuspoints(bonusPoints);
		objMemberPointsResponse.setGuestTotalNights(guestTotalNight);

		objMemberPointsResponse.setGuestTotalStay(guestTotalStay);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMemberPointsResponse "," Exit getMemberPointsResponse method " );
		return objMemberPointsResponse;
	}

	public NameIdByMembershipResponse getNameIdInformation(NameIdByMembershipRequest objNameIdByMembershipRequest) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdInformation "," Enter getNameIdInformation method " );

		com.micros.name.NameServiceStub.FetchNameIdByMembershipRequest objFetchNameIdByMembershipRequest = null;
		com.micros.name.NameServiceStub.FetchNameIdByMembershipResponse objFetchNameIdByMembershipResponse = null;

		NameIdByMembershipResponse objResponse = null;

		String xmlRequest = "" ;
		String xmlResponse = "" ;

		int counter = 0;
		int threadTime = 0;
		int timeUnitCounter = 0;

		if( (objNameIdByMembershipRequest.getMembershipNumber().length() > 0) && (objNameIdByMembershipRequest.getMembershipType().length() > 0)) {

			objFetchNameIdByMembershipRequest = getNameIdRequestObject( objNameIdByMembershipRequest );

			timeUnitCounter = Integer.parseInt( BaseConfigurationReader.getProperty( ICloudKeyConstants.SERVER_TIME_OUT ) );
			threadTime = Integer.parseInt( BaseConfigurationReader.getProperty( ICloudKeyConstants.SERVER_THREAD_TIME ) );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdInformation ", " Convert request into xml form " );

			xmlRequest = AdapterUtility.convertToStreamXML( objFetchNameIdByMembershipRequest );

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdInformation ", " Get Request in xml format :: " + xmlRequest );

			// To send the xml request to the OXI Simulator via Message Transport 
			MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();

			while( !(xmlResponse.contains( IMicrosConstants.RESPONSE_NAME_ID ) ) && ( counter < timeUnitCounter ) ) {

				xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

				try {

					Thread.sleep( threadTime );
					counter = counter + IMicrosConstants.COUNT_ONE ;

					MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class," getNameIdInformation ", " Thread Sleeping Counter " + counter );

				}
				catch ( Exception exc) {

					MicrosPMSLogger.logError( MicrosPMSMessageParser.class, " getNameIdInformation ", exc );
				}

			}

			MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getNameIdInformation "," Get Response from OXI Simulator in xml format :: " + xmlResponse);

			if( xmlResponse.contains( ICloudKeyConstants.SERVER_TIME_OUT_CRITERIA )) {

				MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getNameIdInformation ", " No Response from MicrosPMS_OWS ");

				objResponse = null;

			}
			else {

				objFetchNameIdByMembershipResponse = new com.micros.name.NameServiceStub.FetchNameIdByMembershipResponse();

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdInformation ",	" Convert xml response into object " );

				objFetchNameIdByMembershipResponse = ( FetchNameIdByMembershipResponse ) AdapterUtility.covertToStramObject( xmlResponse );

				MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdInformation "," Get Response object from response xml ::: " + objFetchNameIdByMembershipResponse );

				objResponse = getNameIdResponse( objFetchNameIdByMembershipResponse );

			}

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdInformation "," Response received in message Parser : " + objResponse );
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdInformation "," Exit getNameIdInformation method " );

		return objResponse;
	}


	private NameIdByMembershipResponse getNameIdResponse(FetchNameIdByMembershipResponse objFetchNameIdByMembershipResponse) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdResponse "," Enter getNameIdResponse method " );

		NameIdByMembershipResponse objNameIdByMembershipResponse = new NameIdByMembershipResponse();


		//objNameIdByMembershipResponse.setResult(objFetchNameIdByMembershipResponse.getResult().getResultStatusFlag().getValue());
		objNameIdByMembershipResponse.setStatus("SUCCESS");

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdResponse "," Result Status Set to the response " );

		NameIdNameAddress[] objNameIdNameAddresses = objFetchNameIdByMembershipResponse.getNameIdNameAddressList().getNameAndAddresses();
		int l = objNameIdNameAddresses.length;

		for(int i=0;i<l; i++) {

			String profileId = objNameIdNameAddresses[i].getProfileId().getString();
			String externalId = objNameIdNameAddresses[i].getAddress().getExternalId();

			long opid = objNameIdNameAddresses[i].getAddress().getOperaId();
			String operaId = String.valueOf(opid);
			objNameIdByMembershipResponse.setNameId(operaId);

			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " profile id : ", profileId);
			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " External id : ", externalId);
			MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " Opera id : ", operaId);
		}

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdResponse "," Exit getNameIdResponse method " );
		return objNameIdByMembershipResponse;
	}


	private FetchNameIdByMembershipRequest getNameIdRequestObject( NameIdByMembershipRequest objRequest) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdRequestObject "," Enter getNameIdRequestObject method " );

		com.micros.name.NameServiceStub.FetchNameIdByMembershipRequest objNameIdByMembershipRequest = null;

		objNameIdByMembershipRequest = new com.micros.name.NameServiceStub.FetchNameIdByMembershipRequest();

		com.micros.name.NameServiceStub.OGHeader objHeader = new com.micros.name.NameServiceStub.OGHeader();

		int transactionIdentifier = TransIdGenerator.getTransactionId();
		String transId = String.valueOf( transactionIdentifier );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdRequestObject ", " Current transaction Id = " + transId );

		objHeader.setTransactionID( transId );

		com.micros.name.NameServiceStub.PrimaryLangID_type0 objId_type0 = new com.micros.name.NameServiceStub.PrimaryLangID_type0();
		objId_type0.setPrimaryLangID_type0( IMicrosConstants.ENG_LANG );
		objHeader.setPrimaryLangID( objId_type0 );

		Calendar objCalendar = Calendar.getInstance();
		objHeader.setTimeStamp( objCalendar );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdRequestObject ", " Current TimeStamp :: " + objCalendar );

		com.micros.name.NameServiceStub.EndPoint origin = new com.micros.name.NameServiceStub.EndPoint();
		origin.setEntityID( IMicrosConstants.OWS_ORIGIN_ID);
		origin.setSystemType( IMicrosConstants.OWS_ORI_SYSTEM_TYPE );
		objHeader.setOrigin(origin);

		com.micros.name.NameServiceStub.EndPoint destination = new com.micros.name.NameServiceStub.EndPoint();

		destination.setEntityID( IMicrosConstants.OWS_DESTINATION_ID );
		destination.setSystemType( IMicrosConstants.OWS_ORI_DEST_TYPE );
		objHeader.setDestination(destination);

		com.micros.name.NameServiceStub.Authentication_type0 objAuthentication_type0 = new com.micros.name.NameServiceStub.Authentication_type0();
		com.micros.name.NameServiceStub.UserCredentials_type0 objCredentials_type0 = new com.micros.name.NameServiceStub.UserCredentials_type0();

		objCredentials_type0.setUserName(IMicrosConstants.OWS_USER_NAME );
		objCredentials_type0.setUserPassword(IMicrosConstants.OWS_USER_PASS);
		objAuthentication_type0.setUserCredentials(objCredentials_type0);
		objHeader.setAuthentication(objAuthentication_type0);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdRequestObject ", "  Authentication UserCredentials Set  " );

		com.micros.name.NameServiceStub.OGHeaderE objHeader2 = new com.micros.name.NameServiceStub.OGHeaderE();
		objHeader2.setOGHeader(objHeader);

		objNameIdByMembershipRequest.setMembershipType(objRequest.getMembershipType());
		objNameIdByMembershipRequest.setMembershipNumber(objRequest.getMembershipNumber());
		objNameIdByMembershipRequest.setLastName(objRequest.getLastname());

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getNameIdRequestObject "," Exit getNameIdRequestObject method " );

		return objNameIdByMembershipRequest;
	}


}
