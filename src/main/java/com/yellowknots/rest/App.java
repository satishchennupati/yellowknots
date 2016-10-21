 package com.yellowknots.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan(basePackages =
{
    "com.egen"
})
@Configuration
public class App {
	
	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(App.class, args);
	    }

}
