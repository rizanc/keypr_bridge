package com.cloudkey.commons;

import lombok.Value;

import java.util.List;

/* @author ektas */
@Value
public class ReservationRoomAllocation {

	// Reference variable to store the room details with rate. 
	String roomNo;
	List<RoomRate> roomRateList;
	RoomType roomType;
	String reservationStatusType; // For status as chcekin , reservaed , canceled.
	
}
