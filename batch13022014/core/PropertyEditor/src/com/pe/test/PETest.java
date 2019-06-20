package com.pe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pe.beans.Calculator;
import com.pe.beans.ComplexNumberPropertyEditorRegistrar;

public class PETest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/pe/common/application-context.xml"));
		((ConfigurableListableBeanFactory) factory)
				.addPropertyEditorRegistrar(new ComplexNumberPropertyEditorRegistrar());
		
		Calculator c = factory.getBean("cal", Calculator.class);
		System.out.println(c);
	}
}
