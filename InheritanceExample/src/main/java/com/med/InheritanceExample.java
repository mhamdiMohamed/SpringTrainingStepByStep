package com.med;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceExample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		if (context.containsBean("anEmployee")) {
			Employee employee=(Employee) 
					context.getBean("anEmployee");
			System.out.println("Name : "+
					employee.getName());
			System.out.println("Last name : "+
					employee.getLastName());
			System.out.println("Department : "+
					employee.getDepartment());
		}else{
			System.out.println("This bean is not yet in bean.xml");
		}
	}

}
