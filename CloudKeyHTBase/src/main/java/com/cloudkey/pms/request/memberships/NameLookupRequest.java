package com.cloudkey.pms.request.memberships;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Value;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.AssertTrue;

/*
 * This class hold information of Name id request made by guest.
 */
@Value
public class NameLookupRequest extends PMSRequest {
	private String firstName;

	@NotBlank
	@ApiModelProperty(required = true)
	private String lastName;

	private String membershipNumber;

	private String membershipType;

	public NameLookupRequest(String firstName, String lastName, String membershipNumber, String membershipType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.membershipNumber = membershipNumber;
		this.membershipType = membershipType;
	}


	@AssertTrue(message = "If either membershipType or membershipNumber is specified, both must be specified")
	private boolean isValid() {
		return membershipType == null ? membershipNumber == null : membershipNumber != null;
	}
}
