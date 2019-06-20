package com.nbf.beans;

public class Robot {
	private Chip chip;

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}