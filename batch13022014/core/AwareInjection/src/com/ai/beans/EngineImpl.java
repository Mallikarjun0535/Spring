package com.ai.beans;

public class EngineImpl implements IEngine {
	private int id;
	private String type;

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void start() {
		System.out.println("starting ... Engine [id=" + id + ", type=" + type
				+ "]");
	}

}
