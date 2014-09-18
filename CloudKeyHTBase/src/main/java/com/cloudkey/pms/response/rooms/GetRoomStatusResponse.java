package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.room.RoomStatusInfo;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * The Class has the details of reservation availability. It has the information of response status
 * as well as details of all rooms available in the hotel.
 *
 * @author vinayk2
 *
 */
public class GetRoomStatusResponse extends PMSResponse {

    /* Reference variable to store the room availability. */
    private List<RoomStatusInfo> roomStatusInfos;

	public GetRoomStatusResponse(List<RoomStatusInfo> roomStatusInfos) {
		this.roomStatusInfos = ImmutableList.copyOf(roomStatusInfos);
	}

	public List<RoomStatusInfo> getRoomStatusInfos() {
		return roomStatusInfos;
	}

	@Override
	public String toString() {
		return "FindRoomStatusResponse{" +
			"roomStatusInfos=" + roomStatusInfos +
			'}';
	}
}
