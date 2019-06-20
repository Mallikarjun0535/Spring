package com.ms.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ms.bo.StudentBO;
import com.ms.dao.StudentDao;

public class MSTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ms/common/application-context.xml");
		StudentDao sdao = context.getBean("studentDao", StudentDao.class);
		// System.out.println("rows affected : " + sdao.insert(11, "Lava"));
		List<StudentBO> students = sdao.getAllStudentsByName("n");
		for (StudentBO bo : students) {
			System.out.println(bo);
		}
	}
}
