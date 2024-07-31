package com.sp.BeanLifeCycleByXml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/sp/BeanLifeCycleByXml/confi.xml");
 Bean bean=context.getBean("bean",Bean.class);
 context.registerShutdownHook();

 System.out.println(bean);
	}

}
