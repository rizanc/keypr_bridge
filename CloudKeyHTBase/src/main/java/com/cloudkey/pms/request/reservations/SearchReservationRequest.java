package com.cloudkey.pms.request.reservations;

import com.google.common.base.Objects;

import javax.validation.constraints.AssertTrue;

/**
 * Class stores the information for searching reservation in the hotel. It uses
 * detail provided by the guest for searching reservation.
 *
 * @author vinayk2
 */
public class SearchReservationRequest {

    private String pmsReservationId;

    private String firstName;

    private String lastName;

    private String creditCardNumber;

	private String membershipNumber;

	private String membershipType;

	private String hotelCode;

	private String extRefLegNumber;

	private String extReferenceNumber;

	private String extReferenceType;

	protected SearchReservationRequest() { /* For serialization */ }

	public SearchReservationRequest(String pmsReservationId, String firstName, String lastName, String creditCardNumber, String membershipNumber, String membershipType, String hotelCode, String extRefLegNumber, String extReferenceNumber, String extReferenceType) {
		this.pmsReservationId = pmsReservationId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.creditCardNumber = creditCardNumber;
		this.membershipNumber = membershipNumber;
		this.membershipType = membershipType;
		this.hotelCode = hotelCode;
		this.extRefLegNumber = extRefLegNumber;
		this.extReferenceNumber = extReferenceNumber;
		this.extReferenceType = extReferenceType;
	}

	@AssertTrue(message = "At least one criteria must be specified")
    private boolean isValid() {
		// At least one criteria must be specified
		return (pmsReservationId != null
			|| firstName != null
			|| lastName != null
			|| creditCardNumber != null
			|| membershipNumber != null
			|| membershipType != null
			|| hotelCode != null
			|| extRefLegNumber != null
			|| extReferenceNumber != null
			|| extReferenceType != null);
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

	public String getHotelCode() {
		return hotelCode;
	}

	public String getExtRefLegNumber() {
		return extRefLegNumber;
	}

	public String getExtReferenceNumber() {
		return extReferenceNumber;
	}

	public String getExtReferenceType() {
		return extReferenceType;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("pmsReservationId", pmsReservationId)
			.add("firstName", firstName)
			.add("lastName", lastName)
			.add("creditCardNumber", creditCardNumber)
			.add("membershipNumber", membershipNumber)
			.add("membershipType", membershipType)
			.add("hotelCode", hotelCode)
			.add("extRefLegNumber", extRefLegNumber)
			.add("extReferenceNumber", extReferenceNumber)
			.add("extReferenceType", extReferenceType)
			.toString();
	}
}

