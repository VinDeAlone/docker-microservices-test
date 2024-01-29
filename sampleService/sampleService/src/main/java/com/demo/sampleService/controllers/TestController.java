package com.demo.sampleService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sampleService.entities.Test;
import com.demo.sampleService.services.TestService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestService ser;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getTest(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK)
				.body(this.ser.getTest(id))
				;
	}
	
	@PostMapping
	public ResponseEntity<?> createTest(@RequestBody Test test){
		return ResponseEntity.status(HttpStatus.OK)
				.body(this.ser.createtTest(test))
				;
	}

}
