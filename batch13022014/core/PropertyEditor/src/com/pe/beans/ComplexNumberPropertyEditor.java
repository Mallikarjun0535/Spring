package com.pe.beans;

import java.beans.PropertyEditorSupport;

public class ComplexNumberPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String val) throws IllegalArgumentException {
		String[] tokens = null;
		int base;
		int expo;
		ComplexNumber cn = null;

		tokens = val.split(",");
		base = Integer.parseInt(tokens[0]);
		expo = Integer.parseInt(tokens[1]);

		cn = new ComplexNumber(base, expo);
		setValue(cn);
	}

}
