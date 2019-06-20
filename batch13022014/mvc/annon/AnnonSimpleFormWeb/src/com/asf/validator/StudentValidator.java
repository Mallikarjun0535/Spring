package com.asf.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.asf.command.StudentCommand;

@Component
public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(StudentCommand.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		StudentCommand command = null;

		command = (StudentCommand) obj;

		if (command.getId() <= 0) {
			errors.rejectValue("id", "id.invalid");
		}

		if (command.getName() == null || command.getName().equals("")) {
			errors.rejectValue("name", "name.blank");
		}
	}

}
