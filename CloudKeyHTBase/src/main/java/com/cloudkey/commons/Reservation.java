package com.cloudkey.commons;

import com.cloudkey.pms.common.contact.StreetAddress;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import org.joda.time.LocalDate;

import java.util.List;

/**
 * Class stores details of reservation.It has information of check in date,
 * check out date, room type and all guest and room information related with
 * reservation.
 *
 * @author vinayk2
 */
public class Reservation {

	/* variable to store unique identifier of the guest. */
	// TODO: This ID should not be here, unless it's for our local MYSQL instance
	private Integer id;// PK of database.

    private String chainCode;
    private String hotelCode;

	/* variable to store pms id. */
	private String pmsReservationId;

	/* variable to store the number of days to be stayed at hotel. */
	/*	private String stayLength ;*/
	private Integer stayLength;

	/* variable to store the company name of the guest. */
	private String company;

	/* variable to store the address information of the guest. */
	private StreetAddress address;

	/* variable to store the phone number of the guest. */
	private String phoneNumber;

	/* variable to store email address of the guest. */
	private String email;

	/* variable to store loyalty number of the guest. */
	private String loyaltyNumber;

	/* variable to store the number of guests. */
	private Integer numberOfGuests;
    private Integer numberOfAdults;
    private Integer numberOfChildren;
	
	/* variable to store the details of the reservation. */
	private List<ReservationRoomAllocation> reservationRoomAllocationList;

	private List<RoomDetails> roomDetailList;

	/* variable to store the confirmation number of the reservation. */
	// TODO: Remove this. It is an arbitrary ID. pmsReservationId should be sufficient.
	private String confirmationNumber;

	/* variable to store the check in date of the guest. */
	private LocalDate checkinDate;

	/* variable to store check out data of the guest. */
	private LocalDate checkoutDate;

	/* variable to store first name*/
	private String firstName;

	/*Variable to store last name.*/
	private String lastName;

	/* variable to store the guest special notes for the reservation. */
	private String notes;

	private String loyaltyProgram;

	private String propertyId;

	private String creditCardNumber;

	private String reservationSource;

	private byte[] propertyImage;

	private String affilateId;

	private String message;

	private List<ReservationOrder> reservationOrderList;

	private String reservationStatus;

	private String arrivalTime;

	private String departureTime;

	private String group;

	public String getFullName() {
		return Joiner.on(" ").skipNulls().join(firstName, lastName);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChainCode() {
		return chainCode;
	}

	public void setChainCode(String chainCode) {
		this.chainCode = chainCode;
	}

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public void setPmsReservationId(String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
	}

	public Integer getStayLength() {
		return stayLength;
	}

	public void setStayLength(Integer stayLength) {
		this.stayLength = stayLength;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public StreetAddress getAddress() {
		return address;
	}

	public void setAddress(StreetAddress address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoyaltyNumber() {
		return loyaltyNumber;
	}

	public void setLoyaltyNumber(String loyaltyNumber) {
		this.loyaltyNumber = loyaltyNumber;
	}

	public Integer getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(Integer numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public Integer getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(Integer numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public Integer getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(Integer numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public List<ReservationRoomAllocation> getReservationRoomAllocationList() {
		return reservationRoomAllocationList;
	}

	public void setReservationRoomAllocationList(List<ReservationRoomAllocation> reservationRoomAllocationList) {
		this.reservationRoomAllocationList = reservationRoomAllocationList;
	}

	public List<RoomDetails> getRoomDetailList() {
		return roomDetailList;
	}

	public void setRoomDetailList(List<RoomDetails> roomDetailList) {
		this.roomDetailList = roomDetailList;
	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public LocalDate getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(LocalDate checkinDate) {
		this.checkinDate = checkinDate;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getLoyaltyProgram() {
		return loyaltyProgram;
	}

	public void setLoyaltyProgram(String loyaltyProgram) {
		this.loyaltyProgram = loyaltyProgram;
	}

	public String getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getReservationSource() {
		return reservationSource;
	}

	public void setReservationSource(String reservationSource) {
		this.reservationSource = reservationSource;
	}

	public byte[] getPropertyImage() {
		return propertyImage;
	}

	public void setPropertyImage(byte[] propertyImage) {
		this.propertyImage = propertyImage;
	}

	public String getAffilateId() {
		return affilateId;
	}

	public void setAffilateId(String affilateId) {
		this.affilateId = affilateId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ReservationOrder> getReservationOrderList() {
		return reservationOrderList;
	}

	public void setReservationOrderList(List<ReservationOrder> reservationOrderList) {
		this.reservationOrderList = reservationOrderList;
	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("id", id)
			.add("chainCode", chainCode)
			.add("hotelCode", hotelCode)
			.add("pmsReservationId", pmsReservationId)
			.add("stayLength", stayLength)
			.add("company", company)
			.add("address", address)
			.add("phoneNumber", phoneNumber)
			.add("email", email)
			.add("loyaltyNumber", loyaltyNumber)
			.add("numberOfGuests", numberOfGuests)
			.add("numberOfAdults", numberOfAdults)
			.add("numberOfChildren", numberOfChildren)
			.add("reservationRoomAllocationList", reservationRoomAllocationList)
			.add("roomDetailList", roomDetailList)
			.add("confirmationNumber", confirmationNumber)
			.add("checkinDate", checkinDate)
			.add("checkoutDate", checkoutDate)
			.add("firstName", firstName)
			.add("lastName", lastName)
			.add("notes", notes)
			.add("loyaltyProgram", loyaltyProgram)
			.add("propertyId", propertyId)
			.add("creditCardNumber", creditCardNumber)
			.add("reservationSource", reservationSource)
			.add("propertyImage", propertyImage)
			.add("affilateId", affilateId)
			.add("message", message)
			.add("reservationOrderList", reservationOrderList)
			.add("reservationStatus", reservationStatus)
			.add("arrivalTime", arrivalTime)
			.add("departureTime", departureTime)
			.add("group", group)
			.toString();
	}
}