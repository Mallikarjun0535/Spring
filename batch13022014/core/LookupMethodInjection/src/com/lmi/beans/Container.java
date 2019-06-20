package com.lmi.beans;

abstract public class Container {

	public void execute(String data) {
		Executor executor = lookupExecutor();
		executor.setData(data);
		executor.process();
	}

	public abstract Executor lookupExecutor();
}
