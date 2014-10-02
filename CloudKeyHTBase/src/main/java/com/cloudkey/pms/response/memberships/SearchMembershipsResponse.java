package com.cloudkey.pms.response.memberships;

import com.cloudkey.pms.common.profile.CustomerProfile;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

/*
 * This class hold information of name id.
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class SearchMembershipsResponse extends PMSResponse {
	List<CustomerProfile> memberships;
}
