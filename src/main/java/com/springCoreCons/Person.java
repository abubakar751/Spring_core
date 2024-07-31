package com.springCoreCons;


public class Person {
	private String name;
	private int age ;
	private Certificate certificate;
	public Person(String name, int age,Certificate certificate) {
		
		this.name = name;
		this.age = age;
		this.certificate= certificate;
		
	}
	@Override
	public String toString() {
		return this.name +": "+this.age +" "+this.certificate;
	}
	
}
