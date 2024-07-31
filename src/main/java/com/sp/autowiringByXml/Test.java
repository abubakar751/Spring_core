package com.sp.autowiringByXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sp/autowiringByXml/confi.xml");
 Emp emp= context.getBean("emp",Emp.class);
 System.out.println(emp);
	}

}
