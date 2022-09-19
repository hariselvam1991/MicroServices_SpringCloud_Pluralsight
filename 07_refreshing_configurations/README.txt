
1. Add RefreshScope to RateController
	@RefreshScope
2. Start server and client apps
3. Change a property in GitHub
4. Trigger client refresh
	POST http://localhost:8080/actuator/refresh
5. See new value without requiring a restart