package com.cloudkey.pms.common.payment;

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
}
