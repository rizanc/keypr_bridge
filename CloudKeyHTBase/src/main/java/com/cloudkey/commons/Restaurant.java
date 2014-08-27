package com.cloudkey.commons;

import com.cloudkey.pms.common.Cuisine;
import com.cloudkey.pms.common.profile.StreetAddress;

import java.util.List;

/**
 * Class stores Restaurants information.It has information of restaurant name,
 * with cuisine  and descriptions.
 * 
 * @author 
 *
 */
public class Restaurant {

	/* reference variable to store restaurants details */
	protected String name;
	protected String description;
	protected List<Cuisine> cuisines;
	protected List<StreetAddress> contacts;
	protected Boolean offersBreakfast;
	protected Boolean offersBrunch;
	protected Boolean offersLunch;
	protected Boolean offersDinner;
	protected Integer maxSeatingCapacity;
	protected Integer maxSingleParty;
//	protected Vector relativePosition;

	protected Restaurant() { /* For serialization */ }

	public Restaurant(String name, String description, List<Cuisine> cuisines, List<StreetAddress> contacts, Boolean offersBreakfast, Boolean offersBrunch, Boolean offersLunch, Boolean offersDinner, Integer maxSeatingCapacity, Integer maxSingleParty) {
		this.name = name;
		this.description = description;
		this.cuisines = cuisines;
		this.contacts = contacts;
		this.offersBreakfast = offersBreakfast;
		this.offersBrunch = offersBrunch;
		this.offersLunch = offersLunch;
		this.offersDinner = offersDinner;
		this.maxSeatingCapacity = maxSeatingCapacity;
		this.maxSingleParty = maxSingleParty;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public List<Cuisine> getCuisines() {
		return cuisines;
	}

	public List<StreetAddress> getContacts() {
		return contacts;
	}

	public Boolean getOffersBreakfast() {
		return offersBreakfast;
	}

	public Boolean getOffersBrunch() {
		return offersBrunch;
	}

	public Boolean getOffersLunch() {
		return offersLunch;
	}

	public Boolean getOffersDinner() {
		return offersDinner;
	}

	public Integer getMaxSeatingCapacity() {
		return maxSeatingCapacity;
	}

	public Integer getMaxSingleParty() {
		return maxSingleParty;
	}
}
