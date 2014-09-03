package com.micros.pms;

import com.cloudkey.commons.Membership;
import com.cloudkey.commons.Reservation;
import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.hotels.HotelInformationRequest;
import com.cloudkey.pms.request.hotels.MeetingRoomInformationRequest;
import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.MemberPointsRequest;
import com.cloudkey.pms.request.memberships.NameLookupRequest;
import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.request.rooms.*;
import com.cloudkey.pms.response.EmptyResponse;
import com.cloudkey.pms.response.hotels.HotelInformationResponse;
import com.cloudkey.pms.response.hotels.MeetingRoomInformationResponse;
import com.cloudkey.pms.response.memberships.GuestMembershipsResponse;
import com.cloudkey.pms.response.memberships.MemberPointsResponse;
import com.cloudkey.pms.response.memberships.NameLookupResponse;
import com.cloudkey.pms.response.reservations.*;
import com.cloudkey.pms.response.rooms.AssignRoomResponse;
import com.cloudkey.pms.response.rooms.FetchCalendarResponse;
import com.cloudkey.pms.response.rooms.ReleaseRoomResponse;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.inject.Inject;
import com.micros.pms.processors.hotels.HotelInformationProcessor;
import com.micros.pms.processors.memberships.GuestMembershipsProcessor;
import com.micros.pms.processors.memberships.NameLookupProcessor;
import com.micros.pms.processors.reservations.*;
import com.micros.pms.processors.roomassignments.AssignRoomProcessor;
import com.micros.pms.processors.roomassignments.AvailabilityProcessor;
import com.micros.pms.processors.roomassignments.FetchCalendarProcessor;
import com.micros.pms.processors.roomassignments.ReleaseRoomProcessor;
import com.micros.pms.processors.rooms.UpdateRoomStatusRequestProcessor;
import org.apache.commons.lang3.NotImplementedException;

/**
 *
 * @author crizan2
 */
public class MicrosOWSParser extends OWSBase implements IParserInterface {

	// Reservations
	@Inject
	PostChargeProcessor postChargeProcessor;

	@Inject
	AddReservationNotesProcessor addReservationNotesProcessor;

	@Inject
	CheckInProcessor checkInProcessor;

	@Inject
	CheckOutProcessor checkOutProcessor;

	@Inject
	GetFolioProcessor getFolioProcessor;

	@Inject
	SearchReservationProcessor searchReservationProcessor;

	@Inject
	FindReservationProcessor findReservationProcessor;

	// Room assignments
	@Inject
	AssignRoomProcessor assignRoomProcessor;

	@Inject
	ReleaseRoomProcessor releaseRoomProcessor;

	@Inject
	FetchCalendarProcessor fetchCalendarProcessor;

	@Inject
	AvailabilityProcessor availabilityProcessor;

	// Hotels
	@Inject
	HotelInformationProcessor hotelInformationProcessor;

	// Memberships
	@Inject
	NameLookupProcessor nameLookupProcessor;

	@Inject
	GuestMembershipsProcessor guestMembershipsProcessor;

	// Guest Services
	@Inject
	UpdateRoomStatusRequestProcessor updateRoomStatusRequestProcessor;

	@Override
    public GetFolioResponse retrieveFolioInfo(GetFolioRequest getFolioRequest) throws PMSInterfaceException {
        log.debug("retrieveFolioInfo: Enter method.");
		return getFolioProcessor.process(getFolioRequest);
    }

    @Override
    public ReleaseRoomResponse releaseRoom(ReleaseRoomRequest releaseRoomRequest) throws PMSInterfaceException {
        log.debug("releaseRoom: Enter method.");
	    return releaseRoomProcessor.process(releaseRoomRequest);
    }

    @Override
    public CheckInResponse guestCheckIn(CheckInRequest checkInRequest) throws PMSInterfaceException {
        log.debug("guestCheckIn: Enter method.");
        return checkInProcessor.process(checkInRequest);
    }

    @Override
    public AssignRoomResponse assignRoom(AssignRoomRequest assignRoomRequest) throws PMSInterfaceException {
        log.debug("assignRoom: Enter method.");
	    return assignRoomProcessor.process(assignRoomRequest);
    }

