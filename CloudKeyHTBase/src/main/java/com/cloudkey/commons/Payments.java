package com.cloudkey.commons;

import lombok.Value;

import java.math.BigDecimal;

/**
 * Class stores the information of payments made by the client.
 * Details include the credit card number and amount to be charged.
 *
 * @author vinayk2
 */
@Value
public class Payments {

	/**
	 * Reference variable to store the credit card information.
	 */
	String creditCard;

	/**
	 * Reference variable to store the chargeable amount.
	 */
	BigDecimal amount;

}
