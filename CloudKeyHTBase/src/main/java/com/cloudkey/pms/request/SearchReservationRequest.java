package com.cloudkey.pms.request;

/**
 * Class stores the information for searching reservation in the hotel. It uses
 * detail provided by the guest for searching reservation.
 * 
 * @author vinayk2
 * 
 */

public class SearchReservationRequest {

	/* variable to store confirmation number. */
	private String confirmationNumber ;
	/* variable to store email address of the guest. */
	private String emailId ;
	/* variable to store first name of the guest. */
	private String firstName ;
	/* variable to store last name of the guest. */
	private String lastName ;
	/* variable to store credit card number of the guest. */
	private String creditCardNumber ;

    public SearchReservationRequest(String confirmationNumber, String emailId, String firstName, String lastName, String creditCardNumber) {
        this.confirmationNumber = confirmationNumber;
        this.emailId = emailId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCardNumber = creditCardNumber;
    }

/*
	 * Getter and Setter for each data member.
	 */
	
	public String getCreditCardNumber() {
		
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		
		this.creditCardNumber = creditCardNumber;
	}

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

	@Override
	public String toString() {
		
		return "SearchReservationRequest [confirmationNumber="
				+ confirmationNumber + ", emailId=" + emailId + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	

}
