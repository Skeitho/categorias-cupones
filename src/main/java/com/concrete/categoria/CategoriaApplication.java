package com.concrete.categoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CategoriaApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CategoriaApplication.class, args);
		

	}
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CategoriaApplication.class);
	}

}
