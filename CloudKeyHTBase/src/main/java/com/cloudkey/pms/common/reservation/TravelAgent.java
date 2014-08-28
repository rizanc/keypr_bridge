package com.cloudkey.pms.common.reservation;

import com.keypr.bridge.ids.CompanyId;
import com.keypr.bridge.ids.TravelAgentId;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class TravelAgent {
    private TravelAgentId id;

    @Nullable
    private String name;

    public TravelAgent(TravelAgentId id, @Nullable String name) {
        this.id = id;
        this.name = name;
    }

    public TravelAgentId getId() {
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
