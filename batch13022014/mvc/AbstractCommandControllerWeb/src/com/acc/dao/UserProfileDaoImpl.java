package com.acc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acc.bo.UserProfileBO;
import com.acc.bo.UserSearchBO;

public class UserProfileDaoImpl implements UserProfileDao {
	// queries
	private final String SEARCH_USER_PROFILE = "SELECT * FROM USERPROFILE WHERE (FIRST_NM IS NOT NULL AND FIRST_NM LIKE ?) OR (LAST_NM IS NOT NULL AND LAST_NM LIKE ?) OR (MOBILE IS NOT NULL AND MOBILE = ?) OR (EMAIL IS NOT NULL AND EMAIL LIKE ?)";
	// code
	private JdbcTemplate jdbcTemplate;

	public UserProfileDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<UserProfileBO> search(UserSearchBO searchBO) {
		return jdbcTemplate.query(SEARCH_USER_PROFILE,
				new UserProfileRowMapper(),
				new Object[] { searchBO.getFirstNm(), searchBO.getLastNm(),
						searchBO.getMobile(), searchBO.getEmail() });
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
