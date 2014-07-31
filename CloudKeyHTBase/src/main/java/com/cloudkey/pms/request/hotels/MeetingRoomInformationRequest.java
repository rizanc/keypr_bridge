package com.cloudkey.pms.request.hotels;

import com.google.common.base.Objects;

/**
 * This class represents the details to be provided for searching meeting room availability
 * in the hotel.
 * 
 * @author vinayk2
 *
 */
public class MeetingRoomInformationRequest {
	
	private String numberOfAttendees;

    public MeetingRoomInformationRequest(String numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getNumberOfAttendees() {
        return numberOfAttendees;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("numberOfAttendees", numberOfAttendees)
                .toString();
    }
}
