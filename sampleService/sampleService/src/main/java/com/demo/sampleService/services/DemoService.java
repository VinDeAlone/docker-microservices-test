package com.demo.sampleService.services;

import com.demo.sampleService.entities.Demo;

public interface DemoService {
	
	Demo getDemo(int id);
	Demo createDemo(Demo demo);

}
