package com.cloudkey.pms.request.reservations;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * Class to store information for update booking details in the hotel.
 * <p/>
 * The corresponding MICROS message can be used to modify most booking details,
 * however this only supports notes thus far.
 *
 * @author vinayk2
 */
public class UpdateBookingRequest {

    @NotBlank
    @ApiModelProperty(required = true)
    private String pmsReservationId;

    @NotEmpty
    @ApiModelProperty(required = true)
    private List<String> notes = Lists.newArrayList();

	protected UpdateBookingRequest() { /* For serialization */ }

	public UpdateBookingRequest(String pmsReservationId, List<String> notes) {
        this.pmsReservationId = pmsReservationId;
        this.notes.addAll(notes);
    }

    public String getPmsReservationId() {
        return pmsReservationId;
    }

    public List<String> getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("pmsReservationId", pmsReservationId)
                .add("notes", notes)
                .toString();
    }
}
