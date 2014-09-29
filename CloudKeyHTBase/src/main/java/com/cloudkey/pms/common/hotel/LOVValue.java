package com.cloudkey.pms.common.hotel;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * Created by crizan2 on 04/09/2014.
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class LOVValue {
    String description;

    String value;
}
