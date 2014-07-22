package com.cloudkey.pms.response;

/**
 * This Class has information about Guest membership . It has details of Geust membership.
 * 
 * @author 
 */

import java.util.List;

import com.cloudkey.commons.Membership;
import com.cloudkey.commons.Response;

public class GuestMembershipResponse extends Response {
	
	private List<Membership> membershipList;
	
	/*
	 * Generate getter and setter for data member.
	 */
	
	public List<Membership> getMembershipList() {
		
		return membershipList;
	}
	
	public void setMembershipList(List<Membership> membershipList) {
		
		this.membershipList = membershipList;
	}
	
	@Override
	public String toString() {
		return "GuestMembershipResponse [membershipList=" + membershipList
				+ ", status=" + status + ", errorMessage=" + errorMessage + "]";
	}

}
