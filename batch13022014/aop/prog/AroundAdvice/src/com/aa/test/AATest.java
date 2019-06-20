package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import com.aa.beans.CacheAspect;
import com.aa.beans.Calculator;
import com.aa.beans.CommonDynamicPointcut;
//import com.aa.beans.LoggingAspect;
import com.aa.beans.LoggingStaticPointcut;

public class AATest {

	public static void main(String[] args) {

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());

		NameMatchMethodPointcut pc = new NameMatchMethodPointcut();
		pc.addMethodName("add");
		//pf.addAdvisor(new DefaultPointcutAdvisor(pc, new LoggingAspect()));

		Calculator proxy = (Calculator) pf.getProxy();

		/* Calculator proxy = new Calculator(); */
		System.out.println("Sum : " + proxy.add(100, 20));

		System.out.println("Multiply : " + proxy.multiply(10, 20));
	}
}
