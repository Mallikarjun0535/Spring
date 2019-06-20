package com.ac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ac.bo.UserProfileBO;

public class UserProfileDaoImpl implements UserProfileDao {
	// queries
	private final String SQL_GET_USER_PROFILE_BY_ID = "SELECT USER_ID, FIRST_NM, LAST_NM, MOBILE, EMAIL FROM USERPROFILE WHERE USER_ID = ?";

	// code
	private JdbcTemplate jdbcTemplate;

	public UserProfileDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public UserProfileBO getUserProfile(int userId) {
		return jdbcTemplate.queryForObject(SQL_GET_USER_PROFILE_BY_ID,
				new UserProfileRowMapper(), new Object[] { userId });
	}

	private final class UserProfileRowMapper implements
			RowMapper<UserProfileBO> {
		@Override
		public UserProfileBO mapRow(ResultSet rs, int index)
				throws SQLException {
			return new UserProfileBO(rs.getInt("USER_ID"),
					rs.getString("FIRST_NM"), rs.getString("LAST_NM"),
					rs.getLong("MOBILE"), rs.getString("EMAIL"));
		}
	}

}
