package com.don.beans;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	private Map<String, Object> dataMap;

	public Cache() {
		dataMap = new HashMap<String, Object>();
	}

	/**
	 * First time to load the data into it
	 * 
	 * @param dataMap
	 */
	public void load(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public void put(String key, Object val) {
		dataMap.put(key, val);
	}

	public Object get(String key) {
		return dataMap.get(key);
	}

	public boolean containsKey(String key) {
		return dataMap.containsKey(key);
	}

}
