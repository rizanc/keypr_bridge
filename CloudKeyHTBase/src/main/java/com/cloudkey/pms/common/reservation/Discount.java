package com.cloudkey.pms.common.reservation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;
import lombok.experimental.FieldDefaults;

import lombok.experimental.NonFinal;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
abstract public class Discount {
    String discountReason;
}
