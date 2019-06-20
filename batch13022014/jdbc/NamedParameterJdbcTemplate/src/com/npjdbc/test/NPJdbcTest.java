package com.npjdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.npjdbc.bo.StudentBO;
import com.npjdbc.dao.StudentDao;

public class NPJdbcTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/npjdbc/common/application-context.xml");
		StudentDao sdao = context.getBean("studentDao", StudentDao.class);
		// System.out.println("No of students : " + sdao.getNoOfStudents("H"));
		
		sdao.updateStudent(new StudentBO(5, "Vilan Ravana"));

		List<StudentBO> students = sdao.getStudents("i");
		for (StudentBO s : students) {
			System.out.println(s);
		}
	}
}
