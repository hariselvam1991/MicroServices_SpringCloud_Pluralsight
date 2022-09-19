
1. 3 functional interfaces
	
Supplier<O>
	Use for endpoints that provide data without input
	would respond to an HTTP GET request
	GET - http://localhost:8080/getTollStations
Consumer<I>
	Use for asynchronus endpoints that take input and expect no output
	would respond to an HTTP POST request
	POST - http://localhost:8080/processTollRecord
	{
   	 "stationId": "110A",
    	 "licensePlate": "M1346TR",
    	 "timestamp": "2022-09-18T08:00:00"
	}
	http://localhost:8080/processTollRecordReactivate - reactive way. Use Function but acts like Consumer
Function<I, O>
	Use for request-response endpoints
	would respond to an HTTP POST or GET request