package com.cloudkey.pms.common.room;

import com.keypr.bridge.ids.BridgeIds.RepairStatus;
import com.keypr.bridge.ids.BridgeIds.RoomStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.joda.time.DateTime;

import javax.annotation.Nullable;

/**
 * Details about a room repair
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
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
