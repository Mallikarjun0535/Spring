package com.qa.bo;

public class StudentBO {
	private int id;
	private String name;

	public StudentBO(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentBO [id=" + id + ", name=" + name + "]";
	}
}
