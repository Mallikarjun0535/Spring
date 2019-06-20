package com.don.beans;

import java.util.List;

public class CacheManager {
	private List<IAccessor> accessors;
	private Cache cache;

	public CacheManager(List<IAccessor> accessors, Cache cache) {
		this.accessors = accessors;
		this.cache = cache;
		load();
	}

	private void load() {
		Object data = null;

		for (IAccessor accessor : accessors) {
			data = accessor.getData();
			cache.put(accessor.getKey(), data);
		}
	}

}
