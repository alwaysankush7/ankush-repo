package com.maurya.springBoot.Movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker
public class SpringbootMovieInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMovieInfoApplication.class, args);
	}

	@Bean
	
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
