package com.cloudkey.pms.common.reservation;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class TravelAgentProfile {
    private String id;

    @Nullable
    private String name;

	public TravelAgentProfile(String id, @Nullable String name) {
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
        return "TravelAgent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
