package com.med.custom.event;

import org.springframework.context.ApplicationListener;

public class MyCustomEventHandler implements ApplicationListener<MyCustomEvent>{
	public void onApplicationEvent(MyCustomEvent customEvent) {
		System.out.println(
				"My Custom Event " + customEvent.getTimestamp() + " " + 
						customEvent.getClass());
	}
}
