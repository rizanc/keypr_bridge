package com.cloudkey.pms.request.reservations;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Request bean for posting a new charge to a guest account.
 *
 * @author crizan2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
@EqualsAndHashCode(callSuper = true)
public class PostChargeRequest extends AbstractSingleReservationRequest {
	@NotNull
	@ApiModelProperty(required = true)
	private BigDecimal chargeAmount;

	@NotEmpty
	@ApiModelProperty(required = true)
	String itemCode;

	@NotEmpty
	@ApiModelProperty(required = true)
	String accountCode;

	DateTime postDateTime;

	String shortInfo;

	String longInfo;

	Integer folioViewNo;

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

}
