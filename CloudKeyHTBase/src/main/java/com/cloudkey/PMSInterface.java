package com.cloudkey;

import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.exceptions.ReservationNotFound;
import com.cloudkey.pms.request.hotels.HotelInformationRequest;
import com.cloudkey.pms.request.hotels.HotelItemCodesRequest;
import com.cloudkey.pms.request.hotels.LOVRequest;
import com.cloudkey.pms.request.hotels.MeetingRoomInformationRequest;
import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.NameLookupRequest;
import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.request.rooms.*;
import com.cloudkey.pms.response.EmptyResponse;
import com.cloudkey.pms.response.hotels.HotelInformationResponse;
import com.cloudkey.pms.response.hotels.HotelItemCodesResponse;
import com.cloudkey.pms.response.hotels.LOVResponse;
import com.cloudkey.pms.response.hotels.MeetingRoomInformationResponse;
import com.cloudkey.pms.response.memberships.GuestMembershipsResponse;
import com.cloudkey.pms.response.memberships.NameLookupResponse;
import com.cloudkey.pms.response.reservations.*;
import com.cloudkey.pms.response.rooms.*;

/**
 * Interface which may be implemented to support a PMS backend.
 *
 * @author niveditat
 */
public interface PMSInterface {

	/**
	 * Retrieves folios (bills) for a reservation
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    GetFolioResponse retrieveFolioInfo(GetFolioRequest request) throws PMSInterfaceException;

	/**
	 * Assigns a room to a reservation
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
	AssignRoomResponse assignRoom(AssignRoomRequest request) throws PMSInterfaceException;

	/**
	 * Releases (un-assigns) the room assigned to a reservation.
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    ReleaseRoomResponse releaseRoom(ReleaseRoomRequest request) throws PMSInterfaceException;

	/**
	 * Checks in a reservation.
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    CheckInResponse checkIn(CheckInRequest request) throws PMSInterfaceException;


	/**
	 * Checks out a reservation.
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    CheckOutResponse checkOut(CheckOutRequest request) throws PMSInterfaceException;

	/**
	 * Adds notes to a reservation.
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    AddReservationNotesResponse addReservationNotes(AddReservationNotesRequest request) throws PMSInterfaceException;

	/**
	 * Posts charges to a reservation folio (bill).
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    PostChargeResponse postCharge(PostChargeRequest request) throws PMSInterfaceException;

	/**
	 * Fetches a calendar of room availability.
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    FetchCalendarResponse fetchCalendar(FetchCalendarRequest request) throws PMSInterfaceException;

	/**
	 * Searches reservations provided certain criteria.
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    SearchReservationResponse searchReservations(SearchReservationRequest request) throws PMSInterfaceException;

	/**
	 * Retrieves membership information associated with a guest id.
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    GuestMembershipsResponse getMembershipInformation(GuestMembershipsRequest request) throws PMSInterfaceException;

	/**
	 * Searches for guests by their name.
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    NameLookupResponse getNameIdInformation(NameLookupRequest request) throws PMSInterfaceException;

	/**
	 * Retrieves general information about the hotel.
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
    HotelInformationResponse hotelInformationQuery(HotelInformationRequest request) throws PMSInterfaceException;

	/**
	 * Modifies various room status fields
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
	EmptyResponse updateRoomStatus(UpdateRoomStatusRequest request) throws PMSInterfaceException;

	/**
	 * Fetches room availability
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
	AvailabilityResponse fetchAvailability(AvailabilityRequest request) throws PMSInterfaceException;

	/**
	 * Finds a particular reservation
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 * @throws ReservationNotFound
	 */
	FindReservationResponse findReservation(FindReservationRequest request) throws PMSInterfaceException, ReservationNotFound;

	/**
	 * Creates a new reservation
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 */
	CreateReservationResponse createReservation(CreateReservationRequest request) throws PMSInterfaceException;

	/**
	 * Cancels an existing reservation
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 * @throws ReservationNotFound
	 */
	CancelReservationResponse cancelReservation(CancelReservationRequest request) throws PMSInterfaceException, ReservationNotFound;

	/**
	 * Modifies an existing reservation
	 *
	 * @param request
	 * @return
	 * @throws PMSInterfaceException
	 * @throws ReservationNotFound
	 */
	EmptyResponse modifyReservation(ModifyReservationRequest request) throws PMSInterfaceException, ReservationNotFound;

	/**
	 * Retrieves room status information.
	 *
	 * @param request
	 * @return
	 */
	GetRoomStatusResponse getRoomStatus(GetRoomStatusRequest request);

	/**
	 * Retrieves general information about the setup and characteristics of a room.
	 *
	 * @param request
	 * @return
	 */
	GetRoomSetupResponse getRoomSetup(GetRoomSetupRequest request);

	/**
	 * Returns codes for each purchasable goods and billing code (Bar, minibar, vending machine, etc)
	 * defined for the hotel.
	 *
	 * @param request
	 * @return
	 */
	HotelItemCodesResponse hotelItemCodes(HotelItemCodesRequest request);
}
