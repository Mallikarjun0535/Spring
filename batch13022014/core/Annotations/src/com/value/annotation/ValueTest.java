package com.value.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/value/annotation/application-context.xml");
		Address addr = context.getBean("address", Address.class);
		System.out.println(addr);
	}
}
