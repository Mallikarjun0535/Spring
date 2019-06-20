package com.ifm.beans;

public class IndiaGoogleEngineImpl implements IGoogleEngine {

	@Override
	public String[] getDirections(String src, String dest) {
		return new String[] { "ind1", "ind2" };
	}

}
