package com.cloudkey.pms.request.hotels;

import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * This class represents the details to be provided for searching meeting room availability
 * in the hotel.
 * 
 * @author vinayk2
 *
 */
public class MeetingRoomInformationRequest {

	@NotNull
	@ApiModelProperty(required = true)
	private Integer numberOfAttendees;

	protected MeetingRoomInformationRequest() { /* For serialization */ }

	public MeetingRoomInformationRequest(Integer numberOfAttendees) {
		this.numberOfAttendees = numberOfAttendees;
	}

	public Integer getNumberOfAttendees() {
		return numberOfAttendees;
	}

	@Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("numberOfAttendees", numberOfAttendees)
                .toString();
    }
}