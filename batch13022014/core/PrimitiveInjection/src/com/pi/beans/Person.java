package com.pi.beans;

public class Person {
	private int ssn;
	private String name;

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
