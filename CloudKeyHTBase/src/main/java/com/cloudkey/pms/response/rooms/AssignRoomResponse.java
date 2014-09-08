package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;

/**
 * This class is used to sote the response status and assign room number .
 *
 * @author niveditat
 *
 */
public class AssignRoomResponse extends PMSResponse {

    private String assignRoomNumber;

	protected AssignRoomResponse() { /* For Serialization */ }

	public AssignRoomResponse(String assignRoomNumber) {
		this.assignRoomNumber = assignRoomNumber;
	}

	public String getAssignRoomNumber() {
		return assignRoomNumber;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("assignRoomNumber", assignRoomNumber)
			.toString();
	}
}
