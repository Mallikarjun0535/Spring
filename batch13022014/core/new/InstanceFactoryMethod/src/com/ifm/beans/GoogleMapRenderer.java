package com.ifm.beans;

public class GoogleMapRenderer {
	private IGoogleEngine googleEngine;

	public void render(String src, String dest) {
		String[] directions = null;

		directions = googleEngine.getDirections(src, dest);
		System.out.println("Directions ...");
		for (String d : directions) {
			System.out.println(d);
		}
	}

	public void setGoogleEngine(IGoogleEngine googleEngine) {
		this.googleEngine = googleEngine;
	}

}
