package com.med;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionExample {
	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("bean.xml");

		//auto-wiring by constructor
		System.out.println(applicationContext.getBean("person"));

		//auto-wiring by name
		System.out.println(applicationContext.getBean("theSamePerson"));

		//auto-wiring by type
		System.out.println(applicationContext.getBean("anotherSamePerson"));
	}
}
