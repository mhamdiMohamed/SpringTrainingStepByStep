package com.med;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionExample {
	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("bean.xml");

		//constructor based injection
		System.out.println(applicationContext.getBean("person"));
		
		//setter based injection
		System.out.println(applicationContext.getBean("theSamePerson"));
		
		//inner bean injection
		System.out.println(applicationContext.getBean("anotherSamePerson"));
	}
}
