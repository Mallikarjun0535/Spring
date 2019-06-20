package com.sja.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sja.dao.SimpleStudentDao;

public class SJATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sja/common/application-context.xml");
		SimpleStudentDao ssdao = context.getBean("studentDao",
				SimpleStudentDao.class);
		/*
		 * System.out.println("No of rows affected : " + ssdao.insert(10,
		 * "Vibheeshan"));
		 */
		System.out.println("Name : " + ssdao.findName(10));
	}
}
