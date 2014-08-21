package com.cloudkey.pms.request.memberships;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class is used to send the request parameters for MemberPoints.
 *
 * @author Chetu
 */
public class MemberPointsRequest extends PMSRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	private String nameId;

	protected MemberPointsRequest() { /* For serialization */ }

	public MemberPointsRequest(String nameId) {
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
