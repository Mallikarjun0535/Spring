package com.um.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ShutdownWindowInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object obj) throws Exception {
		Calendar c = null;

		c = Calendar.getInstance();
		// maintaince window
		System.out.println(obj.getClass());
		if (c.get(Calendar.HOUR) >= 5 && c.get(Calendar.HOUR) < 6) {
			response.sendRedirect("maintaince.jsp");
			return false;
		}
		return true;
	}

}
