package com.ew.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ew.dto.StudentDTO;

public class DownloadStudentDataController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<StudentDTO> students = null;
		ModelAndView mav = null;

		students = new ArrayList<StudentDTO>();
		students.add(new StudentDTO("1", "Rama"));
		students.add(new StudentDTO("2", "Sita"));
		students.add(new StudentDTO("3", "Bharatha"));
		students.add(new StudentDTO("4", "Lakshmana"));

		mav = new ModelAndView();
		mav.addObject("students", students);
		mav.setViewName("studentexcel");

		return mav;
	}

}
