package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * This class is used to send the request parameters for assign the room.
 * 
 * @author niveditat
 */
@Value
public class AssignRoomRequest extends PMSRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	private String pmsReservationId;

	private String roomNumber;

	@JsonIgnore
	public boolean isForSpecificRoom() {
		return roomNumber != null && !roomNumber.isEmpty();
	}

}
