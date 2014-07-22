package com.cloudkey.pms.response;

import java.util.List;

import com.cloudkey.commons.Response;
import com.cloudkey.commons.Restaurants;
import com.cloudkey.commons.RoomType;

/**
 * This Class has information of Hotel. 
 * @author 
 */
public class HotelInformationResponse extends Response {
	
	/* Reference variable to store the hotel information */
	
	private String hotelName;
	//private List<Address> addressList ;
	private String address;
	private String city;
	private String country;
	private String postalCode;
	private String contactEmails;
	private String contactPhones;
	private String fax;
	private String checkInTime;
	private String checkOutTime;
	private String notes;
	private List<RoomType> roomTypeList;
	private List<Restaurants> restaurantsList;
	
	
	/*generate getter setter for hotel information response. */
	public String getHotelName() {
		
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		
		this.hotelName = hotelName;
	}
	public String getAddress() {
		
		return address;
	}
	public void setAddress(String address) {
		
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		
		this.city = city;
	}
	public String getCountry() {
		
		return country;
	}
	public void setCountry(String country) {
		
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		
		this.postalCode = postalCode;
	}
	public String getContactEmails() {
		
		return contactEmails;
	}
	public void setContactEmails(String contactEmails) {
		
		this.contactEmails = contactEmails;
	}
	public String getContactPhones() {
		
		return contactPhones;
	}
	public void setContactPhones(String contactPhones) {
		
		this.contactPhones = contactPhones;
	}
	public String getFax() {
		
		return fax;
	}
	public void setFax(String fax) {
		
		this.fax = fax;
	}
	public String getCheckInTime() {
		
		return checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		
		this.checkInTime = checkInTime;
	}
	public String getCheckOutTime() {
		
		return checkOutTime;
	}
	public void setCheckOutTime(String checkOutTime) {
		
		this.checkOutTime = checkOutTime;
	}
	public String getNotes() {
		
		return notes;
	}
	public void setNotes(String notes) {
		
		this.notes = notes;
	}
	public List<RoomType> getRoomTypeList() {
		
		return roomTypeList;
	}
	public void setRoomTypeList(List<RoomType> roomTypeList) {
		
		this.roomTypeList = roomTypeList;
	}
	public List<Restaurants> getRestaurantsList() {
		
		return restaurantsList;
	}
	public void setRestaurantsList(List<Restaurants> restaurantsList) {
		
		this.restaurantsList = restaurantsList;
	}
	
	@Override
	public String toString() {
		return "HotelInformationResponse [hotelName=" + hotelName
				+ ", address=" + address + ", city=" + city + ", country="
				+ country + ", postalCode=" + postalCode + ", contactEmails="
				+ contactEmails + ", contactPhones=" + contactPhones + ", fax="
				+ fax + ", checkInTime=" + checkInTime + ", checkOutTime="
				+ checkOutTime + ", notes=" + notes + ", roomTypeList="
				+ roomTypeList + ", restaurantsList=" + restaurantsList
				+ ", status=" + status + ", errorMessage=" + errorMessage + "]";
	}
	
}
