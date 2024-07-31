package com.springcoreanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    ApplicationContext     context=new ClassPathXmlApplicationContext("com/springcoreanno/conf.xml");
     Student student= (Student) context.getBean("st");
     student.setId(101);
     student.setName("Abubakar");
     System.out.println(student);
    }
}
