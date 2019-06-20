package com.mba.util;

public class SecurityManager {
	private static SecurityManager instance;
	private ThreadLocal<UserInfo> threadLocal;

	private SecurityManager() {
		threadLocal = new ThreadLocal<UserInfo>();
	}

	public synchronized static SecurityManager getInstance() {
		if (instance == null) {
			instance = new SecurityManager();
		}
		return instance;
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
		String user = null;

		ui = threadLocal.get();
		if (ui != null) {
			user = ui.getUn();
		}

		return user;
	}
}
