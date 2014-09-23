package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Value;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Class stores the reservation identifier to release all the rooms assign on it.
 * 
 * @author niveditat
 */
@Value
public class ReleaseRoomRequest extends PMSRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	String pmsReservationId;

}
