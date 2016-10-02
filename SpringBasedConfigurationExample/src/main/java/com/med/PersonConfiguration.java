package com.med;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = AddressConfiguration.class)
public class PersonConfiguration {
	@Bean(name="person")
	public Person getPerson() {
		return new Person("MHAMDI", "Mohamed", "male", 
				new AddressConfiguration().getAddress());
	}
}
