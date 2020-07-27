package com.objetivo.segundo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obj")

public class Objetivos1 {
	
	@GetMapping
	public String obj () {
		return "Meu objetivo dessa semana é \n"
				+ "criar aplicações no Spring Boot \n"
				+ "sozinha e com segurança.";
	}

}
