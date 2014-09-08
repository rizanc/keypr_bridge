package com.cloudkey.pms.request.reservations;

import com.google.common.collect.ImmutableList;
import com.wordnik.swagger.annotations.ApiModelProperty;
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
public class AddReservationNotesRequest extends AbstractSingleReservationRequest {

    @NotEmpty
    @ApiModelProperty(required = true)
    private List<String> notes;

	protected AddReservationNotesRequest() { /* For serialization */ }

	public AddReservationNotesRequest(String pmsReservationId, List<String> notes) {
		super(pmsReservationId);
        this.notes = ImmutableList.copyOf(notes);
    }

    public List<String> getNotes() {
        return notes;
    }

	@Override
	public String toString() {
		return "AddReservationNotesRequest{" +
			"notes=" + notes +
			'}';
	}
}
