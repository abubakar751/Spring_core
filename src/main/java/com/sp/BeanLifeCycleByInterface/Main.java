package com.sp.BeanLifeCycleByInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/sp/BeanLifeCycleByInterface/confi.xml");
 Student  student=context.getBean("beanInter",Student.class);
 context.registerShutdownHook();
 System.out.println(student);
	}

}
