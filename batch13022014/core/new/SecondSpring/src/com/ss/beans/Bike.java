package com.ss.beans;

public class Bike {
	private IEngine engine;

	public void ride() {
		engine.start();
		System.out.println("running..");
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

}
