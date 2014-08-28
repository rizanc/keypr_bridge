package com.cloudkey.pms.common.reservation;

import com.keypr.bridge.ids.BridgeIds;
import com.keypr.bridge.ids.RoomBlockCode;
import com.keypr.bridge.ids.RoomNumber;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class Room {
    private RoomType roomType;

    @Nullable
    private RoomNumber roomNumber;

    @Nullable
    private BridgeIds.RoomStatus roomStatus;

    @Nullable
    private RoomBlockCode roomBlockCode;
}
