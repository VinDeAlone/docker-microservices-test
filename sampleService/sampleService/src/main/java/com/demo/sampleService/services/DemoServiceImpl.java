package com.demo.sampleService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.sampleService.entities.Demo;
import com.demo.sampleService.repositories.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoRepository repo;

	@Override
	public Demo getDemo(int id) {
		return this.repo.findById(id).orElseThrow(()->new RuntimeException("Demo not found !!!"));
	}

	@Override
	public Demo createDemo(Demo demo) {
		return this.repo.save(demo);
	}

}
