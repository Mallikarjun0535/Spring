package com.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ara.beans.CheckKeyAspect;
import com.ara.beans.KeyGenerator;

public class ARATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new KeyGenerator());
		pf.addAdvice(new CheckKeyAspect());

		KeyGenerator proxy = (KeyGenerator) pf.getProxy();
		System.out.println("Key : " + proxy.generateKey(9));
		System.out.println("Key : " + proxy.generateKey(7));
	}
}
