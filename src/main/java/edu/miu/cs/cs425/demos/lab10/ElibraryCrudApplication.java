package edu.miu.cs.cs425.demos.lab10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ElibraryCrudApplication  extends SpringBootServletInitializer {

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ElibraryCrudApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ElibraryCrudApplication.class, args);
	}
}
