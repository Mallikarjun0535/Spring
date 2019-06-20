package com.qa.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.bo.StudentBO;
import com.qa.dao.StudentDao;

public class QATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/qa/common/application-context.xml");
		StudentDao sdao = context.getBean("studentDao", StudentDao.class);
		// System.out.println("No of students : " + sdao.getCountOfStudent());
		// System.out.println("Name : " + sdao.findName(1));
		// System.out.println(sdao.getStudentById(1));
		/*List<StudentBO> students = sdao.getAllStudents();*/
		/*List<StudentBO> students = sdao.getStudentsByPazination(2, sdao.getCountOfStudent(), 3);
		for (StudentBO stud : students) {
			System.out.println(stud);
		}*/
		
		/*List<Map<String, Object>> paramList = sdao.getStudents();
		System.out.println(paramList);*/
		
		List<StudentBO> insertStudents = new ArrayList<StudentBO>();
		insertStudents.add(new StudentBO(7, "Bharatha"));
		insertStudents.add(new StudentBO(8, "Sugriva"));
		insertStudents.add(new StudentBO(9, "Vaali"));
		
		sdao.insertBatch(insertStudents);
		
		List<StudentBO> students = sdao.getAllStudents();
		for (StudentBO stud : students) {
			System.out.println(stud);
		}
	}
}
