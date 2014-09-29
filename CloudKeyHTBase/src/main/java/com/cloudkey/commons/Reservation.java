package com.cloudkey.commons;

import com.cloudkey.pms.common.profile.StreetAddress;
import com.google.common.base.Joiner;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Builder;
import lombok.experimental.FieldDefaults;
import org.joda.time.LocalDate;

import java.util.List;

/**
 * Class stores details of reservation.It has information of check in date,
 * check out date, room type and all guest and room information related with
 * reservation.
 *
 * @author vinayk2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@Builder
public class Reservation {

	/* variable to store unique identifier of the guest. */
	// TODO: This ID should not be here, unless it's for our local MYSQL instance
	Integer id;// PK of database.

    String chainCode;
    String hotelCode;

	/* variable to store pms id. */
	String pmsReservationId;

	/* variable to store the number of days to be stayed at hotel. */
	/*	String stayLength ;*/
	Integer stayLength;

	/* variable to store the company name of the guest. */
	String company;

	/* variable to store the address information of the guest. */
	StreetAddress address;

	/* variable to store the phone number of the guest. */
	String phoneNumber;

	/* variable to store email address of the guest. */
	String email;

	/* variable to store loyalty number of the guest. */
	String loyaltyNumber;

	/* variable to store the number of guests. */
	Integer numberOfGuests;
    Integer numberOfAdults;
    Integer numberOfChildren;
	
	/* variable to store the details of the reservation. */
	List<ReservationRoomAllocation> reservationRoomAllocationList;

	List<RoomDetails> roomDetailList;

	/* variable to store the confirmation number of the reservation. */
	// TODO: Remove this. It is an arbitrary ID. pmsReservationId should be sufficient.
	String confirmationNumber;

	/* variable to store the check in date of the guest. */
	LocalDate checkinDate;

	/* variable to store check out data of the guest. */
	LocalDate checkoutDate;

	/* variable to store first name*/
	String firstName;

	/*Variable to store last name.*/
	String lastName;

	/* variable to store the guest special notes for the reservation. */
	String notes;

	String loyaltyProgram;

	String propertyId;

	String creditCardNumber;

	String reservationSource;

	byte[] propertyImage;

	String affilateId;

	String message;

	List<ReservationOrder> reservationOrderList;

	String reservationStatus;

	String arrivalTime;

	String departureTime;

	String group;

	public String getFullName() {
		return Joiner.on(" ").skipNulls().join(firstName, lastName);
	}
}