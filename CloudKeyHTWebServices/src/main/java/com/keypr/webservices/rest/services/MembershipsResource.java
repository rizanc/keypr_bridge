package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.MemberPointsRequest;
import com.cloudkey.pms.request.memberships.NameIdByMembershipRequest;
import com.cloudkey.pms.response.memberships.GuestMembershipResponse;
import com.cloudkey.pms.response.reservations.MakePaymentResponse;
import com.cloudkey.pms.response.memberships.MemberPointsResponse;
import com.cloudkey.pms.response.memberships.NameIdByMembershipResponse;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * REST service to the hotel membership methods of {@link com.cloudkey.message.parser.IParserInterface}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Path("/memberships")
@Api(value = "/memberships", description = "Memberships resource")
public class MembershipsResource extends AbstractResource {

    @GET
    @ApiOperation(
        value = "Fetches guest membership details related to a 'name id'",
        response = GuestMembershipResponse.class
    )
    @ApiResponses({
        @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
        @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid")
    })
    public GuestMembershipResponse guestMemberships(@QueryParam("nameId") String nameId) {
	    GuestMembershipsRequest request = new GuestMembershipsRequest(nameId);
	    validate(request);

	    return messageParser.getMembershipInformation(request);
    }

    @Path("/points")
    @GET
    @ApiOperation(
        value = "Fetches member points details by membership number",
        response = MakePaymentResponse.class
    )
    @ApiResponses({
        @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
        @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid")
    })
    public MemberPointsResponse memberPoints(
            @QueryParam("membershipNumber") String membershipNumber,
            @QueryParam("membershipType") String membershipType,
            @QueryParam("memberLastName") String memberLastName) {
        MemberPointsRequest request = new MemberPointsRequest(membershipNumber, membershipType, memberLastName);
		validate(request);

        return messageParser.memberPointsQuery(request);
    }

    @Path("/search")
    @GET
    @ApiOperation(
        value = "Finds a membership's 'name id' by related criteria",
        response = NameIdByMembershipResponse.class
    )
    @ApiResponses({
        @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
        @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid")
    })
    public NameIdByMembershipResponse nameIdSearch(
            @QueryParam("membershipNumber") String membershipNumber,
            @QueryParam("membershipType") String membershipType,
            @QueryParam("memberLastName") String memberLastName) {
        NameIdByMembershipRequest request = new NameIdByMembershipRequest(membershipNumber, membershipType, memberLastName);
	    validate(request);

        return messageParser.getNameIdInformation(request);
    }
}
