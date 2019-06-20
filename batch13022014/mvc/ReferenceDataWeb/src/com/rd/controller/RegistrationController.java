package com.rd.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.rd.command.RegisterCommand;

public class RegistrationController extends SimpleFormController {

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		return new ModelAndView("finish");
	}

	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map referenceDataMap = new HashMap();
		Map<Integer, String> courseMap = null;

		courseMap = new HashMap<Integer, String>();
		courseMap.put(1, "Spring");
		courseMap.put(2, "Web Services");
		courseMap.put(3, "Design Patterns");

		referenceDataMap.put("courses", courseMap);
		return referenceDataMap;
	}

}
