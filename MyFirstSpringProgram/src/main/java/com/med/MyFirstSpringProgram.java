package com.med;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringProgram {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new 
				ClassPathXmlApplicationContext("bean.xml");
		
		if (applicationContext.containsBean("MySimpleClass")) {
			SimpleClass simpleClass=(SimpleClass) 
					applicationContext.getBean("MySimpleClass");
			System.out.println("MySimpleClass.message : "+
					simpleClass.getMessage());
		}else{
			System.out.println("This bean is not yet in bean.xml");
		}
	}
}
