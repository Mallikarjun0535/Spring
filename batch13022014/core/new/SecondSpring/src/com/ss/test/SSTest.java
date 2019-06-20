package com.ss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ss.beans.Bike;

public class SSTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ss/common/application-context.xml"));
		Bike bike = factory.getBean("bike", Bike.class);
		bike.ride();
	}
}
