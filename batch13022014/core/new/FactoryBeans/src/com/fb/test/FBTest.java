package com.fb.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class FBTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/fb/common/application-context.xml"));
		/*
		 * Alarm alarm = factory.getBean("alarm", Alarm.class); alarm.sayTime();
		 */
		Calendar cal1 = factory.getBean("cal", Calendar.class);
		Calendar cal2 = factory.getBean("cal", Calendar.class);
		System.out.println("cal1 == cal2 ? : " + (cal1 == cal2));
	}
}
