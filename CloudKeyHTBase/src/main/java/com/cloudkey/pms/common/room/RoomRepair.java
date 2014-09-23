package com.cloudkey.pms.common.room;

import com.keypr.bridge.ids.BridgeIds.RepairStatus;
import com.keypr.bridge.ids.BridgeIds.RoomStatus;
import lombok.Value;
import org.joda.time.DateTime;

import javax.annotation.Nullable;

/**
 * Details about a room repair
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@Value
public class RoomRepair {
    RoomStatus returnStatus;

    RepairStatus repairStatus;

    @Nullable
    DateTime start;

    @Nullable
    DateTime end;

    @Nullable
    String repairReason;

    @Nullable
    String repairType;

    @Nullable
    String repairRemarks;
}
