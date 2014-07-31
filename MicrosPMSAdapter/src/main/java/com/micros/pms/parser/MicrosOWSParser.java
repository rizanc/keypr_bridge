package com.micros.pms.parser;

import com.cloudkey.commons.Membership;
import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.*;
import com.cloudkey.pms.response.*;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.processor.*;
import org.apache.commons.lang3.NotImplementedException;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class MicrosOWSParser implements IParserInterface {
    @Override
    public GetFolioResponse retrieveFolioInfo(GetFolioRequest getFolioRequest) throws PMSInterfaceException {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " retrieveFolioInfo ", " Enter retrieveFolioInfo method. ");

        try {
            return new OWSResvAdvancedProcessor().processRetrieveFolioInfo(getFolioRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public ReleaseRoomResponse releaseRoom(ReleaseRoomRequest releaseRoomRequest) throws PMSInterfaceException {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " releaseRoom ", " Enter releaseRoom method. ");

        try {
            return new OWSReservationProcessor().processReleaseRoom(releaseRoomRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public CheckInResponse guestCheckIn(CheckInRequest checkInRequest) throws PMSInterfaceException {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " guestCheckIn ", " Enter guestCheckIn method. ");

        try {
            return new OWSResvAdvancedProcessor().processCheckIn(checkInRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public AssignRoomResponse assignRoom(AssignRoomRequest assignRoomRequest) throws PMSInterfaceException {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " assignRoom ", " Enter assignRoom method. ");

        try {
            return new OWSReservationProcessor().processAssignRoom(assignRoomRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) throws PMSInterfaceException {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " guestCheckOut ", " Enter guestCheckOut method. ");

        try {
            return new OWSResvAdvancedProcessor().processCheckOut(checkOutRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public UpdateBookingResponse updateBooking(UpdateBookingRequest updateBookingRequest) throws PMSInterfaceException {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " updateBooking ", " Enter updateBooking method. ");

        try {
            return new OWSReservationProcessor().processUpdateBooking(updateBookingRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public MakePaymentResponse makePayment(MakePaymentRequest request) throws PMSInterfaceException {
        // TODO
        throw new NotImplementedException("TODO");
    }

    @Override
    public UpdatePaymentResponse updatePayment(UpdatePaymentRequest updatePaymentRequest) throws PMSInterfaceException {
        return null;
    }

    @Override
    public GetAvailabilityResponse checkAvailability(GetAvailabilityRequest getAvailabilityRequest) throws PMSInterfaceException {

        GetAvailabilityResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " checkAvailability ", " Enter checkAvailability method. ");
        try {
            response = new OWSAvailabilityProcessor().processAvailability(getAvailabilityRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }

        return response;
    }

    @Override
    public SearchReservationResponse searchReservationData(SearchReservationRequest searchReservationRequest) throws PMSInterfaceException {

        SearchReservationResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " searchReservationData ", " Enter searchReservationData method. ");
        try {
            response = new OWSReservationProcessor().processSearchReservationData(searchReservationRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }

        return response;

    }

    @Override
    public MeetingRoomInformationResponse getMeetingInformation(MeetingRoomInformationRequest meetingRoomInformationRequest) throws PMSInterfaceException  {
        return null;
    }

    @Override
    public GuestMembershipResponse getMembershipInformation(GuestMembershipsRequest guestMembershipsRequest) throws PMSInterfaceException {

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getMembershipInformation ", " Enter getMembershipInformation method. ");
        try {
            return new OWSNameProcessor().processGuestCardList(guestMembershipsRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public NameIdByMembershipResponse getNameIdInformation(NameIdByMembershipRequest nameIdByMembershipRequest) throws PMSInterfaceException {

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getNameIdInformation ", " Enter getNameIdInformation method. ");

        try {
            return new OWSNameProcessor().processNameLookupByMembership(nameIdByMembershipRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public HotelInformationResponse hotelInformationQuery(HotelInformationRequest hotelInformationRequest) throws PMSInterfaceException {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " hotelInformationQuery ", " Enter hotelInformationQuery method. ");

        try {
            return new OWSInformationProcessor().processHotelInformation(hotelInformationRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }
    }

    @Override
    public MemberPointsResponse memberPointsQuery(MemberPointsRequest memberPointsRequest) throws PMSInterfaceException {
        MemberPointsResponse response = new MemberPointsResponse();
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " memberPointsQuery ", " Enter memberPointsQuery method. ");

        // Get the name id for the member
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

        NameIdByMembershipRequest nameIdByMembershipRequest = new NameIdByMembershipRequest(membershipType, membershipNumber, membershipLastName);

        NameIdByMembershipResponse nameIdByMembershipResponse = getNameIdInformation(nameIdByMembershipRequest);
        if (nameIdByMembershipResponse.getStatus() == IMicrosConstants.RESPONSE_FAIL) {
            response.setStatus(IMicrosConstants.RESPONSE_FAIL);
            response.setErrorMessage(nameIdByMembershipResponse.getErrorMessage());
            MicrosPMSLogger.logInfo(MicrosOWSParser.class, " memberPointsQuery ", " Last/Member Type/Member Number are all required. ");
            return response;
        }

        String nameID = nameIdByMembershipResponse.getNameId();

        // Get the membership request
        GuestMembershipsRequest guestMembershipRequest = new GuestMembershipsRequest(nameID);
        GuestMembershipResponse guestMembershipResponse = null;
        try {
            guestMembershipResponse = new OWSNameProcessor().processGuestCardList(guestMembershipRequest);
        } catch (RemoteException e) {
            throw new PMSInterfaceException(e);
        }
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
