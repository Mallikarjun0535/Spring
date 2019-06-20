package com.aa.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Pointcut("execution(* com.aa.beans.*.*(..))")
	public void myPointcut() {

	}

	@Pointcut("execution(* com.aa.beans.*.*(..)) && args(x,y)")
	public void logPointcut(int x, int y) {

	}

	@Around("logPointcut(x,y)")
	public Object log(ProceedingJoinPoint pjp, int x, int y) throws Throwable {
		String methodName = null;
		Object[] args = null;
		boolean isFirst = true;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();
		System.out.println("x : " + x + " y : " + y);
		System.out.println("entered into " + methodName + "(");
		for (Object arg : args) {
			if (isFirst) {
				System.out.print(arg);
				isFirst = false;
				continue;
			}
			System.out.print("," + arg);
		}
		System.out.println(")");
		Object ret = pjp.proceed();

		System.out.println("exiting from " + methodName
				+ " with returnValue : " + ret);
		return ret;
	}

	@Before("myPointcut()")
	public void audit(JoinPoint jp) {
		System.out.println("called  " + jp.getSignature().getName()
				+ " by user1");
	}
}
