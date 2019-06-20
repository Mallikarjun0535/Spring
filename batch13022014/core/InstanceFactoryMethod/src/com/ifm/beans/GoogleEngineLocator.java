package com.ifm.beans;

public class GoogleEngineLocator {
	public IGoogleEngine getUSGoogleEngine() {
		// lookup logic only
		return new USGoogleEngineImpl();
	}
	
	public IGoogleEngine getIndiaGoogleEngine() {
		// lookup logic
		return new IndiaGoogleEngineImpl();
	}
}
