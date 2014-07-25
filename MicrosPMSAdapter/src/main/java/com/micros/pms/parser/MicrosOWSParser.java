package com.micros.pms.parser;

import com.micros.pms.logger.MicrosPMSLogger;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.*;
import com.cloudkey.pms.response.*;
import com.micros.pms.processor.OWSAvailabilityProcessor;
import com.micros.pms.processor.OWSInformationProcessor;
import com.micros.pms.processor.OWSReservationProcessor;
import com.micros.pms.processor.OWSResvAdvancedProcessor;


/**
 * Created by crizan2 on 16/07/2014.
 */

public class MicrosOWSParser implements IParserInterface {
    @Override
    public GetFolioResponse retrieveFolioInfo(GetFolioRequest getFolioRequest) {

        GetFolioResponse response;
        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " retrieveFolioInfo ", " Enter retrieveFolioInfo method. ");
        response = new OWSResvAdvancedProcessor().processRetrieveFolioInfo(getFolioRequest);

        return response;
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

        UpdateBookingResponse response;

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " updateBooking ", " Enter updateBooking method. ");
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

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " checkAvailability ", " Enter checkAvailability method. ");
        response = new OWSAvailabilityProcessor().processAvailability(getAvailabilityRequest);

        return response;
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
    public NameIdByMembershipResponse getNameIdInformation(NameIdByMembershipRequest nameIdByMembershipRequest) {
        return null;
    }

    @Override
    public HotelInformationResponse hotelInformationQuery(HotelInformationRequest hotelInformationRequest) {
        HotelInformationResponse response;

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " hotelInformationQuery ", " Enter hotelInformationQuery method. ");
        response = new OWSInformationProcessor().processHotelInformation(hotelInformationRequest);

        return response;
    }

    @Override
    public MemberPointsResponse memberPointsQuery(MemberPointsRequest memberPointsRequest) {
        return null;
    }
}
