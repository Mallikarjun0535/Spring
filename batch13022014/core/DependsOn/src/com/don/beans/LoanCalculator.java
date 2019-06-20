package com.don.beans;

import java.util.Properties;

public class LoanCalculator {
	private final String CACHE_CITY_RI_KEY = "cityRI";
	private Cache cache;

	public float calInterest(long principle, int noOfYears, String city) {
		float ri = 0.0f;
		float amt = 0.0f;
		Properties cityRIProps = null;

		cityRIProps = (Properties) cache.get(CACHE_CITY_RI_KEY);
		if (cityRIProps != null) {
			if (cityRIProps.containsKey(city) == false) {
				throw new IllegalArgumentException(
						"City you entered is not supported");
			}
			ri = Float.parseFloat((String) cityRIProps.getProperty(city));
			amt = (principle * ri * noOfYears) / 100;
		}
		return amt;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
