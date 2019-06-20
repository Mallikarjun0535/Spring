package com.acc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acc.command.SearchCommand;
import com.acc.dto.StudDTO;

@Controller
public class SearchStudentController {

	@RequestMapping("/dosearch.htm")
	public String doSearch(ModelMap model,
			@ModelAttribute SearchCommand command, BindingResult errors) {
		List<StudDTO> students = null;

		students = new ArrayList<StudDTO>();
		students.add(new StudDTO("1", "Modi"));
		students.add(new StudDTO("2", "Babu"));
		students.add(new StudDTO("3", "Kcr"));

		model.addAttribute("students", students);

		return "studlist";
	}
}
