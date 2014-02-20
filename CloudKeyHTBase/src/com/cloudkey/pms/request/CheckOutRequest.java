package com.cloudkey.pms.request;

/**
 * Class stores check out request information of the guest. It has confirmation
 * number as its details.
 * 
 * @author vinayk2
 * 
 */
public class CheckOutRequest {

	/* variable to store confirmation number of the reservation. */
	private String confirmationNumber ;


	/*
	 * Getter and Setter for data member.
	 */

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public String toString() {
		
		return "CheckOutRequest [confirmationNumber=" + confirmationNumber + "]";
	}

}
