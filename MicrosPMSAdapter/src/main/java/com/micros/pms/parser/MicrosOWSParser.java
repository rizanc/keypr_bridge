package com.micros.pms.parser;

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
import com.cloudkey.pms.response.memberships.GuestMembershipResponse;
import com.cloudkey.pms.response.memberships.MemberPointsResponse;
import com.cloudkey.pms.response.memberships.NameIdByMembershipResponse;
import com.cloudkey.pms.response.reservations.*;
import com.cloudkey.pms.response.roomassignments.AssignRoomResponse;
import com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse;
import com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;
import com.micros.pms.processor.*;
import org.apache.commons.lang3.NotImplementedException;

import javax.xml.ws.WebServiceException;
import java.util.List;

/**
 *
 * @author crizan2
 */
public class MicrosOWSParser extends OWSBase implements IParserInterface {

	@Inject
	OWSAvailabilityProcessor availabilityProcessor;

	@Inject
	OWSInformationProcessor informationProcessor;

	@Inject
	OWSMeetingRoomProcessor meetingRoomProcessor;
	
	@Inject
	OWSNameProcessor nameProcessor;

	@Inject
	OWSReservationProcessor reservationProcessor;

	@Inject
	OWSResvAdvancedProcessor resvAdvancedProcessor;

	@Override
    public GetFolioResponse retrieveFolioInfo(GetFolioRequest getFolioRequest) throws PMSInterfaceException {
        log.debug("retrieveFolioInfo: Enter method.");

        try {
            return resvAdvancedProcessor.processRetrieveFolioInfo(getFolioRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public ReleaseRoomResponse releaseRoom(ReleaseRoomRequest releaseRoomRequest) throws PMSInterfaceException {
        log.debug("releaseRoom: Enter method.");

        try {
            return reservationProcessor.processReleaseRoom(releaseRoomRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public CheckInResponse guestCheckIn(CheckInRequest checkInRequest) throws PMSInterfaceException {
        log.debug("guestCheckIn: Enter method.");

        try {
            return resvAdvancedProcessor.processCheckIn(checkInRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public AssignRoomResponse assignRoom(AssignRoomRequest assignRoomRequest) throws PMSInterfaceException {
        log.debug("assignRoom: Enter method.");

        try {
            return reservationProcessor.processAssignRoom(assignRoomRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) throws PMSInterfaceException {
        log.debug("guestCheckOut: Enter method.");

        try {
            return resvAdvancedProcessor.processCheckOut(checkOutRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public AddReservationNotesResponse addReservationNotes(AddReservationNotesRequest request) throws PMSInterfaceException {
        log.debug("addReservationNotes: Enter method.");

        try {
            return reservationProcessor.processAddNotes(request);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }
    }

	@Override
	public PostChargeResponse postCharge(PostChargeRequest request) throws PMSInterfaceException {
		log.debug("postCharge: Enter method.");

		try {
			return resvAdvancedProcessor.postCharge(request);
		} catch (WebServiceException e) {
			throw new PMSInterfaceException(e);
		}
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

        try {
	        return availabilityProcessor.processAvailability(getAvailabilityRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public SearchReservationResponse searchReservationData(SearchReservationRequest searchReservationRequest) throws PMSInterfaceException {
	    log.debug("searchReservationData: Enter method.");

        SearchReservationResponse response;

        try {
        response = reservationProcessor.processSearchReservationData(searchReservationRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }

        return response;

    }

    @Override
    public MeetingRoomInformationResponse getMeetingInformation(MeetingRoomInformationRequest meetingRoomInformationRequest) throws PMSInterfaceException  {
	    log.debug("getMeetingInformation: Enter method.");

	    throw new NotImplementedException("Not yet implemented");
    }

    @Override
    public GuestMembershipResponse getMembershipInformation(GuestMembershipsRequest guestMembershipsRequest) throws PMSInterfaceException {
	    log.debug("getMembershipInformation: Enter method.");

        try {
            return nameProcessor.processGuestCardList(guestMembershipsRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public NameIdByMembershipResponse getNameIdInformation(NameIdByMembershipRequest nameIdByMembershipRequest) throws PMSInterfaceException {
        log.debug("getNameIdInformation: Enter method.");

        try {
            return nameProcessor.processNameLookupByMembership(nameIdByMembershipRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public HotelInformationResponse hotelInformationQuery(HotelInformationRequest hotelInformationRequest) throws PMSInterfaceException {
        log.debug("hotelInformationQuery: Enter method.");

        try {
            return informationProcessor.processHotelInformation(hotelInformationRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public MemberPointsResponse memberPointsQuery(MemberPointsRequest memberPointsRequest) throws PMSInterfaceException {
	    log.debug("memberPointsQuery: Enter method.");

	    MemberPointsResponse response = new MemberPointsResponse();

        // Get the name id for the member
        String membershipLastName = memberPointsRequest.getMemberLastName();
        String membershipType = memberPointsRequest.getMembershipType();
        String membershipNumber = memberPointsRequest.getMembershipNumber();

        NameIdByMembershipRequest nameIdByMembershipRequest = new NameIdByMembershipRequest(membershipType, membershipNumber, membershipLastName);

        NameIdByMembershipResponse nameIdByMembershipResponse = getNameIdInformation(nameIdByMembershipRequest);

        String nameID = nameIdByMembershipResponse.getNameId();

        // Get the membership request
        GuestMembershipsRequest guestMembershipRequest = new GuestMembershipsRequest(nameID);
        GuestMembershipResponse guestMembershipResponse;
        try {
            guestMembershipResponse = nameProcessor.processGuestCardList(guestMembershipRequest);
        } catch (WebServiceException e) {
            throw new PMSInterfaceException(e);
        }

        List<Membership> memberships = guestMembershipResponse.getMembershipList();
        if (memberships != null) {

            for (Membership membership : memberships) {
                if (membership.getMembershipType().equalsIgnoreCase(membershipType)) {
                response.setMembershipNumber(membership.getMembershipNumber());
                response.setMembershipType(membership.getMembershipType());
                response.setMembershipId(membership.getMembershipId());
                response.setEffectiveDate(membership.getEffectiveDate());
                response.setTotalPoints(membership.getCurrentPoints().toString());
                response.setExpireDate(membership.getExpirationDate());
                    break;
                }
            }
        }

        return response;
    }
}
