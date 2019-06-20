package com.pe.beans;

public class Calculator {
	private ComplexNumber complexNumber;

	public void setComplexNumber(ComplexNumber complexNumber) {
		this.complexNumber = complexNumber;
	}

	@Override
	public String toString() {
		return "Calculator [complexNumber=" + complexNumber + "]";
	}

}
