package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.room.RoomStatusInfo;
import com.cloudkey.pms.response.PMSResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.List;

/**
 * The Class has the details of reservation availability. It has the information of response status
 * as well as details of all rooms available in the hotel.
 *
 * @author vinayk2
 *
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(callSuper = false)
public class GetRoomStatusResponse extends PMSResponse {

    /* Reference variable to store the room availability. */
    List<RoomStatusInfo> roomStatusInfos;

}
