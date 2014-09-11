package com.cloudkey.pms.common.reservation;

import javax.annotation.Nullable;

/**
 * A reference to a company, contact person, reservation group, etc.
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class ProfileReference {
	/**
	 * The identifier of the profile in the PMS system
	 */
    private String profileId;

	/**
	 * An additional identifier that is sometimes used in conjunction with the profile id.
	 *
	 * For examples, companies have an identifier which references their company profile (profileId,
	 * but they may also have another ID which somehow identifies the company.
	 */
	@Nullable
	private String otherId;

	@Nullable
    private String name;

	public ProfileReference(String profileId, @Nullable String otherId, @Nullable String name) {
		this.profileId = profileId;
		this.otherId = otherId;
		this.name = name;
	}

	public String getProfileId() {
		return profileId;
	}

	@Nullable
	public String getOtherId() {
		return otherId;
	}

	@Nullable
	public String getName() {
        return name;
    }

}
