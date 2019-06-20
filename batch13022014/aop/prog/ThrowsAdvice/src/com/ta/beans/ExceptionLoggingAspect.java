package com.ta.beans;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLoggingAspect implements ThrowsAdvice {

	/*
	 * public void afterThrowing(Exception e) {
	 * System.out.println("Exception : " + e.getMessage()); }
	 */

	public void afterThrowing(Method method, Object[] args, Object target,
			IllegalArgumentException iae) {
		System.out.println("Exception reported by : " + method.getName() + "("
				+ args[0] + ")");
	}

	public void afterThrowing(IllegalArgumentException iae) {
		System.out.println("IAE Exception : " + iae.getMessage());
	}
 
}
