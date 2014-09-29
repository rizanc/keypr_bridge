package com.cloudkey.pms.request.reservations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * This class is used to send the request parameters for assign the room.
 * 
 * @author niveditat
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class AssignRoomRequest extends AbstractSingleReservationRequest {

	String roomNumber;

	public AssignRoomRequest(String pmsReservationId, String roomNumber) {
		super(pmsReservationId);
		this.roomNumber = roomNumber;
	}

	@JsonIgnore
	public boolean isForSpecificRoom() {
		return roomNumber != null && !roomNumber.isEmpty();
	}

}
