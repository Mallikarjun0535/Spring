package com.un.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.un.beans.Motor;

public class UNTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/un/common/application-context.xml"));
		Motor m = factory.getBean("motor", Motor.class);
		System.out.println(m);
	}
}
