Dependencies:
Spring Web
OAuth2 Resource Server

Make changes in secureui project
	Invoke http://localhost:8081/api/tolldata from /report API
	Add WebClient bean

	
Hit http://localhost:8180/report
	The secure API invokes http://localhost:8081/api/tolldata with the generated token
	The resource server validates the token and responds back.