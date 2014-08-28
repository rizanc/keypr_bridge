package com.cloudkey.pms.common.reservation;

import com.keypr.bridge.ids.RoomClassCode;
import com.keypr.bridge.ids.RoomTypeCode;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class RoomType {
    private RoomTypeCode roomTypeCode;

    private String roomTypeName;

    private String roomTypeDescription;

    @Nullable
    private RoomClassCode roomClassCode;
}
