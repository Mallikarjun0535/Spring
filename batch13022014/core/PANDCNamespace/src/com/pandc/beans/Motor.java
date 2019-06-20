package com.pandc.beans;

public class Motor {
	private Engine engine;

	public Motor(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Motor [engine=" + engine + "]";
	}

}
