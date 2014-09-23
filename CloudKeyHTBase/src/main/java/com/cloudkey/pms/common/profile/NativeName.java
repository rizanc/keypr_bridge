package com.cloudkey.pms.common.profile;

import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

/**
 * A person's name information in their native language
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class NativeName extends PersonName {
    String languageCode;

    public NativeName(String languageCode, List<String> nameTitles, String firstName, List<String> middleNames, String lastName, List<String> nameSuffixes, String profession, String familiarName) {
        super(nameTitles, firstName, middleNames, lastName, nameSuffixes, profession, familiarName);
        this.languageCode = languageCode;
    }
}
