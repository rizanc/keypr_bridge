package com.cloudkey.pms.response.roomassignments;

import com.cloudkey.commons.Response;
import com.cloudkey.commons.RoomDetails;
import com.google.common.base.Objects;

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
		return Objects.toStringHelper(this)
			.add("roomDetailList", roomDetailList)
			.toString();
	}
}
