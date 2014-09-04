package com.cloudkey.message.parser;

import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.pms.request.hotels.HotelInformationRequest;
import com.cloudkey.pms.request.hotels.HotelItemCodesRequest;
import com.cloudkey.pms.request.hotels.LOVRequest;
import com.cloudkey.pms.request.hotels.MeetingRoomInformationRequest;
import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.MemberPointsRequest;
import com.cloudkey.pms.request.memberships.NameLookupRequest;
import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.request.rooms.*;
import com.cloudkey.pms.response.EmptyResponse;
import com.cloudkey.pms.response.hotels.HotelInformationResponse;
import com.cloudkey.pms.response.hotels.LOVResponse;
import com.cloudkey.pms.response.hotels.MeetingRoomInformationResponse;
import com.cloudkey.pms.response.memberships.GuestMembershipsResponse;
import com.cloudkey.pms.response.memberships.MemberPointsResponse;
import com.cloudkey.pms.response.memberships.NameLookupResponse;
import com.cloudkey.pms.response.reservations.*;
import com.cloudkey.pms.response.rooms.AssignRoomResponse;
import com.cloudkey.pms.response.rooms.FetchCalendarResponse;
import com.cloudkey.pms.response.rooms.ReleaseRoomResponse;

/**
 * This interface declare all the methods for the message parser.
 * Message Parser will implements this interface and define the methods for generate the response.
 *
 * @author niveditat
 */
public interface IParserInterface {

    /**
     * This method return LOV information.
     *
     * @param folioRequest
     * @return LOVResponse
     */
    LOVResponse retrieveLOVQuery(LOVRequest folioRequest) throws PMSInterfaceException;

    /**
     * This method generates bill information for the guest. It uses
     * confirmation number of the guest to generate the bill details.
     *
     * @param folioRequest
     * @return GetFolioResponse
     */
    GetFolioResponse retrieveFolioInfo(GetFolioRequest folioRequest) throws PMSInterfaceException;

    /**
     * This method is used to released the room using reservation id.
     *
     * @param releaseRoomRequest
     * @return ReleaseRoomResponse
     */
    ReleaseRoomResponse releaseRoom(ReleaseRoomRequest releaseRoomRequest) throws PMSInterfaceException;

    /**
     * This method makes check in request for the guest to the property management system.
     * It uses guest reservation data for check in. It returns the reservation data with the status of check in.
     *
     * @param checkInRequest
     * @return CheckInResponse
     */
    CheckInResponse guestCheckIn(CheckInRequest checkInRequest) throws PMSInterfaceException;

    /**
     * This method makes assign Room request for the guest to the property management system.
     * It uses guest reservation data and roomtype for assign Room. It returns the reservation data with the status of room assignment.
     *
     * @param assignRoomRequest
     * @return CheckInResponse
     */
    AssignRoomResponse assignRoom(AssignRoomRequest assignRoomRequest) throws PMSInterfaceException;


    /**
     * This method makes check out request for the guest to the property management system.
     * It uses confirmation number of the guest for check out and returns reservation details along
     * with status.
     *
     * @param checkOutRequest
     * @return CheckOutResponse
     */
    CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) throws PMSInterfaceException;

    /**
     * This method makes update booking request of the guest to the property management system.
     * It uses confirmation number and notes details of the guest for making request. It returns
     * guest reservation detail as response.
     *
     * @param request
     * @return UpdateBookingResponse
     */
    AddReservationNotesResponse addReservationNotes(AddReservationNotesRequest request) throws PMSInterfaceException;

    /**
     * Adds charges to a guest account
     *
     * @param request
     * @return
     */
    PostChargeResponse postCharge(PostChargeRequest request) throws PMSInterfaceException;

    /**
     * @param request
     * @return UpdatePaymentResponse
     */
    MakePaymentResponse makePayment(MakePaymentRequest request) throws PMSInterfaceException;

    /**
     * This method makes update Payment request of the guest to the property management system.
     * It uses guest confirmation number and payments details.It returns status as response.
     *
     * @param upPaymentRequest
     * @return UpdatePaymentResponse
     */
    UpdatePaymentResponse updatePayment(UpdatePaymentRequest upPaymentRequest) throws PMSInterfaceException;

    /**
     * This method check the availability  of the room for a given interval of time.
     *
     * @param availRequest
     * @return FetchCalendarResponse
     */
    FetchCalendarResponse fetchCalendar(FetchCalendarRequest availRequest) throws PMSInterfaceException;

    /**
     * This method searches for the reservation details on the basis of email id, confirmation number, credit card,
     * first name and last name of the guest. It returns details of the reservations along with status of the guest.
     *
     * @param reservationRequest
     * @return SearchReservationResponse
     */
    SearchReservationResponse searchReservationData(SearchReservationRequest reservationRequest) throws PMSInterfaceException;

    /**
     * This method searches for the meeting room availability on the basis of number of attendees. It returns
     * hotel details and information about available meeting rooms in the hotel.
     *
     * @param objInformationRequest
     * @return
     */
    MeetingRoomInformationResponse getMeetingInformation(MeetingRoomInformationRequest objInformationRequest) throws PMSInterfaceException;

    /**
     * This method searches for Details of Guest Membership on the basis of Name Id. It returns
     * membership details .
     *
     * @param objGuestMembershipsRequest
     * @return
     */
    GuestMembershipsResponse getMembershipInformation(GuestMembershipsRequest objGuestMembershipsRequest) throws PMSInterfaceException;

    /**
     * This method searches for Name Id. It returns name id to guest.
     *
     * @param objNameLookupRequest
     * @return
     */

    NameLookupResponse getNameIdInformation(NameLookupRequest objNameLookupRequest) throws PMSInterfaceException;

    /**
     * This method searches for Details of Hotel Information on the basis of hotel code. It returns
     * details of Hotel information.
     *
     * @param objHotelInformationRequest
     * @return
     */

    HotelInformationResponse hotelInformationQuery(HotelInformationRequest objHotelInformationRequest) throws PMSInterfaceException;

    /**
     * This method searches for Details of Member points  on the basis of membership id. It returns
     * details of member points.
     *
     * @param objMemberPointsRequest
     * @return
     */

    MemberPointsResponse memberPointsQuery(MemberPointsRequest objMemberPointsRequest) throws PMSInterfaceException;

    EmptyResponse updateRoomStatus(UpdateRoomStatusRequest request) throws PMSInterfaceException;

    EmptyResponse availability(AvailabilityRequest request);

    FindReservationResponse findReservation(FindReservationRequest request);

	com.cloudkey.pms.response.hotels.HotelItemCodesResponse hotelItemCodes(HotelItemCodesRequest request);
}
