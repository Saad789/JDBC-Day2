package com.ts.us.dto;

public class Branch {
	private int id;
	private String location;
	private String city;
	private String state;
	private String country;
	private int postal_code;
	private int restaurant_id;
	
	public Branch(){
		System.out.println("object created");
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	@Override
	public String toString() {
		return "BranchDTO [id=" + id + ", location=" + location + ", city=" + city + ", state=" + state + ", country="
				+ country + ", postal_code=" + postal_code + ", restaurant_id=" + restaurant_id + "]";
	}
	

}
