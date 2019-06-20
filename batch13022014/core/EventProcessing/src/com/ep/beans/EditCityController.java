package com.ep.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EditCityController implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	public void editCity(int cityId, String cityName) {
		ReloadEvent re = null;
		System.out.println("updated db with city as : " + cityName);
		re = new ReloadEvent("tblCities", this);
		publisher.publishEvent(re);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

}
