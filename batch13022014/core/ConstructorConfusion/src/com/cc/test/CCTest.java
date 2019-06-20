package com.cc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cc.beans.Robot;

public class CCTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/cc/common/application-context.xml"));
		Robot r = factory.getBean("robot", Robot.class);
		System.out.println(r);
	}
}
