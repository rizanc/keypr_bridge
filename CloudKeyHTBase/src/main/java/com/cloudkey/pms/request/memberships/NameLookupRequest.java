package com.cloudkey.pms.request.memberships;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.AssertTrue;

/*
 * This class hold information of Name id request made by guest.
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(callSuper = false)
public class NameLookupRequest extends PMSRequest {
	String firstName;

	@NotBlank
	@ApiModelProperty(required = true)
	String lastName;

	String membershipNumber;

	String membershipType;

	@AssertTrue(message = "If either membershipType or membershipNumber is specified, both must be specified")
	private boolean isValid() {
		return membershipType == null ? membershipNumber == null : membershipNumber != null;
	}
}
