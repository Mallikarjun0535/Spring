package com.bpp.beans;

import java.util.Date;

public abstract class AbstractBaseVO {
	protected Date lastModifiedDate;

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
