package com.Michael.strings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StringController {
	@RequestMapping(value="/" , method=RequestMethod.GET )
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/random" , method=RequestMethod.GET )
	public String random() {
		return "random.jsp";
	}
}
