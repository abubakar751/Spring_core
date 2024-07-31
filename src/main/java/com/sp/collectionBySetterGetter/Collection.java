package com.sp.collectionBySetterGetter;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
	private List<String> sName;
	private Set<Integer> sId;
	private Map<Integer,String> sDetails;
	public List<String> getsName() {
		return sName;
	}
	public void setsName(List<String> sName) {
		this.sName = sName;
	}
	public Set<Integer> getsId() {
		return sId;
	}
	public void setsId(Set<Integer> sId) {
		this.sId = sId;
	}
	public Map<Integer, String> getsDetails() {
		return sDetails;
	}
	public void setsDetails(Map<Integer, String> sDetails) {
		this.sDetails = sDetails;
	}
	@Override
	public String toString() {
		return "Collection [sName=" + sName + ", sId=" + sId + ", sDetails=" + sDetails + "]";
	}
	
}
