package com.cloudkey.pms.response.memberships;

import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

/*
 * This class hold information of name id.
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class NameLookupResponse extends PMSResponse {
    String nameId;
}
