package com.cloudkey.pms.response.hotels;

import java.util.List;

import com.cloudkey.commons.AvailableProperty;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/**
 * This class represents the details of the meeting room availability in the hotel.
 *
 * @author vinayk2
 *
 */
public class MeetingRoomInformationResponse extends PMSResponse {

    private List<AvailableProperty> availableProperty;

	public MeetingRoomInformationResponse(List<AvailableProperty> availableProperty) {
		this.availableProperty = ImmutableList.copyOf(availableProperty);
	}

	public List<AvailableProperty> getAvailableProperty() {
		return availableProperty;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("availableProperty", availableProperty)
			.toString();
	}
}
