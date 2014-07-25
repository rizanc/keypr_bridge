package com.micros.pms.parser;

import com.micros.pms.logger.MicrosPMSLogger;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.*;
import com.cloudkey.pms.response.*;
import com.micros.pms.processor.*;


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
        return null;
    }

    @Override
    public NameIdBymembershipResponse getNameIdInformation(NameIdByMembershipRequest nameIdByMembershipRequest) {
        return null;
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
        MemberPointsResponse response;

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " processFetchMemberPoints ", " Enter processFetchMemberPoints method. ");
        response = new OWSMembershipProcessor().processFetchMemberPoints(memberPointsRequest);

        return response;
    }
}
