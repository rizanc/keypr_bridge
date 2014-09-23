package com.cloudkey.pms.response.memberships;

/**
 * This Class has information about Guest membership . It has details of Geust membership.
 *
 * @author
 */

import com.cloudkey.commons.Membership;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Value
public class GuestMembershipsResponse extends PMSResponse {
    List<Membership> membershipList;
}
