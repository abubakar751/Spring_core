package com.sp.diBySetterGetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/sp/diBySetterGetter/confi.xml");
     Emp emp=  context.getBean("emp",Emp.class);
     System.out.println(emp);
    }
}
