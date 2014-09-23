package com.cloudkey.pms.request.hotels;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Value;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by crizan2 on 04/09/2014.
 */
@Value
public class LOVRequest extends PMSRequest {
    // Can be TRXCODES or ARTICLES
    @NotBlank
    @ApiModelProperty(required = true)
    private String identifier;

}
