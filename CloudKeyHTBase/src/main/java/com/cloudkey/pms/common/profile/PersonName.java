package com.cloudkey.pms.common.profile;

import java.util.List;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class PersonName {
    protected List<String> nameTitles;

    protected String firstName;

    protected List<String> middleNames;

    protected String lastName;

    protected List<String> nameSuffixes;

    protected String profession;

    protected String familiarName;

    public PersonName(List<String> nameTitles, String firstName, List<String> middleNames, String lastName, List<String> nameSuffixes, String profession, String familiarName) {
        this.nameTitles = nameTitles;
        this.firstName = firstName;
        this.middleNames = middleNames;
        this.lastName = lastName;
        this.nameSuffixes = nameSuffixes;
        this.profession = profession;
        this.familiarName = familiarName;
    }

    public List<String> getNameTitles() {
        return nameTitles;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<String> getMiddleNames() {
        return middleNames;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getNameSuffixes() {
        return nameSuffixes;
    }

    public String getProfession() {
        return profession;
    }

    public String getFamiliarName() {
        return familiarName;
    }

    @Override
    public String toString() {
        return "PersonName{" +
                "nameTitles=" + nameTitles +
                ", firstName='" + firstName + '\'' +
                ", middleNames=" + middleNames +
                ", lastName='" + lastName + '\'' +
                ", nameSuffixes=" + nameSuffixes +
                ", profession='" + profession + '\'' +
                ", familiarName='" + familiarName + '\'' +
                '}';
    }
}
