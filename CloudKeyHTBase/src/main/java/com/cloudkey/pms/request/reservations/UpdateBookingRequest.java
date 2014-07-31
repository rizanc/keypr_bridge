package com.cloudkey.pms.request.reservations;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
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
    private String confirmationNumber;

    @NotEmpty
    private List<String> notes = Lists.newArrayList();

    public UpdateBookingRequest(String confirmationNumber, List<String> notes) {
        this.confirmationNumber = confirmationNumber;
        this.notes.addAll(notes);
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public List<String> getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("confirmationNumber", confirmationNumber)
                .add("notes", notes)
                .toString();
    }
}
