package com.example.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jdk.jfr.Enabled;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String message(Principal principal)
	{
		return "Hi" +principal.getName()+"Welcome to spring cloud oath2 example application";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
