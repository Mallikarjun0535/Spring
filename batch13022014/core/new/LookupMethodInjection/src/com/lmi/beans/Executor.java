package com.lmi.beans;

public class Executor {
	private String data;

	public void execute() {
		System.out.println("executing with data : " + data + " hashcode : "
				+ this.hashCode());
	}

	public void setData(String data) {
		this.data = data;
	}

}
