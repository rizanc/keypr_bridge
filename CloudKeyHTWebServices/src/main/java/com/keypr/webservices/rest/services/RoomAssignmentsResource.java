package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.roomassignments.AssignRoomRequest;
import com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest;
import com.cloudkey.pms.request.roomassignments.ReleaseRoomRequest;
import com.cloudkey.pms.response.roomassignments.AssignRoomResponse;
import com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse;
import com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse;
import com.keypr.webservices.jersey.LocalDateParam;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.*;

/**
 * REST service to the hotel room assignment methods of {@link com.cloudkey.message.parser.IParserInterface}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Path("/roomassignments")
@Api(value = "/roomassignments", description = "Room assignments resource")
public class RoomAssignmentsResource extends AbstractResource {
    @POST
    @ApiOperation(
        value = "Assigns an available room of the given type to an existing reservation",
        notes = "Micros implementation only uses request.roomTypeCode and request.reservation.confirmationNumber",
        response = AssignRoomResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public AssignRoomResponse assignRoom(@Valid AssignRoomRequest request) {
        return messageParser.assignRoom(request);
    }

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
    public ReleaseRoomResponse releaseRoom(@Valid ReleaseRoomRequest request) {
        return messageParser.releaseRoom(request);
    }

    @GET
    @ApiOperation(
        value = "Fetches room availability for each room-type during the given date range",
        response = GetAvailabilityResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public GetAvailabilityResponse getAvailability(
            @QueryParam("startDate") LocalDateParam startDate,
            @QueryParam("endDate") LocalDateParam endDate) {
        GetAvailabilityRequest request = new GetAvailabilityRequest(
                startDate == null ? null : startDate.get(),
                endDate == null ? null : endDate.get()
        );

        validate(request);

        return messageParser.checkAvailability(request);
    }

}
