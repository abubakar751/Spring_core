package com.standalone.collection;

import java.util.List;

public class Friend {
	private List <String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Friend [list=" + list + "]";
	}
	

}
