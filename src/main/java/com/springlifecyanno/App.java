package com.springlifecyanno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
 AbstractApplicationContext  context=new   	ClassPathXmlApplicationContext("com/springlifecyanno/confi.xml");
 Student student=(Student) context.getBean("stu");   
 context .registerShutdownHook();
     System.out.println(student);
     
    }
}
