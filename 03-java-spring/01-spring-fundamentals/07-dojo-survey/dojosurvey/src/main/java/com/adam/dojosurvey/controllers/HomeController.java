package com.adam.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@PostMapping(path="/results")
	public String results(@RequestParam("name") String name,
			@RequestParam("location") String location,
			@RequestParam("program") String program,
			@RequestParam("comment") String comment,
			Model model) {
		
		model.addAttribute("name",name);
		model.addAttribute("location",location);
		model.addAttribute("program",program);
		model.addAttribute("comment",comment);
		return "results.jsp";
	}
}