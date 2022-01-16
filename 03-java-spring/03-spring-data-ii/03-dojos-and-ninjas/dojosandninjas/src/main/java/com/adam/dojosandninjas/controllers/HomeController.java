package com.adam.dojosandninjas.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adam.dojosandninjas.models.Dojo;
import com.adam.dojosandninjas.models.Ninja;
import com.adam.dojosandninjas.services.DojoService;
import com.adam.dojosandninjas.services.NinjaService;

@Controller
public class HomeController {

	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos";
	}
	
	
	// Dojo Mappings
	@GetMapping("/dojos")
	public String dojoList(Model model) {
		model.addAttribute("dojos",this.dojoService.getAllDojos());
		return "index.jsp";
	}
	@RequestMapping(value="/dojos/new",method = {RequestMethod.GET,RequestMethod.POST})
	public String createDojo(Model model,@Valid @ModelAttribute("newDojo") Dojo dojo,BindingResult result) {
		if(result.hasErrors()) {
			return "NewDojo.jsp";
		}
		else {
			this.dojoService.createDojo(dojo);
			return "redirect:/";			
		}
	}
	@GetMapping("/dojos/{id}")
	public String viewDojoStudents(Model model,@PathVariable("id") Long id) {
		Optional<Dojo> dojo = dojoService.getDojoById(id);
		List<Ninja> dojoRoster = dojo.get().getNinjas();
		model.addAttribute("dojoRoster", dojoRoster);
		model.addAttribute("dojoName", dojo.get().getName());
		return "ShowDojo.jsp";
	}
	
	//Ninja Mappings
	@GetMapping("/ninjas/new")
	public String ninjas(Model model) {
		model.addAttribute("dojos",this.dojoService.getAllDojos());
		model.addAttribute("newNinja", new Ninja());
		return "NewNinja.jsp";
	}
	@PostMapping("/ninjas/new")
	public String ninjas(@Valid @ModelAttribute("newNinja") Ninja ninja,BindingResult result) {
		if(result.hasErrors()) {
			return "NewNinja.jsp";
		}
		else {
			this.ninjaService.createNinja(ninja);
			return "redirect:/";			
		}
	}
	
	
}
