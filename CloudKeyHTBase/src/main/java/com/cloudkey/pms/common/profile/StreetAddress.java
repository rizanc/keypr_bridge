package com.cloudkey.pms.common.profile;

import lombok.Value;

import java.util.List;

/**
 * Street address
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class StreetAddress {

    List<String> addressLine;

    String cityName;

    String stateProv;

    String countryCode;

    String postalCode;

    String barCode;

    String cityExtension;

    String addressType;

    String otherAddressType;

    String languageCode;

}
