package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.keypr.bridge.ids.BridgeIds;
import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class RoomRate {
	String roomType;

	String rateCode;

	/**
	 * If enabled, this rate should not be advertised publicly on booking websites / etc.
	 */
	Boolean suppressRate;

	Boolean hasPackage;

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
