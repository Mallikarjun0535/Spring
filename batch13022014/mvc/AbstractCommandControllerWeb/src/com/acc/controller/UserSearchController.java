package com.acc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.acc.command.SearchCriteria;
import com.acc.dto.ProfileInfoDTO;
import com.acc.dto.ProfileSearchDTO;
import com.acc.service.ProfileManagementService;

public class UserSearchController extends AbstractCommandController {
	private ProfileManagementService profileManagementService;

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object obj,
			BindException bindException) throws Exception {
		ModelAndView mav = null;
		SearchCriteria command = null;
		ProfileSearchDTO searchDto = null;
		List<ProfileInfoDTO> profileDtoList = null;

		command = (SearchCriteria) obj;
		searchDto = new ProfileSearchDTO(command.getFirstNm(),
				command.getLastNm(), command.getMobile(), command.getEmail());
		profileDtoList = profileManagementService.search(searchDto);

		mav = new ModelAndView();
		mav.addObject("profiles", profileDtoList);
		mav.setViewName("searchresult");

		return mav;
	}

	public void setProfileManagementService(
			ProfileManagementService profileManagementService) {
		this.profileManagementService = profileManagementService;
	}

}
