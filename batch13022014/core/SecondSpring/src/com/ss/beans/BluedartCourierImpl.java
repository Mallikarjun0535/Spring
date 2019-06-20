package com.ss.beans;

import java.util.List;

public class BluedartCourierImpl implements ICourier {

	@Override
	public boolean send(List<String> items, String addr) {
		System.out.println("sending parcel through blue dart");
		return true;
	}

}
