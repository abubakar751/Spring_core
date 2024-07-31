package com.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
  ApplicationContext context=new ClassPathXmlApplicationContext("com/standalone/collection/confi.xml");
	Friend friend=context.getBean("ss",Friend.class);
	System.out.println(friend);
	System.out.println(friend.getClass()+" "+friend.getList());
	}

}
