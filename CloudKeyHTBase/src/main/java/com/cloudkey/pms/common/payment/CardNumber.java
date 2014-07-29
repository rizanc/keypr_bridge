package com.cloudkey.pms.common.payment;

import javax.validation.constraints.NotNull;

/**
 * Contains the full unencrypted credit card number
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class CardNumber extends CardNumberReference {
    @NotNull
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }
}
