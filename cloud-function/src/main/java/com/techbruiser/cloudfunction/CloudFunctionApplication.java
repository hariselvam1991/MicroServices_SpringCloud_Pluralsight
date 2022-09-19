package com.techbruiser.cloudfunction;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> function(){
		return value -> "Greetings, Techbruiser and cloud user" + value;
	}

}
