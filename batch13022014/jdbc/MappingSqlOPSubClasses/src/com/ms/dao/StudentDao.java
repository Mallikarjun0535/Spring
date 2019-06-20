package com.ms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import com.ms.bo.StudentBO;

public class StudentDao {
	// sql queries
	private final String SQL_INS_STUDENT = "INSERT INTO STUDENT(STUDENT_ID, NAME) VALUES(?,?)";
	private final String SQL_GET_STUDENTS_BY_NAME = "SELECT STUDENT_ID, NAME FROM STUDENT WHERE NAME LIKE ?";

	// code
	private DataSource dataSource;
	private InsertStudent insertStudent;
	private GetStudentsByName a_GetStudentsByName;

	public StudentDao(DataSource dataSource) {
		this.dataSource = dataSource;
		insertStudent = new InsertStudent(dataSource);
		a_GetStudentsByName = new GetStudentsByName(dataSource);
	}

	public int insert(int id, String name) {
		return insertStudent.update(new Object[] { id, name });
	}

	public List<StudentBO> getAllStudentsByName(String name) {
		return a_GetStudentsByName.execute(new Object[] { "%" + name + "%" });
	}

	/**
	 * Inserting data int Student table
	 */
	private final class InsertStudent extends SqlUpdate {
		public InsertStudent(DataSource dataSource) {
			super(dataSource, SQL_INS_STUDENT);
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.VARCHAR));
			compile();
		}
	}

	private final class GetStudentsByName extends MappingSqlQuery<StudentBO> {

		public GetStudentsByName(DataSource dataSource) {
			super(dataSource, SQL_GET_STUDENTS_BY_NAME);
			declareParameter(new SqlParameter(Types.VARCHAR));
			compile();
		}

		@Override
		protected StudentBO mapRow(ResultSet rs, int index) throws SQLException {
			return new StudentBO(rs.getInt("STUDENT_ID"), rs.getString("NAME"));
		}

	}

}
