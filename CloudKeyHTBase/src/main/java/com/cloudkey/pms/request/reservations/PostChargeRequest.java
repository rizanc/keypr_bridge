package com.cloudkey.pms.request.reservations;

import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Request bean for posting a new charge to a guest account.
 *
 * @author crizan2
 */
public class PostChargeRequest {
	@NotNull
	@ApiModelProperty(required = true)
	private String pmsReservationId;

	@NotNull
	@ApiModelProperty(required = true)
	private BigDecimal chargeAmount;

	private Date postDate;

	private String shortInfo;

	private String longInfo;

	private String stationId;

	private String userId;

	private int folioViewNo;

	private String account;

	private String article;

	protected PostChargeRequest() { /* For serialization */ }

	public PostChargeRequest(String pmsReservationId, BigDecimal chargeAmount, Date postDate, String shortInfo, String longInfo, String stationId, String userId, int folioViewNo, String account, String article) {
		this.pmsReservationId = pmsReservationId;
		this.chargeAmount = chargeAmount;
		this.postDate = postDate;
		this.shortInfo = shortInfo;
		this.longInfo = longInfo;
		this.stationId = stationId;
		this.userId = userId;
		this.folioViewNo = folioViewNo;
		this.account = account;
		this.article = article;
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

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
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

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getFolioViewNo() {
		return folioViewNo;
	}

	public void setFolioViewNo(int folioViewNo) {
		this.folioViewNo = folioViewNo;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("article", article)
			.add("pmsReservationId", pmsReservationId)
			.add("chargeAmount", chargeAmount)
			.add("postDate", postDate)
			.add("shortInfo", shortInfo)
			.add("longInfo", longInfo)
			.add("stationId", stationId)
			.add("userId", userId)
			.add("folioViewNo", folioViewNo)
			.add("account", account)
			.toString();
	}
}