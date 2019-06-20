package com.ci.beans;

public class Person {
	private Passport passport;

	public Person(Passport passport) {
		this.passport = passport;
	}

	public void showPersonInfo() {
		passport.showPassportDetails();
	}
}
