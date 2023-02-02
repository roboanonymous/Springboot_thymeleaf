package com.springboot.web.controller;


import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

}
