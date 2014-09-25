package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.Value;

/**
 * Details for a single charge, i.e. Room Tax for a single day, or base rate for that day.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class Charge {
	String description;

	MonetaryAmount amount;

	String codeType;

	String code;
}
