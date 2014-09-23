package com.cloudkey.pms.request.hotels;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Value;

import javax.validation.constraints.NotNull;

/**
 * This class represents the details to be provided for searching meeting room availability
 * in the hotel.
 * 
 * @author vinayk2
 *
 */
@Value
public class MeetingRoomInformationRequest extends PMSRequest {

	@NotNull
	@ApiModelProperty(required = true)
	private Integer numberOfAttendees;

}
