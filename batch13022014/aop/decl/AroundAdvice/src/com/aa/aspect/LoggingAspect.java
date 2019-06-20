package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	public Object log(ProceedingJoinPoint pjp, int x, int y) throws Throwable {
		String methodName = null;
		Object[] args = null;
		boolean isFirst = true;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();

		System.out.println("entered into " + methodName + "(" + x + "," + y
				+ ")");
		/*
		 * for (Object arg : args) { if (isFirst) { System.out.print(arg);
		 * isFirst = false; continue; } System.out.print("," + arg); }
		 * System.out.println(")");
		 */Object ret = pjp.proceed();

		System.out.println("exiting from " + methodName
				+ " with returnValue : " + ret);
		return ret;
	}
}
