package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
	
	@Autowired
	private Environment env;

	@GetMapping
	public String hello() {
		
		return "Hello, Port " + getPort();
	}
	
	@GetMapping("{nome}")
	public String helloNome(@PathVariable String nome) {
		return "Hello " + nome + " Port " + getPort();
	}
	
	private String getPort() {
		return env.getProperty("local.server.port").toString();
	}
}
