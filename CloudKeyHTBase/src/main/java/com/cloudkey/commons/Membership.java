package com.cloudkey.commons;

import com.google.common.base.Objects;
import org.joda.time.LocalDate;

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
    private LocalDate effectiveDate;
    private LocalDate expirationDate;

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

	public Double getCurrentPoints() {
		return currentPoints;
	}

	public void setCurrentPoints(Double currentPoints) {
		this.currentPoints = currentPoints;
	}

	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("membershipType", membershipType)
			.add("membershipNumber", membershipNumber)
			.add("membershipLevel", membershipLevel)
			.add("operaId", operaId)
			.add("externalId", externalId)
			.add("pointsLabel", pointsLabel)
			.add("membershipId", membershipId)
			.add("memberName", memberName)
			.add("currentPoints", currentPoints)
			.add("effectiveDate", effectiveDate)
			.add("expirationDate", expirationDate)
			.toString();
	}
}
