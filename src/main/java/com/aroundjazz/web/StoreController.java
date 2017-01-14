package com.aroundjazz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.aroundjazz.model.Jazzbar;
import com.aroundjazz.model.JazzbarRepository;

@Controller
public class StoreController {
	
	@Autowired
	private JazzbarRepository jazzbarRepository;
	
	@PostMapping("/create")
	public String create(Jazzbar jazzbar){
		System.out.println("jazzbar 정보 :" + jazzbar);
		jazzbarRepository.save(jazzbar);
		return "redirect:/offers";
	}
	
	@GetMapping("/offers")
	public String list(Model model){
		model.addAttribute("jazzbars", jazzbarRepository.findAll());
		return "offers";
	}

	@GetMapping("/offers/{id}")
	public String show(Model model){
		return "show";
	}
}
