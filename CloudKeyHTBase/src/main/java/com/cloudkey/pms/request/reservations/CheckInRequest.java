package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.common.payment.CardNumber;
import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Class stores the check in information of the guest. It has details of check
 * in date, check out date, room number and all details related to the stay at
 * the hotel.
 *
 * @author vinayk2
 */
public class CheckInRequest {
    @NotBlank
    private String confirmationNumber;

    // TODO: This probably needs to be expanded to at least card holder name and exp date
    private CardNumber creditCardNumber;

    public CheckInRequest(String confirmationNumber, CardNumber creditCardNumber) {
        this.confirmationNumber = confirmationNumber;
        this.creditCardNumber = creditCardNumber;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public CardNumber getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("confirmationNumber", confirmationNumber)
                .add("creditCardNumber", creditCardNumber)
                .toString();
    }
}
