package com.cloudkey.pms.request.hotels;

import com.cloudkey.pms.request.PMSRequest;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * @author clamothe
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
//@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(callSuper = false)
public class HotelItemCodesRequest extends PMSRequest {
}
