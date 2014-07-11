package com.cloudkey.pms.response;

import java.util.List;

import com.cloudkey.commons.AvailableProperty;

/**
 * This class represents the details of the meeting room availability in the hotel.
 * 
 * @author vinayk2
 *
 */
public class MeetingRoomInformationResponse {
	
	private String status;
	private String result;
	
	private List<AvailableProperty> availableProperty = null;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<AvailableProperty> getAvailableProperty() {
		return availableProperty;
	}

	public void setAvailableProperty(List<AvailableProperty> availableProperty) {
		this.availableProperty = availableProperty;
	}

	@Override
	public String toString() {
		return "MeetingRoomInformationResponse [status=" + status + ", result="
				+ result + ", availableProperty=" + availableProperty + "]";
	}
	
}
