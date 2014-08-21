package com.cloudkey.pms.request.memberships;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.AssertTrue;

/*
 * This class hold information of Name id request made by guest.
 */
public class NameLookupRequest extends PMSRequest {
	private String membershipType;

	private String membershipNumber;

	@NotBlank
	@ApiModelProperty(required = true)
	private String lastname;

	protected NameLookupRequest() { /* For serialization */ }

	public NameLookupRequest(String membershipType, String membershipNumber, String lastname) {
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

	@AssertTrue(message = "If either membershipType or membershipNumber is specified, both must be specified")
	private boolean isValid() {
		return membershipType == null ? membershipNumber == null : membershipNumber != null;
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
