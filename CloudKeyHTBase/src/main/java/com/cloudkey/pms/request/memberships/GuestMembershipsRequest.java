package com.cloudkey.pms.request.memberships;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Value;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class is used to send the request parameters for Guest Membership.
 *
 * @author Chetu
 */
@Value
public class GuestMembershipsRequest extends PMSRequest {

	@NotBlank
	@ApiModelProperty(required = true)
	private String pmsNameId;

	public GuestMembershipsRequest(String pmsNameId) {
		this.pmsNameId = pmsNameId;
	}
}
