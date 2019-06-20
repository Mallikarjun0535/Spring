package com.sfc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sfc.command.InsertUserCommand;

public class InsertUserController extends SimpleFormController {

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		String id = null;
		InsertUserCommand cmd = null;

		id = request.getParameter("userId");
		// database
		cmd = new InsertUserCommand();
		cmd.setId(Integer.parseInt(id));
		cmd.setFirstNm("John");
		cmd.setLastNm("Mathew");
		cmd.setMobile(4244141L);
		cmd.setEmail("xyz@abc.com");

		return cmd;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ModelAndView mav = null;
		InsertUserCommand insertUserCommand = null;

		insertUserCommand = (InsertUserCommand) command;
		
		// send sms
		if(insertUserCommand.getMobile() == 111111111) {
			errors.rejectValue("mobile", "mobile.msgfailed");
			return showForm(request, response, errors);
		}

		mav = new ModelAndView();
		mav.addObject("userId", insertUserCommand.getId());
		mav.setViewName("success");

		return mav;
	}

	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return new ModelAndView("duplicateform");
	}
	
	
}


