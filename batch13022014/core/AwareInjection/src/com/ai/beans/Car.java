package com.ai.beans;

import java.util.logging.Logger;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class Car implements BeanFactoryAware, BeanNameAware {
	private IEngine engine;
	private String beanName;
	private String beanId;
	private BeanFactory beanFactory;
	private Logger logger;

	public Car() {
		logger = Logger.getLogger(Car.class.getName());
	}

	public void run() {
		logger.info("entered into : " + beanName + ".run()");
		engine = beanFactory.getBean(beanId, IEngine.class);
		engine.start();
	}

	public void setBeanId(String beanId) {
		System.out.println("setBeanId()");
		this.beanId = beanId;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory()");
		this.beanFactory = beanFactory;
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

}
 