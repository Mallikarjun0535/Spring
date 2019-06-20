package com.req.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReqAnnonTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/req/annotation/application-context.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}
}
