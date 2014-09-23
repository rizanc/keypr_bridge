package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.keypr.bridge.ids.BridgeIds;
import lombok.Value;
import org.joda.time.LocalDate;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@Value
public class RoomRate {
	BridgeIds.RateOccurrence rateOccurrence;

	@Nullable
	LocalDate effectiveDate;

	@Nullable
	LocalDate expirationDate;

	@Nullable
	MonetaryAmount baseAmount;

	@Nullable
	Double points;
}
