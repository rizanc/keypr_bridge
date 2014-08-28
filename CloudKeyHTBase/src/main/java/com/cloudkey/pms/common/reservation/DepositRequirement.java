package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import org.joda.time.LocalDate;

import javax.annotation.Nullable;

/**
 * Declaration of a deposit requirement for a reservation room stay
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class DepositRequirement {

    private LocalDate dueDate;

    private MonetaryAmount depositAmount;

    @Nullable
    private MonetaryAmount depositDueAmount;

}
