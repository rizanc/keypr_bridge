package com.cloudkey.pms.response;

import com.cloudkey.commons.Response;

/*
 * This class hold information of name id.
 */
public class NameIdBymembershipResponse extends Response {

    private String nameId;


    public String getNameId() {

        return nameId;
    }
    public void setNameId(String nameId) {

        this.nameId = nameId;
    }
    @Override
    public String toString() {
        return "NameIdBymembershipResponse [nameId=" + nameId + ", status="
                + status + ", errorMessage=" + errorMessage + "]";
    }

}
