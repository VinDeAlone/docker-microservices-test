package com.demo.testService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.testService.entities.Test;
import com.demo.testService.repositories.TestRepository;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestRepository repo;

	@Override
	public Test getTestById(int id) {
		return this.repo.findById(id).orElseThrow(()->new RuntimeException("Test not found !!!"));
	}

	@Override
	public Test createTest(Test test) {
		return this.repo.save(test);
	}

}
