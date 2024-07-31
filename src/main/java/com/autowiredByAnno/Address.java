package com.autowiredByAnno;

public class Address {
	private String town;
	private String city;
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [town=" + town + ", city=" + city + "]";
	}
	

}
