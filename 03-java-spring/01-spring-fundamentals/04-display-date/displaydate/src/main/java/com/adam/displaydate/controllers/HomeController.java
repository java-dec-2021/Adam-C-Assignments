package com.adam.displaydate.controllers;

import java.util.Date;

import org.apache.naming.java.javaURLContextFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "index.jsp";
	}
	@RequestMapping(value="/date")
	public String index(Model model) {
		Date date = new java.util.D
		model.addAttribute("date", "Burbank");
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String index(Model model) {
		model.addAttribute("time", "Burbank");
		return "time.jsp";
	}
}