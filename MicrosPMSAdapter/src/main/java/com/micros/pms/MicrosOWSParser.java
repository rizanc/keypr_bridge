package com.micros.pms;

import com.cloudkey.commons.Membership;
import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.hotels.HotelInformationRequest;
import com.cloudkey.pms.request.hotels.MeetingRoomInformationRequest;
import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.MemberPointsRequest;
import com.cloudkey.pms.request.memberships.NameIdByMembershipRequest;
import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.request.roomassignments.AssignRoomRequest;
import com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest;
import com.cloudkey.pms.request.roomassignments.ReleaseRoomRequest;
import com.cloudkey.pms.response.hotels.HotelInformationResponse;
import com.cloudkey.pms.response.hotels.MeetingRoomInformationResponse;
import com.cloudkey.pms.response.memberships.GuestMembershipsResponse;
import com.cloudkey.pms.response.memberships.MemberPointsResponse;
import com.cloudkey.pms.response.memberships.NameIdByMembershipResponse;
import com.cloudkey.pms.response.reservations.*;
import com.cloudkey.pms.response.roomassignments.AssignRoomResponse;
import com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse;
import com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;
import com.micros.pms.processors.hotels.HotelInformationProcessor;
import com.micros.pms.processors.memberships.GuestMembershipsProcessor;
import com.micros.pms.processors.memberships.NameIdByMembershipProcessor;
import com.micros.pms.processors.reservations.*;
import com.micros.pms.processors.roomassignments.AssignRoomProcessor;
import com.micros.pms.processors.roomassignments.GetAvailabilityProcessor;
import com.micros.pms.processors.roomassignments.ReleaseRoomProcessor;
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

	// Room assignments
	@Inject
	AssignRoomProcessor assignRoomProcessor;

	@Inject
	ReleaseRoomProcessor releaseRoomProcessor;

	@Inject
	GetAvailabilityProcessor getAvailabilityProcessor;

	// Hotels
	@Inject
	HotelInformationProcessor hotelInformationProcessor;

	// Memberships
	@Inject
	NameIdByMembershipProcessor nameIdByMembershipProcessor;

	@Inject
	GuestMembershipsProcessor guestMembershipsProcessor;

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
    public GetAvailabilityResponse checkAvailability(GetAvailabilityRequest getAvailabilityRequest) throws PMSInterfaceException {
	    log.debug("checkAvailability: Enter method.");
	    return getAvailabilityProcessor.process(getAvailabilityRequest);
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
    public NameIdByMembershipResponse getNameIdInformation(NameIdByMembershipRequest nameIdByMembershipRequest) throws PMSInterfaceException {
        log.debug("getNameIdInformation: Enter method.");
	    return nameIdByMembershipProcessor.process(nameIdByMembershipRequest);
    }

    @Override
    public HotelInformationResponse hotelInformationQuery(HotelInformationRequest hotelInformationRequest) throws PMSInterfaceException {
        log.debug("hotelInformationQuery: Enter method.");
		return hotelInformationProcessor.process(hotelInformationRequest);
    }

	/**
	 * Fetch member points by membership type, number and last name.
	 *
	 * To accomplish this, we use two OWS calls:
	 * 1. NameByIdMembership, to lookup the internal member ID by their membership type, number and last name.
	 * 2. GuestMemberships, to lookup the membership points by the internal member ID.
	 *
	 * @param memberPointsRequest
	 * @return
	 * @throws PMSInterfaceException
	 */
    @Override
    public MemberPointsResponse memberPointsQuery(MemberPointsRequest memberPointsRequest) throws PMSInterfaceException {
	    log.debug("memberPointsQuery: Enter method.");

	    // GuestMembershipsRequest cannot be looked up by membership last name, membership and num.
        // Get the name id for the member
        String membershipLastName = memberPointsRequest.getMemberLastName();
        String membershipType = memberPointsRequest.getMembershipType();
        String membershipNumber = memberPointsRequest.getMembershipNumber();

	    NameIdByMembershipResponse nameIdByMembershipResponse = getNameIdInformation(new NameIdByMembershipRequest(membershipType, membershipNumber, membershipLastName));

	    // Get the membership request
	    GuestMembershipsResponse guestMembershipsResponse = guestMembershipsProcessor.process(new GuestMembershipsRequest(nameIdByMembershipResponse.getNameId()));

	    MemberPointsResponse response = new MemberPointsResponse();

	    Optional<Membership> firstMembershipOpt = FluentIterable.from(guestMembershipsResponse.getMembershipList()).first();

	    if (firstMembershipOpt.isPresent()) {
		    Membership membership = firstMembershipOpt.get();

		    if (membership.getMembershipType().equalsIgnoreCase(membershipType)) {
                response.setMembershipNumber(membership.getMembershipNumber());
                response.setMembershipType(membership.getMembershipType());
                response.setMembershipId(membership.getMembershipId());
                response.setEffectiveDate(membership.getEffectiveDate());
                response.setTotalPoints(membership.getCurrentPoints().toString());
                response.setExpireDate(membership.getExpirationDate());
            }
        }

        return response;
    }
}
