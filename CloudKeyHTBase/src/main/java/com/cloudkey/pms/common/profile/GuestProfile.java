package com.cloudkey.pms.common.profile;

import com.keypr.bridge.ids.GuestProfileId;
import org.joda.time.LocalDate;

import java.util.List;

import static com.keypr.bridge.ids.BridgeIds.Gender;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class GuestProfile {
    /**
     * A PMS-local identifier for the guest.
     */
    private GuestProfileId id;

    /**
     * The guest's name information
     */
    private PersonName personName;

    /**
     * The guest's name information in their native language
     */
    private NativeName nativeName;

    /**
     * The professional title of the guest
     */
    private String businessTitle;

    /**
     * The guest's gender
     */
    private Gender gender;

    /**
     * The guest's birthday
     */
    private LocalDate birthDate;

    /**
     * The contact addresses for the guest
     */
    private List<StreetAddress> streetAddresses;

    private List<String> emailAddresses;

    private List<String> phoneNumbers;

    private List<String> faxNumbers;

}
