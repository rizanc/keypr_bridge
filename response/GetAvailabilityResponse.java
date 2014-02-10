package com.cloudkey.pms.response;

import java.util.ArrayList;

import java.util.List;

import com.cloudkey.commons.Availability;

/**
 * The Class has the details of reservation availability. It has the information of response status
 * as well as details of all rooms available in the hotel.
 * 
 * @author vinayk2
 * 
 */
public class GetAvailabilityResponse {

	/* Reference variable to store the room status. */
	private String status;
	/* Reference variable to store the room availability. */
	private List<Availability> availList;


	/* Getter and Setter for each Data Member. */

	public List<Availability> getAvailList() {

		return availList;
	}

	public void setAvailList(List<Availability> availList) {

		this.availList = availList;
	}

	public String getStatus() {

		return status;
	}

	public void setStatus(String status) {

		this.status = status;
	}

}
