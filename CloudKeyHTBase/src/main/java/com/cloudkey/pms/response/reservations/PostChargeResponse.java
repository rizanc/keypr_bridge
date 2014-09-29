package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * Created by crizan2 on 31/07/2014.
 */
@EqualsAndHashCode(callSuper = false)
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class PostChargeResponse extends PMSResponse {

}
