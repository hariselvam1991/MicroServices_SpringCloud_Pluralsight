
Goals
1. Build Toll reporting site
2. Add spring security with OAuth2.0 login
3. Authenticate and Authorize via github
4. Watch redirects during this flow
5. Choose pages to protect.

Dependecies
	Web, Reactive web, Thymleaf, OAuth 2 client

1. Setup Oauth App in github
	Settings -> Developer Settings -> OAuth Apps
	This will generate client id and secret
2. Add client id and secret values in properties
	spring.security.oauth2.client.registration.github.client-id=583623d3f411a4030dff
	spring.security.oauth2.client.registration.github.client-secret=b796734c3061564b030cf4b9ddf6c3a6a4d573a9
3. Authentication rules are setup in SecurityConfig class

Authorization Flow
	http://localhost:8080/home
	http://localhost:8080/oauth2/authorization/github
	https://github.com/login/oauth/authorize?response_type=code&client_id=583623d3f411a4030dff&scope=read:user&state=BZdFKLKRifVbpkhxnEw99IUFOApSkxgv7ZY8lzCCBi0%3D&redirect_uri=http://localhost:8080/login/oauth2/code/github
	https://github.com/login?client_id=583623d3f411a4030dff&return_to=%2Flogin%2Foauth%2Fauthorize%3Fclient_id%3D583623d3f411a4030dff%26redirect_uri%3Dhttp%253A%252F%252Flocalhost%253A8080%252Flogin%252Foauth2%252Fcode%252Fgithub%26response_type%3Dcode%26scope%3Dread%253Auser%26state%3DBZdFKLKRifVbpkhxnEw99IUFOApSkxgv7ZY8lzCCBi0%253D
	Provide github login credentials				
	https://github.com/login/oauth/authorize?client_id=583623d3f411a4030dff&redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Flogin%2Foauth2%2Fcode%2Fgithub&response_type=code&scope=read%3Auser&state=hKdsafEMfqRG0XgfqNtRwYcCAijGjxXExqj2dou2iZg%3D
	http://localhost:8080/login/oauth2/code/github?code=33697cecd72c56be90d0&state=0EAz0VnPtmH6p_yY8mzozB1pAgwIk8PlZE2R3E3kEeA%3D
	http://localhost:8080/report
	