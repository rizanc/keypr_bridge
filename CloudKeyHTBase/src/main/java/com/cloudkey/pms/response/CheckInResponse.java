package com.cloudkey.pms.response;

import com.cloudkey.commons.Reservation;

/**
 * This class stores the check in response details of the guest. It store the status of
 * check in request made by the guest and details of guest reservation.
 * 
 * @author vinayk2
 *   
 */
public class CheckInResponse {


	/* Reference variable to store the room status. */
	private String status ;
	/* Reference variable to store the reservation data. */
	private Reservation reservation ;


	/* Getter and Setter for each Data Member. */

	public String getStatus() {

		return status;
	}

	public void setStatus(String status) {

		this.status = status;
	}

	public Reservation getReservation() {

		return reservation;
	}

	public void setReservation(Reservation reservation) {

		this.reservation = reservation;
	}
	
	@Override
	public String toString() {
		
		return "CheckInResponse [status=" + status + ", reservation= "+ reservation + "]";
		
	}

}
