package com.cloudkey.pms.response;

import com.cloudkey.commons.Reservation;

/**
 * This class stores the response of booking update request made by the guest.
 * It has the detail of guest reservation.
 * 
 * @author vinayk2
 */
public class UpdateBookingResponse {

	/* Reference variable to store the reservation data */
	private Reservation reservation ;
	private String status;


	/* Getter and Setter for each Data Member. */

	public Reservation getReservation() {

		return reservation;
	}

	public void setReservation(Reservation reservation) {

		this.reservation = reservation;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UpdateBookingResponse [reservation=" + reservation
				+ ", status=" + status + "]";
	}

}
