package com.useOfAnno;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("os")
public class Emp {
	@Value("AbuBakar")
	private String name;
	@Value("102")
	private int id;
	@Value("#{lis}")
	private List<String> list;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", list=" + list + "]";
	}

}
