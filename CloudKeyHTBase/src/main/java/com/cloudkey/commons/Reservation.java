package com.cloudkey.commons;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Class stores details of reservation.It has information of check in date,
 * check out date, room type and all guest and room information related with
 * reservation.
 * 
 * @author vinayk2
 * 
 */
public class Reservation {

	/* variable to store unique identifier of the guest. */
	private int id ;// PK of database.

	/* variable to store pms id. */
	private String pmsId; // pms_id
	/* variable to store the number of days to be stayed at hotel. */
	/*	private String stayLength ;*/
	private int stayLength ;
	/* variable to store full name of the guest. */
	private String fullName ;// first+last
	/* variable to store the company name of the guest. */
	private String company ;
	/* variable to store the address information of the guest. */
	private String address ;
	/* variable to store the phone number of the guest. */
	private String phoneNumber ;
	/* variable to store email address of the guest. */
	private String email ;
	/* variable to store loyalty number of the guest. */
	private String loyaltyNumber ;
	/* variable to store the number of guests. */
	private int numberOfGuests ;
	/* variable to store the details of the reservation. */
	private List<ReservationRoomAllocation> reservationRoomAllocationList;
	private List<RoomDetails> roomDetailList ;

	/* variable to store the confirmation number of the reservation. */
	private String confirmationNumber ;
	/* variable to store the check in date of the guest. */
	private String checkinDate ;
	/* variable to store check out data of the guest. */
	private String checkoutDate ;
	/* variable to store first name*/
	private String firstName ;
	/*Variable to store last name.*/
	private String lastName ;
	/* variable to store the guest special notes for the reservation. */
	private String notes ;
	private String loyaltyProgram;
	private String propertyId;
	private String creditCardNumber;
	private String reservationSource;
	private byte [] propertyImage;
	private String affilateId;
	private String message;
	private String reservationAction ; // to store reservation action as checkin , add , share
	private Date dateModified;
	private Date dateCreated;
	private List<ReservationOrders> reservationOrderList;

	private String reservationStatus;
	private String arrivalTime;
	private String departureTime;
	private String group;

	/*
	 * Getter and Setter for each data member.
	 */


	public String getReservationAction() {
		return reservationAction;
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

	public void setReservationAction(String reservationAction) {
		this.reservationAction = reservationAction;
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
	public List<ReservationOrders> getReservationOrderList() {
		return reservationOrderList;
	}

	public void setReservationOrderList(List<ReservationOrders> reservationOrderList) {
		this.reservationOrderList = reservationOrderList;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getFullName() {

		return fullName;
	}

	public void setFullName( String fullName ) {

		this.fullName = fullName;
	}

	public String getCompany() {

		return company;
	}

	public void setCompany( String company ) {

		this.company = company;
	}

	public String getAddress() {

		return address;
	}

	public void setAddress( String address ) {

		this.address = address;
	}

	public String getPhoneNumber() {

		return phoneNumber;
	}

	public void setPhoneNumber( String phoneNumber ) {

		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail( String email ) {

		this.email = email;
	}

	public String getLoyaltyNumber() {

		return loyaltyNumber;
	}

	public void setLoyaltyNumber( String loyaltyNumber ) {

		this.loyaltyNumber = loyaltyNumber;
	}

	public String getConfirmationNumber() {

		return confirmationNumber;
	}

	public int getStayLength() {
		return stayLength;
	}

	public void setStayLength(int stayLength) {
		this.stayLength = stayLength;
	}

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
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

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setConfirmationNumber( String confirmationNumber ) {

		this.confirmationNumber = confirmationNumber;
	}

	public String getCheckinDate() {

		return checkinDate;
	}

	public void setCheckinDate( String checkinDate ) {

		this.checkinDate = checkinDate;
	}

	public String getCheckoutDate() {

		return checkoutDate;
	}

	public void setCheckoutDate( String checkoutDate ) {

		this.checkoutDate = checkoutDate;
	}

	public String getNotes() {

		return notes;
	}

	public void setNotes( String notes ) {

		this.notes = notes;
	}

	public String getPmsId() {
		return pmsId;
	}

	public void setPmsId(String pmsId) {
		this.pmsId = pmsId;
	}

	public List<ReservationRoomAllocation> getReservationRoomAllocationList() {
		return reservationRoomAllocationList;
	}

	public void setReservationRoomAllocationList(
			List<ReservationRoomAllocation> reservationRoomAllocationList) {
		this.reservationRoomAllocationList = reservationRoomAllocationList;
	}
	public List<RoomDetails> getRoomDetailList() {

		return roomDetailList;
	}

	public void setRoomDetailList(List<RoomDetails> roomDetailList) {
		this.roomDetailList = roomDetailList;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", pmsId=" + pmsId + ", stayLength="
				+ stayLength + ", fullName=" + fullName + ", company="
				+ company + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", loyaltyNumber="
				+ loyaltyNumber + ", numberOfGuests=" + numberOfGuests
				+ ", reservationRoomAllocationList="
				+ reservationRoomAllocationList + ", roomDetailList="
				+ roomDetailList + ", confirmationNumber=" + confirmationNumber
				+ ", checkinDate=" + checkinDate + ", checkoutDate="
				+ checkoutDate + ", firstName=" + firstName + ", lastName="
				+ lastName + ", notes=" + notes + ", loyaltyProgram="
				+ loyaltyProgram + ", propertyId=" + propertyId
				+ ", creditCardNumber=" + creditCardNumber
				+ ", reservationSource=" + reservationSource
				+ ", propertyImage=" + Arrays.toString(propertyImage)
				+ ", affilateId=" + affilateId + ", message=" + message
				+ ", reservationAction=" + reservationAction
				+ ", dateModified=" + dateModified + ", dateCreated="
				+ dateCreated + ", reservationOrderList="
				+ reservationOrderList + ", reservationStatus="
				+ reservationStatus + ", arrivalTime=" + arrivalTime
				+ ", departureTime=" + departureTime + ", group=" + group + "]";
	}

}