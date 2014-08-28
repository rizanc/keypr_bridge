package com.keypr.bridge.ids;

/**
 * Identifies a guest within a reservation.
 *
 * This identifier is only unique within a reservation.
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class ReservationGuestId extends TypedStringIdentifier {
    protected ReservationGuestId(String identifier) {
        super(identifier);
    }
}
