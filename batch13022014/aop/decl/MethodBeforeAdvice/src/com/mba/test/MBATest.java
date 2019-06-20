package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mba.beans.LoanApprover;
import com.mba.util.SecurityHelper;

public class MBATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mba/common/application-context.xml");
		SecurityHelper helper = context.getBean("securityHelper",
				SecurityHelper.class);
		LoanApprover la = context.getBean("loanApprover", LoanApprover.class);
		helper.login("john", "welcome1");
		System.out.println("Approved ? : " + la.approveLoan(1));
		helper.logout();
	}
}
