package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnonTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/autowire/annotation/application-context.xml");
		Robot r = context.getBean("robot", Robot.class);
		System.out.println(r);
	}
}
