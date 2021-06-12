package com.Michael.routes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/dojo", method=RequestMethod.GET)
public class DojoController {
	@RequestMapping(value="", method=RequestMethod.GET)
		public String index() {
			return "dojoindex.jsp";
	}
	
	@RequestMapping("/{city}")
	public String burbank(@PathVariable("city") String city) {
		if(city.equals("burbank")) {
			return "burbank.jsp";
		}
		else if(city.equals("san-jose")) {
			return "sj.jsp";
		}
		else {
			return "";
		}
	}
}
