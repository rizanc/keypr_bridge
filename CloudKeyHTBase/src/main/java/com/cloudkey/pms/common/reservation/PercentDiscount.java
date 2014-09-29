package com.cloudkey.pms.common.reservation;

import lombok.EqualsAndHashCode;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * A rate plan discount by a percentage
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
public class PercentDiscount extends Discount {
    Double discountPercentage;

	public PercentDiscount(String discountReason, Double discountPercentage) {
        super(discountReason);
        this.discountPercentage = discountPercentage;
    }
}
