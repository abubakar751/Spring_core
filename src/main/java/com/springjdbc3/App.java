package com.springjdbc3;

import java.sql.SQLException;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springjdbc3/config.xml");
    	Student2 st=(Student2) context.getBean("stu");
    	st.deleteData(104);
    	st.fetch();
    	
    	context.registerShutdownHook();
    	
    }
}
