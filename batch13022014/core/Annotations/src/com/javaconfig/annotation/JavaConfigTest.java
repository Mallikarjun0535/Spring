package com.javaconfig.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.javaconfig.annotation");
		Alarm alarm = context.getBean("alarm", Alarm.class);
		System.out.println(alarm);
	}
}
