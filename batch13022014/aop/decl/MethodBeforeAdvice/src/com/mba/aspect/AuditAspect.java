package com.mba.aspect;

import org.aspectj.lang.JoinPoint;

import com.mba.util.SecurityHelper;

public class AuditAspect {
	private SecurityHelper securityHelper;

	public void audit(JoinPoint joinPoint) {
		String methodName = null;
		Object[] args = null;

		methodName = joinPoint.getSignature().getName();
		args = joinPoint.getArgs();

		System.out.println("Called " + methodName + "(" + args[0] + ") by "
				+ securityHelper.getLoggedInUser());
	}

	public void validateUser(JoinPoint joinPoint) throws Throwable {
		if (securityHelper.isAuthenticated() == false) {
			throw new IllegalAccessException("Invalid Un/Pwd");
		}
	}

	public void setSecurityHelper(SecurityHelper securityHelper) {
		this.securityHelper = securityHelper;
	}

}
