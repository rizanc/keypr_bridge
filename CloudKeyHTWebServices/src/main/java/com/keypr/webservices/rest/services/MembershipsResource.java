package com.keypr.webservices.rest.services;

import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.NameLookupRequest;
import com.cloudkey.pms.response.memberships.GuestMembershipsResponse;
import com.cloudkey.pms.response.memberships.NameLookupResponse;
import com.google.inject.Singleton;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * REST resource for the hotel membership methods of {@link com.cloudkey.PMSInterface}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Path("/memberships")
@Api(value = "/memberships", description = "Memberships resource")
@Singleton
public class MembershipsResource extends AbstractResource {

    @GET
    @ApiOperation(
        value = "Fetches guest membership details related to a 'name id'",
        response = GuestMembershipsResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public GuestMembershipsResponse guestMemberships(@QueryParam("nameId") String nameId) {
	    return messageParser.getMembershipInformation(
			valid(new GuestMembershipsRequest(nameId))
		);
    }

    @Path("/search")
    @GET
    @ApiOperation(
        value = "Finds a membership's 'name id' by related criteria",
        response = NameLookupResponse.class
    )
    @ApiResponses({
	    @ApiResponse(code = 422, message = "Request parameters are incomplete or invalid"),
	    @ApiResponse(code = 400, message = "The PMS responded with an error message"),
	    @ApiResponse(code = 502, message = "An unexpected error occurred involving PMS communication")
    })
    public NameLookupResponse nameIdSearch(
            @QueryParam("membershipNumber") String membershipNumber,
            @QueryParam("membershipType") String membershipType,
            @QueryParam("memberFirstName") String memberFirstName,
            @QueryParam("memberLastName") String memberLastName) {
        return messageParser.getNameIdInformation(
			valid(new NameLookupRequest(memberFirstName, memberLastName, membershipNumber, membershipType))
		);
    }
}
