package com.ifm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ifm.beans.GoogleMapRenderer;

public class IFMTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ifm/common/application-context.xml"));
		GoogleMapRenderer gmr = factory.getBean("googleMapRenderer",
				GoogleMapRenderer.class);
		gmr.render("src1", "dest1");
	}
}
