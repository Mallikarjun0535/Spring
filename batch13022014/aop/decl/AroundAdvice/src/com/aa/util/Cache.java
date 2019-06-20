package com.aa.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;

public class Cache implements InitializingBean {
	private Map<String, Object> dataMap;

	@Override
	public void afterPropertiesSet() throws Exception {
		dataMap = new HashMap<String, Object>();
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
