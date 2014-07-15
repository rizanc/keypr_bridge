package com.cloudkey.pms.request;

/*
 * This class  hold information of Name id request made by guest. 
 */
public class NameIdByMembershipRequest {

	private String membershipType;
	private String membershipNumber;
	private String lastname;
	
	/*
	 * generate getter and setter for data member.
	 */
	public String getMembershipType() {
		
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		
		this.membershipType = membershipType;
	}
	public String getMembershipNumber() {
		
		return membershipNumber;
	}
	public void setMembershipNumber(String membershipNumber) {
		
		this.membershipNumber = membershipNumber;
	}
	public String getLastname() {
		
		return lastname;
	}
	public void setLastname(String lastname) {
		
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		
		return "NameIdByMembershipRequest [membershipType=" + membershipType
				+ ", membershipNumber=" + membershipNumber + ", lastname="
				+ lastname + "]";
	}
	
}
