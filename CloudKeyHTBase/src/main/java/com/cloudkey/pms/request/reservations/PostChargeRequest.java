package com.cloudkey.pms.request.reservations;

import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Request bean for posting a new charge to a guest account.
 *
 * @author crizan2
 */
public class PostChargeRequest extends AbstractSingleReservationRequest {
	@NotNull
	@ApiModelProperty(required = true)
	private BigDecimal chargeAmount;

	@NotEmpty
	@ApiModelProperty(required = true)
	private String itemCode;

	@NotEmpty
	@ApiModelProperty(required = true)
	private String accountCode;

	private DateTime postDateTime;

	private String shortInfo;

	private String longInfo;

	private Integer folioViewNo;

	protected PostChargeRequest() { /* For serialization */ }

	public PostChargeRequest(String pmsReservationId, BigDecimal chargeAmount, String itemCode, String accountCode, DateTime postDateTime, String shortInfo, String longInfo, Integer folioViewNo) {
		super(pmsReservationId);
		this.chargeAmount = chargeAmount;
		this.itemCode = itemCode;
		this.accountCode = accountCode;
		this.postDateTime = postDateTime;
		this.shortInfo = shortInfo;
		this.longInfo = longInfo;
		this.folioViewNo = folioViewNo;
	}

	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	public DateTime getPostDateTime() {
		return postDateTime;
	}

	public String getShortInfo() {
		return shortInfo;
	}

	public String getLongInfo() {
		return longInfo;
	}

	public Integer getFolioViewNo() {
		return folioViewNo;
	}

	public String getItemCode() {
		return itemCode;
	}

	public String getAccountCode() {
		return accountCode;
	}

	@Override
	public String toString() {
		return "PostChargeRequest{" +
			"chargeAmount=" + chargeAmount +
			", itemCode='" + itemCode + '\'' +
			", accountCode='" + accountCode + '\'' +
			", postDateTime=" + postDateTime +
			", shortInfo='" + shortInfo + '\'' +
			", longInfo='" + longInfo + '\'' +
			", folioViewNo=" + folioViewNo +
			'}';
	}
}
