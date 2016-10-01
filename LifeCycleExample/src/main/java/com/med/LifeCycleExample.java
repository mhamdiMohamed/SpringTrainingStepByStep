package com.med;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleExample {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean.xml");
		
		applicationContext.getBean("MySimpleClass");
		
		applicationContext.registerShutdownHook();
	}

}
