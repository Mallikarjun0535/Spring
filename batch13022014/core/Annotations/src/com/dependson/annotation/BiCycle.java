package com.dependson.annotation;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@DependsOn("chain")
@Component
public class BiCycle {

	public BiCycle() {
		System.out.println("BiCycle");
	}

}
