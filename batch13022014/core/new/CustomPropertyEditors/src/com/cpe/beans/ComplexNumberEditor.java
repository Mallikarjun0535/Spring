package com.cpe.beans;

import java.beans.PropertyEditorSupport;

public class ComplexNumberEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		ComplexNumber complexNumber = null;
		int base = 0;
		int expo = 0;
		String[] splits = null;
		
		splits = text.split(",");
		base = Integer.parseInt(splits[0]);
		expo = Integer.parseInt(splits[1]);
		complexNumber = new ComplexNumber(base, expo);
		setValue(complexNumber);
	}

}
