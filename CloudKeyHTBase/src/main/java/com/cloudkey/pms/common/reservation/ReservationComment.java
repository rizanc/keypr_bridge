package com.cloudkey.pms.common.reservation;

import org.joda.time.DateTime;

import javax.annotation.Nullable;

/**
 * A comment on a {@link com.cloudkey.pms.common.reservation.Reservation}
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class ReservationComment {
    /**
     * The local identifier of the comment relative to the reservation.
     */
    private String id;

    /**
     * Whether the guest can view the comment
     */
    private Boolean isGuestViewable;

    /**
     * The date and time of the comment's creation
     */
    private DateTime creationDate;

    /**
     * The comment
     */
    private String value;

    /**
     * The system which created the comment
     *
     * Values for this field may differ by PMS system.
     */
    @Nullable
    private String originId;

    /**
     * The type of comment
     *
     * Values for this field may differ by PMS system.
     */
    @Nullable
    private String type;

    protected ReservationComment() { /* For Serialization */ }

    public ReservationComment(String id, Boolean isGuestViewable, DateTime creationDate, String value, @Nullable String originId, @Nullable String type) {
        this.id = id;
        this.isGuestViewable = isGuestViewable;
        this.creationDate = creationDate;
        this.value = value;
        this.originId = originId;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public Boolean getIsGuestViewable() {
        return isGuestViewable;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }

    public String getValue() {
        return value;
    }

    @Nullable
    public String getOriginId() {
        return originId;
    }

    @Nullable
    public String getType() {
        return type;
    }
}
