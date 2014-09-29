package com.cloudkey.pms.response.hotels;

import com.cloudkey.pms.common.hotel.LOVItem;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * Created by crizan2 on 04/09/2014.
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class LOVResponse extends PMSResponse {

    List<LOVItem> lovItems;

}
