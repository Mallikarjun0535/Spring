package com.req.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	private int ssn;
	private String name;

	@Required
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + "]";
	}

}
