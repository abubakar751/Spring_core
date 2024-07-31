package com.sp.collectionByCons;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	private List<String> eName;
	private Set<String> eId;
	private Map<Integer, String> eDetails;

	public Demo(List<String> eName, Set<String> eId, Map<Integer, String> eDetails) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eDetails = eDetails;
	}

	@Override
	public String toString() {
		return "Demo [eName=" + eName + ", eId=" + eId + ", eDetails=" + eDetails + "]";
	}

}
