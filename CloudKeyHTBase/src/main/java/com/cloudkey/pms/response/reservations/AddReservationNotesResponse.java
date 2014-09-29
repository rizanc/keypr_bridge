package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * This class stores the response of booking update request made by the guest.
 * It has the detail of guest reservation.
 *
 * @author vinayk2
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class AddReservationNotesResponse extends PMSResponse {

    /* Reference variable to store the reservation data */
    private List<String> currentNotes;

	public List<String> getCurrentNotes() {
		return currentNotes;
	}

}
