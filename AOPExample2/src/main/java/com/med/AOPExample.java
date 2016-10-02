package com.med;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		SimpleClass simpleClass = (SimpleClass) context.getBean("MySimpleClass");
		System.out.println(simpleClass.getMessage());
		simpleClass.printThrowException();
	}
}
