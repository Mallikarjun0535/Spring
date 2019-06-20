package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.EditEmpController;
import com.bpp.beans.ValueObjectBeanPostProcessor;

public class BPPTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bpp/common/application-context.xml"));
		
		// registering bean post process with ioc container
		((ConfigurableListableBeanFactory) factory)
				.addBeanPostProcessor(new ValueObjectBeanPostProcessor());

		EditEmpController eec = factory.getBean("editEmpController",
				EditEmpController.class);
		eec.editEmp(1, "Rama", 25422.23f, "rama@sriman.com");
	}
}
