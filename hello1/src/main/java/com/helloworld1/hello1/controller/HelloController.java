package com.helloworld1.hello1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello1")
public class HelloController {
	
	@GetMapping
	public String hello()
	{
		return "Hello, Generation! \nNeste projeto utilizei as habilidades de persistência e"
				+ " atenção aos detalhes.";
	}

}
