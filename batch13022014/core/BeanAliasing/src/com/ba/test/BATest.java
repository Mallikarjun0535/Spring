package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Address;

public class BATest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ba/common/application-context.xml"));
		Address a1 = factory.getBean("permanentAddress", Address.class);
		Address a2 = factory.getBean("secondaryAddress", Address.class);

		/* System.out.println("a1 == a2 ? : " + (a1 == a2)); */
		String[] names = factory.getAliases("communicationAddress");
		for (String n : names) {
			System.out.println(n);
		}
	}
}
