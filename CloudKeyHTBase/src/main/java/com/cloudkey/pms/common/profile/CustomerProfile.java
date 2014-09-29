package com.cloudkey.pms.common.profile;

import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

import java.util.List;

import static com.keypr.bridge.ids.BridgeIds.Gender;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class CustomerProfile {
    /**
     * A PMS-local identifier for the guest.
     */
    String id;

    /**
     * The guest's name information
     */
    PersonName personName;

    /**
     * The guest's name information in their native language
     */
    NativeName nativeName;

    /**
     * The professional title of the guest
     */
    String businessTitle;

    /**
     * The guest's gender
     */
    Gender gender;

    /**
     * The guest's birthday
     */
    LocalDate birthDate;

    /**
     * The contact addresses for the guest
     */
    List<StreetAddress> streetAddresses;

    List<String> emailAddresses;

    List<String> phoneNumbers;

    List<String> faxNumbers;
}
