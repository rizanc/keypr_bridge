package com.cloudkey.pms.common.profile;

import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.List;

/**
 * Street address
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
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
