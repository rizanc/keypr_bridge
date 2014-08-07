package com.cloudkey.pms.request.memberships;

import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class is used to send the request parameters for Guest Membership.
 *
 * @author Chetu
 */
public class GuestMembershipsRequest {

	@NotBlank
	@ApiModelProperty(required = true)
	private String pmsNameId;

	protected GuestMembershipsRequest() { /* For serialization */ }

	public GuestMembershipsRequest(String pmsNameId) {
		this.pmsNameId = pmsNameId;
	}

	public String getPmsNameId() {
		return pmsNameId;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("pmsNameId", pmsNameId)
			.toString();
	}
}
