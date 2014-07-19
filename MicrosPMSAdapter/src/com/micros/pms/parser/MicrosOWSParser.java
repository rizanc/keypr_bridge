package com.micros.pms.parser;

import com.micros.pms.logger.MicrosPMSLogger;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.*;
import com.cloudkey.pms.response.*;
import com.micros.pms.processor.OWSReservationProcessor;
import com.micros.pms.processor.OWSResvAdvancedProcessor;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class MicrosOWSParser implements IParserInterface {
    @Override
    public GetFolioResponse retrieveFolioInfo(GetFolioRequest getFolioRequest) {

        return null;
    }

    @Override
    public ReleaseRoomResponse releaseRoom(ReleaseRoomRequest releaseRoomRequest) {
        ReleaseRoomResponse response;

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " releaseRoom ", " Enter releaseRoom method. ");
        response = new OWSReservationProcessor().processReleaseRoom(releaseRoomRequest);

        return response;
    }

    @Override
    public CheckInResponse guestCheckIn(CheckInRequest checkInRequest) {
        CheckInResponse response;

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " guestCheckIn ", " Enter guestCheckIn method. ");
        response = new OWSResvAdvancedProcessor().processCheckIn(checkInRequest);

        return response;
    }

    @Override
    public AssignRoomResponse assignRoom(AssignRoomRequest assignRoomRequest) {
        AssignRoomResponse response;

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " assignRoom ", " Enter assignRoom method. ");
        response = new OWSReservationProcessor().processAssignRoom(assignRoomRequest);

        return response;
    }

    @Override
    public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) {
        CheckOutResponse response;

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " guestCheckOut ", " Enter guestCheckOut method. ");
        response = new OWSResvAdvancedProcessor().processCheckOut(checkOutRequest);

        return response;
    }

    @Override
    public UpdateBookingResponse updateBooking(UpdateBookingRequest updateBookingRequest) {
        return null;
    }

    @Override
    public UpdatePaymentResponse updatePayment(UpdatePaymentRequest updatePaymentRequest) {
        return null;
    }

    @Override
    public GetAvailabilityResponse checkAvailability(GetAvailabilityRequest getAvailabilityRequest) {
        return null;
    }

    @Override
    public SearchReservationResponse searchReservationData(SearchReservationRequest searchReservationRequest) {

        SearchReservationResponse response;

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " searchReservationData ", " Enter searchReservationData method. ");
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
        return null;
    }

    @Override
    public MemberPointsResponse memberPointsQuery(MemberPointsRequest memberPointsRequest) {
        return null;
    }
}
