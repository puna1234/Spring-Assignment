package com.zensar.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "test", "com.zensar" })
public class SpringBootDemoApplication extends SpringBootServletInitializer{

	public static void main(String... args) {
		System.out.println("Neha");
		SpringApplication.run(SpringBootDemoApplication.class, args);

		System.out.println("Sima");

	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();

	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//TODO auto-generated method stub
		return super.configure(builder);
	}

}