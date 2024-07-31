package com.sp.autowiringByAnno;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
	private Address adress;

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	
	

	@Override
	public String toString() {
		return "Student [adress=" + adress + "]";
	}

}
