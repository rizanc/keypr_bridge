package com.cloudkey.pms.request;

/**
 * Class stores the reservation identifier to release all the rooms assign on it.
 * 
 * @author niveditat
 *
 */
public class ReleaseRoomRequest {
	
	private String reservationId;

	// setters and getters.
	
	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	@Override
	public String toString() {
		return "ReleaseRoomRequest [reservationId=" + reservationId + "]";
	}
		
}
