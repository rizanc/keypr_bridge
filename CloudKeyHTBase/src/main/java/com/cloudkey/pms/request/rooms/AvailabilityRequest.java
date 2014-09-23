package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Class stores the room availability information. 
 * 
 * @author vinayk2
 */
@Value
public class AvailabilityRequest extends PMSRequest {

    @NotNull
    @ApiModelProperty(required = true)
    private LocalDate startDate;

    @NotNull
    @ApiModelProperty(required = true)
    private LocalDate endDate;

	@NotNull
	@ApiModelProperty(required = true)
	private Integer numAdults;

	private String rateCode;

	private String roomTypeCode;

	private List<Integer> childrenAges;

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
