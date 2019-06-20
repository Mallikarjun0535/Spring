 package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aa.util.Cache;

public class CacheAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String key = null;
		String methodName = null;
		Object[] args = null;
		Cache cache = null;

		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();
		key = methodName;
		for (Object arg : args) {
			key += arg;
		}

		cache = Cache.getInstance();
		if (cache.containsKey(key)) {
			// skip calling target class method
			// return value from cache
			return cache.get(key);
		}
		// value not found in cache
		Object ret = methodInvocation.proceed();
		cache.put(key, ret);

		return ret;
	}

}
