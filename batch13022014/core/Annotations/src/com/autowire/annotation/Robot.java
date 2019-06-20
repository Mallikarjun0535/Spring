package com.autowire.annotation;

import javax.annotation.Resource;

public class Robot {
	@Resource(name="chip2")
	private Chip chip;

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
