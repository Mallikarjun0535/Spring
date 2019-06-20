package com.i18n.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18NTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/i18n/common/application-context.xml");
		/*
		 * String message = context.getMessage("key1", null, "Default Message",
		 * Locale.getDefault());
		 */
		MessageSource messageSource = context.getBean("messageSource",
				MessageSource.class);
		String message = messageSource.getMessage("key1", null,
				Locale.getDefault());
		System.out.println(message);
	}
}
