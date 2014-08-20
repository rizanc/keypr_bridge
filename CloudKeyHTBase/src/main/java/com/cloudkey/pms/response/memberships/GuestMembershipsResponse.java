package com.cloudkey.pms.response.memberships;

/**
 * This Class has information about Guest membership . It has details of Geust membership.
 *
 * @author
 */

import com.cloudkey.commons.Membership;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class GuestMembershipsResponse extends PMSResponse {

    private List<Membership> membershipList;

	public GuestMembershipsResponse(List<Membership> membershipList) {
		this.membershipList = ImmutableList.copyOf(membershipList);
	}

	public List<Membership> getMembershipList() {
		return membershipList;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("membershipList", membershipList)
			.toString();
	}
}
