package com.um.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.um.command.UserCommand;
import com.um.dto.ProfileInfoDTO;
import com.um.service.ProfileManagementService;

public class EditUserController extends SimpleFormController {
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
		profileService.update(dto);
		mav = new ModelAndView();
		mav.addObject("userId", userCommand.getUserId());
		mav.setViewName("edit_success");

		return mav;
	}

	/**
	 * While rendering formView page It calls this method to create Command
	 */
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		String id = null;
		ProfileInfoDTO dto = null;
		UserCommand cmd = null;

		id = request.getParameter("id");
		dto = profileService.getProfileInfo(Integer.parseInt(id));
		cmd = new UserCommand();
		cmd.setUserId(dto.getUserId());
		cmd.setFirstNm(dto.getFirstName());
		cmd.setLastNm(dto.getLastName());
		cmd.setMobile(dto.getMobile());
		cmd.setEmail(dto.getEmail());

		return cmd;
	}

	public void setProfileService(ProfileManagementService profileService) {
		this.profileService = profileService;
	}

}
