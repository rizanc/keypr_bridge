package com.cloudkey.pms.response;

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
	private String status ;
	/* Reference variable to store the room availability. */
	private List<Availability> availabiltyList ;


	/* Getter and Setter for each Data Member. */

	public List<Availability> getAvailList() {

		return availabiltyList;
	}

	public void setAvailList(List<Availability> availList) {

		this.availabiltyList = availList;
	}

	public String getStatus() {

		return status;
	}

	public void setStatus(String status) {

		this.status = status;
	}

	@Override
	public String toString() {

		return "GetAvailabilityResponse [status=" + status + ", availabiltyList=" + availabiltyList + "]";
	}

}
