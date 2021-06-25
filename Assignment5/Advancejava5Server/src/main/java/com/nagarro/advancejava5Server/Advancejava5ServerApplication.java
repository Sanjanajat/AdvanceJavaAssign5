package com.nagarro.advancejava5Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="com.nagarro.advancejava5Server.controller")
public class Advancejava5ServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Advancejava5ServerApplication.class, args);
	}
	
}