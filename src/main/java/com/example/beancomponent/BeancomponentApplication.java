package com.example.beancomponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeancomponentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeancomponentApplication.class, args);
	}
	@Bean
	public  SecondClass getSecondClass(){
		return  new SecondClass();
	}
}
