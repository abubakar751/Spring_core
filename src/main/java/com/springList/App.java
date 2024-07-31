package com.springList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/springList/confi.xml");
        Students s=(Students) context.getBean("stu1");
        System.out.println(s.getClg());
        System.out.println(s.getName());
    }
}
