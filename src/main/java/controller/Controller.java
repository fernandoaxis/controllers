package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping(path = { "/olá", "saudacao" })
	public String ola() {
		return "Olá Spring Boot";
	}
	
	@PostMapping(path = {"/saudacao"})
	public String saudacao() {
		return "Olá Spring Boot (POST)";
	}
}
