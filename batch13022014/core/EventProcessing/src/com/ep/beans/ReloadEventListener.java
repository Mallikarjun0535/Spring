package com.ep.beans;

import org.springframework.context.ApplicationListener;

public class ReloadEventListener implements ApplicationListener<ReloadEvent> {

	@Override
	public void onApplicationEvent(ReloadEvent re) {
		System.out.println("reloading " + re.getTableName() + " data in cache");
	}

}
