package com.keypr.webservices.rest.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomTypeInventory;

/**
 * Keypr web service to accept the updated data of upload Queue for RoomDetails,RoomInventory,Reservation, as Json object and
 * send response to the client, weather it gets the updated data or
 * @author ektas -
 */
@Path("/Service")
public class UploadService {

	
	@Path( "/uploadRoomInfoList/{size}" )
	@POST
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes( MediaType.APPLICATION_JSON )	
	public Response uploadRoomStatus( List<RoomDetails> roomdetailsList , @PathParam("size") int size) {

		Response uploadRoomDataStatus = Response.status(200).entity("success").build();
		return uploadRoomDataStatus;
	}
	
	@Path( "/uploadRoomInventoryDetailsList/{size}" )
	@POST
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes( MediaType.APPLICATION_JSON )
	public Response uploadRoomInventory(List <RoomTypeInventory> roominventorydetailsList, @PathParam("size") int size){
	
		Response res = Response.status(200).entity("success").build();
	return res;
	
}

	@Path( "/uploadReservationyList/{size}" )
	@POST
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes( MediaType.APPLICATION_JSON )
	public Response uploadReservationy(List <Reservation> reservationList, @PathParam("size") int size){
	
		Response res = Response.status(200).entity("success").build();
	    return res;
	
}
	
}
