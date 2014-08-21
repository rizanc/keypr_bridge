package com.cloudkey.pms.response.memberships;

import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;
import org.joda.time.LocalDate;

/**
 * This Class has information about member points. It has details of membership points.
 *
 * @author
 */
public class MemberPointsResponse extends PMSResponse {

    /* reference variable to store member points response*/
    private String membershipId;
    private String membershipType;
    private String membershipLevel;
    private String memberName;
    private String membershipNumber;
    private LocalDate expireDate;
    private LocalDate effectiveDate;
    private String inactive;
    private String resvnameId;
    private Double totalPoints;
    private String bonuspoints;
    private String guestTotalNights;
    private String guestTotalStay;

	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public String getMembershipLevel() {
		return membershipLevel;
	}

	public void setMembershipLevel(String membershipLevel) {
		this.membershipLevel = membershipLevel;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMembershipNumber() {
		return membershipNumber;
	}

	public void setMembershipNumber(String membershipNumber) {
		this.membershipNumber = membershipNumber;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getInactive() {
		return inactive;
	}

	public void setInactive(String inactive) {
		this.inactive = inactive;
	}

	public String getResvnameId() {
		return resvnameId;
	}

	public void setResvnameId(String resvnameId) {
		this.resvnameId = resvnameId;
	}

	public Double getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(Double totalPoints) {
		this.totalPoints = totalPoints;
	}

	public String getBonuspoints() {
		return bonuspoints;
	}

	public void setBonuspoints(String bonuspoints) {
		this.bonuspoints = bonuspoints;
	}

	public String getGuestTotalNights() {
		return guestTotalNights;
	}

	public void setGuestTotalNights(String guestTotalNights) {
		this.guestTotalNights = guestTotalNights;
	}

	public String getGuestTotalStay() {
		return guestTotalStay;
	}

	public void setGuestTotalStay(String guestTotalStay) {
		this.guestTotalStay = guestTotalStay;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("membershipId", membershipId)
			.add("membershipType", membershipType)
			.add("membershipLevel", membershipLevel)
			.add("memberName", memberName)
			.add("membershipNumber", membershipNumber)
			.add("expireDate", expireDate)
			.add("effectiveDate", effectiveDate)
			.add("inactive", inactive)
			.add("resvnameId", resvnameId)
			.add("totalPoints", totalPoints)
			.add("bonuspoints", bonuspoints)
			.add("guestTotalNights", guestTotalNights)
			.add("guestTotalStay", guestTotalStay)
			.toString();
	}
}
