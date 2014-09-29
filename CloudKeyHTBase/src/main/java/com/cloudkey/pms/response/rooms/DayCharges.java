package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Builder;

import java.util.List;

/**
 * Details the charges for one day of a stay.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@Builder
public class DayCharges {
	List<Charge> roomAndPackageCharges;

	MonetaryAmount roomAndPackageTotal;

	List<Charge> taxAndFeeCharges;

	MonetaryAmount taxAndFeeTotal;
}
