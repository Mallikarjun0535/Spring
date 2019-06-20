package com.fs.beans;

public class PDFMessageProducerImpl implements IMessageProducer {
	@Override
	public String convert(String msg) {
		return "<pdf>" + msg + "</pdf>";
	}
}
