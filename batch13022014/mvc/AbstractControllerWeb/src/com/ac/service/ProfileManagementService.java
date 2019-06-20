package com.ac.service;

import com.ac.dto.ProfileInfoDTO;

public interface ProfileManagementService {
	ProfileInfoDTO getProfileInfo(int userId);
}
