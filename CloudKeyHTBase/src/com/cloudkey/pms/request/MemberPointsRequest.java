package com.cloudkey.pms.request;

/**
 * This class is used to send the request parameters for MemberPoints.
 * 
 * @author 
 */
public class MemberPointsRequest {
	
	/* variable to store membership id */
	private String membershipId;
    private String membershipType;

	/* getter and setter for data member */
	public String getMembershipId() {
		
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		
		this.membershipId = membershipId;
	}

	@Override
	public String toString() {
		
		return "MemberPointsRequest [membershipId=" + membershipId + "]";
	}

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
