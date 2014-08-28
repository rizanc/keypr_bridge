package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.keypr.bridge.ids.MemberId;
import com.keypr.bridge.ids.ReservationGuestId;
import org.joda.time.LocalDate;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class RoomStay {

    /**
     * The day of the first night of the stay
     */
    private LocalDate startDate;

    /**
     * The day of the last morning of the stay
     */
    private LocalDate endDate;

    /**
     * The reservation's guests
     */
    private List<ReservationGuestId> guests;

    /**
     * The special room rate plans, if any
     */
    @Nullable
    private List<RatePlan> roomRatePlan;

    private List<RoomStayRoomRate> roomRates;

    /**
     * The room details
     */
    private Room room;

    /**
     * The name of the room rate.
     *
     * Normal rates may not have a name. Custom rates may be named like "Microsoft".
     */
    @Nullable
    private String rateName;

    private MonetaryAmount dailyRoomFee;

    /**
     * The total cost for the rooms
     */
    private MonetaryAmount totalCost;

    /**
     * The total number of adults with the reservation
     */
    private Integer adultCount;

    /**
     * The total number of children with the reservation
     */
    private Integer childrenCount;

    private String creditCardNumber;

    private String creditCardType;

    private String creditCardHolderName;

    private String creditCardExpirationDate;

    private MemberId membershipId;

}
