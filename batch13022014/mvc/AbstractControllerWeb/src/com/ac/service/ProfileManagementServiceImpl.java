package com.ac.service;

import com.ac.bo.UserProfileBO;
import com.ac.dao.UserProfileDao;
import com.ac.dto.ProfileInfoDTO;

public class ProfileManagementServiceImpl implements ProfileManagementService {
	private UserProfileDao userProfileDao;

	@Override
	public ProfileInfoDTO getProfileInfo(int userId) {
		UserProfileBO profileBO = null;
		ProfileInfoDTO profileInfoDto = null;

		profileBO = userProfileDao.getUserProfile(userId);
		profileInfoDto = new ProfileInfoDTO(profileBO.getUserId(),
				profileBO.getFirstName(), profileBO.getLastName(),
				profileBO.getMobile(), profileBO.getEmail());
		return profileInfoDto;
	}

	public void setUserProfileDao(UserProfileDao userProfileDao) {
		this.userProfileDao = userProfileDao;
	}

}
