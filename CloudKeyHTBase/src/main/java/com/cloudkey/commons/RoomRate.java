package com.cloudkey.commons;

import com.google.common.base.Objects;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Class stores details of room rate.It has information of base Amount,
 * efeectiveDate, expiration Date , occurrence Type , roomTypeID with  dateModified and dateCredted.
 *
 * @author niveditat
 */
public class RoomRate {

	// Reference Variables.
	private String planCode;
	private BigDecimal baseAmount;
	private DateTime effectiveDate;
	private DateTime expirationDate;

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public BigDecimal getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(BigDecimal baseAmount) {
		this.baseAmount = baseAmount;
	}

	public DateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(DateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public DateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(DateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("planCode", planCode)
			.add("baseAmount", baseAmount)
			.add("effectiveDate", effectiveDate)
			.add("expirationDate", expirationDate)
			.toString();
	}
}
