package com.cloudkey.pms.response.hotels;

import com.cloudkey.commons.AvailableProperty;
import com.cloudkey.pms.response.PMSResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * This class represents the details of the meeting room availability in the hotel.
 *
 * @author vinayk2
 *
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class MeetingRoomInformationResponse extends PMSResponse {

    List<AvailableProperty> availableProperty;

}
