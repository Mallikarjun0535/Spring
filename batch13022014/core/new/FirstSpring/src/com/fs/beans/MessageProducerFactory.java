package com.fs.beans;

import java.util.ResourceBundle;

public class MessageProducerFactory {
	/*
	 * Version - 1.0 public static IMessageProducer getMessageProducer(String
	 * type) { if (type.equals("html")) { return new HTMLMessageProducerImpl();
	 * } else if (type.equals("pdf")) { return new PDFMessageProducerImpl(); }
	 * return null; }
	 */

	public static IMessageProducer getMessageProducer()
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		ResourceBundle rb = null;
		String className = null;
		Object obj = null;

		rb = ResourceBundle.getBundle("com/fs/common/appClasses");
		className = rb.getString("IMessageProducer.class");
		obj = Class.forName(className).newInstance();

		return (IMessageProducer) obj;
	}
}
