package com.med;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartEventHandler implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
		System.out.println(
				"Context started " + contextStartedEvent.getTimestamp() + " " + 
		contextStartedEvent.getClass());
	}

}
