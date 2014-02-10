package com.cloudkey.pms.request;

/**
 * Class to store information for update booking details in the hotel.
 * 
 * @author vinayk2
 * 
 */
public class UpdateBookingRequest {

	/* Reference variable to store confirmation number. */
	private String confirmationNumber = "";
	/* Reference variable to store notes made by the guest. */
	private String[] notes = null;

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

}
