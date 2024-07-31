package com.springlifecyclexml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springlifecyclexml/confi.xml");

		Student student = context.getBean("stu", Student.class);
		System.out.println(student);

		context.registerShutdownHook();
		

	}
}
