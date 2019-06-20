package com.um.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.um.dto.ProfileInfoDTO;
import com.um.service.ProfileManagementService;

public class ListProfilesController extends AbstractController {
	private ProfileManagementService service;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<ProfileInfoDTO> profileDtos = null;
		ModelAndView mav = null;

		profileDtos = service.getAllUserProfiles();
		mav = new ModelAndView();
		mav.addObject("profiles", profileDtos);
		mav.setViewName("listusers");

		return mav;
	}

	public void setService(ProfileManagementService service) {
		this.service = service;
	}

}
