package com.cloudkey.pms.response;

import com.cloudkey.commons.Reservation;

/**
 * The Class stores the check out response for the guest. It has the details of check out response
 * from the property management system as well as all information of the reservation.
 * 
 * @author vinayk2
 * 
 */
public class CheckOutResponse {

	/* Reference variable to store the room status. */
	private String status;
	/* Reference variable to store the reservation data. */
	private Reservation reservation;


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

}
