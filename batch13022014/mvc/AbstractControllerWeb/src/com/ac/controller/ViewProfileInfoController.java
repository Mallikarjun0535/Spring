package com.ac.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ac.dto.ProfileInfoDTO;
import com.ac.service.ProfileManagementService;

public class ViewProfileInfoController extends AbstractController {
	private ProfileManagementService profileManagementService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ProfileInfoDTO profileInfoDto = null;
		String userId = null;
		ModelAndView mav = null;

		userId = request.getParameter("id");
		profileInfoDto = profileManagementService.getProfileInfo(Integer
				.parseInt(userId));

		mav = new ModelAndView();
		mav.addObject("profileInfo", profileInfoDto);
		mav.setViewName("profileInfo");

		return mav;
	}

	public void setProfileManagementService(
			ProfileManagementService profileManagementService) {
		this.profileManagementService = profileManagementService;
	}

}
