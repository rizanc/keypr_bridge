package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.room.RoomSetupInfo;
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
public class GetRoomSetupResponse extends PMSResponse {

    /* Reference variable to store the room availability. */
    private List<RoomSetupInfo> roomSetupInfos;

	public GetRoomSetupResponse(List<RoomSetupInfo> roomSetupInfos) {
		this.roomSetupInfos = ImmutableList.copyOf(roomSetupInfos);
	}

	public List<RoomSetupInfo> getRoomSetupInfos() {
		return roomSetupInfos;
	}

	@Override
	public String toString() {
		return "FindRoomStatusResponse{" +
			"roomSetupInfos=" + roomSetupInfos +
			'}';
	}
}
