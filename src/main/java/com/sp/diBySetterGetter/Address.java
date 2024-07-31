package com.sp.diBySetterGetter;

public class Address {
	private String vill;
	private String city;
	public String getVill() {
		return vill;
	}
	public void setVill(String vill) {
		this.vill = vill;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [vill=" + vill + ", city=" + city + "]";
	}

}
