package com.cloudkey.pms.response.rooms;

import com.cloudkey.commons.RoomDetails;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/**
 * This class stores the room inventory details. The information includes
 * response status and room list detail.
 *
 * @author vinayk2
 *
 */
public class RoomInventoryResponse extends PMSResponse {

    private RoomDetails roomDetailList;

	public RoomInventoryResponse(RoomDetails roomDetailList) {
		this.roomDetailList = roomDetailList;
	}

	public RoomDetails getRoomDetailList() {
		return roomDetailList;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("roomDetailList", roomDetailList)
			.toString();
	}
}
