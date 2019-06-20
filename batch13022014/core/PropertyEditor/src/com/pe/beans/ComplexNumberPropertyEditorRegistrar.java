package com.pe.beans;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

public class ComplexNumberPropertyEditorRegistrar implements
		PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(ComplexNumber.class,
				new ComplexNumberPropertyEditor());
	}

}
