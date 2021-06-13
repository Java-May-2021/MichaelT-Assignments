package com.Michael.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer counter = (Integer) session.getAttribute("count");
			counter++;
			session.setAttribute("count", counter);
			
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(Model counterModel, HttpSession session){
		Integer currentCount = (Integer) session.getAttribute("count");
		if(currentCount==null) {
			counterModel.addAttribute("current", 0);
		}
		else {
			counterModel.addAttribute("current", currentCount);
		}
		return "counter.jsp";
		
		
	}
}
