package com.cloudkey.pms.common.reservation;

import lombok.*;
import lombok.experimental.FieldDefaults;

import lombok.experimental.NonFinal;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class RoomType {
    String roomTypeCode;

	@Nullable
    String roomTypeName;

	@Nullable
    String roomTypeDescription;

    @Nullable
    String roomClassCode;
}
