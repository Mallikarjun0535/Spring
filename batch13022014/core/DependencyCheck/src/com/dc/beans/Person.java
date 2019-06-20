package com.dc.beans;

public class Person {
	private Passport passport;

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [passport=" + passport + "]";
	}

}
