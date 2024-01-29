package com.demo.demoService.services;

import com.demo.demoService.entities.Demo;

public interface DemoService {
	
	Demo getDemoById(int id);
	Demo createDemo(Demo demo);

}
