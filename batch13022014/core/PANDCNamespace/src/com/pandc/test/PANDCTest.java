package com.pandc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pandc.beans.Motor;

public class PANDCTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/pandc/common/application-context.xml"));
		Motor m = factory.getBean("motor", Motor.class);
		System.out.println(m);
	}
}
