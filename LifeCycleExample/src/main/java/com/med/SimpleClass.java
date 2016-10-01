package com.med;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SimpleClass implements InitializingBean, DisposableBean {

	public SimpleClass() {
		System.out.println("SimpleClass : constructor ...");
	}

	public void init() {
		System.out.println("SimpleClass : init method ...");
	}

	public void destruction() {
		System.out.println("SimpleClass : destruction method ...");
	}

	public void destroy() throws Exception {
		System.out.println("SimpleClass : Destroy method of DisposableBean ...");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("SimpleClass : afterPropertiesSet method ...");
	}
}
