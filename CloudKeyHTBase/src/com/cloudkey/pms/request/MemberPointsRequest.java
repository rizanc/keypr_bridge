package com.cloudkey.pms.request;

/**
 * This class is used to send the request parameters for MemberPoints.
 * 
 * @author 
 */
public class MemberPointsRequest {
	
	/* variable to store membership id */
	private String membershipNumber;
    private String membershipType;
    private String memberLastName;

	/* getter and setter for data member */
	public String getMembershipNumber() {
		
		return membershipNumber;
	}

	public void setMembershipNumber(String membershipNumber) {
		
		this.membershipNumber = membershipNumber;
	}

	@Override
	public String toString() {
		
		return "MemberPointsRequest [membershipNumber=" + membershipNumber + "]";
	}

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }
}
