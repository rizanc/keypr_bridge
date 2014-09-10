package com.cloudkey.pms.common.reservation;

import javax.annotation.Nullable;

/**
 * A reference to a company, contact person, reservation group, etc.
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class ProfileReference {
    private String id;

	@Nullable
    private String name;

	public ProfileReference(String id, @Nullable String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	@Nullable
	public String getName() {
        return name;
    }


	@Override
	public String toString() {
		return "ProfileReference{" +
			"id='" + id + '\'' +
			", name='" + name + '\'' +
			'}';
	}
}
