package com.ifm.beans;

public class USGoogleEngineImpl implements IGoogleEngine {

	@Override
	public String[] getDirections(String src, String dest) {
		return new String[] { "us1", "us2", "us3" };
	}

}
