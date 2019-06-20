package com.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nbf.beans.Robot;

public class NBFTest {
	public static void main(String[] args) {
		BeanFactory pf = new XmlBeanFactory(new ClassPathResource(
				"com/nbf/common/parent-beans.xml"));
		BeanFactory cf = new XmlBeanFactory(new ClassPathResource(
				"com/nbf/common/child-beans.xml"), pf);
		Robot r = cf.getBean("robot", Robot.class);
		System.out.println(r);
	}
}
