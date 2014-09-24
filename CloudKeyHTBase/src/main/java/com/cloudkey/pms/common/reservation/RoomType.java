package com.cloudkey.pms.common.reservation;

import lombok.Value;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class RoomType {
    String roomTypeCode;

	@Nullable
    String roomTypeName;

	@Nullable
    String roomTypeDescription;

    @Nullable
    String roomClassCode;
}
