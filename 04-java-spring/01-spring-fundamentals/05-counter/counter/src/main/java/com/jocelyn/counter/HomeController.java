package com.jocelyn.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController{
	private int getSessionCount(HttpSession session) {
		Object numOfSessions = session.getAttribute("count");
		if(numOfSessions == null) {
			setSessionCount(session, 0);
			numOfSessions = session.getAttribute("count");
		}
		System.out.println(numOfSessions);
		return (Integer) numOfSessions;
	}
	
	private void setSessionCount(HttpSession session, int val) {
		session.setAttribute("count", val);
	}
	
	@RequestMapping("")
	public String home() {
		return ("index.jsp");
	}
	
	@RequestMapping("counter")
	public String counter(HttpSession session) {	
		int currentCount = getSessionCount(session);
		setSessionCount(session, ++currentCount);
		return ("counter.jsp");
	}
}
