package com.ir.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car {
	private IEngine engine;
	private String engineId;

	public void run() {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ir/common/application-context.xml"));
		engine = factory.getBean(engineId, IEngine.class);

		engine.start();
		System.out.println("running....");
	}

	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}

}
