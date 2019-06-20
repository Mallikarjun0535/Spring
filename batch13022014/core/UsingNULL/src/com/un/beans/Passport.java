package com.un.beans;

public class Passport {
	private int id;
	private String issuer;

	public void setId(int id) {
		this.id = id;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", issuer=" + issuer + "]";
	}

}
