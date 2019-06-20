package com.um.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.um.command.UserCommand;
import com.um.dto.ProfileInfoDTO;
import com.um.service.ProfileManagementService;

public class InsertUserController extends SimpleFormController {
	private ProfileManagementService profileService;

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		UserCommand userCommand = null;
		ProfileInfoDTO dto = null;
		ModelAndView mav = null;

		userCommand = (UserCommand) command;
		dto = new ProfileInfoDTO(userCommand.getUserId(),
				userCommand.getFirstNm(), userCommand.getLastNm(),
				userCommand.getMobile(), userCommand.getEmail());
		profileService.insert(dto);

		mav = new ModelAndView();
		mav.addObject("userId", userCommand.getUserId());
		mav.setViewName("insert_success");

		return mav;
	}

	public void setProfileService(ProfileManagementService profileService) {
		this.profileService = profileService;
	}

}
