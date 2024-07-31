package com.sp.collectionByCons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
ApplicationContext context=new ClassPathXmlApplicationContext("com/sp/collectionByCons/confi.xml");
 Demo demo= context.getBean("coll",Demo.class);
 System.out.println(demo);
	}

}
