package com.mba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.mba.util.SecurityManager;

public class SecurityAspect implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		SecurityManager sm = null;

		sm = SecurityManager.getInstance();
		if (sm.isAuthenticated() == false) {
			throw new IllegalAccessException("Invalid User/Pwd");
		}
	}
}
