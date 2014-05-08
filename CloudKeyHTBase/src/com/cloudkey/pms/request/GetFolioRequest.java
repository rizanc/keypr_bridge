package com.cloudkey.pms.request;

/**
 * Class stores the bill information of the guest. 
 * @author vinayk2
 *
 */
public class GetFolioRequest {

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
		
		return "GetFolioRequest [confirmationNumber=" + confirmationNumber + "]";
	}
	
}
