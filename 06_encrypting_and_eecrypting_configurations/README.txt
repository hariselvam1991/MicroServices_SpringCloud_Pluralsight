
1. Add key to properries file in config server
	encrypt:
    		key: ABCDEF
2. Added websecurityconfig file
3. Generate encrypted value and add to properties fine.
	Using http://localhost:8888/encrypt provide body with the input we want to encrypt
	eg connectionstring=server123;user=root;passsword=password;
4. Update this encrypted value in https://github.com/hariselvam1991/techbruiser-spring-cloudconfig-wa-tolls/blob/main/application.properties
	connstring={cipher}35f4afeba3da78ab93b60211
5. Retreive configuration via API
	
6. Test client app with server-side decrypted value
7. Update server to required client-side decryprion
8. Change client to decrypt
9. To enable or disable the encryprion at server sider
	    cloud:
        config:
            server:
                encrypt:
                    enabled: true
10. Even if #6 is enabled: false the client server will decrypt properly by adding below property in 
properties file
	encrypt.key=ABCDEF

