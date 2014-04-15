package com.cloudkey.pms.response;

/**
 * This class is used to sote the response status and assign room number .
 * 
 * @author niveditat
 *
 */
public class AssignRoomResponse {

	/*Variable to store the response.*/
	private String status;
	private String assignRoomNumber;

	/*setter and getters.*/

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAssignRoomNumber() {
		return assignRoomNumber;
	}
	public void setAssignRoomNumber(String assignRoomNumber) {
		this.assignRoomNumber = assignRoomNumber;
	}

	@Override
	public String toString() {
		return "AssignRoomResponse [status=" + status + ", assignRoomNumber="
				+ assignRoomNumber + "]";
	}

}
