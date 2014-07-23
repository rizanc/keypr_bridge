package com.cloudkey.pms.response;

import java.util.List;

import com.cloudkey.commons.Availability;
import com.cloudkey.commons.Response;

/**
 * The Class has the details of reservation availability. It has the information of response status
 * as well as details of all rooms available in the hotel.
 * 
 * @author vinayk2
 * 
 */
public class GetAvailabilityResponse extends Response {

	/* Reference variable to store the room availability. */
	private List<Availability> availabiltyList ;


	/* Getter and Setter for each Data Member. */

	public List<Availability> getAvailList() {

		return availabiltyList;
	}

	public void setAvailList(List<Availability> availList) {

		this.availabiltyList = availList;
	}

	@Override
	public String toString() {
		return "GetAvailabilityResponse [availabiltyList=" + availabiltyList
				+ ", status=" + status + ", errorMessage=" + errorMessage + "]";
	}

}
