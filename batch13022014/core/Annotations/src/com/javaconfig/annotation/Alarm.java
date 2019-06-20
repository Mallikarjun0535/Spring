package com.javaconfig.annotation;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alarm {

	private Calendar time;

	@Autowired
	public void setTime(Calendar time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Alarm [time=" + time.getTime() + "]";
	}

}
