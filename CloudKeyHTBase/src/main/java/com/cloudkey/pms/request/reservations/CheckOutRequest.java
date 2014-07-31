package com.cloudkey.pms.request.reservations;

import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Class stores check out request information of the guest. It has confirmation
 * number as its details.
 *
 * @author vinayk2
 */
public class CheckOutRequest {
    @NotBlank
    private String confirmationNumber;

    public CheckOutRequest(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("confirmationNumber", confirmationNumber)
                .toString();
    }
}
