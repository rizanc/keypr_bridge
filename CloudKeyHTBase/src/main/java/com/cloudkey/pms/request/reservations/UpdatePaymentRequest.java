package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.common.Payments;
import com.google.common.collect.ImmutableList;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * Class stores the information to make update payment request of the guest.
 *
 * @author vinayk2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
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
