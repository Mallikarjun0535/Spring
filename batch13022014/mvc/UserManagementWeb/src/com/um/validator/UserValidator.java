package com.um.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.um.command.UserCommand;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(UserCommand.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		UserCommand command = null;

		command = (UserCommand) obj;

		if (command.getUserId() <= 0) {
			errors.rejectValue("id", "id.invalid");
		}

		if (command.getFirstNm() == null || command.getFirstNm().equals("")) {
			errors.rejectValue("firstNm", "firstNm.blank");
		}

		if (command.getLastNm() == null || command.getLastNm().equals("")) {
			errors.rejectValue("lastNm", "lastNm.blank");
		}

		if (command.getMobile() == null || command.getMobile() < 99999999
				|| command.getMobile() > 999999999) {
			errors.rejectValue("mobile", "mobile.invalid");
		}
		if (command.getEmail() == null || command.getEmail().equals("")) {
			errors.rejectValue("email", "email.blank");
		}
	}

}
