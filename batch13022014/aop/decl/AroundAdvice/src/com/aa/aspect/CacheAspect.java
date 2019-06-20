package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import com.aa.util.Cache;

public class CacheAspect {
	private Cache cache;

	public Object cache(ProceedingJoinPoint pjp) throws Throwable {
		String methodName = null;
		Object[] args = null;
		String key = null;
		Object ret = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();
		key = methodName;
		for (Object arg : args) {
			key += arg;
		}
		if (cache.containsKey(key)) {
			return cache.get(key);
		}
		ret = pjp.proceed();
		cache.put(key, ret);
		return ret;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
