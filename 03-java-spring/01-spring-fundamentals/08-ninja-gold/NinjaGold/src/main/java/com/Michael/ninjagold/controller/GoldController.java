package com.Michael.ninjagold.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoldController {
	@GetMapping("/gold")
	public String gold(HttpSession session, Model viewModel) {
		ArrayList<String> activity = new ArrayList<String>();
		
		if(session.getAttribute("gold")==null) {
			session.setAttribute("gold", 0);
		}
		if(session.getAttribute("activity")==null) {
			session.setAttribute("activity", activity);
		}
		
		viewModel.addAttribute("gold", session.getAttribute("gold"));
		viewModel.addAttribute("activity", session.getAttribute("activity"));
		
		return "gold.jsp";
	}
	
	@PostMapping("/addGold")
	private String addGold(HttpSession session, @RequestParam("location") String location) {
		Random r = new Random();
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY h:mma");
		ArrayList<String> activity = (ArrayList<String>)session.getAttribute("activity");
		int goldEarned;
		int gold = (int)session.getAttribute("gold");
		if(location.equals("farm")) {
			goldEarned = r.nextInt((20-10) + 1) + 10;
			activity.add("Entered a " + location + "and earned " + goldEarned + " " + now);
		}
		else if(location.equals("cave")) {
			goldEarned = r.nextInt((10-5) + 1) + 5;
			activity.add("Entered a " + location + "and earned " + goldEarned + " " + now);
		}
		else if(location.equals("house")) {
			goldEarned = r.nextInt((5-2) + 1) + 2;
			activity.add("Entered a " + location + "and earned " + goldEarned + " " + now);
		}
		else {
			goldEarned = r.nextInt((50+50) + 1) - 50;
			if(goldEarned > 0) {
				activity.add("Entered a " + location + "and earned " + goldEarned + " " + now);
			}
			else {
				activity.add("Entered a " + location + "and lost " + goldEarned + " " + now);
			}
		}
		int totalGold = gold + goldEarned;
		session.setAttribute("gold", totalGold);
		session.setAttribute("activity", activity);
		return "redirect:/gold";
	}
}
