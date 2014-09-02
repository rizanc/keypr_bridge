package com.micros.ows.client;

import com.cloudkey.pms.request.hotels.HotelInformationRequest;
import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.NameLookupRequest;
import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.request.rooms.AssignRoomRequest;
import com.cloudkey.pms.request.rooms.FetchCalendarRequest;
import com.cloudkey.pms.request.rooms.ReleaseRoomRequest;
import com.cloudkey.pms.response.rooms.FetchCalendarResponse;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.micros.pms.MicrosOWSParser;
import org.joda.time.LocalDate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSTestUtils {

    private static final String PMS_RESERVATION_ID = "893542";
    private static final LocalDate START_DATE = new LocalDate(2014, 10, 5);
    private static final LocalDate END_DATE = new LocalDate(2014, 10, 11);
    private static final String ROOM_TYPE_DEFAULT = "SKN";
	private static final String CREDIT_CARD_NO = "4111111111111111";
	private static final String CARD_HOLDER_NAME = "John Smith";
	private static final String CARD_TYPE = "AX";
	private static final LocalDate EXPIRATION_DATE = new LocalDate(2016, 1, 12);
	private static final String EMAIL = "errory@lollison.com";
    private static final String LAST_NAME = "Smith";
    private static final String FIRST_NAME = "John";
    private static final String HOTEL_CODE = "GSDH";
    private static final String MEMBER_ID = "223123123123123212";
    private static final String MEMBER_TYPE = "IB";

	@Inject
	MicrosOWSParser microsOWSParser;

	public void Availability() {
		HashMap<Integer, Integer> ageMap = Maps.newHashMap();
		ageMap.put(31, 1);
		ageMap.put(12, 1);
		ageMap.put(4, 1);

		FetchCalendarRequest fetchCalendarRequest = new FetchCalendarRequest("BAR", ageMap, START_DATE, END_DATE, false);

        FetchCalendarResponse response =
                microsOWSParser.checkAvailability(fetchCalendarRequest);
    }

    public void FutureBookingSummary() {

        SearchReservationRequest request = new SearchReservationRequest(
	        PMS_RESERVATION_ID,
	        FIRST_NAME,
	        LAST_NAME,
	        null, //CREDIT_CARD_NO,
	        null,
	        null,
	        null,
	        null,
	        null
        );
	    
        microsOWSParser.searchReservationData(request);
    }

    public void AssignRoom() {
        AssignRoomRequest request = new AssignRoomRequest(PMS_RESERVATION_ID, ROOM_TYPE_DEFAULT);

	    microsOWSParser.assignRoom(request);
    }

    public void ReleaseRoom() {
        ReleaseRoomRequest request = new ReleaseRoomRequest(PMS_RESERVATION_ID);

	    microsOWSParser.releaseRoom(request);
    }

    public void CheckIn() {
        CheckInRequest request = new CheckInRequest(PMS_RESERVATION_ID, CREDIT_CARD_NO, EXPIRATION_DATE, CARD_HOLDER_NAME, CARD_TYPE);

	    microsOWSParser.guestCheckIn(request);
    }


    public void CheckOut() {
        CheckOutRequest request = new CheckOutRequest(PMS_RESERVATION_ID);

	    microsOWSParser.guestCheckOut(request);
    }

    public void ModifyBooking() {
        //owsReservationProcessor.fetchBooking("938929");
        //owsReservationProcessor.fetchBooking("11900");

        List<String> notes = Arrays.asList("Comment 1", "Comment 2", "Comment 3");
        AddReservationNotesRequest addReservationNotesRequest = new AddReservationNotesRequest(PMS_RESERVATION_ID, notes);

	    microsOWSParser.addReservationNotes(addReservationNotesRequest);
    }

    public void Folio() {
        GetFolioRequest request = new GetFolioRequest(PMS_RESERVATION_ID);

	    microsOWSParser.retrieveFolioInfo(request);
    }

    public void HotelInformation() {
        HotelInformationRequest request = new HotelInformationRequest();

	    microsOWSParser.hotelInformationQuery(request);
    }

    public void NameLookupByMembership() {

        NameLookupRequest request = new NameLookupRequest("OR", "1166666666", "REWARDS");

	    microsOWSParser.getNameIdInformation(request);
    }

    public void GetCardList() {

/*        NameIdByMembershipRequest request = new NameIdByMembershipRequest();
        request.setMembershipNumber("1166666666");
        request.setMembershipType("OR");
        request.setLastname("REWARDS");*/

        GuestMembershipsRequest request = new GuestMembershipsRequest("220080");

	    microsOWSParser.getMembershipInformation(request);
    }
}
