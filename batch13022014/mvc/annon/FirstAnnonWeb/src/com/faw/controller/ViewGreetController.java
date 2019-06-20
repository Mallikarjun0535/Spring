package com.faw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewGreetController {

	/*@RequestMapping("/greet.htm")
	public ModelAndView showGreet(HttpServletRequest req,
			HttpServletResponse response) {
		ModelAndView mav = null;

		mav = new ModelAndView();
		mav.addObject("person", "Rama");
		mav.setViewName("greet");
		return mav;
	}*/
	
	@RequestMapping("/greet.htm")
	public String showGreet(ModelMap model) {

		model.addAttribute("person", "Rama");
		return "greet";
	}
}
