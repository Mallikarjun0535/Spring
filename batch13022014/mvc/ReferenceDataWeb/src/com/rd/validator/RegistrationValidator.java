package com.rd.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.rd.command.RegisterCommand;

public class RegistrationValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(RegisterCommand.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		RegisterCommand cmd = null;
		
		cmd = (RegisterCommand) obj;
		
		if(cmd.getId() <= 0) {
			errors.rejectValue("id", "id.invalid");
		}
	}

}
