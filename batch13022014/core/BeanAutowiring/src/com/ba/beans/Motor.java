package com.ba.beans;

public class Motor {
	private Engine engine;
	private Belt belt;

	public Motor(Belt belt) {
		this.belt = belt;
	}

	public Motor(Engine engine) {
		System.out.println("Motor(engine)");
		this.engine = engine;
	}

	public Motor() {
		System.out.println("Motor()");
	}

	@Override
	public String toString() {
		return "Motor [engine=" + engine + ", belt=" + belt + "]";
	}

}
