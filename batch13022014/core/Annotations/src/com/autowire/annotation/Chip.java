package com.autowire.annotation;

public class Chip {
	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Chip [id=" + id + ", name=" + name + "]";
	}

}
