package com.sfc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sfc.command.InsertUserCommand;

public class InsertUserValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(InsertUserCommand.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		InsertUserCommand command = null;

		command = (InsertUserCommand) obj;

		if (command.getId() <= 0) {
			errors.rejectValue("id", "id.invalid");
		}

		if (command.getFirstNm() == null || command.getFirstNm().equals("")) {
			errors.rejectValue("firstNm", "firstNm.blank");
		}

		if (command.getLastNm() == null || command.getLastNm().equals("")) {
			errors.rejectValue("lastNm", "lastNm.blank");
		}

		if (command.getMobile() == null || command.getMobile() < 99999999 || command.getMobile() > 999999999) {
			errors.rejectValue("mobile", "mobile.invalid");
		}
		if (command.getEmail() == null || command.getEmail().equals("")) {
			errors.rejectValue("email", "email.blank");
		}
	}

}
