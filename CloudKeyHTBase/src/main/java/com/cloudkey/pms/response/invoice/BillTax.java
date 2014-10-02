package com.cloudkey.pms.response.invoice;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.*;
import lombok.experimental.Builder;
import lombok.experimental.FieldDefaults;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class BillTax {

	MonetaryAmount vatAmount;

	MonetaryAmount vatAmountEuro;

	String description;

}
