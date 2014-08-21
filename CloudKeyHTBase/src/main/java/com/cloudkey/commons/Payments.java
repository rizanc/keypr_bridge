package com.cloudkey.commons;

import com.google.common.base.Objects;

import java.math.BigDecimal;

/**
 * Class stores the information of payments made by the client.
 * Details include the credit card number and amount to be charged.
 *
 * @author vinayk2
 */
public class Payments {

	/* Reference variable to store the credit card information. */
	private String creditCard;
	/* Reference variable to store the chargeable amount. */
	private BigDecimal amount;

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("creditCard", creditCard)
			.add("amount", amount)
			.toString();
	}
}
