package com.cloudkey.pms.request.reservations;

import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class represents the get bill request of the guest. The request
 * include confirmation number of the guest.
 *
 * @author vinayk2
 */
public class GetFolioRequest {
    @NotBlank
    private String confirmationNumber;

    public GetFolioRequest(String confirmationNumber) {
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
