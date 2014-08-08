package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.hotels.HotelInformationRequest;
import com.cloudkey.pms.request.hotels.MeetingRoomInformationRequest;
import com.cloudkey.pms.response.hotels.HotelInformationResponse;
import com.cloudkey.pms.response.hotels.MeetingRoomInformationResponse;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * REST service to the general hotel methods of {@link com.cloudkey.message.parser.IParserInterface}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Path("/hotels")
@Api(value = "/hotels", description = "Hotels resource")
public class HotelsResource extends AbstractResource {

    @GET
    @ApiOperation(
        value = "Fetches general information about a hotel",
        response = HotelInformationResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public HotelInformationResponse updateBookingRequest() {
        HotelInformationRequest request = new HotelInformationRequest();
	    validate(request);

        return messageParser.hotelInformationQuery(request);
    }

    @Path("/meetingrooms")
    @GET
    @ApiOperation(
        value = "Fetches a list of available meeting rooms which match some criteria",
        response = MeetingRoomInformationResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
        @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public MeetingRoomInformationResponse meetingRoomInformation(
            @QueryParam("numberOfAttendees") Integer numberOfAttendees) {
        MeetingRoomInformationRequest request = new MeetingRoomInformationRequest(numberOfAttendees);
        validate(request);

	    MeetingRoomInformationResponse meetingInformation = messageParser.getMeetingInformation(request);
	    return meetingInformation;
    }

}
