package com.cloudkey.pms.common.payment;

import com.google.common.base.Objects;

import javax.validation.constraints.NotNull;

/**
 * Contains the full unencrypted credit card number
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class CardNumber extends CardNumberReference {

    @NotNull
    private String cardNumber;

	protected CardNumber() { /* For serialization */ }

	public CardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

	public String getCardNumber() {
		return cardNumber;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("cardNumber", cardNumber)
			.toString();
	}
}
