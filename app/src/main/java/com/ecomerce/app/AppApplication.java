package com.ecomerce.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class AppApplication {
	
	@GetMapping	
	public String helloworld() {
		return "Hello World";
	}
	
	@GetMapping("/Atividade1")
	public String exercicio1() {
		return "Habilidades: Proatividade e Atenção aos detalhes e Mentalidades: Crescimento e Persistência";
	}
	
	@GetMapping("/Atividade2")
	public String exercicio2() {
		return "Os meus objetivos de aprendizado dessa semana é estudar, entender e praticar sobre a ferramenta Spring Boot e entender melhor o seu funcionamento!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
