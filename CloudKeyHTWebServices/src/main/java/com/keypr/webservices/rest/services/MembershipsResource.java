package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.GuestMembershipsRequest;
import com.cloudkey.pms.request.MemberPointsRequest;
import com.cloudkey.pms.request.NameIdByMembershipRequest;
import com.cloudkey.pms.response.GuestMembershipResponse;
import com.cloudkey.pms.response.MakePaymentResponse;
import com.cloudkey.pms.response.MemberPointsResponse;
import com.cloudkey.pms.response.NameIdByMembershipResponse;
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
    })
    public GuestMembershipResponse guestMemberships(@QueryParam("nameId") String nameId) {
        return messageParser.getMembershipInformation(new GuestMembershipsRequest(nameId));
    }

    @Path("/points")
    @GET
    @ApiOperation(
            value = "Fetches member points details by membership number",
            response = MakePaymentResponse.class
    )
    @ApiResponses({
            @ApiResponse(code = 502, message = "PMSInterfaceException occurred"),
    })
    public MemberPointsResponse memberPoints(
            @QueryParam("membershipNumber") String membershipNumber,
            @QueryParam("membershipType") String membershipType,
            @QueryParam("memberLastName") String memberLastName) {
        MemberPointsRequest request = new MemberPointsRequest(membershipNumber, membershipType, memberLastName);

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
    })
    public NameIdByMembershipResponse nameIdSearch(
            @QueryParam("membershipNumber") String membershipNumber,
            @QueryParam("membershipType") String membershipType,
            @QueryParam("memberLastName") String memberLastName) {
        NameIdByMembershipRequest request = new NameIdByMembershipRequest(membershipNumber, membershipType, memberLastName);

        return messageParser.getNameIdInformation(request);
    }
}
