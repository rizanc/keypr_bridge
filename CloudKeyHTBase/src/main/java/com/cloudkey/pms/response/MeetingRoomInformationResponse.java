package com.cloudkey.pms.response;

import java.util.List;

import com.cloudkey.commons.AvailableProperty;
import com.cloudkey.commons.Response;

/**
 * This class represents the details of the meeting room availability in the hotel.
 *
 * @author vinayk2
 *
 */
public class MeetingRoomInformationResponse extends Response {

    private List<AvailableProperty> availableProperty = null;


    public List<AvailableProperty> getAvailableProperty() {
        return availableProperty;
    }

    public void setAvailableProperty(List<AvailableProperty> availableProperty) {
        this.availableProperty = availableProperty;
    }

    @Override
    public String toString() {
        return "MeetingRoomInformationResponse [availableProperty="
                + availableProperty + ", status=" + status + ", errorMessage="
                + errorMessage + "]";
    }

}
