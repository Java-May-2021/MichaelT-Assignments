package com.Michael.datetime.controller;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DateTimeController {
	private Date getDateTime() {
		Date current = new Date();
		return current;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="time", method=RequestMethod.GET)
	public String time(Model dateTimeModel){
		dateTimeModel.addAttribute("datetime", getDateTime());
		return "time.jsp";
	}
	
	@RequestMapping(value="date", method=RequestMethod.GET)
	public String date(Model dateTimeModel){
		dateTimeModel.addAttribute("datetime", getDateTime());
		return "date.jsp";
	}
}
