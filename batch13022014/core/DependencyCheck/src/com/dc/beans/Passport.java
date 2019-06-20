package com.dc.beans;

public class Passport {
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
		return "Passport [ssn=" + ssn + ", name=" + name + "]";
	}

}
