package com.ba.beans;

public class Address {
	private String addressLine1;
	private String city;

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", city=" + city + "]";
	}

}
