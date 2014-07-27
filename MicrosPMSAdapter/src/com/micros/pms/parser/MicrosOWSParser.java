package com.micros.pms.parser;

import com.cloudkey.commons.Membership;
import com.micros.ows.membership.MembershipServiceStub;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.*;
import com.cloudkey.pms.response.*;
import com.micros.pms.processor.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by crizan2 on 16/07/2014.
 */

public class MicrosOWSParser implements IParserInterface {
    @Override
    public GetFolioResponse retrieveFolioInfo(GetFolioRequest getFolioRequest) {

        GetFolioResponse response;
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " retrieveFolioInfo ", " Enter retrieveFolioInfo method. ");
        response = new OWSResvAdvancedProcessor().processRetrieveFolioInfo(getFolioRequest);

        return response;
    }

    @Override
    public ReleaseRoomResponse releaseRoom(ReleaseRoomRequest releaseRoomRequest) {
        ReleaseRoomResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " releaseRoom ", " Enter releaseRoom method. ");
        response = new OWSReservationProcessor().processReleaseRoom(releaseRoomRequest);

        return response;
    }

    @Override
    public CheckInResponse guestCheckIn(CheckInRequest checkInRequest) {
        CheckInResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " guestCheckIn ", " Enter guestCheckIn method. ");
        response = new OWSResvAdvancedProcessor().processCheckIn(checkInRequest);

        return response;
    }

    @Override
    public AssignRoomResponse assignRoom(AssignRoomRequest assignRoomRequest) {
        AssignRoomResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " assignRoom ", " Enter assignRoom method. ");
        response = new OWSReservationProcessor().processAssignRoom(assignRoomRequest);

        return response;
    }

    @Override
    public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) {
        CheckOutResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " guestCheckOut ", " Enter guestCheckOut method. ");
        response = new OWSResvAdvancedProcessor().processCheckOut(checkOutRequest);

        return response;
    }

    @Override
    public UpdateBookingResponse updateBooking(UpdateBookingRequest updateBookingRequest) {

        UpdateBookingResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " updateBooking ", " Enter updateBooking method. ");
        response = new OWSReservationProcessor().processUpdateBooking(updateBookingRequest);

        return response;
    }

    @Override
    public UpdatePaymentResponse updatePayment(UpdatePaymentRequest updatePaymentRequest) {
        return null;
    }

    @Override
    public GetAvailabilityResponse checkAvailability(GetAvailabilityRequest getAvailabilityRequest) {

        GetAvailabilityResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " checkAvailability ", " Enter checkAvailability method. ");
        response = new OWSAvailabilityProcessor().processAvailability(getAvailabilityRequest);

        return response;
    }

    @Override
    public SearchReservationResponse searchReservationData(SearchReservationRequest searchReservationRequest) {

        SearchReservationResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " searchReservationData ", " Enter searchReservationData method. ");
        response = new OWSReservationProcessor().processSearchReservationData(searchReservationRequest);

        return response;

    }

    @Override
    public MeetingRoomInformationResponse getMeetingInformation(MeetingRoomInformationRequest meetingRoomInformationRequest) {
        return null;
    }

    @Override
    public GuestMembershipResponse getMembershipInformation(GuestMembershipsRequest guestMembershipsRequest) {

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getMembershipInformation ", " Enter getMembershipInformation method. ");
        GuestMembershipResponse guestMembershipResponse = new OWSNameProcessor().processGuestCardList(guestMembershipsRequest);
        return guestMembershipResponse;
    }

    @Override
    public NameIdBymembershipResponse getNameIdInformation(NameIdByMembershipRequest nameIdByMembershipRequest) {
        NameIdBymembershipResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getNameIdInformation ", " Enter getNameIdInformation method. ");

        response = new OWSNameProcessor().processNameLookupByMembership(nameIdByMembershipRequest);

        return response;
    }

    @Override
    public HotelInformationResponse hotelInformationQuery(HotelInformationRequest hotelInformationRequest) {
        HotelInformationResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " hotelInformationQuery ", " Enter hotelInformationQuery method. ");
        response = new OWSInformationProcessor().processHotelInformation(hotelInformationRequest);

        return response;
    }

    @Override
    public MemberPointsResponse memberPointsQuery(MemberPointsRequest memberPointsRequest) {
        MemberPointsResponse response = new MemberPointsResponse();
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " memberPointsQuery ", " Enter memberPointsQuery method. ");

        // Get the name id for the member
        NameIdBymembershipResponse nameIdMembershipResponse = new NameIdBymembershipResponse();
        NameIdByMembershipRequest nameIdByMembershipRequest = new NameIdByMembershipRequest();

        String membershipLastName = memberPointsRequest.getMemberLastName();
        String membershipType = memberPointsRequest.getMembershipType();
        String membershipNumber = memberPointsRequest.getMembershipNumber();

        if (membershipLastName.isEmpty() ||
                membershipType.isEmpty() ||
                membershipNumber.isEmpty()) {
            response.setStatus(IMicrosConstants.RESPONSE_FAIL);
            response.setErrorMessage(IMicrosConstants.REQUIRED_FIELDS_EMPTY);
            MicrosPMSLogger.logInfo(MicrosOWSParser.class, " memberPointsQuery ", " Last/Member Type/Member Number are all required. ");
            return response;
        }

        nameIdByMembershipRequest.setLastname(membershipLastName);
        nameIdByMembershipRequest.setMembershipType(membershipType);
        nameIdByMembershipRequest.setMembershipNumber(membershipNumber);

        NameIdBymembershipResponse nameIdBymembershipResponse = getNameIdInformation(nameIdByMembershipRequest);
        if (nameIdBymembershipResponse.getStatus() == IMicrosConstants.RESPONSE_FAIL) {
            response.setStatus(IMicrosConstants.RESPONSE_FAIL);
            response.setErrorMessage(nameIdBymembershipResponse.getErrorMessage());
            MicrosPMSLogger.logInfo(MicrosOWSParser.class, " memberPointsQuery ", " Last/Member Type/Member Number are all required. ");
            return response;
        }

        String nameID = nameIdBymembershipResponse.getNameId();

        // Get the membership request
        GuestMembershipsRequest guestMembershipRequest = new GuestMembershipsRequest();
        guestMembershipRequest.setNameId(nameID);
        GuestMembershipResponse guestMembershipResponse = new OWSNameProcessor().processGuestCardList(guestMembershipRequest);
        if (guestMembershipResponse.getStatus() == IMicrosConstants.RESPONSE_FAIL) {
            response.setStatus(IMicrosConstants.RESPONSE_FAIL);
            response.setErrorMessage(guestMembershipResponse.getErrorMessage());
            return response;
        }

        List<Membership> memberships = guestMembershipResponse.getMembershipList();
        if (memberships != null) {

            for (Membership membership : memberships) {
                String mt = membership.getMembershipType();
                if (membership.getMembershipType().equalsIgnoreCase(membershipType)) {
                    response.setMembershipNumber(membership.getMembershipNumber());
                    response.setMembershipType(membership.getMembershipType());
                    response.setMembershipId(membership.getMembershipId());
                    response.setEffectiveDate(membership.getEffectiveDate());
                    response.setTotalPoints(Double.toString(membership.getCurrentPoints()));
                    response.setExpireDate(membership.getExpirationDate());
                    break;
                }
            }
        }

        response.setStatus(IMicrosConstants.RESPONSE_SUCCESS);
        return response;
    }
}
