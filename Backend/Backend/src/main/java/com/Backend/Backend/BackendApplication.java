package com.Backend.Backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner connectionChecker(MongoTemplate mongoTemplate) {
		return args -> {
			try {
				// This command asks MongoDB for its name to confirm the connection
				String dbName = mongoTemplate.getDb().getName();
				System.out.println("==========================================");
				System.out.println("SUCCESS: Connected to MongoDB Atlas!");
				System.out.println("Database Name: " + dbName);
				System.out.println("==========================================");
			} catch (Exception e) {
				System.out.println("==========================================");
				System.out.println("ERROR: Could not connect to MongoDB Atlas.");
				System.out.println("Check your application.properties and IP whitelist.");
				System.out.println("==========================================");
			}
		};
	}
}