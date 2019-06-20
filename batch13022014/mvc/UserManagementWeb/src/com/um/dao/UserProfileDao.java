package com.um.dao;

import java.util.List;

import com.um.bo.UserProfileBO;

public interface UserProfileDao {
	List<UserProfileBO> getAllUsers();

	UserProfileBO getUserProfile(int userId);

	void insert(UserProfileBO bo);

	void update(UserProfileBO bo);
}
