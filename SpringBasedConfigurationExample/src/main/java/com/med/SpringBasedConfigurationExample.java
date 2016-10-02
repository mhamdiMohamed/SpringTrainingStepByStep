package com.med;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBasedConfigurationExample {
	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(PersonConfiguration.class);

		System.out.println(applicationContext.getBean("person"));
		System.out.println(applicationContext.getBean(Person.class));
		System.out.println(applicationContext.getBean("address"));
		System.out.println(applicationContext.getBean(Address.class));

	}
}
