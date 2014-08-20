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

	private int folioViewNo;

	private String account;

	// TODO: This may need to be removed. If set, this must be an identifier which OPERA already knows.
	//       It's not clear what this field is for or how we would find out which article identifiers are available.
	private String article;

	protected PostChargeRequest() { /* For serialization */ }

	public PostChargeRequest(String pmsReservationId, BigDecimal chargeAmount, DateTime postDateTime, String shortInfo, String longInfo, String stationId, String userId, int folioViewNo, String account, String article) {
		this.pmsReservationId = pmsReservationId;
		this.chargeAmount = chargeAmount;
		this.postDateTime = postDateTime;
		this.shortInfo = shortInfo;
		this.longInfo = longInfo;
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
			.add("postDateTime", postDateTime)
			.add("shortInfo", shortInfo)
			.add("longInfo", longInfo)
			.add("userId", userId)
			.add("folioViewNo", folioViewNo)
			.add("account", account)
			.toString();
	}
}
