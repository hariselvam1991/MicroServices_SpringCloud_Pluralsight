
Serverless Computing
	Managed services that scale to zero
	Function-as-a-service is serverless computing
	Elastic, autoscaled services
	Startup fast, run for shortperiods

Creating functions

1. Creare new pring boot project for toll processing function
2. Define the functioanls interface and annoate.
3.  change spring cloud function context into sping cloud starter function web
4. Spring Cloud Function
	Short-lived, asynchronus microservices
4. @Bean
	public Function<String, TollStation> retrieveStation()
5. POST http://localhost:8080/retrieveStation
	- retrieveStation is a webservice
6. GET http://localhost:8080/retrieveStation/110A
	- retrieveStation is a webservice
7. Add spring.cloud.function.definition=retrieveStation in properties file
	- POST http://localhost:8080 still works
	as retrieveStation is set to be default function
