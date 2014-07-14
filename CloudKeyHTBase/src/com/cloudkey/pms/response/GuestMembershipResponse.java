package com.cloudkey.pms.response;

/**
 * This Class has information about Guest membership . It has details of Geust membership.
 * 
 * @author 
 */

import java.util.List;
import com.cloudkey.commons.Membership;

public class GuestMembershipResponse {
	
	private String result;
	private String status;
	private List<Membership> membershipList;
	
	/*
	 * Generate getter and setter for data member.
	 */
	public String getResult() {
		
		return result;
	}
	public void setResult(String result) {
		
		this.result = result;
	}
	public String getStatus() {
		
		return status;
	}
	public void setStatus(String status) {
		
		this.status = status;
	}
	public List<Membership> getMembershipList() {
		
		return membershipList;
	}
	public void setMembershipList(List<Membership> membershipList) {
		
		this.membershipList = membershipList;
	}
	@Override
	public String toString() {
		
		return "GuestMembershipResponse [result=" + result + ", status="
				+ status + ", membershipList=" + membershipList + "]";
	}

}
