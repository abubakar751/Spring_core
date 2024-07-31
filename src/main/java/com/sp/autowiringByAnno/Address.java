package com.sp.autowiringByAnno;

public class Address {
	
	private String pin;
	private String zip;
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", zip=" + zip + "]";
	}
	

}
