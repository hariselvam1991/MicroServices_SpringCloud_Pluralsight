package com.techbruiser.setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetupApplication.class, args);
	}

}

@RestController
class MyConstroller {

	@GetMapping("/api/greeting")
	public String offerGreeting(){
		return "Hello";
	}
}
