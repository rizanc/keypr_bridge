package com.micros.pms.constant;

/**
 * This interface declares all the constants to be used in the application.
 * @author niveditat
 *
 */
public interface IMicrosConstants {

	String HOTEL_CODE = "ows.hotel.code";
	String CHAIN_CODE = "ows.chain.code";

	String OWS_ORIGIN_ID = "origin.entity.id";
	String OWS_ORI_SYSTEM_TYPE = "origin.system.type";

	String OWS_DESTINATION_ID = "destination.entity.id";
	String OWS_ORI_DEST_TYPE = "destination.system.type";

	String OWS_USER_NAME = "auth.user.name";
	String OWS_USER_PASS = "auth.user.pass";

	String OWS_RESV_NAMEID = "RESV_NAME_ID";
	String PMS_ID = "PMS_ID";
	String DATE_FORMAT =  "MM-dd-yyyy";

	String PMS_SERVER_URL = "http://localhost:8080/MicrosSimulatorPMS_OWS/call";

	String RESPOSNE_CHECK_IN = "<com.micros.adv.reservation.ResvAdvancedServiceStub_-CheckInResponse> ";
	String RESPONSE_CHECK_OUT = "<com.micros.adv.reservation.ResvAdvancedServiceStub_-CheckOutResponse>";

	String RESPONSE_FUTURE_BOOKING = "<com.micros.reservation.ReservationServiceStub_-FutureBookingSummaryResponse> ";
	String RESPONSE_FETCH_ROOM_STATUS_RESPONSE = "<com.micros.adv.reservation.ResvAdvancedServiceStub_-FetchRoomStatusResponse>";

	String RESPONSE_FETCH_CALENDAR = "<com.micros.availability.AvailabilityServiceStub_-FetchCalendarResponse> ";
	String RESPONSE_INVOICE = "<com.micros.adv.reservation.ResvAdvancedServiceStub_-InvoiceResponse>";

	String RESPONSE_MODIFY_BOOKING = "<com.micros.reservation.ReservationServiceStub_-ModifyBookingResponse>";
	String RESPONSE_RELEASE_ROOM = "<com.micros.reservation.ReservationServiceStub_-ReleaseRoomResponse>";


	String RESPONSE_GUEST_MEMBERSHIP = "<com.micros.membership.MembershipServiceStub_-FetchMembershipsResponse>";

	String RESPONSE_SERVER_NOT_FOUND = "The requested resource is not available" ;

	String EXCEPTION_MESSAGE = "Property Mangaement System is Down! ";

	String RESPONSE_HOTEL_INFORMATION = "com.micros.information.InformationServiceStub_-HotelInformationResponse ";
	String RESPONSE_MEMBER_POINTS = "<com.micros.membership.MembershipServiceStub_-FetchMemberPointsResponse>";

	String RESPONSE_NAME_ID = "<com.micros.name.NameServiceStub_-FetchNameIdByMembershipResponse>" ;   
	String RESPONSE_MEETING_ROOM = "</com.micros.meeting.MeetingRoomServiceStub_-MeetingAvailabilityResponse> ";

	String MEETING_HOTEL_CODE = "hotel.code";


	String ENG_LANG = "E";


	String RESPONSE_SUCCESS = "SUCCESS";
	String RESPONSE_FAILURE = "FAILURE";

	String MEETING_FEATURE = "PODIUM";

	Integer COUNT_ZERO = 0;
	Integer COUNT_ONE = 1;
	Integer COUNT_TWO = 2;
	Integer COUNT_FOUR = 4;

	String NAME_FIRST = "Mark";
	String NAME_LAST = "RobinSon";
	String VALUE_UNIQUE_ID = "4627013";
	String VALUE_SOURCE = "OPERA";
	String VALUE_SOURCE_ID = "OPERA-ID";
	String VALUE_PLAN_CODE = "SpringOffers";
	String VALUE_ROOM_TYPE_CODE = "KING";
	String VALUE_FEATURE_ONE = "POOL";
	String VALUE_FEATURE_TWO = "DVD";
	String VALUE_CARD_CODE = "AN";
	String VALUE_CARD_HOLDER_NAME = "Mike Haggar";
	String VALUE_CARD_NUMBER = "****-****-****-1234";
	String VALUE_ORIGINATOR_CODE = "CRO";
	String VALUE_EMAIL_ID = "ASURENDRA@micros.com";

	String QUERY_TRANSACTION_SELECT_BY_ID = " Select transId from IdGenerator ";
	String QUERY_TRANSACTION_UPDATE_BY_ID =  " update IdGenerator set transId = ? ";
	String ROOM_DESCRIPTION = "Not Avail";

	String TRANSACTION_ID = "transId";

	Integer ROWS_UPDATED = 0;
}
