package com.useOfAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/useOfAnno/confi.xml");
		/*
		 * Emp emp = context.getBean("os", Emp.class);
		 * 
		 * System.out.println(emp.hashCode()); Emp emp1 = context.getBean("os",
		 * Emp.class); System.out.println(emp1.hashCode()); Emp emp2 =
		 * context.getBean("os", Emp.class); System.out.println(emp2.hashCode());
		 */
		 ScopeOfBean scopeOfBean=context.getBean("sc", ScopeOfBean.class);
		 System.out.println(scopeOfBean.hashCode());
		 ScopeOfBean scopeOfBean1=context.getBean("sc", ScopeOfBean.class);
		 System.out.println(scopeOfBean1.hashCode());

	}

}
