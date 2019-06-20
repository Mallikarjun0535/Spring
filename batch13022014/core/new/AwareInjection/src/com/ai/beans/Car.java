package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car implements BeanFactoryAware {
	private String beanId;
	private IEngine engine;
	private BeanFactory factory;

	public Car() {
		System.out.println("Car()");
	}

	public void run() {
		engine = factory.getBean("engine", IEngine.class);
		engine.start();
		System.out.println("running...");
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
		System.out.println("setBeanId()");
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		this.factory = factory;
		System.out.println("setBeanFactory()... <Aware>");
	}

}
