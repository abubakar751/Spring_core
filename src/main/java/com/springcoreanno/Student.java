package com.springcoreanno;

import org.springframework.stereotype.Component;

@Component("st")
public class Student {
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
 
	
}
