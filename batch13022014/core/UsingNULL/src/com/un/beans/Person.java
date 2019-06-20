package com.un.beans;

public class Person {
	private Passport passport;

	public Person(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [passport=" + passport + "]";
	}

}
