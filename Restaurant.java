package com.ts.us.dto;

public class Restaurant {
	private int id;
	private String govt_registration_id;
	private String name;
	private String password;
	private String logo_name;
	
	public Restaurant(){
		System.out.println("Object created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGovt_registration_id() {
		return govt_registration_id;
	}

	public void setGovt_registration_id(String govt_registration_id) {
		this.govt_registration_id = govt_registration_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogo_name() {
		return logo_name;
	}

	public void setLogo_name(String logo_name) {
		this.logo_name = logo_name;
	}

	@Override
	public String toString() {
		return "RestaurantDTO [id=" + id + ", govt_registration_id=" + govt_registration_id + ", name=" + name
				+ ", password=" + password + ", logo_name=" + logo_name + "]";
	}
	
	

}
