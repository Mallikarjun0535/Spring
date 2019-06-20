/*package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		boolean isFirst = true;

		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();

		*//**
		 * Code before Target class method execution
		 *//*
		System.out.print("entered into " + methodName + "(");
		for (Object arg : args) {
			if (isFirst) {
				System.out.print(arg);
				isFirst = false;
				continue;
			}
			System.out.print("," + arg);
		}
		System.out.println(")");
		args[0] = (Integer) args[0] + 1;
		args[1] = (Integer) args[1] + 1;

		Object ret = methodInvocation.proceed();

		System.out.println("exiting from " + methodName
				+ " with return value : " + ret);
		ret = (Integer) ret + 1;

		return ret;
	}

}
*/