package com.asf.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asf.command.StudentCommand;
import com.asf.validator.StudentValidator;

@Controller
@RequestMapping("/insert.htm")
public class InsertStudentController {
	@Autowired
	private StudentValidator validator;

	/**
	 * This is equal to formBackingObject
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(ModelMap model) {
		StudentCommand command = null;

		command = new StudentCommand();
		model.addAttribute("studcmd", command);
		return "insert";
	}

	/**
	 * This is equal to onSubmit
	 * 
	 * @param model
	 * @param command
	 * @param errors
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String doInsert(ModelMap model,
			@ModelAttribute("studcmd") StudentCommand command,
			BindingResult errors) {

		if (validator.supports(command.getClass())) {
			validator.validate(command, errors);
			if (errors.hasErrors()) {
				return "insert";
			}
		}

		// call service
		model.addAttribute("studentId", command.getId());
		return "success";
	}

	@ModelAttribute("courses")
	public Map<Integer, String> extraFormData() {
		Map<Integer, String> courses = null;

		courses = new HashMap<Integer, String>();

		courses.put(1, "Spring");
		courses.put(2, "Web Services");
		courses.put(3, "Design Patterns");

		return courses;
	}

}
