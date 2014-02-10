package com.cloudkey.pms.request;

/**
 * Class stores the information for searching reservation in the hotel. It uses
 * detail provided by the guest for searching reservation.
 * 
 * @author vinayk2
 * 
 */

public class SearchReservationRequest {

	/* Reference variable to store confirmation number. */
	private String confirmationNumber = "";
	/* Reference variable to store email address of the guest. */
	private String emailId = "";
	/* Reference variable to store first name of the guest. */
	private String firstName = "";
	/* Reference variable to store last name of the guest. */
	private String lastName = "";

	/*
	 * Getter and Setter for each data member.
	 */
	public String getConfirmationNumber() {

		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {

		this.confirmationNumber = confirmationNumber;
	}

	public String getEmailId() {

		return emailId;
	}

	public void setEmailId(String emailId) {

		this.emailId = emailId;
	}

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getLastName() {

		return lastName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

}
