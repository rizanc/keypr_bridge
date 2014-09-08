package com.cloudkey.pms.request.reservations;

import com.cloudkey.commons.Payments;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * Class stores the information to make update payment request of the guest.
 *
 * @author vinayk2
 */
public class UpdatePaymentRequest extends AbstractSingleReservationRequest {

    @NotEmpty
    @ApiModelProperty(required = true)
    private List<Payments> payments;

	protected UpdatePaymentRequest() { /* For serialization */ }

	public UpdatePaymentRequest(String pmsReservationId, List<Payments> payments) {
		super(pmsReservationId);
		this.payments = ImmutableList.copyOf(payments);
	}

	public List<Payments> getPayments() {
		return payments;
	}

	@Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("payments", payments)
                .toString();
    }
}
