package net.divine.hellocontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekAccessInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)  // before access to url
			throws Exception {
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		// close site if today is Sunday
		/*
		 * if (dayOfWeek == 1) {
		 * response.getWriter().write("This web site is closed on Sunday");
		 * return false; }
		 */
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,  // after @RequesMapping 
			ModelAndView modelAndView) throws Exception {
		//System.out.println("postHandle: "+ request.getRequestURI().toString());
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) // after rendering page
			throws Exception {
		//System.out.println("afterCompletion: "+ request.getRequestURI().toString());
	}

}
