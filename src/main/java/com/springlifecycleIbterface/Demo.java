package com.springlifecycleIbterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
   AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springlifecyclexml1/confi.xml");
    Student student= context.getBean("stu" ,Student.class);
    ByInterface byInterface=context.getBean("by",ByInterface.class);
    
   
   context.registerShutdownHook();
    System.out.println(byInterface);
	}

}
