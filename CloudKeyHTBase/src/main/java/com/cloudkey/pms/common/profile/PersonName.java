package com.cloudkey.pms.common.profile;

import lombok.*;
import lombok.experimental.FieldDefaults;

import lombok.experimental.NonFinal;

import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class PersonName {
    List<String> nameTitles;

    String firstName;

    List<String> middleNames;

    String lastName;

    List<String> nameSuffixes;

    String profession;

    String familiarName;
}
