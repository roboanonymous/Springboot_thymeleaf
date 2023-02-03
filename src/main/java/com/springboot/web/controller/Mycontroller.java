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
	
	@GetMapping("/condition")
	public String conditionHandler(Model m)
	{
		System.out.println("Condition handler executed ...");
		m.addAttribute("isActive", false);
		m.addAttribute("gender" , "M");
		List<Integer> list = List.of(11,22,33,44,55,66,77);
		m.addAttribute("mylist",list);
		return "condition";
	}
	
	//handler for fragment
	@GetMapping("/service")
	public String serviceHandler(Model m)
	{
		m.addAttribute("title" , "I want to Die ");
		m.addAttribute("subtitle" , "now");
		return "service";
	}
	
	@GetMapping("/newabout")
	public String newAbout()
	{
		return "aboutnew";
	}

}
