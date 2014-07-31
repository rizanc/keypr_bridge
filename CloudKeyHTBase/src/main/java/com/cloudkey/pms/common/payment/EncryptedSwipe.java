package com.cloudkey.pms.common.payment;

import com.google.common.base.Objects;

/**
 * Encrypted information identifying a credit card.
 *
 * Can be used in place of a raw {@link CardNumber} or
 * on-file {@link VaultedCardNumber}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class EncryptedSwipe extends CardNumberReference {
    protected String trackIndicator;
    protected String swiperType;
    protected String swiperID;
    protected String maskedPAN;
    protected String track1;
    protected String track2;
    protected String keySerialNumber;

	protected EncryptedSwipe() { /* For serialization */ }

	public EncryptedSwipe(String trackIndicator, String swiperType, String swiperID, String maskedPAN, String track1, String track2, String keySerialNumber) {
		this.trackIndicator = trackIndicator;
		this.swiperType = swiperType;
		this.swiperID = swiperID;
		this.maskedPAN = maskedPAN;
		this.track1 = track1;
		this.track2 = track2;
		this.keySerialNumber = keySerialNumber;
	}

	public String getTrackIndicator() {
		return trackIndicator;
	}

	public String getSwiperType() {
		return swiperType;
	}

	public String getSwiperID() {
		return swiperID;
	}

	public String getMaskedPAN() {
		return maskedPAN;
	}

	public String getTrack1() {
		return track1;
	}

	public String getTrack2() {
		return track2;
	}

	public String getKeySerialNumber() {
		return keySerialNumber;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("track1", track1)
			.add("trackIndicator", trackIndicator)
			.add("swiperType", swiperType)
			.add("swiperID", swiperID)
			.add("maskedPAN", maskedPAN)
			.add("track2", track2)
			.add("keySerialNumber", keySerialNumber)
			.toString();
	}
}
