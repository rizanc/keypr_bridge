package com.cloudkey.pms.response.roomassignments;

import java.util.List;

import com.cloudkey.commons.DayRoomAvailability;
import com.cloudkey.commons.Response;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/**
 * The Class has the details of reservation availability. It has the information of response status
 * as well as details of all rooms available in the hotel.
 *
 * @author vinayk2
 *
 */
public class GetAvailabilityResponse extends Response {

    /* Reference variable to store the room availability. */
    private List<DayRoomAvailability> availabilityList;

	public GetAvailabilityResponse(List<DayRoomAvailability> availabilityList) {
		this.availabilityList = ImmutableList.copyOf(availabilityList);
	}

	public List<DayRoomAvailability> getAvailabilityList() {
		return availabilityList;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("availabilityList", availabilityList)
			.toString();
	}
}
