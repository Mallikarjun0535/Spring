package com.ss.beans;

import java.util.List;

public class EbayShop {
	private ICourier courier;

	public float checkout(List<String> items, String addr) {
		courier.send(items, addr);
		return 10.0f;
	}

	public void setCourier(ICourier courier) {
		this.courier = courier;
	}

}
