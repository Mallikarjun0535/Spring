package com.ac.dao;

import com.ac.bo.UserProfileBO;

public interface UserProfileDao {
	UserProfileBO getUserProfile(int userId);
}
