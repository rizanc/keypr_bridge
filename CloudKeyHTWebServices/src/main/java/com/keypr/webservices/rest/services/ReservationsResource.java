package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.request.reservations.AssignRoomRequest;
import com.cloudkey.pms.request.reservations.ReleaseRoomRequest;
import com.cloudkey.pms.response.EmptyResponse;
import com.cloudkey.pms.response.reservations.*;
import com.cloudkey.pms.response.reservations.AssignRoomResponse;
import com.cloudkey.pms.response.reservations.ReleaseRoomResponse;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * REST service to the reservation methods of {@link com.cloudkey.message.parser.PMSInterface}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Path("/reservations")
@Api(value = "/reservations", description = "Reservations resource")
@Singleton
public class ReservationsResource extends AbstractResource {
	@Inject
	protected ReservationResource.ReservationResourceFactory reservationResourceFactory;

	@GET
	@ApiOperation(
		value = "Fetches reservations which match the provided criteria",
		response = SearchReservationResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	public SearchReservationResponse searchReservation(
		@QueryParam("pmsReservationId") String pmsReservationId,
		@QueryParam("confirmationNumber") String confirmationNumber,
		@QueryParam("firstName") String firstName,
		@QueryParam("lastName") String lastName,
		@QueryParam("creditCardNumber") String creditCardNumber,
		@QueryParam("membershipNumber") String membershipNumber,
		@QueryParam("membershipType") String membershipType,
		@QueryParam("extReferenceNumber") String extReferenceNumber,
		@QueryParam("extRefLegNumber") Integer extRefLegNumber,
		@QueryParam("extReferenceType") String extReferenceType
	) {
		return messageParser.searchReservationData(
			valid(new SearchReservationRequest(
				pmsReservationId,
				confirmationNumber,
				firstName,
				lastName,
				creditCardNumber,
				membershipNumber,
				membershipType,
				extReferenceNumber,
				extRefLegNumber,
				extReferenceType
			))
		);
	}

	@POST
	@ApiOperation(
		value = "Creates a new reservation",
		response = CreateReservationResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	public CreateReservationResponse createReservation(@Valid CreateReservationRequest request) {
		return messageParser.createReservation(request);
	}

	@Path("/{pmsReservationId}")
	@ApiOperation(value = "Reservation", response = ReservationResource.class)
	public ReservationResource getReservationResource(@PathParam("pmsReservationId") String pmsReservationId) {
		return reservationResourceFactory.create(pmsReservationId);
	}

//    @Path("/folio/pay")
//    @POST
//    @ApiOperation(
//        value = "Not Implemented. Makes a payment towards a reservation folio",
//        response = MakePaymentResponse.class
//    )
//    @ApiResponses({
//	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
//	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
//	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
//    })
//    public MakePaymentResponse makePayment(@Valid MakePaymentRequest request) {
//        return messageParser.makePayment(request);
//    }

	// It's not clear that there is a MICROS message for this, or what the intention
    // of this method is. Disabling it & probably will remove it.
//    @Path("/folio/pay")
//    @PUT
//    @ApiOperation("Updates the payment records of a reservation")
//    @ApiResponses({
//	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
//	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
//	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
//    })
//    public UpdatePaymentResponse makePayment(@Valid UpdatePaymentRequest request) {
//        return messageParser.updatePayment(request);
//    }
}