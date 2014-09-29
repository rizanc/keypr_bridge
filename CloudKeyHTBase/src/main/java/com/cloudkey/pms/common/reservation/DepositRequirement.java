package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

import javax.annotation.Nullable;

/**
 * Declaration of a deposit requirement for a reservation room stay
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class DepositRequirement {

	@Nullable
    LocalDate dueDate;

    MonetaryAmount depositAmount;

    @Nullable
    MonetaryAmount depositDueAmount;

}
