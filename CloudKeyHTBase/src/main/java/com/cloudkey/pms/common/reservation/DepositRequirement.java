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

	@Nullable
    private LocalDate dueDate;

    private MonetaryAmount depositAmount;

    @Nullable
    private MonetaryAmount depositDueAmount;

	public DepositRequirement(LocalDate dueDate, MonetaryAmount depositAmount, MonetaryAmount depositDueAmount) {
		this.dueDate = dueDate;
		this.depositAmount = depositAmount;
		this.depositDueAmount = depositDueAmount;
	}

	@Nullable
	public LocalDate getDueDate() {
		return dueDate;
	}

	public MonetaryAmount getDepositAmount() {
		return depositAmount;
	}

	@Nullable
	public MonetaryAmount getDepositDueAmount() {
		return depositDueAmount;
	}
}
