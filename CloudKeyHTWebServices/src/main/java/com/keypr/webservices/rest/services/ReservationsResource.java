package com.keypr.webservices.rest.services;

import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.response.reservations.*;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.*;

/**
 * REST service to the reservation methods of {@link IParserInterface}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Path("/reservations")
@Api(value = "/reservations", description = "Reservations resource")
public class ReservationsResource extends AbstractResource {

    @Path("/search")
    @GET
    @ApiOperation(
        value = "Fetches reservations which match the provided criteria",
        response = SearchReservationResponse.class
    )
    @ApiResponses({
        @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
        @ApiResponse(code = 422, message = "Request was not valid")
    })
    public SearchReservationResponse searchReservation(
            @QueryParam("confirmationNumber") String confirmationNumber,
            @QueryParam("firstName") String firstName,
            @QueryParam("lastName") String lastName,
            @QueryParam("creditCardNumber") String creditCardNumber
            ) {
        SearchReservationRequest request = new SearchReservationRequest(
                confirmationNumber,
                firstName,
                lastName,
                creditCardNumber
        );
        validate(request);

        return messageParser.searchReservationData(request);
    }

    @Path("/checkin")
    @POST
    @ApiOperation(
        value = "Checks in an existing reservation",
        response = CheckInResponse.class
    )
    @ApiResponses({
        @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
        @ApiResponse(code = 422, message = "Request was not valid")
    })
    public CheckInResponse checkIn(@Valid CheckInRequest request) {
        return messageParser.guestCheckIn(request);
    }

    @Path("/checkout")
    @POST
    @ApiOperation(
        value = "Checks out an existing reservation",
        response = CheckOutResponse.class
    )
    @ApiResponses({
        @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
        @ApiResponse(code = 422, message = "Request was not valid")
    })
    public CheckOutResponse checkOut(@Valid CheckOutRequest request) {
        return messageParser.guestCheckOut(request);
    }

    @Path("/folio")
    @GET
    @ApiOperation(
        value = "Fetches the bill for a reservation",
            notes = "Includes room charge and all other charges incurred during stay",
        response = GetFolioResponse.class
    )
    @ApiResponses({
        @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
        @ApiResponse(code = 422, message = "Request was not valid")
    })
    public GetFolioResponse getFolio(@QueryParam("confirmationNumber") String confirmationNumber) {
        GetFolioRequest request = new GetFolioRequest(confirmationNumber);
        validate(request);

        return messageParser.retrieveFolioInfo(request);
    }

    @Path("/folio/pay")
    @POST
    @ApiOperation(
        value = "Not Implemented. Makes a payment towards a reservation folio",
        response = MakePaymentResponse.class
    )
    @ApiResponses({
        @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
        @ApiResponse(code = 422, message = "Request was not valid")
    })
    public MakePaymentResponse makePayment(@Valid MakePaymentRequest request) {
        return messageParser.makePayment(request);
    }

    @Path("/notes")
    @POST
    @ApiOperation(
        value = "Adds staff-viewable notes to a reservation",
        response = UpdateBookingResponse.class
    )
    @ApiResponses({
        @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
        @ApiResponse(code = 422, message = "Request was not valid")
    })
    public UpdateBookingResponse updateBookingRequest(@Valid UpdateBookingRequest request) {
        return messageParser.updateBooking(request);
    }

    // It's not clear that there is a MICROS message for this, or what the intention
    // of this method is. Disabling it & probably will remove it.
//    @Path("/folio/pay")
//    @PUT
//    @ApiOperation("Updates the payment records of a reservation")
//    public UpdatePaymentResponse makePayment(@Valid UpdatePaymentRequest request) {
//        return messageParser.updatePayment(request);
//    }
}