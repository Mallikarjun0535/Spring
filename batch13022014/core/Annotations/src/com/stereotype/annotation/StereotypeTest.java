package com.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/stereotype/annotation/application-context.xml");

		Car car1 = context.getBean("car", Car.class);
		car1.run();

	}
}
