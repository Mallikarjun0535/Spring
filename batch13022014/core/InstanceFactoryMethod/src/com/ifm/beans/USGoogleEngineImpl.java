package com.ifm.beans;

public class USGoogleEngineImpl implements IGoogleEngine {

	@Override
	public String[] getDirections(String src, String dest) {
		return new String[] { "US1", "US2", "US3" };
	}

}
