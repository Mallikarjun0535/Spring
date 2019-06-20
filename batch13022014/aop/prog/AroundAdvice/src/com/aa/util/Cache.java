package com.aa.util;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	private static Cache instance;
	private Map<String, Object> dataMap;

	private Cache() {
		dataMap = new HashMap<String, Object>();
	}

	public static synchronized Cache getInstance() {
		if (instance == null) {
			instance = new Cache();
		}
		return instance;
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
