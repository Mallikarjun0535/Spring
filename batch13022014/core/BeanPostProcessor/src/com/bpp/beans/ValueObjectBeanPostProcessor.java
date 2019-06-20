package com.bpp.beans;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ValueObjectBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization(" + beanName + ")");
		if (obj instanceof AbstractBaseVO) {
			((AbstractBaseVO) obj).setLastModifiedDt(new Date());
		}
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String beanName)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization(" + beanName + ")");
		return obj;
	}
}
