package com.sja.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class SimpleStudentDao {
	// sql
	private final String PROC_FIND_STUDENT_NM_BY_ID = "GETSTUDENTDETAIL";

	// code
	private DataSource dataSource;

	public SimpleStudentDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int insert(int id, String name) {
		MapSqlParameterSource paramSource = null;
		SimpleJdbcInsert sji = null;

		paramSource = new MapSqlParameterSource();
		paramSource.addValue("STUDENT_ID", id);
		paramSource.addValue("NAME", name);

		sji = new SimpleJdbcInsert(dataSource);
		sji.setTableName("STUDENT");
		return sji.execute(paramSource);
	}

	public String findName(int id) {
		String name = null;
		SimpleJdbcCall sjc = null;

		sjc = new SimpleJdbcCall(dataSource);
		sjc.withProcedureName(PROC_FIND_STUDENT_NM_BY_ID);
		Map<String, Object> returnMap = sjc.execute(new MapSqlParameterSource(
				"P_ID", id));
		name = (String) returnMap.get("O_NAME");

		return name;
	}

}
