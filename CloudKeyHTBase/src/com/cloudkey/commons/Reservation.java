package com.cloudkey.commons;

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
	private String id ;
	/* variable to store type of the room. */
	private String roomType ;
	/* variable to store the number of days to be stayed at hotel. */
	private String stayLength ;
	/* variable to store full name of the guest. */
	private String fullName ;
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
	private String numberOfGuests ;
	/* variable to store the details of the room. */
	private String roomDetail ;
	/* variable to store the confirmation number of the reservation. */
	private String confirmationNumber ;
	/* variable to store the check in date of the guest. */
	private String checkinDate ;
	/* variable to store check out data of the guest. */
	private String checkoutDate ;
	/* variable to store the StayRate instance. */
	private StayRate rate ;
	/* variable to store the guest special notes for the reservation. */
	private String notes ;
	/* variable to store room number. */
	private String roomNumber ;

	/*
	 * Getter and Setter for each data member.
	 */

	public String getId() {

		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	public String getRoomType() {

		return roomType;
	}

	public void setRoomType( String roomType ) {

		this.roomType = roomType;
	}

	public String getStayLength() {

		return stayLength;
	}

	public void setStayLength( String stayLength ) {

		this.stayLength = stayLength;
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

	public String getNumberOfGuests() {

		return numberOfGuests;
	}

	public void setNumberOfGuests( String numberOfGuests ) {

		this.numberOfGuests = numberOfGuests;
	}

	public String getRoomDetail() {

		return roomDetail;
	}

	public void setRoomDetail( String roomDetail ) {

		this.roomDetail = roomDetail;
	}

	public String getConfirmationNumber() {

		return confirmationNumber;
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

	public StayRate getRate() {

		return rate;
	}

	public void setRate( StayRate rate ) {

		this.rate = rate;
	}

	public String getNotes() {

		return notes;
	}

	public void setNotes( String notes ) {

		this.notes = notes;
	}

	public String getRoomNumber() {

		return roomNumber;
	}

	public void setRoomNumber( String roomNumber ) {

		this.roomNumber = roomNumber;
	}

	public String toString()  {
		
		return "Reservation [id=" + id + ", roomType=" + roomType
				+ ", stayLength=" + stayLength + ", fullName=" + fullName
				+ ", company=" + company + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", loyaltyNumber=" + loyaltyNumber + ", numberOfGuests="
				+ numberOfGuests + ", roomDetail=" + roomDetail
				+ ", confirmationNumber=" + confirmationNumber
				+ ", checkinDate=" + checkinDate + ", checkoutDate="
				+ checkoutDate + ", rate=" + rate + ", notes=" + notes
				+ ", roomNumber=" + roomNumber + "]";
	}

}
