package com.springList;

import java.util.List;

public class Students {
	private String clg;
	private List<String> name;
	
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [clg=" + clg + ", name=" + name + "]";
	}
	

}
