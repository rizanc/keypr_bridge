package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.keypr.bridge.ids.BridgeIds;
import org.joda.time.LocalDate;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class RoomRate {

	private BridgeIds.RateOccurrence rateOccurrence;

	@Nullable
	private LocalDate effectiveDate;

	@Nullable
	private LocalDate expirationDate;

	@Nullable
	private MonetaryAmount baseAmount;

	@Nullable
	private Double points;

	public RoomRate(BridgeIds.RateOccurrence rateOccurrence, @Nullable LocalDate effectiveDate, @Nullable LocalDate expirationDate, @Nullable MonetaryAmount baseAmount, @Nullable Double points) {
		this.rateOccurrence = rateOccurrence;
		this.effectiveDate = effectiveDate;
		this.expirationDate = expirationDate;
		this.baseAmount = baseAmount;
		this.points = points;
	}

	public BridgeIds.RateOccurrence getRateOccurrence() {
		return rateOccurrence;
	}

	@Nullable
	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}

	@Nullable
	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	@Nullable
	public MonetaryAmount getBaseAmount() {
		return baseAmount;
	}

	@Nullable
	public Double getPoints() {
		return points;
	}

	@Override
	public String toString() {
		return "RoomRate{" +
			"rateOccurrence=" + rateOccurrence +
			", effectiveDate=" + effectiveDate +
			", expirationDate=" + expirationDate +
			", baseAmount=" + baseAmount +
			", points=" + points +
			'}';
	}
}
