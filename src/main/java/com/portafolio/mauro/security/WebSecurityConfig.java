package com.portafolio.mauro.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    //.antMatchers(HttpMethod.OPTIONS, "/**")   
    //.antMatchers(HttpMethod.GET)
//    .antMatchers(HttpMethod.PUT) ////
//            .permitAll()////
        http.cors()//cors() soluciona error headers..
            .and()
            .csrf()
            .disable()
            .authorizeRequests()
            .antMatchers(HttpMethod.GET)
            .permitAll()
            .anyRequest()
            .authenticated()
            .and()
            .httpBasic();
    }
    
}
