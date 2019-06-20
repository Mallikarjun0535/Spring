package com.ep.beans;

import org.springframework.context.ApplicationEvent;

public class ReloadEvent extends ApplicationEvent {
	private String tableName;

	public ReloadEvent(String tableName, Object source) {
		super(source);
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

}
