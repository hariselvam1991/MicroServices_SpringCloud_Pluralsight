package com.techbruiser.resourceserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    public void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().
        antMatchers(HttpMethod.GET, "/api/tolldata")
        .hasAuthority("SCOPE_reader")
        .anyRequest()
        .authenticated()
        .and()
        .oauth2ResourceServer()
        .jwt();
    }
    
}
