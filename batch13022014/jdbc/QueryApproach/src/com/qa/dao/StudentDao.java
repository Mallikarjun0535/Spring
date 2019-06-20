package com.qa.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.qa.bo.StudentBO;

public class StudentDao {
	// sql queries
	private final String SQL_COUNT_ALL_STUDENTS = "SELECT COUNT(1) FROM STUDENT";
	private final String SQL_FIND_NAME_BY_ID = "SELECT NAME FROM STUDENT WHERE STUDENT_ID = ?";
	private final String SQL_GET_STUDENT_BY_ID = "SELECT STUDENT_ID, NAME FROM STUDENT WHERE STUDENT_ID = ?";
	private final String SQL_GET_ALL_STUDENTS = "SELECT STUDENT_ID, NAME FROM STUDENT ORDER BY STUDENT_ID";
	private final String SQL_GET_STUDENT = "SELECT STUDENT_ID, NAME FROM STUDENT";
	private final String SQL_INSERT_STUDENT = "INSERT INTO STUDENT(STUDENT_ID, NAME) VALUES(?,?)";

	// code
	private JdbcTemplate jdbcTemplate;

	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getCountOfStudent() {
		return jdbcTemplate.queryForInt(SQL_COUNT_ALL_STUDENTS);
	}

	public String findName(int id) {
		return jdbcTemplate.queryForObject(SQL_FIND_NAME_BY_ID, String.class,
				new Object[] { id });
	}

	public StudentBO getStudentById(int id) {
		return jdbcTemplate.queryForObject(SQL_GET_STUDENT_BY_ID,
				new Object[] { id }, new StudentRowMapper());
	}

	public List<StudentBO> getAllStudents() {
		return jdbcTemplate.query(SQL_GET_ALL_STUDENTS, new StudentRowMapper());
	}

	public List<StudentBO> getStudentsByPazination(int pageSize, int totalRows,
			int currentPage) {
		return jdbcTemplate.query(SQL_GET_ALL_STUDENTS,
				new StudentResultExtractor(currentPage, totalRows, pageSize));
	}

	public List<Map<String, Object>> getStudents() {
		return jdbcTemplate.queryForList(SQL_GET_STUDENT);
	}

	public int insert(int id, String name) {
		return jdbcTemplate.update(SQL_INSERT_STUDENT,
				new Object[] { id, name });
	}

	private final class StudentRowMapper implements RowMapper<StudentBO> {
		@Override
		public StudentBO mapRow(ResultSet rs, int rowIndex) throws SQLException {
			return new StudentBO(rs.getInt("STUDENT_ID"), rs.getString("NAME"));
		}
	}

	private final class StudentResultExtractor implements
			ResultSetExtractor<List<StudentBO>> {
		private int currentPage;
		private int totalRows;
		private int pageSize;

		public StudentResultExtractor(int currentPage, int totalRows,
				int pageSize) {
			this.currentPage = currentPage;
			this.totalRows = totalRows;
			this.pageSize = pageSize;
		}

		@Override
		public List<StudentBO> extractData(ResultSet rs) throws SQLException,
				DataAccessException {
			int startIndex = 0;
			int row = 1;
			List<StudentBO> students = null;

			startIndex = ((pageSize) * (currentPage - 1)) + 1;
			students = new ArrayList<StudentBO>();

			while (rs.next()) {
				if (row >= startIndex && row < (startIndex + pageSize)) {
					students.add(new StudentBO(rs.getInt("STUDENT_ID"), rs
							.getString("NAME")));
				}
				if (row >= (startIndex + pageSize)) {
					break;
				}
				row++;
			}

			return students;
		}
	}

	public void insertBatch(final List<StudentBO> students) {
		jdbcTemplate.batchUpdate(SQL_INSERT_STUDENT, new StudentBatchInsert(
				students));
	}

	private final class StudentBatchInsert implements
			BatchPreparedStatementSetter {
		private List<StudentBO> students;

		public StudentBatchInsert(List<StudentBO> students) {
			this.students = students;
		}

		@Override
		public int getBatchSize() {
			return students.size();
		}

		@Override
		public void setValues(PreparedStatement pstmt, int index)
				throws SQLException {
			pstmt.setInt(1, students.get(index).getId());
			pstmt.setString(2, students.get(index).getName());
		}

	}

}
