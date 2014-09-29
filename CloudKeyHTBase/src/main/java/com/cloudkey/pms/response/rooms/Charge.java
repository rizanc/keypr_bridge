package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * Details for a single charge, i.e. Room Tax for a single day, or base rate for that day.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class Charge {
	String description;

	MonetaryAmount amount;

	String codeType;

	String code;
}
