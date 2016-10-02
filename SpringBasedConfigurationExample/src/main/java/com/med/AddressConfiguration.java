package com.med;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfiguration {
	@Bean(name="address")
	public Address getAddress(){
		return new Address("El Khadhra city","city",1003);
	}
}
