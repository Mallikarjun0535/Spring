package com.faw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewWelcomeController {

	@RequestMapping("/welcome.htm")
	public String showWelcome() {
		return "welcome";
	}
}
