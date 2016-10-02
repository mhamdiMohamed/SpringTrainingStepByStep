package com.med;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.med.custom.event.MyCustomEventPublisher;

public class EventHandlingExample {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
		applicationContext.start();
		System.out.println(((SimpleClass) applicationContext.getBean("MySimpleClass")).getMessage());
		applicationContext.stop();
		MyCustomEventPublisher customEventPublisher = (MyCustomEventPublisher) 
				applicationContext.getBean("customEventPublisher");

		customEventPublisher.publish();
	}
}
