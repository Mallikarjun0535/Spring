package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bi.beans.Bus;

public class BITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bi/common/application-context.xml"));
		Bus bus = factory.getBean("bus", Bus.class);
		System.out.println(bus);
		
	}
}
