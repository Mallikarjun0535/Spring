package com.fs.beans;

public class HTMLMessageProducerImpl implements IMessageProducer {
	@Override
	public String convert(String msg) {
		return "<html><body>" + msg + "</body></html>";
	}
}
