package com.cloudkey.pms.response;

/**
 * This class stores the released rooms result status .
 * 
 * @author niveditat
 *
 */
public class ReleaseRoomResponse {
	
	private String status;
	
	// setter and getters.

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ReleaseRoomResponse [status=" + status + "]";
	}	
}

