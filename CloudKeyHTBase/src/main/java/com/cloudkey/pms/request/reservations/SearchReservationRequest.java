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

    private String confirmationNumber;

    private String firstName;

    private String lastName;

    private String creditCardNumber;

	protected SearchReservationRequest() { /* For serialization */ }

    public SearchReservationRequest(String confirmationNumber, String firstName, String lastName, String creditCardNumber) {
        this.confirmationNumber = confirmationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCardNumber = creditCardNumber;
    }

    @AssertTrue(message = "At least one criteria must be specified")
    private boolean isValid() {
        // At least one criteria must be specified
        return !(confirmationNumber == null
                && firstName == null
                && lastName == null
                && creditCardNumber == null);
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
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

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("confirmationNumber", confirmationNumber)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("creditCardNumber", creditCardNumber)
                .toString();
    }
}
