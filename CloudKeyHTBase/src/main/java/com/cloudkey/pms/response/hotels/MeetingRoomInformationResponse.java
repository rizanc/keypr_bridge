package com.cloudkey.pms.response.hotels;

import com.cloudkey.commons.AvailableProperty;
import com.cloudkey.pms.response.PMSResponse;
import lombok.Value;

import java.util.List;

/**
 * This class represents the details of the meeting room availability in the hotel.
 *
 * @author vinayk2
 *
 */
@Value
public class MeetingRoomInformationResponse extends PMSResponse {

    List<AvailableProperty> availableProperty;

}
