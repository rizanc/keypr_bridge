package com.cloudkey.pms.common.reservation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Value;
import lombok.experimental.NonFinal;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
@Value @NonFinal
abstract public class Discount {
    String discountReason;
}
