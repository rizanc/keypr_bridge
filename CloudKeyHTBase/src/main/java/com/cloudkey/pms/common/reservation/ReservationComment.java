package com.cloudkey.pms.common.reservation;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.joda.time.DateTime;

import javax.annotation.Nullable;

/**
 * A comment on a {@link com.cloudkey.pms.common.reservation.Reservation}
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class ReservationComment {

    /**
     * The local identifier of the comment relative to the reservation.
     */
    String id;

    /**
     * Whether the guest can view the comment
     */
    Boolean isGuestViewable;

    /**
     * The date and time of the comment's creation
     */
    DateTime creationDate;

    /**
     * The comment
     */
    String value;

    /**
     * The system which created the comment
     *
     * Values for this field may differ by PMS system.
     */
    @Nullable
    String originId;

    /**
     * The type of comment
     *
     * Values for this field may differ by PMS system.
     */
    @Nullable
    String type;

}
