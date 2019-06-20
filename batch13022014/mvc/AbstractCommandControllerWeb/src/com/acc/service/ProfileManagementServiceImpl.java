package com.acc.service;

import java.util.ArrayList;
import java.util.List;

import com.acc.bo.UserProfileBO;
import com.acc.bo.UserSearchBO;
import com.acc.dao.UserProfileDao;
import com.acc.dto.ProfileInfoDTO;
import com.acc.dto.ProfileSearchDTO;

public class ProfileManagementServiceImpl implements ProfileManagementService {
	private UserProfileDao userProfileDao;

	@Override
	public List<ProfileInfoDTO> search(ProfileSearchDTO searchDTO) {
		UserSearchBO searchBO = null;
		List<UserProfileBO> userBoList = null;
		List<ProfileInfoDTO> profileDtoList = null;

		searchBO = new UserSearchBO(searchDTO.getFirstNm(),
				searchDTO.getLastNm(), searchDTO.getMobile(),
				searchDTO.getEmail());
		userBoList = userProfileDao.search(searchBO);
		if(userBoList.size() > 0) {
			profileDtoList = new ArrayList<ProfileInfoDTO>();
		}
		for (UserProfileBO bo : userBoList) {
			profileDtoList.add(new ProfileInfoDTO(bo.getUserId(), bo
					.getFirstName(), bo.getLastName(), bo.getMobile(), bo
					.getEmail()));
		}
		return profileDtoList;
	}

	public void setUserProfileDao(UserProfileDao userProfileDao) {
		this.userProfileDao = userProfileDao;
	}

}
