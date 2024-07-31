package com.sp.collectionBySetterGetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext conntext = new ClassPathXmlApplicationContext("com/sp/collectionBySetterGetter/confi.xml");
    Collection collection=    conntext.getBean("coll",Collection.class);
    System.out.println(collection);
	}

}
