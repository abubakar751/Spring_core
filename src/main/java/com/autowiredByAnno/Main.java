package com.autowiredByAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiredByAnno/confi.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);

	}

}
