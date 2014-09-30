package com.cloudkey.pms.response.memberships;

/**
 * This Class has information about Guest membership . It has details of Geust membership.
 *
 * @author
 */

import com.cloudkey.pms.common.Membership;
import com.cloudkey.pms.response.PMSResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class GuestMembershipsResponse extends PMSResponse {
    List<Membership> membershipList;
}
