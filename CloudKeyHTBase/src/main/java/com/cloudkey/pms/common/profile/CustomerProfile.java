package com.cloudkey.pms.common.profile;

import com.google.common.collect.ImmutableList;
import org.joda.time.LocalDate;

import java.util.List;

import static com.keypr.bridge.ids.BridgeIds.Gender;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class CustomerProfile {
    /**
     * A PMS-local identifier for the guest.
     */
    private String id;

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

	public CustomerProfile(String id, PersonName personName, NativeName nativeName, String businessTitle, Gender gender, LocalDate birthDate, List<StreetAddress> streetAddresses, List<String> emailAddresses, List<String> phoneNumbers, List<String> faxNumbers) {
		this.id = id;
		this.personName = personName;
		this.nativeName = nativeName;
		this.businessTitle = businessTitle;
		this.gender = gender;
		this.birthDate = birthDate;
		this.streetAddresses = ImmutableList.copyOf(streetAddresses);
		this.emailAddresses = ImmutableList.copyOf(emailAddresses);
		this.phoneNumbers = ImmutableList.copyOf(phoneNumbers);
		this.faxNumbers = ImmutableList.copyOf(faxNumbers);
	}

	public String getId() {
		return id;
	}

	public PersonName getPersonName() {
		return personName;
	}

	public NativeName getNativeName() {
		return nativeName;
	}

	public String getBusinessTitle() {
		return businessTitle;
	}

	public Gender getGender() {
		return gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public List<StreetAddress> getStreetAddresses() {
		return streetAddresses;
	}

	public List<String> getEmailAddresses() {
		return emailAddresses;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public List<String> getFaxNumbers() {
		return faxNumbers;
	}

	@Override
	public String toString() {
		return "CustomerProfile{" +
			"id='" + id + '\'' +
			", personName=" + personName +
			", nativeName=" + nativeName +
			", businessTitle='" + businessTitle + '\'' +
			", gender=" + gender +
			", birthDate=" + birthDate +
			", streetAddresses=" + streetAddresses +
			", emailAddresses=" + emailAddresses +
			", phoneNumbers=" + phoneNumbers +
			", faxNumbers=" + faxNumbers +
			'}';
	}
}