    @Override
    public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) throws PMSInterfaceException {
        log.debug("guestCheckOut: Enter method.");
        return checkOutProcessor.process(checkOutRequest);
    }

    @Override
    public AddReservationNotesResponse addReservationNotes(AddReservationNotesRequest request) throws PMSInterfaceException {
        log.debug("addReservationNotes: Enter method.");

        return addReservationNotesProcessor.process(request);
    }

	@Override
	public PostChargeResponse postCharge(PostChargeRequest request) throws PMSInterfaceException {
		log.debug("postCharge: Enter method.");

		return postChargeProcessor.process(request);
	}

    @Override
    public MakePaymentResponse makePayment(MakePaymentRequest request) throws PMSInterfaceException {
	    log.debug("makePayment: Enter method.");

	    // TODO
        throw new NotImplementedException("TODO");
    }

    @Override
    public UpdatePaymentResponse updatePayment(UpdatePaymentRequest updatePaymentRequest) throws PMSInterfaceException {
	    log.debug("updatePayment: Enter method.");

	    throw new NotImplementedException("TODO");
    }

    @Override
    public FetchCalendarResponse fetchCalendar(FetchCalendarRequest fetchCalendarRequest) throws PMSInterfaceException {
	    log.debug("fetchCalendar: Enter method.");
	    return fetchCalendarProcessor.process(fetchCalendarRequest);
    }

    @Override
    public SearchReservationResponse searchReservationData(SearchReservationRequest searchReservationRequest) throws PMSInterfaceException {
	    log.debug("searchReservationData: Enter method.");
	    return searchReservationProcessor.process(searchReservationRequest);
    }

    @Override
    public MeetingRoomInformationResponse getMeetingInformation(MeetingRoomInformationRequest meetingRoomInformationRequest) throws PMSInterfaceException  {
	    log.debug("getMeetingInformation: Enter method.");

	    throw new NotImplementedException("Not yet implemented");
    }

    @Override
    public GuestMembershipsResponse getMembershipInformation(GuestMembershipsRequest guestMembershipsRequest) throws PMSInterfaceException {
	    log.debug("getMembershipInformation: Enter method.");
	    return guestMembershipsProcessor.process(guestMembershipsRequest);
    }

    @Override
    public NameLookupResponse getNameIdInformation(NameLookupRequest nameLookupRequest) throws PMSInterfaceException {
        log.debug("getNameIdInformation: Enter method.");
	    return nameLookupProcessor.process(nameLookupRequest);
    }

    @Override
    public HotelInformationResponse hotelInformationQuery(HotelInformationRequest hotelInformationRequest) throws PMSInterfaceException {
        log.debug("hotelInformationQuery: Enter method.");
		return hotelInformationProcessor.process(hotelInformationRequest);
    }

    @Override
    public MemberPointsResponse memberPointsQuery(MemberPointsRequest memberPointsRequest) throws PMSInterfaceException {
	    log.debug("memberPointsQuery: Enter method.");

	    // Get the membership request
	    GuestMembershipsResponse guestMembershipsResponse = getMembershipInformation(new GuestMembershipsRequest(memberPointsRequest.getNameId()));

	    MemberPointsResponse response = new MemberPointsResponse();
		response.setSoapMessages(guestMembershipsResponse.getSoapMessages());

	    Optional<Membership> firstMembershipOpt = FluentIterable.from(guestMembershipsResponse.getMembershipList()).first();

	    if (firstMembershipOpt.isPresent()) {
		    Membership membership = firstMembershipOpt.get();

            response.setMembershipNumber(membership.getMembershipNumber());
            response.setMembershipType(membership.getMembershipType());
            response.setMembershipId(membership.getMembershipId());
            response.setEffectiveDate(membership.getEffectiveDate());
            response.setTotalPoints(membership.getCurrentPoints());
            response.setExpireDate(membership.getExpirationDate());
        }

        return response;
    }

	@Override
	public EmptyResponse updateRoomStatus(UpdateRoomStatusRequest request) throws PMSInterfaceException {
		log.debug("updateRoomStatus: Enter method.");
		return updateRoomStatusRequestProcessor.process(request);
	}

	@Override
	public EmptyResponse availability(AvailabilityRequest request) {
		log.debug("availability: Enter method.");
		return availabilityProcessor.process(request);
	}

	@Override
	public FindReservationResponse findReservation(FindReservationRequest request) {
		return findReservationProcessor.process(request);
	}
}
