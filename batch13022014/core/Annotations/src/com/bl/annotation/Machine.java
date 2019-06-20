package com.bl.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Machine {
	@PostConstruct
	public void startup() {
		System.out.println("startup...");
	}

	public void start() {
		System.out.println("Machine is running...");
	}

	@PreDestroy
	public void release() {
		System.out.println("released...");
	}
}
