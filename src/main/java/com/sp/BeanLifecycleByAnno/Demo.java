package com.sp.BeanLifecycleByAnno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Demo {
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
		return "Demo [id=" + id + ", name=" + name + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	@PreDestroy
    public void destroy() {
    	System.out.println("destroy");
    }
}
