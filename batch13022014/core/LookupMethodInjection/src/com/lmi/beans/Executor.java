package com.lmi.beans;

public class Executor {
	private String data;

	public void process() {
		System.out.println("hashcode : " + this.hashCode());
		System.out.println("data : " + data);
	}

	public void setData(String data) {
		this.data = data;
	}

}
