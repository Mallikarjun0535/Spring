package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.Math;
import com.bl.beans.ShutdownHook;

public class BLTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bl/common/application-context.xml"));
		ShutdownHook shk = factory.getBean("shutdownHook", ShutdownHook.class);
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new Thread(shk));
		
		Math m = factory.getBean("math", Math.class);
		System.out.println(m);
	}
}
