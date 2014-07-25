package com.cloudkey.commons;

import java.util.Date;

/**
 * Class stores the information of membership.
 * 
 * @author 
 *
 */


public class Membership {
	
	private String membershipType;
	private String membershipNumber;
	private String membershipLevel;
	private String operaId;
	private String externalId;
	private String pointsLabel;
	private String membershipId;
	private String memberName;
    private Double currentPoints;
    private Date effectiveDate;
    private Date expirationDate;


	
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
	public String getMembershipLevel() {
		
		return membershipLevel;
	}
	public void setMembershipLevel(String membershipLevel) {
		
		this.membershipLevel = membershipLevel;
	}
	public String getOperaId() {
		
		return operaId;
	}
	public void setOperaId(String operaId) {
		
		this.operaId = operaId;
	}
	public String getExternalId() {
		
		return externalId;
	}
	public void setExternalId(String externalId) {
		
		this.externalId = externalId;
	}
	public String getPointsLabel() {
		
		return pointsLabel;
	}
	public void setPointsLabel(String pointsLabel) {
		
		this.pointsLabel = pointsLabel;
	}
	public String getMembershipId() {
		
		return membershipId;
	}
	public void setMembershipId(String membershipId) {
		
		this.membershipId = membershipId;
	}
	public String getMemberName() {
		
		return memberName;
	}
	public void setMemberName(String memberName) {
		
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		
		return "Membership [membershipType=" + membershipType
				+ ", membershipNumber=" + membershipNumber
				+ ", membershipLevel=" + membershipLevel + ", operaId="
				+ operaId + ", externalId=" + externalId + ", pointsLabel="
				+ pointsLabel + ", membershipId=" + membershipId
				+ ", memberName=" + memberName + "]";
	}

    public Double getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(Double currentPoints) {
        this.currentPoints = currentPoints;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
