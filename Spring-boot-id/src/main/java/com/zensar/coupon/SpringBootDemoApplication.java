package com.zensar.coupon;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"test","com.zensar"})
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		System.out.println("Punam");
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("Komal");
	}
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}

}