package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlansReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args)
			throws Throwable {
		if (method.getName().equals("findPlans")) {
			System.out.println("age : " + args[0]);
			System.out.println("coverageType : " + args[1]);
			System.out.println("networkType : " + args[2]);
			return "plan2";
		}
		return null;
	}

}
