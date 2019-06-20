package com.acc.dto;

import java.io.Serializable;

public class ProfileInfoDTO implements Serializable {
	private int userId;
	private String firstName;
	private String lastName;
	private long mobile;
	private String email;

	public ProfileInfoDTO(int userId, String firstName, String lastName,
			long mobile, String email) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
