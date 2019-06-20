package com.stereotype.annotation;

import javax.inject.Named;


@Named
public class Car {

	public Car() {
		System.out.println("Car() created");
	}

	public void run() {
		System.out.println("running...");
	}
}
