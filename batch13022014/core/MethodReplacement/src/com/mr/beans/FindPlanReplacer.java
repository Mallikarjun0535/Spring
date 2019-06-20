package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlanReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args)
			throws Throwable {
		System.out.println("age : " + args[0]);
		System.out.println("networkType : " + args[2]);
		System.out.println("coverageType : " + args[1]);
		
		if (method.getName().equals("findPlan")) {
			return "jeevan saral";
		}
		return null;
	}

}
