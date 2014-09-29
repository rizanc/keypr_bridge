package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import lombok.experimental.NonFinal;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Abstract class for requests which require a pmsReservationId
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(callSuper = false)
public class AbstractSingleReservationRequest extends PMSRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	String pmsReservationId;

	public void setPmsReservationId(String pmsReservationId) {
		if (this.pmsReservationId != null) {
			throw new IllegalStateException("pmsReservationId is already set and maybe only set once");
		}

		this.pmsReservationId = pmsReservationId;
	}
}
