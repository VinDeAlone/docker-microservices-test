package com.demo.sampleService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SampleServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sample service : started on port : 8506");
	}

}
