package com.cloudkey.pms.response.roomassignments;

import com.cloudkey.commons.Response;

/**
 * This class is used to sote the response status and assign room number .
 *
 * @author niveditat
 *
 */
public class AssignRoomResponse extends Response {

    /*Variable to store the response.*/
    private String assignRoomNumber;

	/*setter and getters.*/

    public String getAssignRoomNumber() {
        return assignRoomNumber;
    }

    public void setAssignRoomNumber(String assignRoomNumber) {
        this.assignRoomNumber = assignRoomNumber;
    }

    @Override
    public String toString() {
        return "AssignRoomResponse [assignRoomNumber=" + assignRoomNumber
                + ", status=" + status + ", errorMessage=" + errorMessage + "]";
    }

}
