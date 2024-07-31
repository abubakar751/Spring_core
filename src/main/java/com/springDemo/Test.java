package com.springDemo;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws SQLException {
		AbstractApplicationContext  context=new ClassPathXmlApplicationContext("com/springDemo/config.xml");
		 Student student=(Student) context.getBean("stu");
		 student.deleteData(107);
		student.fetch();
		 context.registerShutdownHook();
	}
	
	

}
