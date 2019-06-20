package com.pi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pi.beans.Address;

public class PITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/pi/common/application-context.xml"));
		Address addr = factory.getBean("address", Address.class);
		System.out.println(addr);
	}
}
