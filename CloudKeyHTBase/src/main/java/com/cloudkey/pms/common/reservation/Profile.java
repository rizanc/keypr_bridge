package com.cloudkey.pms.common.reservation;

/**
 * A company which might book a room for an employee
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class Profile {
    private String id;

    private String name;

	public Profile(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
