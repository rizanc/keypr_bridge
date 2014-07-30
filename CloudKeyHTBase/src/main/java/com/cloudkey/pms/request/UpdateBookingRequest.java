package com.cloudkey.pms.request;

import java.util.Arrays;

/**
 * Class to store information for update booking details in the hotel.
 *
 * The corresponding MICROS message can be used to modify most booking details,
 * however this only supports notes thus far.
 *
 * @author vinayk2
 * 
 */
public class UpdateBookingRequest {

	/* variable to store confirmation number. */
	private String confirmationNumber ;

	/* variable to store notes made by the guest. */
	private String[] notes ;

	/*
	 * Getter and Setter for each data member.
	 */
	public String getConfirmationNumber() {

		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {

		this.confirmationNumber = confirmationNumber;
	}

	public String[] getNotes() {

		return notes;
	}

	public void setNotes(String[] notes) {

		this.notes = notes;
	}

	public String toString() {
		
		return "UpdateBookingRequest [confirmationNumber=" + confirmationNumber + ", notes=" + Arrays.toString(notes) + "]";
	}

}
