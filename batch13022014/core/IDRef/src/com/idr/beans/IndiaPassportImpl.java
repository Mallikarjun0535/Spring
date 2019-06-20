package com.idr.beans;

public class IndiaPassportImpl implements IPassport {
	private String passportNo;
	private String issuer;

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getPassportDetails() {
		return "Passport [passportNo=" + passportNo + ", issuer=" + issuer
				+ "]";
	}

}
