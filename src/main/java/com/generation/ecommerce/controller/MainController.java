package com.generation.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.generation.ecommerce.model.repository.ItemRepository;

@Controller

public class MainController 

{
	@Autowired
	ItemRepository repo;
	
	@GetMapping("/home")
	public String homepage(Model model)
	{
		model.addAttribute("items", repo.findAll());
		
		
		return "homepage";
	}
	
}
