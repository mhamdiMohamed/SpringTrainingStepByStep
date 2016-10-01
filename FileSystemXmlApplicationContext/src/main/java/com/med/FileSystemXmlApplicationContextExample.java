package com.med;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContextExample {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new FileSystemXmlApplicationContext(
				"src/main/resources/bean.xml");

		if (beanFactory.containsBean("MySimpleClass")) {
			SimpleClass simpleClass = (SimpleClass) 
					beanFactory.getBean("MySimpleClass");
			System.out.println("MySimpleClass.message : " + simpleClass.getMessage());
		} else {
			System.out.println("This bean is not yet in bean.xml");
		}
	}

}
