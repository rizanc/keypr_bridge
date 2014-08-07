package com.micros.ows.client;

import com.cloudkey.pms.request.hotels.HotelInformationRequest;
import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.NameIdByMembershipRequest;
import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.request.roomassignments.AssignRoomRequest;
import com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest;
import com.cloudkey.pms.request.roomassignments.ReleaseRoomRequest;
import com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse;
import com.google.inject.Inject;
import com.micros.pms.processor.*;
import org.joda.time.LocalDate;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSTestUtils {

    private static final String CONFIRMATION_NO = "11900";
    private static final LocalDate START_DATE = new LocalDate(2014, 10, 5);
    private static final LocalDate END_DATE = new LocalDate(2014, 10, 11);
    private static final String ROOM_TYPE_DEFAULT = "SKN";
    private static final String CREDIT_CARD_NO = "4111111111111111";
    private static final String EMAIL = "errory@lollison.com";
    private static final String LAST_NAME = "Ellison";
    private static final String FIRST_NAME = "LARRY";
    private static final String HOTEL_CODE = "GSDH";
    private static final String MEMBER_ID = "223123123123123212";
    private static final String MEMBER_TYPE = "IB";

	@Inject
	OWSAvailabilityProcessor owsAvailabilityProcessor;

	@Inject
	OWSReservationProcessor owsReservationProcessor;

	@Inject
	OWSResvAdvancedProcessor owsResvAdvancedProcessor;

	@Inject
	OWSNameProcessor owsNameProcessor;

	@Inject
	OWSInformationProcessor owsInformationProcessor;

	public void Availability() {
        GetAvailabilityRequest getAvailabilityRequest = new GetAvailabilityRequest(START_DATE, END_DATE);

        try {
            GetAvailabilityResponse response =
                    owsAvailabilityProcessor.processAvailability(getAvailabilityRequest);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    public void FutureBookingSummary() {

        SearchReservationRequest request = new SearchReservationRequest(
	        CONFIRMATION_NO,
	        FIRST_NAME,
	        LAST_NAME,
	        CREDIT_CARD_NO,
	        null,
	        null,
	        null,
	        null,
	        null,
	        null
        );
        try {
            owsReservationProcessor.processSearchReservationData(request);
        } catch (RemoteException e) {
            e.printStackTrace();
        }


    }

        AssignRoomRequest request = new AssignRoomRequest(CONFIRMATION_NO, ROOM_TYPE_DEFAULT);
    public void AssignRoom() {

        try {
            owsReservationProcessor.processAssignRoom(request);
        } catch (RemoteException e) {
            e.printStackTrace();
        }


    }

        ReleaseRoomRequest request = new ReleaseRoomRequest(CONFIRMATION_NO);
    public void ReleaseRoom() {

        try {
            owsReservationProcessor.processReleaseRoom(request);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

        CheckInRequest request = new CheckInRequest(CONFIRMATION_NO, CREDIT_CARD_NO);
    public void CheckIn() {

        try {
            owsResvAdvancedProcessor.processCheckIn(request);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }


    public void CheckOut() {

        CheckOutRequest request = new CheckOutRequest(CONFIRMATION_NO);

        try {
            owsResvAdvancedProcessor.processCheckOut(request);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    public void ModifyBooking() {
        //owsReservationProcessor.fetchBooking("938929");
        //owsReservationProcessor.fetchBooking("11900");

        List<String> notes = Arrays.asList("Comment 1", "Comment 2", "Comment 3");
        UpdateBookingRequest updateBookingRequest = new UpdateBookingRequest(CONFIRMATION_NO, notes);

        try {
            owsReservationProcessor.processUpdateBooking(updateBookingRequest);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void Folio() {

        GetFolioRequest request = new GetFolioRequest(CONFIRMATION_NO);

        try {
            owsResvAdvancedProcessor.processRetrieveFolioInfo(request);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    public void HotelInformation() {
        HotelInformationRequest request = new HotelInformationRequest(HOTEL_CODE);

        try {
            owsInformationProcessor.processHotelInformation(request);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    public void NameLookupByMembership() {

        NameIdByMembershipRequest request = new NameIdByMembershipRequest("OR", "1166666666", "REWARDS");

        try {
            owsNameProcessor.processNameLookupByMembership(request);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    public void GetCardList() {

/*        NameIdByMembershipRequest request = new NameIdByMembershipRequest();
        request.setMembershipNumber("1166666666");
        request.setMembershipType("OR");
        request.setLastname("REWARDS");*/

        GuestMembershipsRequest request = new GuestMembershipsRequest("220080");

        try {
            owsNameProcessor.processGuestCardList(request);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
