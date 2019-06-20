package com.bl.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class BLTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.bl.annotation");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		Machine m = context.getBean("machine", Machine.class);
		m.start();

	}
}
