package com.bfpp.beans;

public class ConnectionManager {
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConnection() {
		return "ConnectionManager [driverClassName=" + driverClassName
				+ ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}

}
