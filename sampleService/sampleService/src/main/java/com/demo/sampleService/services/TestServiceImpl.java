package com.demo.sampleService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.sampleService.entities.Test;
import com.demo.sampleService.repositories.TestRepository;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestRepository repo;

	@Override
	public Test getTest(int id) {
		return this.repo.findById(id).orElseThrow(()->new RuntimeException("Test not found !!!"));
	}

	@Override
	public Test createtTest(Test test) {
		return this.repo.save(test);
	}

}
