package com.ara.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class CheckKeyAspect implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object ret, Method method, Object[] args,
			Object target) throws Throwable {
		if ((Integer) ret <= 0) {
			throw new IllegalArgumentException(
					"Invalid len, so weak key generated");
		}
	}

}
