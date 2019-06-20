package com.um.service;

import java.util.List;

import com.um.dto.ProfileInfoDTO;

public interface ProfileManagementService {
	List<ProfileInfoDTO> getAllUserProfiles();

	ProfileInfoDTO getProfileInfo(int userId);

	void insert(ProfileInfoDTO dto);

	void update(ProfileInfoDTO dto);
}
