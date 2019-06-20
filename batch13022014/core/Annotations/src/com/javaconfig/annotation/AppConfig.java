package com.javaconfig.annotation;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "time")
	public Calendar newCalendar() {
		Calendar c = null;

		c = Calendar.getInstance();
		return c;
	}
}
