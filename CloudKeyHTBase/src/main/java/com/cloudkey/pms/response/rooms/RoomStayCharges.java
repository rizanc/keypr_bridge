package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.joda.time.LocalDate;

import java.util.Map;

/**
 * Details of the total charges for the entire period of a room stay.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class RoomStayCharges {
	MonetaryAmount roomAndPackageTotal;

	MonetaryAmount taxAndFeeTotal;

	Boolean isTaxInclusive;

	Map<LocalDate, DayCharges> chargesByDate;
}
