package com.cloudkey.pms.common;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Builder;
import lombok.experimental.FieldDefaults;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * This class encapsulates the information of the order placed by the guest.
 * the detail include item code, item description, unit price, quantity and total
 * charge amount.
 *
 * @author vinayk2
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
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
