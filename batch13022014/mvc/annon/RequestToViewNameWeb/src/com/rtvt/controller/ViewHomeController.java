package com.rtvt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewHomeController {

	/*
	 * @RequestMapping("/home.htm") public void showHome(Map<String, Object>
	 * model) { model.put("person", "Rama"); }
	 */

	@RequestMapping("/home.htm")
	public Map<String, Object> showHome() {
		Map<String, Object> model = null;

		model = new HashMap<String, Object>();
		model.put("person", "Rama");
		return model;
	}
}
