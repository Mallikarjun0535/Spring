package com.ifm.beans;

public class GoogleEngineLocator {
	public IGoogleEngine getIndiaGoogleEngine() {
		// lookup to get IndiaGoogleEngine
		return new IndiaGoogleEngineImpl();
	}

	public IGoogleEngine getUSGoogleEngine() {
		// lookup to get USEngine
		// dummy code (we should not create rather we should get it)
		return new USGoogleEngineImpl();
	}
}
