package com.github.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bloomreach.service","com.bloomreach.resource"})
public class GitclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitclientApplication.class, args);
	}
}
