package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Robot;

public class BATest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ba/common/application-context.xml"));
		/*
		 * Robot r1 = factory.getBean("robot", Robot.class); Robot r2 =
		 * factory.getBean("r3,r4", Robot.class); System.out.println("r1==r2?:"
		 * + (r1 == r2));
		 */

		String[] aliases = factory.getAliases("r1");
		for (String a : aliases) {
			System.out.println(a);
		}
	}
}
