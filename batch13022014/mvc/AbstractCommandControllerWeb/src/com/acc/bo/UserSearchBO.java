package com.acc.bo;

public class UserSearchBO {
	private String firstNm;
	private String lastNm;
	private Long mobile;
	private String email;

	public UserSearchBO(String firstNm, String lastNm, Long mobile, String email) {
		super();
		this.firstNm = firstNm;
		this.lastNm = lastNm;
		this.mobile = mobile;
		this.email = email;
	}

	public String getFirstNm() {
		return firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getLastNm() {
		return lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
