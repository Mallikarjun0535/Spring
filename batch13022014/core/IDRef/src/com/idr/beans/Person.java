package com.idr.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Person {
	private String ssn;
	private String name;
	private String id;
	private IPassport passport;

	public void showPersonInfo() {
		System.out.println("ssn : " + ssn);
		System.out.println("name : " + name);

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/idr/common/application-context.xml"));
		passport = factory.getBean(id, IPassport.class);
		System.out.println(passport.getPassportDetails());
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

}
