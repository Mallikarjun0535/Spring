package com.um.service;

import java.util.ArrayList;
import java.util.List;

import com.um.bo.UserProfileBO;
import com.um.dao.UserProfileDao;
import com.um.dto.ProfileInfoDTO;

public class ProfileManagementServiceImpl implements ProfileManagementService {
	private UserProfileDao userProfileDao;

	@Override
	public List<ProfileInfoDTO> getAllUserProfiles() {
		List<UserProfileBO> userBoList = null;
		List<ProfileInfoDTO> profileDtoList = null;

		userBoList = userProfileDao.getAllUsers();
		if (userBoList.size() > 0) {
			profileDtoList = new ArrayList<ProfileInfoDTO>();
		}
		for (UserProfileBO bo : userBoList) {
			profileDtoList.add(new ProfileInfoDTO(bo.getUserId(), bo
					.getFirstName(), bo.getLastName(), bo.getMobile(), bo
					.getEmail()));
		}
		return profileDtoList;
	}

	public ProfileInfoDTO getProfileInfo(int userId) {
		UserProfileBO profileBO = null;
		ProfileInfoDTO profileInfoDto = null;

		profileBO = userProfileDao.getUserProfile(userId);
		profileInfoDto = new ProfileInfoDTO(profileBO.getUserId(),
				profileBO.getFirstName(), profileBO.getLastName(),
				profileBO.getMobile(), profileBO.getEmail());
		return profileInfoDto;
	}

	@Override
	public void insert(ProfileInfoDTO dto) {
		UserProfileBO bo = null;

		bo = new UserProfileBO(dto.getUserId(), dto.getFirstName(),
				dto.getLastName(), dto.getMobile(), dto.getEmail());
		userProfileDao.insert(bo);
	}

	@Override
	public void update(ProfileInfoDTO dto) {
		UserProfileBO bo = null;

		bo = new UserProfileBO(dto.getUserId(), dto.getFirstName(),
				dto.getLastName(), dto.getMobile(), dto.getEmail());
		userProfileDao.update(bo);
	}

	public void setUserProfileDao(UserProfileDao userProfileDao) {
		this.userProfileDao = userProfileDao;
	}

}
