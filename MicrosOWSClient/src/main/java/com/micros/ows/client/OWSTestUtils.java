package com.micros.ows.client;

import com.cloudkey.commons.Reservation;
import com.cloudkey.pms.request.*;
import com.cloudkey.pms.response.*;
import com.micros.pms.processor.*;

import java.util.Date;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSTestUtils {

    private static final String CONFIRMATION_NO = "11900";
    private static final Date START_DATE = new Date(2014, 10, 5);
    private static final Date END_DATE = new Date(2014, 10, 11);
    private static final String ROOM_TYPE_DEFAULT = "SKN";
    private static final String CREDIT_CARD_NO = "4111111111111111";
    private static final String LAST_NAME = "Ellison";
    private static final String FIRST_NAME = "LARRY";
    private static final String HOTEL_CODE = "GSDH";
    private static final String MEMBER_ID = "223123123123123212";
    private static final String MEMBER_TYPE = "IB";

    public static void Availability() {

        OWSAvailabilityProcessor owsAvailabilityProcessor = new OWSAvailabilityProcessor();

        GetAvailabilityRequest getAvailabilityRequest = new GetAvailabilityRequest();
        getAvailabilityRequest.setStartDate(START_DATE);
        getAvailabilityRequest.setEndDate(END_DATE);

        GetAvailabilityResponse response =
                owsAvailabilityProcessor.processAvailability(getAvailabilityRequest);

    }

    public static void FutureBookingSummary() {

        OWSReservationProcessor owsReservationProcessor = new OWSReservationProcessor();
        SearchReservationRequest request = new SearchReservationRequest();
        //request.setConfirmationNumber(CONFIRMATION_NO);
        request.setLastName(LAST_NAME);
        request.setFirstName(FIRST_NAME);
        //request.setCreditCardNumber(CREDIT_CARD_NO);
        owsReservationProcessor.processSearchReservationData(request);


    }

    public static void AssignRoom() {

        OWSReservationProcessor owsReservationProcessor = new OWSReservationProcessor();
        AssignRoomRequest request = new AssignRoomRequest();

        Reservation reservation = new Reservation();
        reservation.setConfirmationNumber(CONFIRMATION_NO);

        request.setReservation(reservation);
        request.setRoomTypeCode(ROOM_TYPE_DEFAULT);
        owsReservationProcessor.processAssignRoom(request);


    }

    public static void ReleaseRoom() {

        OWSReservationProcessor owsReservationProcessor = new OWSReservationProcessor();
        ReleaseRoomRequest request = new ReleaseRoomRequest();

        Reservation reservation = new Reservation();
        reservation.setConfirmationNumber(CONFIRMATION_NO);
        request.setReservationId(CONFIRMATION_NO);

        owsReservationProcessor.processReleaseRoom(request);

    }

    public static void CheckIn() {

        OWSResvAdvancedProcessor owsResvAdvancedProcessor = new OWSResvAdvancedProcessor();
        CheckInRequest request = new CheckInRequest();

        Reservation reservation = new Reservation();
        reservation.setConfirmationNumber(CONFIRMATION_NO);
        reservation.setCreditCardNumber(CREDIT_CARD_NO);

        request.setReservation(reservation);

        owsResvAdvancedProcessor.processCheckIn(request);

    }


    public static void CheckOut() {

        OWSResvAdvancedProcessor owsResvAdvancedProcessor = new OWSResvAdvancedProcessor();
        CheckOutRequest request = new CheckOutRequest();

        request.setConfirmationNumber(CONFIRMATION_NO);

        owsResvAdvancedProcessor.processCheckOut(request);

    }

    public static void ModifyBooking() {

        OWSReservationProcessor owsReservationProcessor = new OWSReservationProcessor();
        //owsReservationProcessor.fetchBooking("938929");
        //owsReservationProcessor.fetchBooking("11900");


        UpdateBookingRequest updateBookingRequest = new UpdateBookingRequest();
        updateBookingRequest.setConfirmationNumber(CONFIRMATION_NO);

        String[] notes = new String[]{"Comment 1", "Comment 2", "Comment 3"};
        updateBookingRequest.setNotes(notes);
        owsReservationProcessor.processUpdateBooking(updateBookingRequest);
    }

    public static void Folio() {

        OWSResvAdvancedProcessor owsResvAdvancedProcessor = new OWSResvAdvancedProcessor();

        GetFolioRequest request = new GetFolioRequest();
        request.setConfirmationNumber(CONFIRMATION_NO);

        owsResvAdvancedProcessor.processRetrieveFolioInfo(request);

    }

    public static void HotelInformation() {

        OWSInformationProcessor owsInformationProcessor = new OWSInformationProcessor();

        HotelInformationRequest request = new HotelInformationRequest();
        request.setHotelCode(HOTEL_CODE);

        owsInformationProcessor.processHotelInformation(request);

    }
    public static void Membership() {

        OWSMembershipProcessor owsMembershipProcessor = new OWSMembershipProcessor();

        MemberPointsRequest request = new MemberPointsRequest();
        request.setMembershipNumber(MEMBER_ID);
        request.setMembershipType(MEMBER_TYPE);

        owsMembershipProcessor.processFetchMemberPoints(request);

    }

    public static void NameLookupByMembership() {

        OWSNameProcessor owsNameProcessor = new OWSNameProcessor();

        NameIdByMembershipRequest request = new NameIdByMembershipRequest();
        request.setMembershipNumber("1166666666");
        request.setMembershipType("OR");
        request.setLastname("REWARDS");

        owsNameProcessor.processNameLookupByMembership(request);

    }

    public static void GetCardList() {

        OWSNameProcessor owsNameProcessor = new OWSNameProcessor();

/*        NameIdByMembershipRequest request = new NameIdByMembershipRequest();
        request.setMembershipNumber("1166666666");
        request.setMembershipType("OR");
        request.setLastname("REWARDS");*/

        GuestMembershipsRequest request = new GuestMembershipsRequest();

        request.setNameId("220080");

        owsNameProcessor.processGuestCardList(request);

    }
}
