package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * This class stores the released rooms result status .
 *
 * @author niveditat
 *
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
//@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class ReleaseRoomResponse extends PMSResponse {
}

