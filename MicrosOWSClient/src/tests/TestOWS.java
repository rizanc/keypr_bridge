package tests;

import com.cloudkey.commons.Reservation;
import com.cloudkey.pms.request.*;
import com.cloudkey.pms.response.CheckInResponse;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.micros.pms.processor.OWSAvailabilityProcessor;
import com.micros.pms.processor.OWSReservationProcessor;
import com.micros.pms.processor.OWSResvAdvancedProcessor;

import java.util.Date;


/**
 * Created by crizan2 on 16/07/2014.
 */
public class TestOWS {

    public static void Availability() {

        OWSAvailabilityProcessor owsAvailabilityProcessor = new OWSAvailabilityProcessor();

        GetAvailabilityRequest getAvailabilityRequest = new GetAvailabilityRequest();
        getAvailabilityRequest.setStartDate(new Date(2014,10,5));
        getAvailabilityRequest.setEndDate(new Date(2014,10,11));

        GetAvailabilityResponse response =
                owsAvailabilityProcessor.processAvailability(getAvailabilityRequest);

    }

    public static void FutureBookingSummary() {

        OWSReservationProcessor owsReservationProcessor = new OWSReservationProcessor();
        SearchReservationRequest request = new SearchReservationRequest();
//        request.setConfirmationNumber("11650");
        request.setConfirmationNumber("938929");
        owsReservationProcessor.processSearchReservationData(request);


    }

    public static void AssignRoom() {

        OWSReservationProcessor owsReservationProcessor = new OWSReservationProcessor();
        AssignRoomRequest request = new AssignRoomRequest();

        Reservation reservation = new Reservation();
        reservation.setConfirmationNumber("11651");

        request.setReservation(reservation);
        request.setRoomTypeCode("SKN");
        owsReservationProcessor.processAssignRoom(request);


    }

    public static void ReleaseRoom() {

        OWSReservationProcessor owsReservationProcessor = new OWSReservationProcessor();
        ReleaseRoomRequest request = new ReleaseRoomRequest();

        Reservation reservation = new Reservation();
        reservation.setConfirmationNumber("11651");
        request.setReservationId("11651");

        owsReservationProcessor.processReleaseRoom(request);

    }

    public static void CheckIn() {

        OWSResvAdvancedProcessor owsResvAdvancedProcessor = new OWSResvAdvancedProcessor();
        CheckInRequest request = new CheckInRequest();

        Reservation reservation = new Reservation();
        reservation.setConfirmationNumber("11651");
        reservation.setCreditCardNumber("4111111111111111");

        request.setReservation(reservation);

        owsResvAdvancedProcessor.processCheckIn(request);

    }


    public static void CheckOut() {

        OWSResvAdvancedProcessor owsResvAdvancedProcessor = new OWSResvAdvancedProcessor();
        CheckOutRequest request = new CheckOutRequest();

        request.setConfirmationNumber("11651");

        owsResvAdvancedProcessor.processCheckOut(request);

    }
}
