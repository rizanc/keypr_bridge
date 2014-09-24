package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.Value;
import org.joda.time.LocalDate;

import javax.annotation.Nullable;

/**
 * Declaration of a deposit requirement for a reservation room stay
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class DepositRequirement {

	@Nullable
    LocalDate dueDate;

    MonetaryAmount depositAmount;

    @Nullable
    MonetaryAmount depositDueAmount;

}
