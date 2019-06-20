package com.ta.beans;

public class Thrower {
	public int echo(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("invalid i");
		}
		return i;
	}
}
