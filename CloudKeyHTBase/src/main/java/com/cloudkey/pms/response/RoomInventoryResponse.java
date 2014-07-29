package com.cloudkey.pms.response;

import com.cloudkey.commons.Response;
import com.cloudkey.commons.RoomDetails;

/**
 * This class stores the room inventory details. The information includes
 * response status and room list detail.
 *
 * @author vinayk2
 *
 */
public class RoomInventoryResponse extends Response {

    // Variables to store data.
    RoomDetails roomDetailList;

    // Getter and Setter for each data member.

    public RoomDetails getRoomDetailList() {
        return roomDetailList;
    }

    public void setRoomDetailList(RoomDetails roomDetailList) {
        this.roomDetailList = roomDetailList;
    }

    @Override
    public String toString() {
        return "RoomInventoryResponse [roomDetailList=" + roomDetailList
                + ", status=" + status + ", errorMessage=" + errorMessage + "]";
    }

}