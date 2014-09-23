package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.room.RoomSetupInfo;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

/**
 * The Class has the details of reservation availability. It has the information of response status
 * as well as details of all rooms available in the hotel.
 *
 * @author vinayk2
 *
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class GetRoomSetupResponse extends PMSResponse {

    /* Reference variable to store the room availability. */
    List<RoomSetupInfo> roomSetupInfos;

}
