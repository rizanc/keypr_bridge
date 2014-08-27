package com.cloudkey.pms.common.profile;

import com.google.common.base.Objects;

import java.util.List;

/**
 * Street address
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class StreetAddress {

    private List<String> addressLine;

    private String cityName;

    private String stateProv;

    private String countryCode;

    private String postalCode;

    private String barCode;

    private String cityExtension;

    private String addressType;

    private String otherAddressType;

    private String languageCode;

	protected StreetAddress() { /* For serialization */ }

	public StreetAddress(List<String> addressLine, String cityName, String stateProv, String countryCode, String postalCode, String barCode, String cityExtension, String addressType, String otherAddressType, String languageCode) {
		this.addressLine = addressLine;
		this.cityName = cityName;
		this.stateProv = stateProv;
		this.countryCode = countryCode;
		this.postalCode = postalCode;
		this.barCode = barCode;
		this.cityExtension = cityExtension;
		this.addressType = addressType;
		this.otherAddressType = otherAddressType;
		this.languageCode = languageCode;
	}

	public List<String> getAddressLine() {
		return addressLine;
	}

	public String getCityName() {
		return cityName;
	}

	public String getStateProv() {
		return stateProv;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getBarCode() {
		return barCode;
	}

	public String getCityExtension() {
		return cityExtension;
	}

	public String getAddressType() {
		return addressType;
	}

	public String getOtherAddressType() {
		return otherAddressType;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("addressLine", addressLine)
			.add("cityName", cityName)
			.add("stateProv", stateProv)
			.add("countryCode", countryCode)
			.add("postalCode", postalCode)
			.add("barCode", barCode)
			.add("cityExtension", cityExtension)
			.add("addressType", addressType)
			.add("otherAddressType", otherAddressType)
			.add("languageCode", languageCode)
			.toString();
	}
}
