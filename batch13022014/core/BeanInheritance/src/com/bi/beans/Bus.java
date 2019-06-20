package com.bi.beans;

public class Bus {
	private int id;
	private String model;
	private String manufacturer;
	private String color;

	public void setId(int id) {
		this.id = id;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", model=" + model + ", manufacturer="
				+ manufacturer + ", color=" + color + "]";
	}

}
