package com.ba.beans;

public class Robot {
	private Bus bus;
	private Chip chip;

	public Robot(Bus bus) {
		System.out.println("Robot(bus)");
		this.bus = bus;
	}

	public Robot(Chip chip) {
		System.out.println("Robot(chip)");
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + ", bus=" + bus + "]";
	}

}
