package com.cloudkey.commons;

import lombok.Value;
import lombok.experimental.Builder;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * This class encapsulates the information of the order placed by the guest.
 * the detail include item code, item description, unit price, quantity and total
 * charge amount.
 *
 * @author vinayk2
 */
@Value
@Builder
public class OrderDetails {
	// reference variables.
	String itemCode;
	String itemDescription;
	BigDecimal unitPrice;
	Integer quantity;
	BigDecimal chargeAmount;
	DateTime dateTime;
}
