package com.cloudkey.pms.request.memberships;

import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotBlank;

/*
 * This class hold information of Name id request made by guest.
 */
public class NameIdByMembershipRequest {
	@NotBlank
	private String membershipType;

	@NotBlank
	private String membershipNumber;

	@NotBlank
	private String lastname;

	public NameIdByMembershipRequest(String membershipType, String membershipNumber, String lastname) {
		this.membershipType = membershipType;
		this.membershipNumber = membershipNumber;
		this.lastname = lastname;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public String getMembershipNumber() {
		return membershipNumber;
	}

	public String getLastname() {
		return lastname;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("membershipType", membershipType)
			.add("membershipNumber", membershipNumber)
			.add("lastname", lastname)
			.toString();
	}
}
