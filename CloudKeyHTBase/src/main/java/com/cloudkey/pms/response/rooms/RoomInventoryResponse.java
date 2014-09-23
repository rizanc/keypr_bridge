package com.cloudkey.pms.response.rooms;

import com.cloudkey.commons.RoomDetails;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * This class stores the room inventory details. The information includes
 * response status and room list detail.
 *
 * @author vinayk2
 *
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class RoomInventoryResponse extends PMSResponse {
    RoomDetails roomDetailList;
}
