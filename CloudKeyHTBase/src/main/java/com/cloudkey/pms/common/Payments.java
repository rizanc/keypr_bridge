package com.cloudkey.pms.common;

import lombok.*;
import lombok.experimental.FieldDefaults;


import java.math.BigDecimal;

/**
 * Class stores the information of payments made by the client.
 * Details include the credit card number and amount to be charged.
 *
 * @author vinayk2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
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
