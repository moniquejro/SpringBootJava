package com.helloworld1.hello1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")

public class HelloSecondController {
	
	@GetMapping
	public String hello2()
	{
		return "Meus objetivos desta semana é dominar \n"
				+ "o SpringBoot a ponto de me sentir segura \n"
				+ "criando aplicações sozinha.";
	}
}
