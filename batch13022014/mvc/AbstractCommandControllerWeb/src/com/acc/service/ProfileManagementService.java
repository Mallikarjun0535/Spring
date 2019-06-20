package com.acc.service;

import java.util.List;

import com.acc.dto.ProfileInfoDTO;
import com.acc.dto.ProfileSearchDTO;

public interface ProfileManagementService {
	List<ProfileInfoDTO> search(ProfileSearchDTO searchDTO);
}
