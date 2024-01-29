package com.demo.demoService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demoService.entities.Demo;
import com.demo.demoService.repositories.DemoRepositories;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoRepositories repo;

	@Override
	public Demo getDemoById(int id) {
		return this.repo.findById(id).orElseThrow(()-> new RuntimeException("Demo not found !!!"));
	}

	@Override
	public Demo createDemo(Demo demo) {
		return this.repo.save(demo);
	}

}
