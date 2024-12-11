package com.example.recipe_api_advanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//Enable JPa auditing on the main classs
@SpringBootApplication
@EnableJpaAuditing
public class RecipeApiAdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeApiAdvancedApplication.class, args);
	}

}
