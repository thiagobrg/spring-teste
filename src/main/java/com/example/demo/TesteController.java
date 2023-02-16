package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

	@GetMapping
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("{nome}")
	public String helloNome(@PathVariable String nome) {
		return "Hello " + nome;
	}
}
