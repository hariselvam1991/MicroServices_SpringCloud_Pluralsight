Role of Tracing in Microservices
	Locate misbehaving components
	Observe end-to-end latency
	Understand actaul, not specified behaviour

Spring Cloud Sleuth
	Automatic instrumentation of communication channels.

Glossary
	Span
	Trace
	Annotation
		- Client Sent
		- Server Received
		- Server Sent
		- Client Received
	Tracer
	
Goals:
1. addingSpring Cloud Sleuth to services
2. Updating properties files to reveal traces
3. Testing services and observing output

Dependency:
spring-cloud-starter-sleuth
http://localhost:8081/customer/501/contactdetails
http://localhost:8082/customer/501/vehicledetails
 http://localhost:8080/customer/501

Visualizing latency with zipkin
Collects timing data
Visualize latency for spans in a tree
Many integrations, besides Spring

Dependency
cloud-sleuth-zipkin 

Goals:
Download prepakaged Zipkin server
Startup the server
Update services to send spans to Zipkin
Add zinkin url in all properties file


