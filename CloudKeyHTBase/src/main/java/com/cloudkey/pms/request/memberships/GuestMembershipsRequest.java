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
	private String nameId;

	protected GuestMembershipsRequest() { /* For serialization */ }

	public GuestMembershipsRequest(String nameId) {
		this.nameId = nameId;
	}

	public String getNameId() {
		return nameId;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("nameId", nameId)
			.toString();
	}
}
