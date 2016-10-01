package com.med;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class XmlBeanFactoryExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("bean.xml"));

		if (beanFactory.containsBean("MySimpleClass")) {
			SimpleClass simpleClass = (SimpleClass) 
					beanFactory.getBean("MySimpleClass");
			System.out.println("MySimpleClass.message : " + simpleClass.getMessage());
		} else {
			System.out.println("This bean is not yet in bean.xml");
		}
	}

}
