package com.cloudkey.pms.request.reservations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * This class is used to send the request parameters for assign the room.
 * 
 * @author niveditat
 */
@EqualsAndHashCode(callSuper = true)
@Value
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
