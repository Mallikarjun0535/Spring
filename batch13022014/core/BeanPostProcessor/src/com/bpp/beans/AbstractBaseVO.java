package com.bpp.beans;

import java.util.Date;

public abstract class AbstractBaseVO {
	protected Date lastModifiedDt;

	public Date getLastModifiedDt() {
		return lastModifiedDt;
	}

	public void setLastModifiedDt(Date lastModifiedDt) {
		this.lastModifiedDt = lastModifiedDt;
	}

}
