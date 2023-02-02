package com.springboot.web.controller;


import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Mycontroller {
	@RequestMapping(value = "/about" , method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside the handler ...");
		
		// Putting data
		model.addAttribute("name", "Samyak Jain");
		model.addAttribute("CurrentDate" , LocalDate.now());
		
		return "about";
		// about.html
	}
	
	
	// handling Iteration
	@GetMapping("/exammple-loop")
	public String iteratehandler(Model m)
	{
		List <String> names = List.of("Samyak", "Dhruv" , "Deepak" , "John");
		m.addAttribute("names",names);
		return "iterate";
		
	}

}
