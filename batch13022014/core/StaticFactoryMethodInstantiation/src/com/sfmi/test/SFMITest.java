package com.sfmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sfmi.beans.Alarm;

public class SFMITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/sfmi/common/application-context.xml"));
		Alarm alarm = factory.getBean("alarm", Alarm.class);
		alarm.sayTime();
	}
}
