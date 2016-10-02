package com.med.custom.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyCustomEventPublisher implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}
	
	public void publish(){
		MyCustomEvent customEvent=new MyCustomEvent(this);
		publisher.publishEvent(customEvent);
	}
}
