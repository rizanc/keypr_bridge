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
	private String firstName;

	@NotBlank
	@ApiModelProperty(required = true)
	private String lastName;

	private String membershipNumber;

	private String membershipType;

	protected NameLookupRequest() { /* For serialization */ }

	public NameLookupRequest(String firstName, String lastName, String membershipNumber, String membershipType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.membershipNumber = membershipNumber;
		this.membershipType = membershipType;
	}

	public String getMembershipNumber() {
		return membershipNumber;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	@AssertTrue(message = "If either membershipType or membershipNumber is specified, both must be specified")
	private boolean isValid() {
		return membershipType == null ? membershipNumber == null : membershipNumber != null;
	}

	@Override
	public String toString() {
		return "NameLookupRequest{" +
			"firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", membershipNumber='" + membershipNumber + '\'' +
			", membershipType='" + membershipType + '\'' +
			'}';
	}
}
