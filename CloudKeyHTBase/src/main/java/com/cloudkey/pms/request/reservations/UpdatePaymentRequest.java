package com.cloudkey.pms.request.reservations;

import com.cloudkey.commons.Payments;
import com.google.common.collect.ImmutableList;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * Class stores the information to make update payment request of the guest.
 *
 * @author vinayk2
 */
@Value
@EqualsAndHashCode(callSuper = true)
public class UpdatePaymentRequest extends AbstractSingleReservationRequest {

    @NotEmpty
    @ApiModelProperty(required = true)
    List<Payments> payments;

	public UpdatePaymentRequest(String pmsReservationId, List<Payments> payments) {
		super(pmsReservationId);
		this.payments = ImmutableList.copyOf(payments);
	}

}
