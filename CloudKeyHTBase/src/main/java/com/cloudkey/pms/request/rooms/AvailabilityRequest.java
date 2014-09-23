package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.collect.ImmutableList;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Value;
import org.joda.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

/**
 * Class stores the room availability information. 
 * 
 * @author vinayk2
 */
@Value
public class AvailabilityRequest extends PMSRequest {

    @NotNull
    @ApiModelProperty(required = true)
    LocalDate startDate;

    @NotNull
    @ApiModelProperty(required = true)
    LocalDate endDate;

	@NotNull
	@ApiModelProperty(required = true)
	Integer numAdults;

	String rateCode;

	String roomTypeCode;

	List<Integer> childrenAges;

	public AvailabilityRequest(LocalDate startDate, LocalDate endDate, String rateCode, Integer numAdults, String roomTypeCode, List<Integer> childrenAges) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.rateCode = rateCode;
		this.numAdults = numAdults;
		this.roomTypeCode = roomTypeCode;
		this.childrenAges = childrenAges == null ? Collections.<Integer>emptyList() : ImmutableList.copyOf(childrenAges);
	}

	@AssertTrue(message = "Rate code and room type code are both specified or neither is")
	private boolean hasRateCodeAndTypeOrNeither() {
		return roomTypeCode == null ? rateCode == null : rateCode != null;
	}

}
