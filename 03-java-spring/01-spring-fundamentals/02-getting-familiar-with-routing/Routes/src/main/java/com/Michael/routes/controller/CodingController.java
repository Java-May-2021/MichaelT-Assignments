package com.Michael.routes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/coding", method=RequestMethod.GET)
public class CodingController {
	@RequestMapping(value="", method=RequestMethod.GET)
	public String index() {
		return "codingindex.jsp";
	}
	
	@RequestMapping(value="/python", method=RequestMethod.GET)
	public String python() {
		return "python.jsp";
	}
	
	@RequestMapping(value="/java", method=RequestMethod.GET)
	public String Java() {
		return "java.jsp";
	}

}
