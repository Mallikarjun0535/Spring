package com.cc.beans;

public class Robot {
	private int id;
	private String type;

	public Robot(int id, String type) {
		this.id = id;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Robot [id=" + id + ", type=" + type + "]";
	}

}
