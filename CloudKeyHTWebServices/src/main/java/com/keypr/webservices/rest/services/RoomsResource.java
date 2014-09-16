package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.rooms.*;
import com.cloudkey.pms.response.EmptyResponse;
import com.cloudkey.pms.response.rooms.AssignRoomResponse;
import com.cloudkey.pms.response.rooms.FetchCalendarResponse;
import com.cloudkey.pms.response.rooms.ReleaseRoomResponse;
import com.keypr.webservices.jersey.LocalDateParam;
import com.wordnik.swagger.annotations.*;
import io.dropwizard.jersey.params.IntParam;

import javax.validation.Valid;
import javax.ws.rs.*;
import java.util.List;

/**
 * REST service to the hotel room methods of {@link com.cloudkey.message.parser.PMSInterface}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Path("/rooms")
@Api(value = "/rooms", description = "Rooms resource")
public class RoomsResource extends AbstractResource {
	@Path("/calendar")
	@GET
	@ApiOperation(
		value = "Fetches a room availability calendar for a particular rate code for each room-type during the given date range",
		response = FetchCalendarResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	public FetchCalendarResponse fetchCalendar(
			@QueryParam("startDate") LocalDateParam startDate,
			@QueryParam("endDate") LocalDateParam endDate,
			@DefaultValue("false") @QueryParam("availableOnly") Boolean availableOnly,
			@QueryParam("rateCode") String rateCode,
			@QueryParam("numAdults") IntParam numAdults,
			@QueryParam("numChildren") IntParam numChildren) {
		FetchCalendarRequest request = valid(new FetchCalendarRequest(
			unwrap(startDate),
			unwrap(endDate),
			availableOnly,
			rateCode,
			unwrap(numAdults),
			unwrap(numChildren)
		));

		return messageParser.fetchCalendar(request);
	}

	@Path("/availability")
	@GET
	@ApiOperation(
		value = "Fetches room availability for each room-type for the given potential reservation",
		response = EmptyResponse.class
	)
	@ApiResponses({
		@ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
		@ApiResponse(code = 400, message = "The PMS responded with an error message"),
		@ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
	})
	public EmptyResponse availability(
			@QueryParam("startDate") LocalDateParam startDate,
			@QueryParam("endDate") LocalDateParam endDate,
			@QueryParam("numAdults") IntParam numAdults,
			@QueryParam("rateCode") String rateCode,
			@QueryParam("roomTypeCode") String roomTypeCode,
			// TODO: The swagger UI doesn't allow multiple children ages to be specified.
			@QueryParam("childrenAges") List<IntParam> childrenAges) {
		AvailabilityRequest request = valid(new AvailabilityRequest(
			unwrap(startDate),
			unwrap(endDate),
			rateCode,
			unwrap(numAdults),
			roomTypeCode,
			unwrap(childrenAges)
		));

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
}
