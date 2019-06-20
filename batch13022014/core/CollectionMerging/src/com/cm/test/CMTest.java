package com.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cm.beans.Course;

public class CMTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/cm/common/application-context.xml"));
		Course c = factory.getBean("btechECE1Yr1Sem", Course.class);
		System.out.println(c);
	}
}
