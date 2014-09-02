package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.rooms.*;
import com.cloudkey.pms.response.EmptyResponse;
import com.cloudkey.pms.response.rooms.AssignRoomResponse;
import com.cloudkey.pms.response.rooms.FetchCalendarResponse;
import com.cloudkey.pms.response.rooms.ReleaseRoomResponse;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.validation.Valid;
import javax.ws.rs.*;

/**
 * REST service to the hotel room methods of {@link com.cloudkey.message.parser.IParserInterface}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Path("/rooms")
@Api(value = "/rooms", description = "Rooms resource")
public class RoomsService extends AbstractResource {
	@Path("/calendar")
	@POST
	@ApiOperation(
		value = "Fetches a room availability calendar for a particular rate code for each room-type during the given date range",
		response = FetchCalendarResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	public FetchCalendarResponse fetchCalendar(@Valid FetchCalendarRequest request) {
//		@QueryParam("rateCode") String rateCode,
//		@QueryParam("guestCount") IntParam guestCount,
//		@QueryParam("startDate") LocalDateParam startDate,
//		@QueryParam("endDate") LocalDateParam endDate,
//		@DefaultValue("false") @QueryParam("availableOnly") Boolean availableOnly) {
//		FetchCalendarRequest request = new FetchCalendarRequest(
//			rateCode,
//			guestCount == null ? null : guestCount.get(),
//			startDate == null ? null : startDate.get(),
//			endDate == null ? null : endDate.get(),
//			availableOnly
//		);

//		validate(request);

		return messageParser.fetchCalendar(request);
	}

	@Path("/availability")
	@POST
	@ApiOperation(
		value = "Fetches room availability for each room-type for the given potential reservation",
		response = EmptyResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	public EmptyResponse fetchCalendar(@Valid AvailabilityRequest request) {
		return messageParser.availability(request);
	}

	@Path("/status")
    @POST
    @ApiOperation(
        value = "Updates room status fields",
        response = EmptyResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public EmptyResponse updateRoomStatus(@Valid UpdateRoomStatusRequest request) {
        return messageParser.updateRoomStatus(request);
    }

	@Path("/assignment")
	@POST
	@ApiOperation(
		value = "Assigns an available room of the given type to an existing reservation",
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

	@Path("/assignment")
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
}
