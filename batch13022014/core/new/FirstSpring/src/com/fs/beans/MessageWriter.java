package com.fs.beans;

public class MessageWriter {
	private IMessageProducer messageProducer;

	public void writeMessage(String msg) {
		String cmsg = null;

		cmsg = messageProducer.convert(msg);
		System.out.println(cmsg);
	}

	public void setMessageProducer(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}
}
