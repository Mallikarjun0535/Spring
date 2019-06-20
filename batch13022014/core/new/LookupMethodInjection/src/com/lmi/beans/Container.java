package com.lmi.beans;

abstract public class Container {
	public void receive(String data) {
		Executor executor = null;

		executor = lookupExecutor();
		executor.setData(data);
		executor.execute();
	}

	public abstract Executor lookupExecutor();
}
