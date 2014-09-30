package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.response.EmptyResponse;
import com.cloudkey.pms.response.reservations.*;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.annotation.Nullable;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * REST sub-resource for interacting with existing reservations.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Api(hidden = true, value = "/reservations")
public class ReservationResource extends AbstractResource {
	protected final String pmsReservationId;

	@Inject
	public ReservationResource(@Assisted String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
	}
	
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
	public EmptyResponse modifyReservation(ModifyReservationRequest request) {
		request.setPmsReservationId(pmsReservationId);

		return messageParser.modifyReservation(
			valid(request)
		);
	}

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
	public CancelReservationResponse cancelReservation(@QueryParam("reason") String reason) {
		return messageParser.cancelReservation(
			valid(new CancelReservationRequest(
				pmsReservationId,
				reason
			))
		);
	}

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
	public FindReservationResponse get() {
		return messageParser.findReservation(
			valid(new FindReservationRequest(pmsReservationId))
		);
	}

	@Path("/room")
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
	public AssignRoomResponse assignRoom(@Nullable @QueryParam("roomNumber") String roomNumber) {
		return messageParser.assignRoom(
			valid(new AssignRoomRequest(pmsReservationId, roomNumber))
		);
	}

	@Path("/room")
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
	public ReleaseRoomResponse releaseRoom() {
		return messageParser.releaseRoom(
			valid(new ReleaseRoomRequest(pmsReservationId))
		);
	}

    @Path("/checkin")
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
    public CheckInResponse checkIn(CheckInRequest request) {
		request.setPmsReservationId(pmsReservationId);

        return messageParser.checkIn(valid(request));
    }

    @Path("/checkout")
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
    public CheckOutResponse checkOut() {
		return messageParser.checkOut(valid(new CheckOutRequest(pmsReservationId)));
    }

    @Path("/folio")
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
    public GetFolioResponse getFolio() {
        return messageParser.retrieveFolioInfo(
			valid(new GetFolioRequest(pmsReservationId))
		);
    }

    @Path("/postcharge")
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
    public PostChargeResponse postCharge(PostChargeRequest request) {
		request.setPmsReservationId(pmsReservationId);
        return messageParser.postCharge(valid(request));
    }

    @Path("/notes")
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
    public AddReservationNotesResponse updateBookingRequest(AddReservationNotesRequest request) {
		request.setPmsReservationId(pmsReservationId);
        return messageParser.addReservationNotes(valid(request));
    }

	/**
	 * Guice assisted-injection factory for ReservationResource.
	 *
	 * Injecting this factory allows you to create a Guice-injected ReservationResource for
	 * a particular pmsReservationId.
	 *
	 * <pre>{@code
	 *
	 * 	@Inject
	 * 	ReservationResourceFactory reservationResourceFactory;
	 *
	 * 	protected ReservationResource getReservationResource(String pmsReservationId) {
	 * 	    return reservationResourceFactory.create(pmsReservationId);
	 * 	}
	 *
	 * }</pre>
	 */
	public interface ReservationResourceFactory {
		ReservationResource create(String pmsReservationId);
	}
}