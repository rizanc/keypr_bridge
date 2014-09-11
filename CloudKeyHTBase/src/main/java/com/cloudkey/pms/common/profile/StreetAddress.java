package com.cloudkey.pms.common.profile;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

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
		this.addressLine = ImmutableList.copyOf(addressLine);
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		StreetAddress that = (StreetAddress) o;

		if (addressLine != null ? !addressLine.equals(that.addressLine) : that.addressLine != null) return false;
		if (addressType != null ? !addressType.equals(that.addressType) : that.addressType != null) return false;
		if (barCode != null ? !barCode.equals(that.barCode) : that.barCode != null) return false;
		if (cityExtension != null ? !cityExtension.equals(that.cityExtension) : that.cityExtension != null)
			return false;
		if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;
		if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
		if (languageCode != null ? !languageCode.equals(that.languageCode) : that.languageCode != null) return false;
		if (otherAddressType != null ? !otherAddressType.equals(that.otherAddressType) : that.otherAddressType != null)
			return false;
		if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
		if (stateProv != null ? !stateProv.equals(that.stateProv) : that.stateProv != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = addressLine != null ? addressLine.hashCode() : 0;
		result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
		result = 31 * result + (stateProv != null ? stateProv.hashCode() : 0);
		result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
		result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
		result = 31 * result + (barCode != null ? barCode.hashCode() : 0);
		result = 31 * result + (cityExtension != null ? cityExtension.hashCode() : 0);
		result = 31 * result + (addressType != null ? addressType.hashCode() : 0);
		result = 31 * result + (otherAddressType != null ? otherAddressType.hashCode() : 0);
		result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
		return result;
	}
}
