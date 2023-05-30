package com.zemoso.workbench;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkbenchApplication {

	public static void main(String[] args) {
		System.out.println("Done configuration and created this branch to generate PR and test sonar Integration...");
		SpringApplication.run(WorkbenchApplication.class, args);
	}

}
