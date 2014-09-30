package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.RoomDetails;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * This class stores the room inventory details. The information includes
 * response status and room list detail.
 *
 * @author vinayk2
 *
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class RoomInventoryResponse extends PMSResponse {
    RoomDetails roomDetailList;
}
