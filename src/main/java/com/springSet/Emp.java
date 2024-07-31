package com.springSet;

import java.util.Set;

public class Emp {
	private String comName;
	private Set<Integer> empId;
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public Set<Integer> getEmpId() {
		return empId;
	}
	public void setEmpId(Set<Integer> empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Emp [comName=" + comName + ", empId=" + empId + "]";
	}
	

}
