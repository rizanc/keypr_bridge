package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.request.reservations.AssignRoomRequest;
import com.cloudkey.pms.request.reservations.ReleaseRoomRequest;
import com.cloudkey.pms.response.EmptyResponse;
import com.cloudkey.pms.response.reservations.*;
import com.cloudkey.pms.response.reservations.AssignRoomResponse;
import com.cloudkey.pms.response.reservations.ReleaseRoomResponse;
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
@Path("/reservations/")
@Api(value = "/reservations", description = "Reservations resource")
public class ReservationsResource extends AbstractResource {
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

	@Path("{pmsReservationId}")
	@PUT
	@ApiOperation(
		value = "Modifies an existing reservation",
		response = EmptyResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 404, message = "The reservation does not exist"),
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	public EmptyResponse modifyReservation(@PathParam("pmsReservationId") String pmsReservationId, ModifyReservationRequest request) {
		request.setPmsReservationId(pmsReservationId);

		return messageParser.modifyReservation(
			valid(request)
		);
	}

	@Path("{pmsReservationId}")
	@DELETE
	@ApiOperation(
		value = "Cancels an existing reservation",
		response = CancelReservationResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 404, message = "The reservation does not exist"),
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	public CancelReservationResponse cancelReservation(
			@PathParam("pmsReservationId") String pmsReservationId,
			@QueryParam("reason") String reason) {
		return messageParser.cancelReservation(
			valid(new CancelReservationRequest(
				pmsReservationId,
				reason
			))
		);
	}

	@Path("{pmsReservationId}")
	@GET
	@ApiOperation(
		value = "Fetches a reservation",
		response = FindReservationResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 404, message = "The reservation does not exist"),
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	public FindReservationResponse get(@PathParam("pmsReservationId") String pmsReservationId) {
		return messageParser.findReservation(
			valid(new FindReservationRequest(pmsReservationId))
		);
	}

	@Path("{pmsReservationId}/room")
	@PUT
	@ApiOperation(
		value = "Assigns a room to an existing reservation",
		response = AssignRoomResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message. Common error codes include: NO_ROOM_AVAILABLE"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	@Consumes(MediaType.WILDCARD) // Does not take any body
	public AssignRoomResponse assignRoom(
		@PathParam("pmsReservationId") String pmsReservationId,
		@Nullable @QueryParam("roomNumber") String roomNumber) {
		return messageParser.assignRoom(
			valid(new AssignRoomRequest(pmsReservationId, roomNumber))
		);
	}

	@Path("{pmsReservationId}/room")
	@DELETE
	@ApiOperation(
		value = "Unassigns the room assigned to a reservation",
		response = ReleaseRoomResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	public ReleaseRoomResponse releaseRoom(
		@PathParam("pmsReservationId") String pmsReservationId) {
		return messageParser.releaseRoom(
			valid(new ReleaseRoomRequest(pmsReservationId))
		);
	}

    @Path("{pmsReservationId}/checkin")
    @POST
    @ApiOperation(
        value = "Checks in an existing reservation",
        response = CheckInResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
    public CheckInResponse checkIn(
			@PathParam("pmsReservationId") String pmsReservationId,
			CheckInRequest request) {
		request.setPmsReservationId(pmsReservationId);

        return messageParser.guestCheckIn(valid(request));
    }

    @Path("{pmsReservationId}/checkout")
    @POST
    @ApiOperation(
        value = "Checks out an existing reservation",
        response = CheckOutResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public CheckOutResponse checkOut(
			@PathParam("pmsReservationId") String pmsReservationId) {
		return messageParser.guestCheckOut(valid(new CheckOutRequest(pmsReservationId)));
    }

    @Path("{pmsReservationId}/folio")
    @GET
    @ApiOperation(
        value = "Fetches the bill for a reservation",
            notes = "Includes room charge and all other charges incurred during stay",
        response = GetFolioResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public GetFolioResponse getFolio(@PathParam("pmsReservationId") String pmsReservationId) {
        return messageParser.retrieveFolioInfo(
			valid(new GetFolioRequest(pmsReservationId))
		);
    }

    @Path("{pmsReservationId}/postcharge")
    @POST
    @ApiOperation(
        value = "Adds charges to a guest account",
        response = PostChargeResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public PostChargeResponse postCharge(
			@PathParam("pmsReservationId") String pmsReservationId,
			PostChargeRequest request) {
		request.setPmsReservationId(pmsReservationId);
        return messageParser.postCharge(valid(request));
    }

    @Path("{pmsReservationId}/notes")
    @POST
    @ApiOperation(
        value = "Adds staff-viewable notes to a reservation",
        response = AddReservationNotesResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public AddReservationNotesResponse updateBookingRequest(
			@PathParam("pmsReservationId") String pmsReservationId,
			AddReservationNotesRequest request) {
		request.setPmsReservationId(pmsReservationId);
        return messageParser.addReservationNotes(valid(request));
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