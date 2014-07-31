package com.cloudkey.pms.response.memberships;

import com.cloudkey.commons.Response;

/*
 * This class hold information of name id.
 */
public class NameIdByMembershipResponse extends Response {

    private String nameId;


    public String getNameId() {

        return nameId;
    }
    public void setNameId(String nameId) {

        this.nameId = nameId;
    }
    @Override
    public String toString() {
        return "NameIdByMembershipResponse [nameId=" + nameId + ", status="
                + status + ", errorMessage=" + errorMessage + "]";
    }

}
