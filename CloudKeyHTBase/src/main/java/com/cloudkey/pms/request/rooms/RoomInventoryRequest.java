package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Value;
import org.hibernate.validator.constraints.NotBlank;

// TODO: There is no endpoint or micros method for this request.
/**
 * This class hold the information of room inventory request made by the guest.
 * 
 * @author vinayk2
 *
 */
@Value
public class RoomInventoryRequest extends PMSRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	String roomType;
}
