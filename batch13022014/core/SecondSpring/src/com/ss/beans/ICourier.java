package com.ss.beans;

import java.util.List;

public interface ICourier {
	public boolean send(List<String> items, String addr);
}
