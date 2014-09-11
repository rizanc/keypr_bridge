package com.cloudkey.pms.common.payment;

import com.google.common.base.Objects;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;

/**
 * A monetary amount, with specifiable decimal precision and currency.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class MonetaryAmount {
    private BigDecimal amount;

	private Currency currencyCode = Currency.getInstance(Locale.US);

	protected MonetaryAmount() { /* For serialization */ }

	public MonetaryAmount(double amount, short numDecimals, Currency currencyCode) {
		this(toBigDecimal(amount, numDecimals), currencyCode);
	}

	public MonetaryAmount(BigDecimal amount, Currency currencyCode) {
		this.amount = amount;
		this.currencyCode = currencyCode;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Currency getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * Converts a double to a BigDecimal the specified number of decimal positions.
	 *
	 * @param d
	 * @param numDecimals
	 * @return
	 */
	private static BigDecimal toBigDecimal(double d, short numDecimals) {
		StringBuilder pattern = new StringBuilder("#.");

		for (short i = 0; i < numDecimals; i++) {
			pattern.append("0");
		}

		DecimalFormat decimalFormat = new DecimalFormat(pattern.toString());
		String stringRepresentation = decimalFormat.format(d);

		return new BigDecimal(stringRepresentation);
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("currencyCode", currencyCode)
			.add("amount", amount)
			.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MonetaryAmount that = (MonetaryAmount) o;

		if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
		if (currencyCode != null ? !currencyCode.equals(that.currencyCode) : that.currencyCode != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = amount != null ? amount.hashCode() : 0;
		result = 31 * result + (currencyCode != null ? currencyCode.hashCode() : 0);
		return result;
	}
}
