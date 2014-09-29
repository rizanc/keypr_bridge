package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.EqualsAndHashCode;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * A rate plan discount of an exact currency amount
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
public class FlatDiscount extends Discount {
    MonetaryAmount discountAmount;

    public FlatDiscount(String discountReason, MonetaryAmount discountAmount) {
        super(discountReason);
        this.discountAmount = discountAmount;
    }
}
