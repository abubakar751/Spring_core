package com.sp.BeanLifecycleByAnno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/sp/BeanLifecycleByAnno/confi.xml");
  Demo demo= context.getBean("demo",Demo.class);
  System.out.println(demo);
  context.registerShutdownHook();

	}

}
