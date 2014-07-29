package com.cloudkey.message.parser;

import com.cloudkey.pms.request.*;
import com.cloudkey.pms.response.*;
import com.cloudkey.pms.response.NameIdByMembershipResponse;

/**
 * This interface declare all the methods for the message parser.
 * Message Parser will implements this interface and define the methods for generate the response. 
 * 
 * @author niveditat
 * 
 */
public interface IParserInterface {

	/**
	 * This method generates bill information for the guest. It uses
	 * confirmation number of the guest to generate the bill details.
	 * 
	 * @param folioReq
	 * @return GetFolioResponse
	 */
	public GetFolioResponse retrieveFolioInfo(GetFolioRequest folioRequest);
	
	/**
	 * This method is used to released the room using reservation id.
	 * 
	 * @param releaseRoomRequest
	 * @return ReleaseRoomResponse
	 */
	public ReleaseRoomResponse releaseRoom(ReleaseRoomRequest releaseRoomRequest);
	

	/**
	 * This method makes check in request for the guest to the property management system.
	 * It uses guest reservation data for check in. It returns the reservation data with the status of check in.
	 * 
	 * @param checkInReq
	 * @return CheckInResponse
	 */
	public CheckInResponse guestCheckIn(CheckInRequest checkInRequest);

	/**
	 * This method makes assign Room request for the guest to the property management system.
	 * It uses guest reservation data and roomtype for assign Room. It returns the reservation data with the status of room assignment.
	 * 
	 * @param checkInReq
	 * @return CheckInResponse
	 */
	public AssignRoomResponse assignRoom(AssignRoomRequest assignRoomRequest);


	/**
	 * This method makes check out request for the guest to the property management system.
	 * It uses confirmation number of the guest for check out and returns reservation details along
	 * with status.
	 * 
	 * @param checkOutReq
	 * @return CheckOutResponse
	 */
	public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest);

	/**
	 * This method makes update booking request of the guest to the property management system.
	 * It uses confirmation number and notes details of the guest for making request. It returns
	 * guest reservation detail as response.
	 * 
	 * @param upBookingReq
	 * @return UpdateBookingResponse
	 */
	public UpdateBookingResponse updateBooking(UpdateBookingRequest upBookingRequest);

	/**
	 * @param request
	 * @return UpdatePaymentResponse
	 */
	public MakePaymentResponse makePayment(MakePaymentRequest request);

	/**
	 * This method makes update Payment request of the guest to the property management system.
	 * It uses guest confirmation number and payments details.It returns status as response.
	 *
	 * @param upPaymentReq
	 * @return UpdatePaymentResponse
	 */
	public UpdatePaymentResponse updatePayment(UpdatePaymentRequest upPaymentRequest);

	/**
	 * This method check the availability  of the room for a given interval of time.
	 * 
	 * @param availReq
	 * @return GetAvailabilityResponse
	 */
	public GetAvailabilityResponse checkAvailability(GetAvailabilityRequest availRequest);

	/**
	 * This method searches for the reservation details on the basis of email id, confirmation number, credit card,
	 * first name and last name of the guest. It returns details of the reservations along with status of the guest.
	 * 
	 * @param reservationRequest
	 * @return SearchReservationResponse
	 */
	public SearchReservationResponse searchReservationData(SearchReservationRequest reservationRequest );

	/**
	 * This method searches for the meeting room availability on the basis of number of attendees. It returns
	 * hotel details and information about available meeting rooms in the hotel.
	 * 
	 * @param objInformationRequest
	 * @return
	 */
	public MeetingRoomInformationResponse getMeetingInformation( MeetingRoomInformationRequest objInformationRequest);
	
	/**
	 * This method searches for Details of Guest Membership on the basis of Name Id. It returns
	 * membership details .
	 * 
	 * @param objGuestMembershipsRequest
	 * @return
	 */
	public GuestMembershipResponse getMembershipInformation( GuestMembershipsRequest objGuestMembershipsRequest);
	
	/**
	 * This method searches for Name Id. It returns name id to guest.
	 * 
	 * @param objNameIdByMembershipRequest
	 * @return
	 */
	
	public NameIdByMembershipResponse getNameIdInformation(NameIdByMembershipRequest objNameIdByMembershipRequest);
	
	/**
	 * This method searches for Details of Hotel Information on the basis of hotel code. It returns
	 * details of Hotel information.
	 * 
	 * @param objHotelInformationRequest
	 * @return
	 */
	
	public HotelInformationResponse hotelInformationQuery(HotelInformationRequest objHotelInformationRequest);
	
	/**
	 * This method searches for Details of Member points  on the basis of membership id. It returns
	 * details of member points.
	 * 
	 * @param objMemberPointsRequest
	 * @return
	 */
	
	public MemberPointsResponse memberPointsQuery(MemberPointsRequest objMemberPointsRequest);
}
