package com.ca.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ca.bo.StudentBO;
import com.ca.dao.StudentDao;

public class CATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ca/common/application-context.xml");
		StudentDao sdao = context.getBean("studentDao", StudentDao.class);
		List<StudentBO> students = sdao.getAllStudents();
		for (StudentBO student : students) {
			System.out.println(student);
		}

	}
}
