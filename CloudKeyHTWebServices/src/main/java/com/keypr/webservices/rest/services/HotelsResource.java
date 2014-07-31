package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.HotelInformationRequest;
import com.cloudkey.pms.request.MeetingRoomInformationRequest;
import com.cloudkey.pms.response.HotelInformationResponse;
import com.cloudkey.pms.response.MeetingRoomInformationResponse;
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
            @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
    })
    public HotelInformationResponse updateBookingRequest(@QueryParam("hotelCode") String hotelCode) {
        HotelInformationRequest request = new HotelInformationRequest(hotelCode);

        return messageParser.hotelInformationQuery(request);
    }

    @Path("/meetingrooms")
    @GET
    @ApiOperation(
            value = "Fetches a list of available meeting rooms which match some criteria",
            response = MeetingRoomInformationResponse.class
    )
    @ApiResponses({
            @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
    })
    public MeetingRoomInformationResponse meetingRoomInformation(
            @QueryParam("meetingFeature") String meetingFeature,
            @QueryParam("searchCodeType") String searchCodeType,
            @QueryParam("numberOfAttendees") String numberOfAttendees) {
        MeetingRoomInformationRequest request = new MeetingRoomInformationRequest(meetingFeature, searchCodeType, numberOfAttendees);

        return messageParser.getMeetingInformation(request);
    }

}
