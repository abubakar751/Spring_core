package com.autowiredByAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("address")
	private Address address;

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(Address address) {
		super();
		this.address = address;
	}
	

}
