package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Motor;

public class BATest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ba/common/application-context.xml"));
		Motor m = factory.getBean("motor", Motor.class);
		System.out.println(m);
	}
}
