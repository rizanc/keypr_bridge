package com.cloudkey.commons;

import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.List;

/* @author ektas */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class ReservationRoomAllocation {

	// Reference variable to store the room details with rate. 
	String roomNo;
	List<RoomRate> roomRateList;
	RoomType roomType;
	String reservationStatusType; // For status as chcekin , reservaed , canceled.
	
}
