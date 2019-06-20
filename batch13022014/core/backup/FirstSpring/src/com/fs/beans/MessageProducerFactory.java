package com.fs.beans;

public class MessageProducerFactory {
	public static IMessageProducer getMessageProducer(String type) {
		IMessageProducer messageProducer = null;

		if (type.equals("html")) {
			messageProducer = new HTMLMessageProducer();
		} else if (type.equals("pdf")) {
			messageProducer = new PDFMessageProducer();
		}

		return messageProducer;
	}

}
