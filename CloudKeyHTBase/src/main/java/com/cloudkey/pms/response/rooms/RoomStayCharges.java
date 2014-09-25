package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.Value;
import org.joda.time.LocalDate;

import java.util.Map;

/**
 * Details of the total charges for the entire period of a room stay.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class RoomStayCharges {
	MonetaryAmount roomAndPackageTotal;

	MonetaryAmount taxAndFeeTotal;

	Boolean isTaxInclusive;

	Map<LocalDate, DayCharges> chargesByDate;
}
