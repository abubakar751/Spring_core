package com.sp.BeanLifeCycleByXml;

public class Bean {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bean [id=" + id + ", name=" + name + "]";
	}
	public void init() {
		System.out.println("init method");
	}
	public void destroy () {
		System.out.println("destroy method");
	}

}
