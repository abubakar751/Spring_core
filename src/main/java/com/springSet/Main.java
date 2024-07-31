package com.springSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springSet/confi.xml");
		
		Emp emp= (Emp) context.getBean("emp1");
		System.out.println(emp.getComName());
		System.out.println(emp.getEmpId());

	}

}
