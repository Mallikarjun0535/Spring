package com.dc.beans;

public class BiCycle {
	private Chain chain;

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "BiCycle [chain=" + chain + "]";
	}

}
