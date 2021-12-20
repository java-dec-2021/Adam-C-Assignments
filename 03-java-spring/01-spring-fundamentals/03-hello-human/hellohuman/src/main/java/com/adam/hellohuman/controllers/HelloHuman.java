package com.adam.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
	public String hello(@RequestParam(value="name",required=false) String firstName,@RequestParam(value="last_name",required=false) String lastName) {
		if(firstName != null && lastName != null) {
			return "Hello "+firstName+" "+lastName;
		}
		else if (firstName != null && !(lastName != null)) {
			return "Hello "+firstName;
		}
		else {
			return "Hello human.";
		}
	}
}