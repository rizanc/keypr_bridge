package com.cloudkey.commons;

/**
 * Class stores Restaurants information.It has information of restaurant name,
 * with cuisine  and descriptions.
 * 
 * @author 
 *
 */
public class Restaurants {

	/* reference variable to store restaurants details */
	private String name;
	private String description;
	private String cuisine;
	
	/* generate getter and setter */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	
	@Override
	public String toString() {
		return "Restaurants [name=" + name + ", description=" + description
				+ ", cuisine=" + cuisine + "]";
	}
	
}
