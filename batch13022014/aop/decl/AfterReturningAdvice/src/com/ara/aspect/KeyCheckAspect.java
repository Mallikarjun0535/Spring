package com.ara.aspect;

import org.aspectj.lang.JoinPoint;

public class KeyCheckAspect {
	public void checkKey(JoinPoint joinPoint, Object ret) {
		if ((Integer) ret <= 0) {
			throw new IllegalArgumentException("Invalid key length");
		}
	}
}
