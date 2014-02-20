package com.cloudkey.pms.response;

/**
 * This class stores the response of update payment request made by the guest. It has 
 * information of whether the guest request was successfully completed or not.
 * 
 * @author vinayk2
 */
public class UpdatePaymentResponse {

	/* Reference variable to store the room status. */
	private String status ;

	/* Getter and Setter for each Data Member. */
	
	public String getStatus() {
		
		return status;
	}

	public void setStatus(String status) {
		
		this.status = status;
	}

	@Override
	public String toString() {
		
		return "UpdatePaymentResponse [status=" + status + "]";
	}
	
}
