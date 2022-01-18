package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hi Família 41!!";
	}
	
	@GetMapping("/2")
	public String hello2() {
		return "Hi Família 41!!";
	}
	
	@GetMapping("/habilidade/mentalidade")
	public String habMent() {
		return "Utilizei a mentalidade de Persistência e a habilidade de atenção aos detalhes para realizar essa atividade.";
	}
	
	@GetMapping("/objetivos/aprendizagem")
	public String objAprend() {
		return "O meu objetivo de aprendizagem para essa semana é manter a minha atenção aos detalhes e melhorar a minha mentalidade de crescimento.";
	}
}
