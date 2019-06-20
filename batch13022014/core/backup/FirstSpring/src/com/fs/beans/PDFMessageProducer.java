package com.fs.beans;

public class PDFMessageProducer implements IMessageProducer {

	@Override
	public String convert(String msg) {
		return "<pdf>" + msg + "</pdf>";
	}

}
