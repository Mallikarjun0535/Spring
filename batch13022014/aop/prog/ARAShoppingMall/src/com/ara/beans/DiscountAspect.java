package com.ara.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.ara.common.MemberCard;

public class DiscountAspect implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object ret, Method method, Object[] args,
			Object target) throws Throwable {
		MemberCard mc = null;
		float amt = 0.0f;

		amt = (Float) ret;
		mc = (MemberCard) args[1];

		if (mc.getType().equals("GOLD") && amt > 2000) {
			System.out
					.println("Congratulations! You got a discount of 10%, which can be availed in your next purchase. Coupon Code : cp10");
		} else if(mc.getType().equals("SILVER") && amt > 3000) {
			System.out
			.println("Congratulations! You got a discount of 5%, which can be availed in your next purchase. Coupon Code : cp5");
		}
	}
}
