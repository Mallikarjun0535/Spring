package com.nbf.beans;

public class Passport {
	private int passportNo;
	private String place;

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", place=" + place + "]";
	}

}
