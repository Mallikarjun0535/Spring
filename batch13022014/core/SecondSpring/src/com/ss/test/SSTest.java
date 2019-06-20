package com.ss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ss.beans.EbayShop;
import com.ss.beans.ICourier;

public class SSTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ss/common/application-context.xml"));
		EbayShop es = factory.getBean("ebayShop", EbayShop.class);
		
		es.checkout(null, null);
	}
}
