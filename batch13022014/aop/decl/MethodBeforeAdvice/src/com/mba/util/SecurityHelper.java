package com.mba.util;

import org.springframework.beans.factory.InitializingBean;

public class SecurityHelper implements InitializingBean {
	private ThreadLocal<UserInfo> threadLocal;

	@Override
	public void afterPropertiesSet() throws Exception {
		threadLocal = new ThreadLocal<UserInfo>();
	}

	public void login(String un, String pwd) {
		UserInfo ui = null;

		ui = new UserInfo(un, pwd);
		threadLocal.set(ui);
	}

	public void logout() {
		threadLocal.set(null);
	}

	public boolean isAuthenticated() {
		UserInfo ui = null;

		ui = threadLocal.get();
		if (ui != null) {
			if (ui.getUn().equals("john") && ui.getPwd().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		UserInfo ui = null;

		ui = threadLocal.get();
		if (ui != null) {
			return ui.getUn();
		}
		return null;
	}
}
