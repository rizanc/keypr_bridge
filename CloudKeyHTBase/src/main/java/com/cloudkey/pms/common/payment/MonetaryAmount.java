package com.cloudkey.pms.common.payment;

import com.google.common.base.Objects;

import java.util.Currency;
import java.util.Locale;

/**
 * A monetary amount, with specifiable decimal precision and currency.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class MonetaryAmount {
    private Double amount;

    private Short numDecimals = 2;

    private Currency currencyCode = Currency.getInstance(Locale.US);

	protected MonetaryAmount() { /* For serialization */ }

	public MonetaryAmount(Double amount, Short numDecimals, Currency currencyCode) {
		this.amount = amount;
		this.numDecimals = numDecimals;
		this.currencyCode = currencyCode;
	}

	public Double getAmount() {
		return amount;
	}

	public Short getNumDecimals() {
		return numDecimals;
	}

	public Currency getCurrencyCode() {
		return currencyCode;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("currencyCode", currencyCode)
			.add("numDecimals", numDecimals)
			.add("amount", amount)
			.toString();
	}
}
