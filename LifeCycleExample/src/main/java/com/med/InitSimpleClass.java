package com.med;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitSimpleClass implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("SimpleClass "+beanName +" : postProcessAfterInitialization method ...");
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("SimpleClass "+beanName +" : postProcessBeforeInitialization method ...");
		return bean;
	}

}
