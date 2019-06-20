package com.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ara.beans.DiscountAspect;
import com.ara.beans.ShoppingMall;
import com.ara.common.MemberCard;

public class ARATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new ShoppingMall());
		pf.addAdvice(new DiscountAspect());

		ShoppingMall proxy = (ShoppingMall) pf.getProxy();
		MemberCard mc = new MemberCard();
		mc.setCardNo("224122");
		mc.setType("GOLD");

		float amt = proxy.generateBill(null, mc);
		System.out.println("amt : " + amt);
	}
}
