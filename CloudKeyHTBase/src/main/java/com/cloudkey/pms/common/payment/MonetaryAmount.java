package com.cloudkey.pms.common.payment;

import lombok.Value;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Currency;

/**
 * A monetary amount, with specifiable decimal precision and currency.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class MonetaryAmount {
	@NotNull
    BigDecimal amount;

	@NotNull
	Currency currencyCode;

	public MonetaryAmount(double amount, short numDecimals, Currency currencyCode) {
		this(toBigDecimal(amount, numDecimals), currencyCode);
	}

	public MonetaryAmount(BigDecimal amount, Currency currencyCode) {
		this.amount = amount;
		this.currencyCode = currencyCode;
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
}
