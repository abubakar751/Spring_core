package com.springMap;

import java.util.List;
import java.util.Map;

public class Student {
	private List<String> name;
	private Map<String,String > courses;
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", courses=" + courses + "]";
	}
	
	

}
