package com.npjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.npjdbc.bo.StudentBO;

public class StudentDao {
	// sql queries
	private final String SQL_COUNT_STUDENTS_BY_NAME = "SELECT COUNT(1) FROM STUDENT WHERE NAME LIKE :p_name";
	private final String SQL_GET_STUDENTS_BY_NAME = "SELECT STUDENT_ID, NAME FROM STUDENT WHERE NAME LIKE :p_name";
	private final String SQL_UPDATE_STUDENT = "UPDATE STUDENT SET NAME = :name WHERE STUDENT_ID = :id";

	// code
	private NamedParameterJdbcTemplate npJdbcTemplate;

	public StudentDao(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}

	public int getNoOfStudents(String name) {
		Map<String, Object> paramMap = null;

		paramMap = new HashMap<String, Object>();
		paramMap.put("p_name", "%" + name + "%");
		return npJdbcTemplate.queryForInt(SQL_COUNT_STUDENTS_BY_NAME, paramMap);
	}

	public List<StudentBO> getStudents(String name) {
		MapSqlParameterSource paramSource = null;

		paramSource = new MapSqlParameterSource();
		paramSource.addValue("p_name", "%" + name + "%");

		return npJdbcTemplate.query(SQL_GET_STUDENTS_BY_NAME, paramSource,
				new StudentRowMapper());
	}

	public int updateStudent(StudentBO sbo) {
		SqlParameterSource paramSource = null;
		
		paramSource = new BeanPropertySqlParameterSource(sbo);
		return npJdbcTemplate.update(SQL_UPDATE_STUDENT, paramSource);
	}

	private final class StudentRowMapper implements RowMapper<StudentBO> {
		@Override
		public StudentBO mapRow(ResultSet rs, int index) throws SQLException {
			return new StudentBO(rs.getInt("STUDENT_ID"), rs.getString("NAME"));
		}
	}

}
