package com.cloudkey.pms.request.hotels;

import com.cloudkey.pms.request.PMSRequest;
import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * This class is used to send the request parameters for HotelInformation.
 *
 * @author chetu
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
//@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class HotelInformationRequest extends PMSRequest {

}
