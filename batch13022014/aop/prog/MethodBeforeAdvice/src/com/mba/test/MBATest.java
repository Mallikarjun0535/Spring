package com.mba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.mba.beans.AuditAspect;
import com.mba.beans.LoanApprover;
import com.mba.beans.SecurityAspect;
import com.mba.util.SecurityManager;

public class MBATest {
	public static void main(String[] args) {
		SecurityManager sm = null;
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanApprover());
		pf.addAdvice(new AuditAspect());
		pf.addAdvice(new SecurityAspect());

		sm = SecurityManager.getInstance();
		sm.login("john", "welcome1");
		LoanApprover la = (LoanApprover) pf.getProxy();
		System.out.println("approved ? : " + la.approveLoan(10));
		sm.logout();
	}
}
