package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.PlanFinder;

public class MRTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/mr/common/application-context.xml"));
		PlanFinder pf = factory.getBean("planFinder", PlanFinder.class);
		System.out.println("Plan : " + pf.findPlans(20, 1, 1));
	}
}
