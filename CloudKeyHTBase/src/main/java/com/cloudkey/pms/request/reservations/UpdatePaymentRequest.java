package com.cloudkey.pms.request.reservations;

import com.cloudkey.commons.Payments;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.ArrayList;
import java.util.List;

/**
 * Class stores the information to make update payment request of the guest.
 *
 * @author vinayk2
 */
public class UpdatePaymentRequest {

    @NotBlank
    private String confirmationNumber;

    @NotEmpty
    private List<Payments> payments = Lists.newArrayList();

	public UpdatePaymentRequest(String confirmationNumber, List<Payments> payments) {
		this.confirmationNumber = confirmationNumber;
		this.payments.addAll(payments);
	}

	public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public List<Payments> getPayments() {
        return payments;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("confirmationNumber", confirmationNumber)
                .add("payments", payments)
                .toString();
    }
}
