package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import lombok.Value;

import javax.validation.constraints.AssertTrue;

/**
 * Class stores the information for searching reservation in the hotel. It uses
 * detail provided by the guest for searching reservation.
 *
 * @author vinayk2
 */
@Value
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

	public SearchReservationRequest(String pmsReservationId, String confirmationNumber, String firstName, String lastName, String creditCardNumber, String membershipNumber, String membershipType, String extReferenceNumber, Integer extRefLegNumber, String extReferenceType) {
		this.pmsReservationId = pmsReservationId;
		this.confirmationNumber = confirmationNumber;
//		this.legNumber = legNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.creditCardNumber = creditCardNumber;
		this.membershipNumber = membershipNumber;
		this.membershipType = membershipType;
		this.extReferenceNumber = extReferenceNumber;
		this.extRefLegNumber = extRefLegNumber;
		this.extReferenceType = extReferenceType;
	}

	@AssertTrue(message = "Has both first and last name if either is specified")
	private boolean hasBothOrNeitherNames() {
		return firstName == null ? lastName == null : lastName != null;
	}

}

