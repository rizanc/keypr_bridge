package com.cloudkey.pms.request;

import com.cloudkey.commons.Reservation;

/**
 * Class stores the check in information of the guest. It has details of check
 * in date, check out date, room number and all details related to the stay at
 * the hotel.
 * 
 * @author vinayk2
 * 
 */
public class CheckInRequest {

	/*  variable to store reservation instance. */
	private Reservation reservation ;

	/*
	 * Getter and Setter for data member.
	 */
	public Reservation getReservation() {

		return reservation;
	}

	public void setReservation(Reservation reservation) {

		this.reservation = reservation;
	}

	@Override
	public String toString() {
		
		return "CheckInRequest [reservation=" + reservation + "]";
	}

}
