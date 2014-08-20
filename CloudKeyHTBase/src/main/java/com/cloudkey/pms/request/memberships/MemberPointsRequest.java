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
	private String membershipNumber;

	@NotBlank
	@ApiModelProperty(required = true)
	private String membershipType;

	@NotBlank
	@ApiModelProperty(required = true)
	private String memberLastName;

	protected MemberPointsRequest() { /* For serialization */ }

	public MemberPointsRequest(String membershipNumber, String membershipType, String memberLastName) {
		this.membershipNumber = membershipNumber;
		this.membershipType = membershipType;
		this.memberLastName = memberLastName;
	}

	public String getMembershipNumber() {
		return membershipNumber;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public String getMemberLastName() {
		return memberLastName;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("membershipNumber", membershipNumber)
			.add("membershipType", membershipType)
			.add("memberLastName", memberLastName)
			.toString();
	}
}
