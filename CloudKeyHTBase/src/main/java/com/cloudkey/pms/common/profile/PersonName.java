package com.cloudkey.pms.common.profile;

import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.List;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@Value
@NonFinal
public class PersonName {
    List<String> nameTitles;

    String firstName;

    List<String> middleNames;

    String lastName;

    List<String> nameSuffixes;

    String profession;

    String familiarName;
}
