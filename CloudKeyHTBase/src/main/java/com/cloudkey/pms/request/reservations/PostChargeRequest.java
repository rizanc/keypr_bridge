package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Request bean for posting a new charge to a guest account.
 *
 * @author crizan2
 */
public class PostChargeRequest extends PMSRequest {
	@NotNull
	@ApiModelProperty(required = true)
	private String pmsReservationId;

	@NotNull
	@ApiModelProperty(required = true)
	private BigDecimal chargeAmount;

	private DateTime postDateTime;

	private String shortInfo;

	private String longInfo;

	private String userId;

	private Integer folioViewNo;

	protected PostChargeRequest() { /* For serialization */ }

	public PostChargeRequest(String pmsReservationId, BigDecimal chargeAmount, DateTime postDateTime, String shortInfo, String longInfo, String stationId, String userId, Integer folioViewNo, String account, String article) {
		this.pmsReservationId = pmsReservationId;
		this.chargeAmount = chargeAmount;
		this.postDateTime = postDateTime;
		this.shortInfo = shortInfo;
		this.longInfo = longInfo;
		this.userId = userId;
		this.folioViewNo = folioViewNo;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public void setPmsReservationId(String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
	}

	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public DateTime getPostDateTime() {
		return postDateTime;
	}

	public void setPostDateTime(DateTime postDateTime) {
		this.postDateTime = postDateTime;
	}

	public String getShortInfo() {
		return shortInfo;
	}

	public void setShortInfo(String shortInfo) {
		this.shortInfo = shortInfo;
	}

	public String getLongInfo() {
		return longInfo;
	}

	public void setLongInfo(String longInfo) {
		this.longInfo = longInfo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getFolioViewNo() {
		return folioViewNo;
	}

	public void setFolioViewNo(Integer folioViewNo) {
		this.folioViewNo = folioViewNo;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("pmsReservationId", pmsReservationId)
			.add("chargeAmount", chargeAmount)
			.add("postDateTime", postDateTime)
			.add("shortInfo", shortInfo)
			.add("longInfo", longInfo)
			.add("userId", userId)
			.add("folioViewNo", folioViewNo)
			.toString();
	}
}
