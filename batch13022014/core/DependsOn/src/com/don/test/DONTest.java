package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.don.beans.LoanCalculator;

public class DONTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/don/common/application-context.xml"));
		LoanCalculator lc = factory.getBean("loanCalculator",
				LoanCalculator.class);
		float amt = lc.calInterest(100, 2, "hyd");
		System.out.println("Interest Amount : " + amt);
	}
}
