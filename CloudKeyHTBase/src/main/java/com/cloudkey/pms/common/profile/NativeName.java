package com.cloudkey.pms.common.profile;

import java.util.List;

/**
 * A person's name information in their native language
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class NativeName extends PersonName {
    private String languageCode;

    public NativeName(String languageCode, List<String> nameTitles, String firstName, List<String> middleNames, String lastName, List<String> nameSuffixes, String profession, String familiarName) {
        super(nameTitles, firstName, middleNames, lastName, nameSuffixes, profession, familiarName);
        this.languageCode = languageCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    @Override
    public String toString() {
        return "NativeName{" +
                "languageCode='" + languageCode + '\'' +
                '}';
    }
}
