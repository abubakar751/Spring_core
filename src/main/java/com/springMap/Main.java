package com.springMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	 ApplicationContext context=new  ClassPathXmlApplicationContext("com/springMap/confi.xml");
	 Student student=(Student) context.getBean("mnp");
	 System.out.println(student.getName());
	 System.out.println(student.getCourses());
}
}
