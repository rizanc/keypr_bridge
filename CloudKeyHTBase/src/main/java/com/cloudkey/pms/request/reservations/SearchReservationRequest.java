package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;

import javax.validation.constraints.AssertTrue;

/**
 * Class stores the information for searching reservation in the hotel. It uses
 * detail provided by the guest for searching reservation.
 *
 * @author vinayk2
 */
public class SearchReservationRequest extends PMSRequest {

    private String pmsReservationId;

    private String confirmationNumber;

//	private Integer legNumber;

    private String firstName;

    private String lastName;

    private String creditCardNumber;

	private String membershipNumber;

	private String membershipType;

	private String extReferenceNumber;

	private Integer extRefLegNumber;

	private String extReferenceType;

	protected SearchReservationRequest() { /* For serialization */ }

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

	@Override
	public String toString() {
		return "SearchReservationRequest{" +
			"pmsReservationId='" + pmsReservationId + '\'' +
			", confirmationNumber='" + confirmationNumber + '\'' +
			", firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", creditCardNumber='" + creditCardNumber + '\'' +
			", membershipNumber='" + membershipNumber + '\'' +
			", membershipType='" + membershipType + '\'' +
			", extReferenceNumber='" + extReferenceNumber + '\'' +
			", extRefLegNumber=" + extRefLegNumber +
			", extReferenceType='" + extReferenceType + '\'' +
			'}';
	}

	public String getPmsReservationId() {
        return pmsReservationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

	public String getMembershipNumber() {
		return membershipNumber;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public Integer getExtRefLegNumber() {
		return extRefLegNumber;
	}

	public String getExtReferenceNumber() {
		return extReferenceNumber;
	}

	public String getExtReferenceType() {
		return extReferenceType;
	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

}

