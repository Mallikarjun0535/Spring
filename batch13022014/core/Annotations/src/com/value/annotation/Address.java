package com.value.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("#{appValues.Address_city}")
	private String city;

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

}
