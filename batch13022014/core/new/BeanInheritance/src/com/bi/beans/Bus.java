package com.bi.beans;

public class Bus {
	private int id;
	private String make;
	private String model;
	private String fuelType;
	private String color;
	private float capacity;

	public void setId(int id) {
		this.id = id;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", make=" + make + ", model=" + model
				+ ", fuelType=" + fuelType + ", color=" + color + ", capacity="
				+ capacity + "]";
	}

}
