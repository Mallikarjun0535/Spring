package com.un.beans;

public class Engine {
	private int id;
	private String manufacturer;

	public Engine(int id, String manufacturer) {
		this.id = id;
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", manufacturer=" + manufacturer + "]";
	}

}
