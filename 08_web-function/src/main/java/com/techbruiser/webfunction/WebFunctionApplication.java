package com.techbruiser.webfunction;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class WebFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFunctionApplication.class, args);
	}

	List<TollStation> tollStations;

	public WebFunctionApplication() {
		tollStations = new ArrayList<>();
		tollStations.add(new TollStation("110A", 125.4f, 2));
		tollStations.add(new TollStation("10D", 85.4f, 4));
		tollStations.add(new TollStation("200C", 180.4f, 6));
	}

	//Accepts a String. returns TollStation
	@Bean
	public Function<String, TollStation> retrieveStation(){
		return value -> {
			System.out.println("Request received for station - " + value);
			return tollStations.stream()
			.filter(toll -> value.equals(toll.getStationId()))
			.findAny()
			.orElse(null);
		};
	}

	//Only input
	@Bean
	public Consumer<TollRecord> processTollRecord(){
		return value -> {
			System.out.println("Received toll for car with license plate - "+ value.getLicensePlate());
		};
	} 

	@Bean
	public Function<TollRecord, Mono<Void>> processTollRecordReactivate(){
		return value -> {
			System.out.println("received reactivate toll for car with licenseplate - " + value.getLicensePlate());
			return Mono.empty();
		};
	}

	@Bean
	public Consumer<Flux<TollRecord>> processprocessListofTollRecordsReactive(){
		return value -> {
			value.subscribe( toll -> System.out.println(toll.getLicensePlate()));
		};
	}

	//Only output
	@Bean
	public Supplier<Flux<TollStation>> getTollStations(){
		return() -> Flux.fromIterable(tollStations);
	}
	
}
