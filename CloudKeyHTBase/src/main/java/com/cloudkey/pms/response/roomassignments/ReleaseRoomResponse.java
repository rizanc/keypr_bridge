package com.cloudkey.pms.response.roomassignments;

import com.cloudkey.commons.Response;

/**
 * This class stores the released rooms result status .
 *
 * @author niveditat
 *
 */
public class ReleaseRoomResponse extends Response {

    @Override
    public String toString() {
        return "ReleaseRoomResponse [status=" + status + ", errorMessage="
                + errorMessage + "]";
    }


}

