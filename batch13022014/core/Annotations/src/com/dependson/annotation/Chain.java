package com.dependson.annotation;

import org.springframework.stereotype.Component;

@Component
public class Chain {

	public Chain() {
		System.out.println("Chain()");
	}

}
