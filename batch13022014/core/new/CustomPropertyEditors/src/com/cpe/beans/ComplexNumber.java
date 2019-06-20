package com.cpe.beans;

public class ComplexNumber {
	private int base;
	private int expo;

	public ComplexNumber(int base, int expo) {
		this.base = base;
		this.expo = expo;
	}

	@Override
	public String toString() {
		return "ComplexNumber [base=" + base + ", expo=" + expo + "]";
	}

}
