package com.cloudkey.pms.request;

/**
 * This class represents the get bill request of the guest. The request 
 * include confirmation number of the guest.
 *  
 * @author vinayk2
 *
 */
public class GetFolioRequest {

	/* variable to store confirmation number of the reservation. */
	private String confirmationNumber ;

    public GetFolioRequest(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

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
