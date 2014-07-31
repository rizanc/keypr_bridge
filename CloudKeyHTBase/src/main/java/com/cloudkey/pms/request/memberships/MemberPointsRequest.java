package com.cloudkey.pms.request.memberships;

import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class is used to send the request parameters for MemberPoints.
 *
 * @author Chetu
 */
public class MemberPointsRequest {
	@NotBlank
	private String membershipNumber;

	@NotBlank
	private String membershipType;

	@NotBlank
	private String memberLastName;

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
