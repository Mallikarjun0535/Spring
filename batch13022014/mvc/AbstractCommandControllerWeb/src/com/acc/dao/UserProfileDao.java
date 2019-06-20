package com.acc.dao;

import java.util.List;

import com.acc.bo.UserProfileBO;
import com.acc.bo.UserSearchBO;

public interface UserProfileDao {
	List<UserProfileBO> search(UserSearchBO searchBO);
}
