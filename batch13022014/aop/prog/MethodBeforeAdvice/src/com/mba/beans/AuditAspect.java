package com.mba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.mba.util.SecurityManager;

public class AuditAspect implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		boolean isFirst = true;
		String methodName = null;
		SecurityManager sm = null;

		sm = SecurityManager.getInstance();
		methodName = method.getName();
		System.out.print("Called " + methodName + "(");
		for (Object arg : args) {
			if (isFirst) {
				System.out.print(arg);
				isFirst = false;
				continue;
			}
			System.out.print("," + arg);
		}
		System.out.println(") by " + sm.getLoggedInUser());
	}

}
