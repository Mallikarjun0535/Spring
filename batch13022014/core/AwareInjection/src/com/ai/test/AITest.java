package com.ai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ai.beans.Car;

public class AITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ai/common/application-context.xml"));
		Car c1 = factory.getBean("car1", Car.class);
		c1.run();

		Car c2 = factory.getBean("car2", Car.class);
		c2.run();
	}
}
