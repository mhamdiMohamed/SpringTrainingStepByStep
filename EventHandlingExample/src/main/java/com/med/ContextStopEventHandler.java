package com.med;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStopEventHandler implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
		System.out.println(
				"Context stopped " + contextStoppedEvent.getTimestamp() + " " + 
						contextStoppedEvent.getClass());
	}

}