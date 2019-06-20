package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.beans.ExceptionLoggingAspect;

import com.ta.beans.Thrower;

public class TATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Thrower());
		pf.addAdvice(new ExceptionLoggingAspect());

		Thrower proxy = (Thrower) pf.getProxy();
		System.out.println("I : " + proxy.echo(1));
		System.out.println("I : " + proxy.echo(-1));
	}
}
