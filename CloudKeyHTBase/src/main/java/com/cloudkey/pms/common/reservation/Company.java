package com.cloudkey.pms.common.reservation;

import com.keypr.bridge.ids.CompanyId;

/**
 * A company which might book a room for an employee
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class Company {
    private CompanyId id;

    private String name;

    public Company(CompanyId id, String name) {
        this.id = id;
        this.name = name;
    }

    public CompanyId getId() {
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
