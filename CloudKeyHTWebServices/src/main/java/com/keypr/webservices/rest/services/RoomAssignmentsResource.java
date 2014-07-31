package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.AssignRoomRequest;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.request.ReleaseRoomRequest;
import com.cloudkey.pms.response.AssignRoomResponse;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.cloudkey.pms.response.ReleaseRoomResponse;
import com.keypr.webservices.jodasupport.LocalDateParam;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

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
            @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
    })
    public AssignRoomResponse assignRoom(AssignRoomRequest request) {
        return messageParser.assignRoom(request);
    }

    @DELETE
    @ApiOperation(
            value = "Unassigns the room assigned to a reservation",
            response = ReleaseRoomResponse.class
    )
    @ApiResponses({
            @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
    })
    public ReleaseRoomResponse releaseRoom(ReleaseRoomRequest request) {
        return messageParser.releaseRoom(request);
    }

    @GET
    @ApiOperation(
            value = "Fetches room availability for each room-type during the given date range",
            response = GetAvailabilityResponse.class
    )
    @ApiResponses({
            @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
    })
    public GetAvailabilityResponse getAvailability(
            @QueryParam("startDate") LocalDateParam startDate,
            @QueryParam("endDate") LocalDateParam endDate) {
        GetAvailabilityRequest request = new GetAvailabilityRequest(startDate.get(), endDate.get());

        return messageParser.checkAvailability(request);
    }

}
