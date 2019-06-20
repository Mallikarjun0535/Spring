package com.fs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fs.beans.HTMLMessageProducerImpl;
import com.fs.beans.IMessageProducer;
import com.fs.beans.MessageWriter;

public class FSTest {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		/*
		 * MessageWriter mw = new MessageWriter(); IMessageProducer
		 * messageProducer = new HTMLMessageProducerImpl();
		 * mw.setMessageProducer(messageProducer);
		 * mw.writeMessage("Welcome to Spring!");
		 */

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/fs/common/application-context.xml"));
		MessageWriter writer = (MessageWriter) factory.getBean("messageWriter");
		
		writer.writeMessage("Welcome to spring!");

	}
}
