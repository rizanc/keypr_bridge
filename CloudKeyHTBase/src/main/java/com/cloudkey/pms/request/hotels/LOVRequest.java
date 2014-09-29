package com.cloudkey.pms.request.hotels;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by crizan2 on 04/09/2014.
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class LOVRequest extends PMSRequest {
    // Can be TRXCODES or ARTICLES
    @NotBlank
    @ApiModelProperty(required = true)
    String identifier;
}
