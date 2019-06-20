package com.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nbf.beans.Person;

public class NBFTest {
	public static void main(String[] args) {
		BeanFactory pf = new XmlBeanFactory(new ClassPathResource(
				"com/nbf/common/parent-beans.xml"));
		BeanFactory cf = new XmlBeanFactory(new ClassPathResource(
				"com/nbf/common/child-beans.xml"), pf);
		Person p = cf.getBean("person", Person.class);
		System.out.println(p);
	}
}
