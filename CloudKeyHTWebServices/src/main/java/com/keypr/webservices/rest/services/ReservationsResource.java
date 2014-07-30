package com.keypr.webservices.rest.services;

import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.*;
import com.cloudkey.pms.response.*;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * REST service for the reservation methods of {@link IParserInterface}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Path("/reservations")
@Api(value = "/reservations", description = "Reservations resource")
public class ReservationsResource extends AbstractResource {

    @Path("/search")
    @GET
    @ApiOperation("Fetches reservations which match the provided criteria")
    public SearchReservationResponse searchReservation(
            @QueryParam("confirmationNumber") String confirmationNumber,
            @QueryParam("emailId") String emailId,
            @QueryParam("firstName") String firstName,
            @QueryParam("lastName") String lastName,
            @QueryParam("creditCardNumber") String creditCardNumber
            ) {
        SearchReservationRequest request = new SearchReservationRequest(
                confirmationNumber,
                emailId,
                firstName,
                lastName,
                creditCardNumber
        );

        return messageParser.searchReservationData(request);
    }

    @Path("/checkin")
    @POST
    @ApiOperation(
            value = "Checks in an existing reservation",
            notes = "Micros implementation only uses request.reservation.{confirmationNumber, creditCardNumber}"
    )
    public CheckInResponse checkIn(CheckInRequest request) {
        return messageParser.guestCheckIn(request);
    }

    @Path("/checkout")
    @POST
    @ApiOperation("Checks out an existing reservation")
    public CheckOutResponse checkOut(CheckOutRequest request) {
        return messageParser.guestCheckOut(request);
    }

    @Path("/folio")
    @GET
    @ApiOperation(
            value = "Fetches the bill for a reservation",
            notes = "Includes room charge and all other charges incurred during stay"
    )
    public GetFolioResponse getFolio(@QueryParam("confirmationNumber") String confirmationNumber) {
        GetFolioRequest request = new GetFolioRequest(confirmationNumber);

        return messageParser.retrieveFolioInfo(request);
    }

    @Path("/folio/pay")
    @POST
    @ApiOperation("Makes a payment towards a reservation folio")
    public MakePaymentResponse makePayment(MakePaymentRequest request) {
        return messageParser.makePayment(request);
    }

    @Path("/notes")
    @POST
    @ApiOperation("Adds staff-viewable notes to a reservation")
    public UpdateBookingResponse updateBookingRequest(UpdateBookingRequest request) {
        return messageParser.updateBooking(request);
    }

    // It's not clear that there is a MICROS message for this, or what the intention
    // of this method is. Disabling it, probably will remove it.
//    @Path("/folio/pay")
//    @PUT
//    @ApiOperation("Updates the payment records of a reservation")
//    public UpdatePaymentResponse makePayment(UpdatePaymentRequest request) {
//        return messageParser.updatePayment(request);
//    }
}