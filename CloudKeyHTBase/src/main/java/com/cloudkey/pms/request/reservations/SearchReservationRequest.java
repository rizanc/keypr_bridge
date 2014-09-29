package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.validation.constraints.AssertTrue;

/**
 * Class stores the information for searching reservation in the hotel. It uses
 * detail provided by the guest for searching reservation.
 *
 * @author vinayk2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(callSuper = false)
public class SearchReservationRequest extends PMSRequest {

    String pmsReservationId;

    String confirmationNumber;

//	Integer legNumber;

    String firstName;

    String lastName;

    String creditCardNumber;

	String membershipNumber;

	String membershipType;

	String extReferenceNumber;

	Integer extRefLegNumber;

	String extReferenceType;

	@AssertTrue(message = "Has both first and last name if either is specified")
	private boolean hasBothOrNeitherNames() {
		return firstName == null ? lastName == null : lastName != null;
	}

}

