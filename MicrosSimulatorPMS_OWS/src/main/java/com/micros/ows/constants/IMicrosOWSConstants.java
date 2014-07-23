package com.micros.ows.constants;

/**
 * This interface declares all the constants to be used by the OWS Property Management System Simulator.
 * @author niveditat
 *
 */
public interface IMicrosOWSConstants {

	String CHECKIN_REQUEST = "com.micros.adv.reservation.ResvAdvancedServiceStub_-CheckInRequest";
	String CHECKOUT_REQUEST = "com.micros.adv.reservation.ResvAdvancedServiceStub_-CheckOutRequest";
	
	String GETFOLIO_REQUEST = "com.micros.adv.reservation.ResvAdvancedServiceStub_-Invoice";
	String ASSIGN_ROOM_REQUEST = "com.micros.reservation.ReservationServiceStub_-AssignRoomRequest";
	
	String FETCH_ROOM_STATUS_REQUEST ="com.micros.adv.reservation.ResvAdvancedServiceStub_-FetchRoomStatusRequest";
	String FUTURE_BOOKING_SUMMARY_REQUEST = "com.micros.reservation.ReservationServiceStub_-FutureBookingSummaryRequest";
	
	String MODIFY_BOOKING_REQUEST = "com.micros.reservation.ReservationServiceStub_-ModifyBookingRequest";
	String FETCH_CALENDAR_REQUEST = "com.micros.availability.AvailabilityServiceStub_-FetchCalendarRequest";
	
	String RELEASE_ROOM_REQUEST = "com.micros.reservation.ReservationServiceStub_-ReleaseRoomRequest";

	String HOTEL_INFORMATION_REQUEST = "com.micros.information.InformationServiceStub_-HotelInformationRequest";
	
	String MEETING_ROOM_REQUEST = "com.micros.meeting.MeetingRoomServiceStub_-MeetingAvailabilityRequest";
	
	String GUEST_MEMBERSHIP_REQUEST = "<com.micros.membership.MembershipServiceStub_-FetchMembershipsRequest>";
	String MEMBER_POINTS_REQUEST = "<com.micros.membership.MembershipServiceStub_-FetchMemberPointsRequest>";
	
	String NAME_ID_REQUEST = "<com.micros.name.NameServiceStub_-FetchNameIdByMembershipRequest>";
	
}
