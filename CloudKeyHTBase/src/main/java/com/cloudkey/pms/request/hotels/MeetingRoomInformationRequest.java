package com.cloudkey.pms.request.hotels;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.validation.constraints.NotNull;

/**
 * This class represents the details to be provided for searching meeting room availability
 * in the hotel.
 * 
 * @author vinayk2
 *
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(callSuper = false)
public class MeetingRoomInformationRequest extends PMSRequest {

	@NotNull
	@ApiModelProperty(required = true)
	Integer numberOfAttendees;

}
