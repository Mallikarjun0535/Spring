package com.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.Person;

public class CITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ci/common/application-context.xml"));
		Person p = factory.getBean("person", Person.class);
		p.showPersonInfo();
	}
}
