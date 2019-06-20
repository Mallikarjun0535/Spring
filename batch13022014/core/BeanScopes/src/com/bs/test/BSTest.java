package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.DateUtil;

public class BSTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bs/common/application-context.xml"));
		DateUtil du1 = factory.getBean("dateUtil", DateUtil.class);
		DateUtil du2 = factory.getBean("dateUtil", DateUtil.class);

		System.out.println("du1 == du2 ? : " + (du1 == du2));
	}
}
