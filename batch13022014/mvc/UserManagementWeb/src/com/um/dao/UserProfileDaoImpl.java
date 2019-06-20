package com.um.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.um.bo.UserProfileBO;

public class UserProfileDaoImpl implements UserProfileDao {
	// queries
	private final String SELECT_ALL_USER_PROFILE = "SELECT * FROM USERPROFILE";
	private final String INSERT_USER_PROFILE = "INSERT INTO USERPROFILE(USER_ID, FIRST_NM, LAST_NM, MOBILE, EMAIL) VALUES(?,?,?,?,?)";
	private final String UPDATE_USER_PROFILE = "UPDATE USERPROFILE SET FIRST_NM = ?, LAST_NM=?, MOBILE=?, EMAIL=? WHERE USER_ID = ?";
	private final String SQL_GET_USER_PROFILE_BY_ID = "SELECT USER_ID, FIRST_NM, LAST_NM, MOBILE, EMAIL FROM USERPROFILE WHERE USER_ID = ?";
	
	// code
	private JdbcTemplate jdbcTemplate;

	public UserProfileDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<UserProfileBO> getAllUsers() {
		return jdbcTemplate.query(SELECT_ALL_USER_PROFILE,
				new UserProfileRowMapper());
	}
	
	@Override
	public UserProfileBO getUserProfile(int userId) {
		return jdbcTemplate.queryForObject(SQL_GET_USER_PROFILE_BY_ID,
				new UserProfileRowMapper(), new Object[] { userId });
	}



	@Override
	public void insert(UserProfileBO bo) {
		jdbcTemplate.update(
				INSERT_USER_PROFILE,
				new Object[] { bo.getUserId(), bo.getFirstName(),
						bo.getLastName(), bo.getMobile(), bo.getEmail() });
	}

	@Override
	public void update(UserProfileBO bo) {
		jdbcTemplate.update(
				UPDATE_USER_PROFILE,
				new Object[] { bo.getFirstName(), bo.getLastName(),
						bo.getMobile(), bo.getEmail(), bo.getUserId() });
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
