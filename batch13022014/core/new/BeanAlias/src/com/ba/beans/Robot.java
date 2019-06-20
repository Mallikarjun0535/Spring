package com.ba.beans;

public class Robot {
	private int id;
	private String type;

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Robot [id=" + id + ", type=" + type + "]";
	}

}
