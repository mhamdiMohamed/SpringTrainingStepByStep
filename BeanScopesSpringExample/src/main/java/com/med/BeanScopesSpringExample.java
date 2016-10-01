package com.med;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesSpringExample {

	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("bean.xml");

		//Singleton scope
		System.out.println("Singleton scope");
		SimpleClass classA=(SimpleClass) applicationContext
				.getBean("MySimpleClassSingleton");
		classA.setMessage(classA.getMessage()+"Singleton !!");
		System.out.println("classA message : "+classA.getMessage());
		SimpleClass classB=(SimpleClass) applicationContext
				.getBean("MySimpleClassSingleton");
		System.out.println("classB message : "+classB.getMessage());

		//Prototype scope
		System.out.println("Prototype scope");
		 classA=(SimpleClass) applicationContext
				.getBean("MySimpleClassPrototype");
			classA.setMessage(classA.getMessage()+"Prototype !!");
		System.out.println("classA message : "+classA.getMessage());
		 classB=(SimpleClass) applicationContext
				.getBean("MySimpleClassPrototype");
		System.out.println("classB message : "+classB.getMessage());
	}

}
