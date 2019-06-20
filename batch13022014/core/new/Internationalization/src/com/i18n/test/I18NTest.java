package com.i18n.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18NTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/i18n/common/application-context.xml");
		MessageSource source = context.getBean("messageSource",
				MessageSource.class);

		String msg = source.getMessage("key1", new Object[] { 10 },
				Locale.getDefault());
		System.out.println("msg : " + msg);
	}
}
