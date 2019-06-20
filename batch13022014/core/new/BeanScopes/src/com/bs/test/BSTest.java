package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.Machine;

public class BSTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bs/common/application-context.xml"));
		Machine m1 = factory.getBean("machine", Machine.class);
		Machine m2 = factory.getBean("machine", Machine.class);

		System.out.println("m1==m2?:" + (m1 == m2));
	}
}
