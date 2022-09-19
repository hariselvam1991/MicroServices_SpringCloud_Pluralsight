
Options for Authorization Servers
1. Managed services from those such Google, Ping Identity or Okta
2. Commercial software like Microsoft Active Directory
3. Open source solution like or the new Spring Authorization Server

Goals
Stand up a keycloak instance
Create the realm, client, and user necessary in Keycloak
Update Spring client application to use Keycloak for authentication and authorization instead of GitHub

1. Launch Keycloack instance using "kc.bat start-dev" from bin folder of downloaded 
2. Add Realm
3. Create new client
4. Create Role, User and User credentials
5. Set Role Mappings - Add Users role
6. Generate the relam token from http://localhost:8080/realms/techbruiser/protocol/openid-connect/token
client_id=toll-app, username, password and grant_type=password
Make sure the 'Access Type' is 'Public' to generate token from postman.
7. change the Access Type to Condifentials then take the secret value from Credentials tab
8. Set the secret value in properties 
9. Now try http://localhost:8180/report
10. It will redirect to Keycloak login oage. Provide the user credentials created inside keycloak
