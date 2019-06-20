package com.don.beans;

import java.util.Properties;
import java.util.ResourceBundle;

public class CityRIPropertiesAccessor implements IAccessor {
	private final String CITY_RI_FILE_PATH = "cityRI";
	private final String key;

	public CityRIPropertiesAccessor(String key) {
		this.key = key;
	}

	@Override
	public Object getData() {
		ResourceBundle rb = null;
		Properties props = null;

		rb = ResourceBundle.getBundle(CITY_RI_FILE_PATH);
		props = new Properties();
		for (String key : rb.keySet()) {
			props.put(key, rb.getString(key));
		}
		return props;
	}

	public String getKey() {
		return key;
	}

}
