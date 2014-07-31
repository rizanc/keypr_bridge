package com.cloudkey.pms.request;

/**
 * Class stores the information for searching reservation in the hotel. It uses
 * detail provided by the guest for searching reservation.
 *
 * @author vinayk2
 */

public class SearchReservationRequest {

    /* variable to store confirmation number. */
    private String confirmationNumber;
    /* variable to store email address of the guest. */
    private String emailId;
    /* variable to store first name of the guest. */
    private String firstName;
    /* variable to store last name of the guest. */
    private String lastName;
    /* variable to store credit card number of the guest. */
    private String creditCardNumber;

    private String membershipNumber;
    private String membershipType;
    private String hotelCode;

    private String extRefLegNumber;
    private String extReferenceNumber;
    private String extReferenceType;

	/*
     * Getter and Setter for each data member.
	 */

    public String getCreditCardNumber() {

        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {

        this.creditCardNumber = creditCardNumber;
    }

    public String getConfirmationNumber() {

        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {

        this.confirmationNumber = confirmationNumber;
    }

    public String getEmailId() {

        return emailId;
    }

    public void setEmailId(String emailId) {

        this.emailId = emailId;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    @Override
    public String toString() {

        return "SearchReservationRequest [confirmationNumber="
                + confirmationNumber + ", emailId=" + emailId + ", firstName="
                + firstName + ", lastName=" + lastName + "]";
    }


    public String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getExtRefLegNumber() {
        return extRefLegNumber;
    }

    public void setExtRefLegNumber(String extRefLegNumber) {
        this.extRefLegNumber = extRefLegNumber;
    }

    public String getExtReferenceNumber() {
        return extReferenceNumber;
    }

    public void setExtReferenceNumber(String extReferenceNumber) {
        this.extReferenceNumber = extReferenceNumber;
    }

    public String getExtReferenceType() {
        return extReferenceType;
    }

    public void setExtReferenceType(String extReferenceType) {
        this.extReferenceType = extReferenceType;
    }
}
