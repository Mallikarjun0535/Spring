package com.ta.aspect;

import org.aspectj.lang.JoinPoint;

public class ExceptionLoggingAspect {

	public void logExp(JoinPoint jp, IllegalArgumentException iae) {
		System.out.println("exection " + jp.getSignature().getName() + "("
				+ jp.getArgs()[0] + ") with message : " + iae.getMessage());
	}
}
