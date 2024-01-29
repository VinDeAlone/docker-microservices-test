package com.demo.testService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test service started on port : 8506");
	}

}
