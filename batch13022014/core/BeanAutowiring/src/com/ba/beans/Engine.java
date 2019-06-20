package com.ba.beans;

public class Engine {
	private int id;
	private String fuelType;

	public void setId(int id) {
		this.id = id;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", fuelType=" + fuelType + "]";
	}

}
